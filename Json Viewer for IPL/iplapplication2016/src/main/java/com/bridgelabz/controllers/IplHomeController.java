package com.bridgelabz.controllers;

import java.io.IOException;
import java.util.ArrayList;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.bridgelabz.dao.IplDaoImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//This annotation are treated as controllers
//where @RequestMapping methods assume @ResponseBody semantics by default
@RestController
//@EnableWebMVC, this is the same as <mvc:annotation-driven/>
//mvc:annotation-driven element registers a DefaultAnnotationHandlerMapping 
//And AnnotationMethodHandlerAdapter
@EnableWebMvc
public class IplHomeController 
{
	//Marks a constructor, field, setter method or config method.
	//as to be autowired by Spring's dependency injection facilities. 
	@Autowired
	private IplDaoImpl play;
	@Autowired
	public SessionFactory sessionfactory;
	
	//Annotation for mapping web requests onto specific handler classes and/or handler methods
	@RequestMapping(value="/ipl.html",method = RequestMethod.GET)
	public ModelAndView iplHomepage(Model m)
	{
		return new ModelAndView ("iplhome");
	}
	
	// Searching 
	@RequestMapping(value="/search", method = RequestMethod.GET,produces = "application/json")
	//Annotation which indicates that a method parameter should be bound to a web request parameter
	public String searchbyname(@RequestParam(value="by", required=true) String by,@RequestParam(value="q", required=true) String query) throws JsonProcessingException 
	{
	
		@SuppressWarnings("rawtypes")
		//Each ArrayList instance has a capacity
		//ArrayList used to store the elements in the list.
		//It is always at least as large as the list size.
		ArrayList jsonsearch=new ArrayList<Object>();
		jsonsearch= (ArrayList) play.jsonsearch(by,query);
		//ObjectMapper convert Java objects to matching JSON constructs and vice versa
		   ObjectMapper mapper = new ObjectMapper();
		//This is the method to convert a JSON string to a pretty print version
		   return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonsearch);
		
	}
	
	
	// sorting
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/sort", method = RequestMethod.GET,produces = "application/json")
	public String searchforanything(@RequestParam(value="sortby", required=true) String fieldName) throws JsonProcessingException 
	{
		//Each ArrayList instance has a capacity
		//ArrayList used to store the elements in the list.
		//It is always at least as large as the list size.
			ArrayList jsonsorting=new ArrayList<Object>();
			jsonsorting= (ArrayList) play.jsonsorting( fieldName);
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonsorting);
		}
			
		

		//------display the DELHI DAREDEVILS Player list demo-----Player list in Json By using @RestController-/
		@RequestMapping(value="ddplayerview",  method = RequestMethod.GET,produces = "application/json")
		public String playerList1() throws IOException {
				ArrayList<?> Playerinfo=new ArrayList<Object>();
				Playerinfo= play.printList();
			    ObjectMapper mapper = new ObjectMapper();
			    return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Playerinfo);
		}
		
		//------display the GUJARATH LIONS player view DareDevils Player list demo-----Player list in Json By using @RestController-/
				@RequestMapping(value="glplayerview",  method = RequestMethod.GET,produces = "application/json")
				public String glplayerview() throws IOException {
				ArrayList<?> Playerinfo=new ArrayList<Object>();
				Playerinfo= play.gujratPlayerList();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Playerinfo);
				}
				
		//------display the PKING XI PANJAB player view DareDevils Player list demo-----Player list in Json By using @RestController-/
				@RequestMapping(value="kpplayerview",  method = RequestMethod.GET,produces = "application/json")
				public String kpplayerview() throws IOException {
				ArrayList<?> Playerinfo=new ArrayList<Object>();
				Playerinfo= play.punjabPlayerList();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Playerinfo);
				}			
	
		//------display the KOLKATA KNIGHT RIDERS player view DareDevils Player list demo-----Player list in Json By using @RestController-/
				@RequestMapping(value="kkrplayerview",  method = RequestMethod.GET,produces = "application/json")
				public String kkrplayerview() throws IOException {
				ArrayList<?> Playerinfo=new ArrayList<Object>();
				Playerinfo= play.kkrPlayerList();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Playerinfo);
				}	
				
		//------display the MUMBAI INDIANS player view DareDevils Player list demo-----Player list in Json By using @RestController-/
				@RequestMapping(value="mumbaiplayerview",  method = RequestMethod.GET,produces = "application/json")
				public String mumbaiplayerview() throws IOException {
				ArrayList<?> Playerinfo=new ArrayList<Object>();
				Playerinfo= play.mumbaiPlayerList();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Playerinfo);
				}	
				
		//------display the RISING PUNE SUPER GIANTS player view DareDevils Player list demo-----Player list in Json By using @RestController-/
				@RequestMapping(value="puneplayerview",  method = RequestMethod.GET,produces = "application/json")
				public String puneplayerview() throws IOException {
				ArrayList<?> Playerinfo=new ArrayList<Object>();
				Playerinfo= play.risingPunePlayerList();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Playerinfo);
				}	
				
		//------display the ROYAL CHALANGERS BANGLORE player view DareDevils Player list demo-----Player list in Json By using @RestController-/
				@RequestMapping(value="rcbplayerview",  method = RequestMethod.GET,produces = "application/json")
				public String rcbplayerview() throws IOException {
				ArrayList<?> Playerinfo=new ArrayList<Object>();
				Playerinfo= play.royalChallengesPlayerList();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Playerinfo);
				}	
		//------display the SUNRISERS HYDERABAD player view DareDevils Player list demo-----Player list in Json By using @RestController-/
				@RequestMapping(value="sunriseplayerview",  method = RequestMethod.GET,produces = "application/json")
				public String sunriseplayerview() throws IOException {
				ArrayList<?> Playerinfo=new ArrayList<Object>();
				Playerinfo= play.sunriseHydrabadPlayerList();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Playerinfo);
				}	
				
				
		//--------display the DELHI DAREDEVILS team list in Json By using @RestController-------- 
				@RequestMapping(value="ddteamview", method = RequestMethod.GET,produces = "application/json")
				public String DDTeamList() throws IOException
				{
				ArrayList<?> Teaminfo=new ArrayList<Object>();
				Teaminfo= play.teamList();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Teaminfo);
				}
				
		//--------display the GUJARATH LIONS team list in Json By using @RestController-------- 
				@RequestMapping(value="glteamview", method = RequestMethod.GET,produces = "application/json")
				public String glteamview() throws IOException
				{
				ArrayList<?> Teaminfo=new ArrayList<Object>();
				Teaminfo= play.gujratTeam();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Teaminfo);
				}
				
		//--------display the KING XI PANJAB team list in Json By using @RestController-------- 
				@RequestMapping(value="kpteamview", method = RequestMethod.GET,produces = "application/json")
				public String kpteamview() throws IOException
				{
				ArrayList<?> Teaminfo=new ArrayList<Object>();
				Teaminfo= play.punjabTeam();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Teaminfo);
				}
				
		//--------display the KOLKATA KNIGHT RIDERS team list in Json By using @RestController-------- 
				@RequestMapping(value="kkrteamview", method = RequestMethod.GET,produces = "application/json")
				public String kkrteamview() throws IOException
				{
				ArrayList<?> Teaminfo=new ArrayList<Object>();
				Teaminfo= play.kkrTeam();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Teaminfo);
				}
				
		//--------display the MUMBAI INDIANS team list in Json By using @RestController-------- 
				@RequestMapping(value="mumbaiteamview", method = RequestMethod.GET,produces = "application/json")
				public String mumbaiteamview() throws IOException
				{
				ArrayList<?> Teaminfo=new ArrayList<Object>();
				Teaminfo= play.mumbaiIndiansTeam();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Teaminfo);
				}
				
		//--------display the RISING PUNE SUPER GIANTS team list in Json By using @RestController-------- 
				@RequestMapping(value="puneteamview", method = RequestMethod.GET,produces = "application/json")
				public String puneteamview() throws IOException
				{
				ArrayList<?> Teaminfo=new ArrayList<Object>();
				Teaminfo= play.risingPuneTeam();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Teaminfo);
				}
				
		//--------display the ROYAL CHALANGERS BANGLORE team list in Json By using @RestController-------- 
				@RequestMapping(value="rcbteamview", method = RequestMethod.GET,produces = "application/json")
				public String rcbteamview() throws IOException
				{
				ArrayList<?> Teaminfo=new ArrayList<Object>();
				Teaminfo= play.royalChallengesTeam();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Teaminfo);
				}
				
				
		//--------display the SUNRISERS HYDERABAD team list in Json By using @RestController-------- 
				@RequestMapping(value="sunriseteamview", method = RequestMethod.GET,produces = "application/json")
				public String sunriseteamview() throws IOException
				{
				ArrayList<?> Teaminfo=new ArrayList<Object>();
				Teaminfo= play.sunriseHydrabadTeam();
				ObjectMapper mapper = new ObjectMapper();
				return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Teaminfo);
				}


}
