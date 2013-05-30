package info.myreflections.naresh.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LoginService implements BusinessService {
	
	private static String UserDetails = "/Users/naresh/Documents/workspace/New Workspace/Website/UserDetails.txt";

	@Override
	// gets the request data from the action class
	// sends the response data to the action class
	// required parameters : loginName, password
	// output parameters : loginName, resultPage
	public HashMap executeService(HashMap requestData) throws IOException {

		HashMap responseData = new HashMap();
		String loginName = requestData.get("loginName").toString();
		String password = requestData.get("password").toString();
		FileInputStream dataInputStream = new FileInputStream(UserDetails);
		BufferedReader dataReader = new BufferedReader(new InputStreamReader(dataInputStream));
		responseData.put("loginName", loginName);
		String dataWithNewLine = new String();
		while ((dataWithNewLine = dataReader.readLine()) != null){
			String trimmedString = dataWithNewLine.trim();
			String[] words = trimmedString.split(",");
			if(loginName.equalsIgnoreCase(words[0])){
				responseData.put("resultPage", "success");
				return responseData;
			}
			
		}
		responseData.put("resultPage", "login");
		
		return responseData;
	}
}
