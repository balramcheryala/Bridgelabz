package com.bridgelabz.dao;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.bridgelabz.model.TeamDto;
public class DelhiDareDevilsDaoImpl implements TeamDao {
	public ArrayList<TeamDto> teamList() {
	
			System.out.println("Team list while be display shortly");

			ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
			JSONParser parser = new JSONParser();

			try {

				FileReader fileread = new FileReader(
						"/home/bridgelabz/Documents/IPLTeamApp/src/main/jsonfile/IPLTeam/DDTeamInfo.json");

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
		
		System.out.println("Team list while be display shortly");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Documents/IPLTeamApp/src/main/jsonfile/IPLTeam/GujratTeam.json");

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
	public ArrayList punjabTeam() {
		System.out.println("Team list while be display shortly");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Documents/IPLTeamApp/src/main/jsonfile/IPLTeam/PunjabTeam.json");

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
	public ArrayList kkrTeam() {
		System.out.println("Team list while be display shortly");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Documents/IPLTeamApp/src/main/jsonfile/IPLTeam/KKRTeam.json");

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
	public ArrayList mumbaiIndiansTeam() {
		System.out.println("Team list while be display shortly");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Documents/IPLTeamApp/src/main/jsonfile/IPLTeam/MumbaiIndians.json");

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
	public ArrayList risingPuneTeam() {
		System.out.println("Team list while be display shortly");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Documents/IPLTeamApp/src/main/jsonfile/IPLTeam/RisingPune.json");

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
	public ArrayList royalChallengesTeam() {
		System.out.println("Team list while be display shortly");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Documents/IPLTeamApp/src/main/jsonfile/IPLTeam/RoyalChallenges.json");

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
	public ArrayList sunriseHydrabadTeam() {
		System.out.println("Team list while be display shortly");

		ArrayList<TeamDto> array1 = new ArrayList<TeamDto>();
		JSONParser parser = new JSONParser();

		try {

			FileReader fileread = new FileReader(
					"/home/bridgelabz/Documents/IPLTeamApp/src/main/jsonfile/IPLTeam/SunriseHydrabad.json");

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