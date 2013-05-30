package info.myreflections.naresh.service;

import info.myreflections.naresh.model.Article;

import java.util.ArrayList;
import java.util.HashMap;

public class FindArticleService implements BusinessService {

	private static String[] articles = {"java", "j2ee", "json", "xml", "struts2", "springs", "hibernate", "Data Structures"};
	private static String articleContent = "Article content is to be updated";
	private static String articlePostedBy = "Naresh Kumar";
	private static String articleDate = "Apr 06, 2013";
	private ArrayList<Article> articlesList = new ArrayList<Article>();
	
	@Override
	public HashMap executeService(HashMap requestData) {
		// TODO Auto-generated method stub
		HashMap responseData = new HashMap();
		String articleName = requestData.get("articleName").toString();
		boolean articlePresent = false;
		responseData.put("articleName", articleName);
		for(String a : articles){
			if(a.contains(articleName)){
				articlePresent = true;
				responseData.put("articlePresent", articlePresent);
				Article article = new Article();
				article.setArticleName(a);
				article.setArticleContent(articleContent);
				article.setArticlePostedBy(articlePostedBy);
				article.setDatePosted(articleDate);
				articlesList.add(article);
			}
		}
		if(articlePresent){
			responseData.put("articlesList", articlesList);
			responseData.put("resultPage", "success");
		}
		else {
			responseData.put("resultPage", "error");
		}
		return responseData;
	}
	

}
