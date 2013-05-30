package info.myreflections.naresh.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

public class RegisterService implements BusinessService {

	private static HashMap users = new HashMap();
	private static String UserDetails = "/Users/naresh/Documents/workspace/New Workspace/Website/UserDetails.txt";
	
	public HashMap executeService(HashMap requestData) throws IOException {
		Writer outputDataWriter = new BufferedWriter(new FileWriter(UserDetails,true));
		HashMap responseData = new HashMap();
		String loginName = requestData.get("loginName").toString();
		String password = requestData.get("password").toString();
		outputDataWriter.write(loginName+","+password+"\n");
		outputDataWriter.close();
		responseData.put("loginName", loginName);
		responseData.put("resultPage", "success");
		return responseData;
	}
}
