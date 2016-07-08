package com.bridgelabz.dao;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.model.TeamDto;
public class DelhiDareDevilsDaoImpl implements TeamDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public ArrayList<TeamDto> teamList() {
	
			System.out.println("Diplaying Details of All Members");

			ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
			JSONParser parser = new JSONParser();

			try {

				FileReader fileread = new FileReader(
						"/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLTeam/DDTeamInfo.json");

				Object obj = parser.parse(fileread);
				JSONArray array = (JSONArray) obj;

				for (int i = 0; i < array.size(); i++) {
					JSONObject jsonObject = (JSONObject) array.get(i);
					String name = jsonObject.get("Name").toString();
					System.out.println("json  name"+name);
					JSONArray jsonArray = (JSONArray) jsonObject.get("DDTeamList");

					for (int j = 0; j < jsonArray.size(); j++) {
						System.out.println("inner for ");
						TeamDto DDplayer = new TeamDto();
						JSONObject jsonObjectArray = (JSONObject) jsonArray.get(j);
						DDplayer.setName(jsonObjectArray.get("team_name").toString());
						DDplayer.setCouch(jsonObjectArray.get("team_coach").toString());
						DDplayer.setCaption(jsonObjectArray.get("team_captain").toString());
						DDplayer.setVeneue(jsonObjectArray.get("team_home_venue").toString());
						DDplayer.setOwner(jsonObjectArray.get("team_owner").toString());

							array1.add(DDplayer);
							 try{
									//save  with transaction
								 System.out.println("Entered in try block of save");
								 Session session = sessionFactory.openSession();
								 Transaction tx1 = session.beginTransaction();
								 session.save(DDplayer);
								 System.out.println("Saved data");
								 tx1.commit();
								 session.close();
								}catch(Exception e){
									e.printStackTrace();
								}
					}
					Iterator<TeamDto> itr = array1.iterator();
					while (itr.hasNext()) {
						System.out.println(" in while");
						System.out.println(itr.next());
						
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		return array1;
	}

	public ArrayList<TeamDto> gujratTeam() {
		
		System.out.println("Diplaying Details of All Members");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLTeam/GujratTeam.json");

			Object obj = parser.parse(fileread);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject = (JSONObject) array.get(i);
				String name = jsonObject.get("Name").toString();
				System.out.println("json  name"+name);
				JSONArray jsonArray = (JSONArray) jsonObject.get("GujratPlayerList");

				for (int j = 0; j < jsonArray.size(); j++) {
					System.out.println("inner for ");
					TeamDto DDplayer = new TeamDto();
					JSONObject jsonObjectArray = (JSONObject) jsonArray.get(j);
					DDplayer.setName(jsonObjectArray.get("team_name").toString());
					DDplayer.setCouch(jsonObjectArray.get("team_coach").toString());
					DDplayer.setCaption(jsonObjectArray.get("team_captain").toString());
					DDplayer.setVeneue(jsonObjectArray.get("team_home_venue").toString());
					DDplayer.setOwner(jsonObjectArray.get("team_owner").toString());

						array1.add(DDplayer);
						 try{
								//save  with transaction
							 System.out.println("Entered in try block of save");
							 Session session = sessionFactory.openSession();
							 Transaction tx1 = session.beginTransaction();
							 session.save(DDplayer);
							 System.out.println("Saved data");
							 tx1.commit();
							 session.close();
							}catch(Exception e){
								e.printStackTrace();
							}
					
				}
				Iterator<TeamDto> itr = array1.iterator();
				while (itr.hasNext()) {
					System.out.println(" in while");
					System.out.println(itr.next());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return array1;
	}
	public ArrayList<TeamDto> punjabTeam() {
		System.out.println("Diplaying Details of All Members");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLTeam/PunjabTeam.json");

			Object obj = parser.parse(fileread);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject = (JSONObject) array.get(i);
				String name = jsonObject.get("Name").toString();
				System.out.println("json  name"+name);
				JSONArray jsonArray = (JSONArray) jsonObject.get("PunjabPlayerList");

				for (int j = 0; j < jsonArray.size(); j++) {
					System.out.println("inner for ");
					TeamDto DDplayer = new TeamDto();
					JSONObject jsonObjectArray = (JSONObject) jsonArray.get(j);
					DDplayer.setName(jsonObjectArray.get("team_name").toString());
					DDplayer.setCouch(jsonObjectArray.get("team_coach").toString());
					DDplayer.setCaption(jsonObjectArray.get("team_captain").toString());
					DDplayer.setVeneue(jsonObjectArray.get("team_home_venue").toString());
					DDplayer.setOwner(jsonObjectArray.get("team_owner").toString());

						array1.add(DDplayer);
						 try{
								//save  with transaction
							 System.out.println("Entered in try block of save");
							 Session session = sessionFactory.openSession();
							 Transaction tx1 = session.beginTransaction();
							 session.save(DDplayer);
							 System.out.println("Saved data");
							 tx1.commit();
							 session.close();
							}catch(Exception e){
								e.printStackTrace();
							}
				}
				Iterator<TeamDto> itr = array1.iterator();
				while (itr.hasNext()) {
					System.out.println(" in while");
					System.out.println(itr.next());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return array1;
	}
	public ArrayList<TeamDto> kkrTeam() {
		System.out.println("Diplaying Details of All Members");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLTeam/KKRTeam.json");

			Object obj = parser.parse(fileread);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject = (JSONObject) array.get(i);
				String name = jsonObject.get("Name").toString();
				System.out.println("json  name"+name);
				JSONArray jsonArray = (JSONArray) jsonObject.get("KKRPlayerList");

				for (int j = 0; j < jsonArray.size(); j++) {
					System.out.println("inner for ");
					TeamDto DDplayer = new TeamDto();
					JSONObject jsonObjectArray = (JSONObject) jsonArray.get(j);
					DDplayer.setName(jsonObjectArray.get("team_name").toString());
					DDplayer.setCouch(jsonObjectArray.get("team_coach").toString());
					DDplayer.setCaption(jsonObjectArray.get("team_captain").toString());
					DDplayer.setVeneue(jsonObjectArray.get("team_home_venue").toString());
					DDplayer.setOwner(jsonObjectArray.get("team_owner").toString());

						array1.add(DDplayer);
						 try{
								//save  with transaction
							 System.out.println("Entered in try block of save");
							 Session session = sessionFactory.openSession();
							 Transaction tx1 = session.beginTransaction();
							 session.save(DDplayer);
							 System.out.println("Saved data");
							 tx1.commit();
							 session.close();
							}catch(Exception e){
								e.printStackTrace();
							}
				}
				Iterator<TeamDto> itr = array1.iterator();
				while (itr.hasNext()) {
					System.out.println(" in while");
					System.out.println(itr.next());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return array1;
	}
	public ArrayList<TeamDto> mumbaiIndiansTeam() {
		System.out.println("Diplaying Details of All Members");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLTeam/MumbaiIndians.json");

			Object obj = parser.parse(fileread);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject = (JSONObject) array.get(i);
				String name = jsonObject.get("Name").toString();
				System.out.println("json  name"+name);
				JSONArray jsonArray = (JSONArray) jsonObject.get("MumbaiPlayerList");

				for (int j = 0; j < jsonArray.size(); j++) {
					System.out.println("inner for ");
					TeamDto DDplayer = new TeamDto();
					JSONObject jsonObjectArray = (JSONObject) jsonArray.get(j);
					DDplayer.setName(jsonObjectArray.get("team_name").toString());
					DDplayer.setCouch(jsonObjectArray.get("team_coach").toString());
					DDplayer.setCaption(jsonObjectArray.get("team_captain").toString());
					DDplayer.setVeneue(jsonObjectArray.get("team_home_venue").toString());
					DDplayer.setOwner(jsonObjectArray.get("team_owner").toString());

						array1.add(DDplayer);
						 try{
								//save  with transaction
							 System.out.println("Entered in try block of save");
							 Session session = sessionFactory.openSession();
							 Transaction tx1 = session.beginTransaction();
							 session.save(DDplayer);
							 System.out.println("Saved data");
							 tx1.commit();
							 session.close();
							}catch(Exception e){
								e.printStackTrace();
							}
				}
				Iterator<TeamDto> itr = array1.iterator();
				while (itr.hasNext()) {
					System.out.println(" in while");
					System.out.println(itr.next());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return array1;
	}
	public ArrayList<TeamDto> risingPuneTeam() {
		System.out.println("Diplaying Details of All Members");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLTeam/RisingPune.json");

			Object obj = parser.parse(fileread);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject = (JSONObject) array.get(i);
				String name = jsonObject.get("Name").toString();
				System.out.println("json  name"+name);
				JSONArray jsonArray = (JSONArray) jsonObject.get("PunePlayerList");

				for (int j = 0; j < jsonArray.size(); j++) {
					System.out.println("inner for ");
					TeamDto DDplayer = new TeamDto();
					JSONObject jsonObjectArray = (JSONObject) jsonArray.get(j);
					DDplayer.setName(jsonObjectArray.get("team_name").toString());
					DDplayer.setCouch(jsonObjectArray.get("team_coach").toString());
					DDplayer.setCaption(jsonObjectArray.get("team_captain").toString());
					DDplayer.setVeneue(jsonObjectArray.get("team_home_venue").toString());
					DDplayer.setOwner(jsonObjectArray.get("team_owner").toString());

						array1.add(DDplayer);
						 try{
								//save  with transaction
							 System.out.println("Entered in try block of save");
							 Session session = sessionFactory.openSession();
							 Transaction tx1 = session.beginTransaction();
							 session.save(DDplayer);
							 System.out.println("Saved data");
							 tx1.commit();
							 session.close();
							}catch(Exception e){
								e.printStackTrace();
							}
				}
				Iterator<TeamDto> itr = array1.iterator();
				while (itr.hasNext()) {
					System.out.println(" in while");
					System.out.println(itr.next());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return array1;
	}
	public ArrayList<TeamDto> royalChallengesTeam() {
		System.out.println("Diplaying Details of All Members");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLTeam/RoyalChallenges.json");

			Object obj = parser.parse(fileread);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject = (JSONObject) array.get(i);
				String name = jsonObject.get("Name").toString();
				System.out.println("json  name"+name);
				JSONArray jsonArray = (JSONArray) jsonObject.get("RoyalChallengeList");

				for (int j = 0; j < jsonArray.size(); j++) {
					System.out.println("inner for ");
					TeamDto DDplayer = new TeamDto();
					JSONObject jsonObjectArray = (JSONObject) jsonArray.get(j);
					DDplayer.setName(jsonObjectArray.get("team_name").toString());
					DDplayer.setCouch(jsonObjectArray.get("team_coach").toString());
					DDplayer.setCaption(jsonObjectArray.get("team_captain").toString());
					DDplayer.setVeneue(jsonObjectArray.get("team_home_venue").toString());
					DDplayer.setOwner(jsonObjectArray.get("team_owner").toString());

						array1.add(DDplayer);
						 try{
								//save  with transaction
							 System.out.println("Entered in try block of save");
							 Session session = sessionFactory.openSession();
							 Transaction tx1 = session.beginTransaction();
							 session.save(DDplayer);
							 System.out.println("Saved data");
							 tx1.commit();
							 session.close();
							}catch(Exception e){
								e.printStackTrace();
							}
				}
				Iterator<TeamDto> itr = array1.iterator();
				while (itr.hasNext()) {
					System.out.println(" in while");
					System.out.println(itr.next());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return array1;
	}
	public ArrayList<TeamDto> sunriseHydrabadTeam() {
		System.out.println("Diplaying Details of All Members");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Downloads/iplapplication2016/src/main/jsonfile/IPLTeam/SunriseHydrabad.json");

			Object obj = parser.parse(fileread);
			JSONArray array = (JSONArray) obj;

			for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject = (JSONObject) array.get(i);
				String name = jsonObject.get("Name").toString();
				System.out.println("json  name"+name);
				JSONArray jsonArray = (JSONArray) jsonObject.get("SunrisersHyderabadList");

				for (int j = 0; j < jsonArray.size(); j++) {
					System.out.println("inner for ");
					TeamDto DDplayer = new TeamDto();
					JSONObject jsonObjectArray = (JSONObject) jsonArray.get(j);
					DDplayer.setName(jsonObjectArray.get("team_name").toString());
					DDplayer.setCouch(jsonObjectArray.get("team_coach").toString());
					DDplayer.setCaption(jsonObjectArray.get("team_captain").toString());
					DDplayer.setVeneue(jsonObjectArray.get("team_home_venue").toString());
					DDplayer.setOwner(jsonObjectArray.get("team_owner").toString());

						array1.add(DDplayer);
						 try{
								//save  with transaction
							 System.out.println("Entered in try block of save");
							 Session session = sessionFactory.openSession();
							 Transaction tx1 = session.beginTransaction();
							 session.save(DDplayer);
							 System.out.println("Saved data");
							 tx1.commit();
							 session.close();
							}catch(Exception e){
								e.printStackTrace();
							}
				}
				Iterator<TeamDto> itr = array1.iterator();
				while (itr.hasNext()) {
					System.out.println(" in while");
					System.out.println(itr.next());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	return array1;
	}
}