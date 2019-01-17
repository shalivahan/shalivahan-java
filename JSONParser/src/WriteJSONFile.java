import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONFile {

	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) {
		JSONObject jobj = new JSONObject();
		JSONObject jj = new JSONObject();
		
		JSONArray jarr2 = new JSONArray();
		jarr2.add("9");
		jarr2.add("11");
		jarr2.add("10");
		jarr2.add("4");
		
		jj.put("No.", jarr2);
		//JSONObject jj = (JSONObject) jobj.put("No.", jarr2);
		
		JSONArray jarr = new JSONArray();
		jarr.add("Shalivahan Singh");
		jarr.add("Roberto Firmino");
		jarr.add("Sadio Mane");
		jarr.add("Virgil Van Dijk");
		
		jobj.put("Name",jj);
		
		JSONArray jarr1 = new JSONArray();
		jarr1.add("ST");
		jarr1.add("CAM");
		jarr1.add("LW");
		jarr1.add("CB");
		
		jobj.put("Position", jarr1);

		try {
			FileWriter file = new FileWriter("MyJSON.json");
			
			file.write(jobj.toString());
			file.flush();
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(jobj);
	}

}
