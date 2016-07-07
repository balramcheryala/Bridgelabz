package com.bridgelabz.controllers;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.bridgelabz.dao.IplDaoImpl;
import com.bridgelabz.model.PlayerModel;
import com.bridgelabz.model.TeamModel;

@Controller
@EnableWebMvc
public class IplHomeController 
{
	@Autowired
	private IplDaoImpl play;
	@Autowired
	public SessionFactory sessionfactory;
	@RequestMapping(value="/ipl.html",method = RequestMethod.GET)
	public ModelAndView iplHomepage(Model m)
	{
		return new ModelAndView ("iplhome");
	}
	
	/*@ExceptionHandler({SpringException.class})
	@RequestMapping(value="/**",method = RequestMethod.GET)
	public String errorPage()
	
	{
		throw new SpringException("Sorry The Resource Path not found ");
     
		
	}*/
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Data NOT_FOUND")
	@ExceptionHandler({SpringException.class})
	@RequestMapping(value="/**",method = RequestMethod.GET)
	  public ModelAndView databaseError(Model m) {
		throw new SpringException("Sorry The Resource Path not found ");
		
	  }
	
	// Searching 
	@ExceptionHandler({SpringException.class})
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public ModelAndView searchbyname(@RequestParam(value="by", required=true) String by,@RequestParam(value="q", required=true) String query) 
	{
		
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println(by);
		System.out.println(query);
		model.put("playerlist", play.jsonsearch(by,query));
		  if(query.isEmpty()){
		         throw new SpringException("Please Provide the Field Name");
		      }
		  else{
			  return new ModelAndView("playerlist",model);
		      }
		
	}
	
	
	// sorting
	@ExceptionHandler({SpringException.class})
	@RequestMapping(value="/sort", method = RequestMethod.GET,produces = "application/json")
	public ModelAndView searchforanything(@RequestParam(value="sortby", required=true) String fieldName) 
	{
		
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("playerlist", play.jsonsorting( fieldName));
			return new ModelAndView("playerlist",model);
			
		}
	
//------display the DDplayer list demo------/
		@RequestMapping("ddplayerview")
		public String playerList1(Model model) {
			
			model.addAttribute("playerdto", new PlayerModel());
			Model result = model.addAttribute("playerlist",play.printList());
			System.out.println();
			System.out.println(result);
			return "playerlist";
		}
		
	//--------display the Delhi DareDevils team list-------- 
	@RequestMapping("ddteamview")
	public String playList(Model model) {
		
		model.addAttribute("playerdto", new TeamModel());
		Model result = model.addAttribute("ddteam", play.teamList());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	/*------display the play list demo------*/
	@RequestMapping("playview")
	public String playerList(Model model) {
		
		model.addAttribute("playerdto", new PlayerModel());
		Model result = model.addAttribute("playerlist",play.printList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the Gujrat Lion PlayerList-------*/
	@RequestMapping("glplayerview")
	public String gujratPlayerList(Model model) {
		
		model.addAttribute("playerdto", new PlayerModel());
		Model result = model.addAttribute("playerlist", this.play.gujratPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the KP  PlayerList-------*/
	@RequestMapping("kpplayerview")
	public String kpPlayerList(Model model) {
		
		model.addAttribute("playerdto", new PlayerModel());
		Model result = model.addAttribute("playerlist", this.play.punjabPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the KKr  PlayerList-------*/
	@RequestMapping("kkrplayerview")
	public String kkrPlayerList(Model model) {
		
		model.addAttribute("playerdto", new PlayerModel());
		Model result = model.addAttribute("playerlist", this.play.kkrPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the mumbai indians PlayerList-------*/
	@RequestMapping("mumbaiplayerview")
	public String mumbaiPlayerList(Model model) {
		
		model.addAttribute("playerdto", new PlayerModel());
		Model result = model.addAttribute("playerlist", this.play.mumbaiPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the rising pune PlayerList-------*/
	@RequestMapping("puneplayerview")
	public String punePlayerList(Model model) {
		
		model.addAttribute("playerdto", new PlayerModel());
		Model result = model.addAttribute("playerlist", this.play.risingPunePlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the royal challenges PlayerList-------*/
	@RequestMapping("rcbplayerview")
	public String rcbPlayerList(Model model) {
		
		model.addAttribute("playerdto", new PlayerModel());
		Model result = model.addAttribute("playerlist", this.play.royalChallengesPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the sunrise hydrabad PlayerList-------*/
	@RequestMapping("sunriseplayerview")
	public String sunrisesPlayerList(Model model) {
		
		model.addAttribute("playerdto", new PlayerModel());
		Model result = model.addAttribute("playerlist", this.play.sunriseHydrabadPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*--------display the Gujrat Lions team list-------- */
	@RequestMapping("glteamview")
	public String gujratTeamList(Model model) {
		
		model.addAttribute("playerdto", new TeamModel());
		Model result = model.addAttribute("ddteam", this.play.gujratTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the punjab team list-------- */
	@RequestMapping("kpteamview")
	public String kpTeamList(Model model) {
		
		model.addAttribute("playerdto", new TeamModel());
		Model result = model.addAttribute("ddteam", this.play.punjabTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	/*--------display the KKR team list--------*/
	@RequestMapping("kkrteamview")
	public String kkrTeamList(Model model) {
		
		model.addAttribute("playerdto", new TeamModel());
		Model result = model.addAttribute("ddteam", this.play.kkrTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the Mumbai indians team list--------*/
	@RequestMapping("mumbaiteamview")
	public String mumbaiTeamList(Model model) {
		
		model.addAttribute("playerdto", new TeamModel());
		Model result = model.addAttribute("ddteam", this.play.mumbaiIndiansTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the Rising pune team list--------*/
	@RequestMapping("puneteamview")
	public String puneTeamList(Model model) {
		
		model.addAttribute("playerdto", new TeamModel());
		Model result = model.addAttribute("ddteam", this.play.risingPuneTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the royal challenges team list--------*/
	@RequestMapping("rcbteamview")
	public String rcbTeamList(Model model) {
		
		model.addAttribute("playerdto", new TeamModel());
		Model result = model.addAttribute("ddteam", this.play.royalChallengesTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the sunrise hydrabad team list--------*/
	@RequestMapping("sunriseteamview")
	public String sunriseTeamList(Model model) {
		
		model.addAttribute("playerdto", new TeamModel());
		Model result = model.addAttribute("ddteam", this.play.sunriseHydrabadTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
}
