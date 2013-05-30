package info.myreflections.naresh.service;

import java.util.HashMap;

public class GetArticleService implements BusinessService {
	
	private static String[] articles = {"java", "j2ee", "json", "xml", "struts2", "springs", "hibernate", "Data Structures"};
	private static String articleContent = "Article content is to be updated";
	private static String articlePostedBy = "Naresh Kumar";
	
	public HashMap executeService(HashMap requestData) {
		// TODO Auto-generated method stub
		HashMap responseData = new HashMap();
		String articleName = requestData.get("articleName").toString();
		responseData.put("articleName", articleName);
		
		for(String article : articles){
			if(articleName.equalsIgnoreCase(article)){
				responseData.put("articleContent", articleContent);
				responseData.put("articlePostedBy", articlePostedBy);
				responseData.put("resultPage", "success");
				return responseData;
			}
		}
		
		responseData.put("resultPage", "error");
		return responseData;
	}

}
