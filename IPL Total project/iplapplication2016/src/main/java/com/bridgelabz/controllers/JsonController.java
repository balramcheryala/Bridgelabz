package com.bridgelabz.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.dao.DelhiDareDevilsDaoImpl;
import com.bridgelabz.dao.PlayerDaoImpl;
import com.bridgelabz.model.PlayerDto;
import com.bridgelabz.model.TeamDto;
@Controller("abc")
public class JsonController 
{
	@Autowired
	private DelhiDareDevilsDaoImpl ddplayer;
	@Autowired
	private PlayerDaoImpl play;
	@Autowired
	public SessionFactory sessionfactory;
	@RequestMapping(value="/ipl.html",method = RequestMethod.GET)
	public String showForm(Map<?, ?> model)
	{
		return "iplhome";
	}
	// Searching 
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public ModelAndView searchbyname(@RequestParam(value="by", required=true) String by,@RequestParam(value="q", required=true) String query) 
	{
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println(by);
		System.out.println(query);
		model.put("playerlist", play.jsonsearch(by,query));
		return new ModelAndView("playerlist",model);
		
	}
	
	// sorting
	@RequestMapping(value="/sort", method = RequestMethod.GET)
	public ModelAndView searchforanything(@RequestParam(value="sortby", required=true) String fieldName) 
	{
		
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("playerlist", play.jsonsorting( fieldName));
			return new ModelAndView("playerlist",model);
			
		}
	
	//--------display the Delhi DareDevils team list-------- 
	@RequestMapping("ddteamview")
	public String DDPlayerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new TeamDto());
		Model result = model.addAttribute("ddteam", ddplayer.teamList());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	/*------display the DDplayer list demo------*/
	@RequestMapping("ddplayerview")
	public String playerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new PlayerDto());
		Model result = model.addAttribute("playerlist",play.printList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the Gujrat Lion PlayerList-------*/
	@RequestMapping("glplayerview")
	public String gujratPlayerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new PlayerDto());
		Model result = model.addAttribute("playerlist", this.play.gujratPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the KP  PlayerList-------*/
	@RequestMapping("kpplayerview")
	public String kpPlayerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new PlayerDto());
		Model result = model.addAttribute("playerlist", this.play.punjabPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the KKr  PlayerList-------*/
	@RequestMapping("kkrplayerview")
	public String kkrPlayerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new PlayerDto());
		Model result = model.addAttribute("playerlist", this.play.kkrPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the mumbai indians PlayerList-------*/
	@RequestMapping("mumbaiplayerview")
	public String mumbaiPlayerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new PlayerDto());
		Model result = model.addAttribute("playerlist", this.play.mumbaiPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the rising pune PlayerList-------*/
	@RequestMapping("puneplayerview")
	public String punePlayerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new PlayerDto());
		Model result = model.addAttribute("playerlist", this.play.risingPunePlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the royal challenges PlayerList-------*/
	@RequestMapping("rcbplayerview")
	public String rcbPlayerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new PlayerDto());
		Model result = model.addAttribute("playerlist", this.play.royalChallengesPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*------ display the sunrise hydrabad PlayerList-------*/
	@RequestMapping("sunriseplayerview")
	public String sunrisesPlayerList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new PlayerDto());
		Model result = model.addAttribute("playerlist", this.play.sunriseHydrabadPlayerList());
		System.out.println();
		System.out.println(result);
		return "playerlist";
	}
	/*--------display the Gujrat Lions team list-------- */
	@RequestMapping("glteamview")
	public String gujratTeamList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new TeamDto());
		Model result = model.addAttribute("ddteam", this.ddplayer.gujratTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the punjab team list-------- */
	@RequestMapping("kpteamview")
	public String kpTeamList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new TeamDto());
		Model result = model.addAttribute("ddteam", this.ddplayer.punjabTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	/*--------display the KKR team list--------*/
	@RequestMapping("kkrteamview")
	public String kkrTeamList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new TeamDto());
		Model result = model.addAttribute("ddteam", this.ddplayer.kkrTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the Mumbai indians team list--------*/
	@RequestMapping("mumbaiteamview")
	public String mumbaiTeamList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new TeamDto());
		Model result = model.addAttribute("ddteam", this.ddplayer.mumbaiIndiansTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the Rising pune team list--------*/
	@RequestMapping("puneteamview")
	public String puneTeamList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new TeamDto());
		Model result = model.addAttribute("ddteam", this.ddplayer.risingPuneTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the royal challenges team list--------*/
	@RequestMapping("rcbteamview")
	public String rcbTeamList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new TeamDto());
		Model result = model.addAttribute("ddteam", this.ddplayer.royalChallengesTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
	
	/*--------display the sunrise hydrabad team list--------*/
	@RequestMapping("sunriseteamview")
	public String sunriseTeamList(Model model) {
		System.out.println("in playlist");
		model.addAttribute("playerdto", new TeamDto());
		Model result = model.addAttribute("ddteam", this.ddplayer.sunriseHydrabadTeam());
		System.out.println();
		System.out.println(result);
		return "ddTeamPlayer";
	}
}
