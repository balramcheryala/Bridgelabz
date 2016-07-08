package com.bridgelabz.dao;

import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.PlayerDto;
@Repository
public class PlayerDaoImpl implements PlayerDao{
	
	@Autowired
	SessionFactory sessionFactory;
	public ArrayList<PlayerDto> printList() {
		System.out.println("Retriving the List ");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLPlayer/jsonfile.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("PlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(stringToDate(jsonObjectArray.get("player_dob").toString()));
					array1.add(player);
					 try{
							//save  with transaction
						 System.out.println("Entered in try block of save");
						 Session session = sessionFactory.openSession();
						 Transaction tx1 = session.beginTransaction();
						 session.save(player);
						 System.out.println("Saved data");
						 tx1.commit();
						 session.close();
						}catch(Exception e){
							e.printStackTrace();
						}

				}

        	}
        }
        	catch (Exception e) {
        		System.out.println("File Reading or Duplication Error");
        	}
	
		return array1;
	}
	
	/*------gujrat player function------*/
	public ArrayList<PlayerDto> gujratPlayerList() {
		System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLPlayer/GujratLionPlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("GujratPlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(stringToDate(jsonObjectArray.get("player_dob").toString()));
					 array1.add(player);
					 try{
							//save  with transaction
						 System.out.println("Entered in try block of save");
						 Session session = sessionFactory.openSession();
						 Transaction tx1 = session.beginTransaction();
						 session.save(player);
						 System.out.println("Saved data");
						 tx1.commit();
						 session.close();
						}catch(Exception e){
							e.printStackTrace();
						}
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("File Reading or Duplication Error");
        	}
		return array1;
	}
	

	
	/*------punjab player function------*/
	public ArrayList<PlayerDto> punjabPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLPlayer/punjabPlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("PunjabPlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(stringToDate(jsonObjectArray.get("player_dob").toString()));
					array1.add(player);
					 try{
							//save  with transaction
						 System.out.println("Entered in try block of save");
						 Session session = sessionFactory.openSession();
						 Transaction tx1 = session.beginTransaction();
						 session.save(player);
						 System.out.println("Saved data");
						 tx1.commit();
						 session.close();
						}catch(Exception e){
							e.printStackTrace();
						}
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("File Reading or Duplication Error");
        	}
		return array1;
	
	}
	
	
	
	
	
	
	
	
	/*------KKR player function------*/
	public ArrayList<PlayerDto> kkrPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLPlayer/KKRPlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("KKRPlayer");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(stringToDate(jsonObjectArray.get("player_dob").toString()));
					 array1.add(player);
					 try{
							//save  with transaction
						 System.out.println("Entered in try block of save");
						 Session session = sessionFactory.openSession();
						 Transaction tx1 = session.beginTransaction();
						 session.save(player);
						 System.out.println("Saved data");
						 tx1.commit();
						 session.close();
						}catch(Exception e){
							e.printStackTrace();
						}
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("File Reading or Duplication Error");
        	}
		return array1;
	
	}
	
	
	
	/*------mumbai indians player function------*/
	public ArrayList<PlayerDto> mumbaiPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLPlayer/MumbaiPlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("MumbaiPlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(stringToDate(jsonObjectArray.get("player_dob").toString()));
					 array1.add(player);
					 try{
							//save  with transaction
						 System.out.println("Entered in try block of save");
						 Session session = sessionFactory.openSession();
						 Transaction tx1 = session.beginTransaction();
						 session.save(player);
						 System.out.println("Saved data");
						 tx1.commit();
						 session.close();
						}catch(Exception e){
							e.printStackTrace();
						}
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("File Reading or Duplication Error");
        	}
		return array1;
	
	}
	
	
	
	
	/*------rising pune player function------*/
	public ArrayList<PlayerDto> risingPunePlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLPlayer/RisingPunePlayer.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("PunePlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(stringToDate(jsonObjectArray.get("player_dob").toString()));
					 array1.add(player);
					 try{
							//save  with transaction
						 System.out.println("Entered in try block of save");
						 Session session = sessionFactory.openSession();
						 Transaction tx1 = session.beginTransaction();
						 session.save(player);
						 System.out.println("Saved data");
						 tx1.commit();
						 session.close();
						}catch(Exception e){
							e.printStackTrace();
						}
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("File Reading or Duplication Error");
        	}
		return array1;
		}
	 public Date stringToDate(String str){
    	 DateFormat f = new SimpleDateFormat("dd MMMM yyyy");
    	
    	 try {
			return f.parse(str);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return null;
     }
	/*------royal challenge player function------*/
	public ArrayList<PlayerDto> royalChallengesPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLPlayer/RoyalChallenges.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("RoyalChallengePlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(stringToDate(jsonObjectArray.get("player_dob").toString()));
					 array1.add(player);
				
					 try{
							//save  with transaction
						 System.out.println("Entered in try block of save");
						 Session session = sessionFactory.openSession();
						 Transaction tx1 = session.beginTransaction();
						 session.save(player);
						 System.out.println("Saved data");
						 tx1.commit();
						 session.close();
						}catch(Exception e){
							e.printStackTrace();
						}
					
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("File Reading or Duplication Error");
        	}
		return array1;
	
	}
	
	
	
	/*------Sunrise hydrabad player function------*/
	public ArrayList<PlayerDto> sunriseHydrabadPlayerList() {
System.out.println("Gujrat list while be display shortly");
		
		ArrayList<PlayerDto> array1=new ArrayList<PlayerDto>();
        JSONParser parser= new JSONParser();
        
        try {
        	
        	FileReader fileread=new FileReader("/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLPlayer/SunriseHydrabad.json");
        	
        	Object obj=parser.parse(fileread);
        	JSONArray array =(JSONArray)obj;
        	
        	for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject)array.get(i);
				jsonObject.get("Name").toString();
				JSONArray jsonArray=(JSONArray)jsonObject.get("SunRiseHydrabadPlayerList");
				
				for (int j = 0; j < jsonArray.size(); j++) {
					PlayerDto player=new PlayerDto();
					JSONObject jsonObjectArray=(JSONObject)jsonArray.get(j);
					player.setName(jsonObjectArray.get("player_name").toString());
					player.setRole(jsonObjectArray.get("player_role").toString());
					player.setBatting(jsonObjectArray.get("player_batting_style").toString());
					player.setBowler(jsonObjectArray.get("player_bowling_style").toString());
					player.setNation(jsonObjectArray.get("player_nationality").toString());
					player.setDob(stringToDate(jsonObjectArray.get("player_dob").toString()));
					
					 array1.add(player);
					try{
						//save  with transaction
					 System.out.println("Entered in try block of save");
					 Session session = sessionFactory.openSession();
					 Transaction tx1 = session.beginTransaction();
					 session.save(player);
					 System.out.println("Saved data");
					 tx1.commit();
					 session.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				Iterator< PlayerDto> itr=array1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}
        	}
        }
        	catch (Exception e) {
        		System.out.println("File Reading or Duplication Error");
        	}
		return array1;
	
	}



// Searching Technique
	
	public  List<?> jsonsearch(String fieldname,String text) 
  	{
	    @SuppressWarnings("unused")
		PlayerDto player=new PlayerDto();
	    Session session = sessionFactory.openSession();
		boolean listFound = false;
		Query query;
		
			String SQL_QUERY =" from PlayerDto as o where o."+fieldname+" LIKE "+ "'%"+text+"%'";
			query = session.createQuery(SQL_QUERY);
			List<?> list = query.list();
		System.out.println("list is :"+list);
		if ((list != null) && (list.size() > 0)) 
		{
			listFound= true;
			System.out.println(listFound);
		}
		session.close();
		return list;     
	  
  	}
	
	
	//Sorting Technique
	
	public  List jsonsorting(String field) 
  	{
	  PlayerDto player=new PlayerDto();
       
	 Session session = sessionFactory.openSession();
		
		boolean listFound = false;
		String SQL_QUERY =" from PlayerDto ORDER BY "+field;
		
		Query query = session.createQuery(SQL_QUERY);
		System.out.println("Query executing :"+query);
		

         List list = query.list();
		System.out.println("list is :"+list);
		if ((list != null) && (list.size() > 0)) 
		{
			listFound= true;
		}
		session.close();
		return list;     
	  
	  	}
	
	
	// Sorting By field name and user VALUE and  
	 public  List jsonsearch(String fieldname,String text,String sortby) 
	  	{
		    PlayerDto player=new PlayerDto();
		    Session session = sessionFactory.openSession();
			boolean listFound = false;
			Query query;
			if(sortby==null)
			{
				String SQL_QUERY1 =" from PlayerDto as o where o."+fieldname+" LIKE "+ "'%"+text+"%'";
				query = session.createQuery(SQL_QUERY1);
			}
			else
			{
			String SQL_QUERY =" from PlayerDto as o where o."+fieldname+" LIKE "+ "'%"+text+"%'"+" ORDER BY "+sortby;
			query = session.createQuery(SQL_QUERY);
			}
			
	         List list = query.list();
			if ((list != null) && (list.size() > 0)) 
			{
				
				listFound= true;
				System.out.println(listFound);
			}
			session.close();
			return list;     
		  
	  	}
}

