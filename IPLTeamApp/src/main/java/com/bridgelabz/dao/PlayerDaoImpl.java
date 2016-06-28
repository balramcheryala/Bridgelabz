package com.bridgelabz.dao;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.PlayerDto;
@Repository
public class PlayerDaoImpl implements PlayerDao{

	public ArrayList<PlayerDto> printList() {
		System.out.println("list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/balram/Documents/GitHubSync/IPLTeamApp/src/main/jsonfile/IPLPlayer/jsonfile.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				String name=jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("PlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(jsonObjectArray.get("player_dob").toString());
					
					 array1.add(player);
					
				}
				/*Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}*/
        	}
        }
        	catch (Exception e) {
        		System.out.println("error");
        	}
	
		return array1;
	}
	/*------gujrat player function------*/
	public ArrayList gujratPlayerList() {
		System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/balram/Documents/GitHubSync/IPLTeamApp/src/main/jsonfile/IPLPlayer/GujratLionPlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				String name=jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("GujratPlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(jsonObjectArray.get("player_dob").toString());
					
					 array1.add(player);
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("error");
        	}
		return array1;
	}
	/*------punjab player function------*/
	public ArrayList punjabPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/balram/Documents/GitHubSync/IPLTeamApp/src/main/jsonfile/IPLPlayer/punjabPlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				String name=jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("PunjabPlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(jsonObjectArray.get("player_dob").toString());
					
					 array1.add(player);
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("error");
        	}
		return array1;
	
	}
	/*------KKR player function------*/
	public ArrayList kkrPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/balram/Documents/GitHubSync/IPLTeamApp/src/main/jsonfile/IPLPlayer/KKRPlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				String name=jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("KKRPlayer");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(jsonObjectArray.get("player_dob").toString());
					
					 array1.add(player);
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("error");
        	}
		return array1;
	
	}
	/*------mumbai indians player function------*/
	public ArrayList mumbaiPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/balram/Documents/GitHubSync/IPLTeamApp/src/main/jsonfile/IPLPlayer/MumbaiPlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				String name=jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("MumbaiPlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(jsonObjectArray.get("player_dob").toString());
					
					 array1.add(player);
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("error");
        	}
		return array1;
	
	}
	/*------rising pune player function------*/
	public ArrayList risingPunePlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/balram/Documents/GitHubSync/IPLTeamApp/src/main/jsonfile/IPLPlayer/RisingPunePlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				String name=jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("PunePlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(jsonObjectArray.get("player_dob").toString());
					
					 array1.add(player);
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("error");
        	}
		return array1;
		}
	/*------royal challenge player function------*/
	public ArrayList royalChallengesPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/balram/Documents/GitHubSync/IPLTeamApp/src/main/jsonfile/IPLPlayer/RoyalChallenges.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				String name=jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("RoyalChallengePlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(jsonObjectArray.get("player_dob").toString());
					
					 array1.add(player);
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("error");
        	}
		return array1;
	
	}
	/*------Sunrise hydrabad player function------*/
	public ArrayList sunriseHydrabadPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/balram/Documents/GitHubSync/IPLTeamApp/src/main/jsonfile/IPLPlayer/SunriseHydrabad.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				String name=jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("SunRiseHydrabadPlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(jsonObjectArray.get("player_dob").toString());
					
					 array1.add(player);
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("error");
        	}
		return array1;
	
	}
	
}

