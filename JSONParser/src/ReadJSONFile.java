import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class ReadJSONFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("MyJSON.json"));
			JSONObject jsonObj = (JSONObject) obj; 					//parsing into object of type Object & converting it into JSONObject type object
	     	Object name = jsonObj.get("Name");				//Extracting Data 1 by 1 with their Keys and Values
			
			System.out.println("name is-> "+name);
			
			Object position = jsonObj.get("Position");
			System.out.println("Position is-> "+position);
			
			
			JSONArray positionArray = (JSONArray) jsonObj.get("Position");
			Iterator<String> itpos = positionArray.iterator();
			while(itpos.hasNext()) {
				System.out.println("Position-> "+itpos.next());
			}
			
			JSONArray noArray = (JSONArray) jsonObj.get("No.");
			Iterator<String> itno = noArray.iterator();
			while(itno.hasNext()) {
				System.out.println("Jersey No.-> "+itno.next());
			} 
		} 
		
		catch (IOException | ParseException  e) {
			e.printStackTrace();
		}

	}

}
