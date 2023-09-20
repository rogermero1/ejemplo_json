package pruebajson;

//import org.json.*;

import java.io.InputStream;
import java.net.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class principal {

	public static void main(String[] args) throws Exception {
		
		URL url=new URL("https://jsonplaceholder.typicode.com/users");
		HttpURLConnection cx=(HttpURLConnection)url.openConnection();
		cx.setRequestMethod("GET");
		
		InputStream stmr=cx.getInputStream();
		byte[] arrStream=stmr.readAllBytes();
		
		String cntJson="";
		
		for(byte tmp:arrStream)
			cntJson+=(char)tmp;
	//	System.out.println(cntJson);
		JSONArray json=new JSONArray(cntJson);
		
		for(Object obj : json)
			//System.out.println(((JSONObject)obj).get("name"));
			System.out.println(new JSONObject(((JSONObject)obj).get("company").toString()).get("name"));
				

	}

}
