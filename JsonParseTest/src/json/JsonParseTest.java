package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParseTest {
	
	public static void main(String[] args) {

		try {
			// read the json file
			FileReader reader = new FileReader("Team_Info.json");

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

			/*// get a String from the JSON object
			String firstName =  (String) jsonObject.get("firstname");
			System.out.println("The first name is: " + firstName);

			// get a number from the JSON object
			long id =  (long) jsonObject.get("id");
			System.out.println("The id is: " + id);
*/
			// get an array from the JSON object
			JSONArray teams= (JSONArray) jsonObject.get("teams");
			
			/*// take the elements of the json array
			for(int i=0; i<lang.size(); i++){
				System.out.println("The " + i + " element of the array: "+lang.get(i));
				
			}*/
			Iterator i = teams.iterator();

			// take each value from the json array separately
			while (i.hasNext()) {
				JSONObject innerObj = (JSONObject) i.next();
				System.out.println("TeamName "+ innerObj.get("team_name"));
				System.out.println("team_coach "+ innerObj.get("team_coach"));
				System.out.println("team_captain "+ innerObj.get("team_captain"));
				System.out.println("team_home_venue "+ innerObj.get("team_home_venue"));
				System.out.println("team_owner "+ innerObj.get("team_owner"));
				
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ParseException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

	}

}
