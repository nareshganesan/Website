package info.myreflections.naresh.action;

import info.myreflections.naresh.model.Article;
import info.myreflections.naresh.service.BusinessService;
import info.myreflections.naresh.service.FindArticleService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FindArticleAction {
	
	private BusinessService service;
	private String articlePresent;
	private String articleName;
	private String errorAction;
	private String resultPage;
	private ArrayList<Article> articlesList;
	
	
	// reads the reuqest data 
	// requires parameters : articleName
	// output parameters : articleName, articleContent, articlePostedBy, resultPage
	public String execute() throws Exception{
		service = new FindArticleService();
		HashMap requestData = new HashMap();
		requestData.put("articleName", getArticleName());
		HashMap responseData = service.executeService(requestData);
		setResultPage(responseData.get("resultPage").toString());
		if(getResultPage().equals("success")){
//			setArticleName(responseData.get("articleName").toString());
//			setArticleContent(responseData.get("articleContent").toString());
//			setArticlePostedBy(responseData.get("articlePostedBy").toString());
			setArticlePresent("present");
			setArticlesList((ArrayList<Article>)responseData.get("articlesList"));
			return getResultPage();
		}
		else {
			setArticlePresent("");
			setErrorAction("Article Not Found");
			return getResultPage();
		}
		
		
		
	}



	public String getResultPage() {
		return resultPage;
	}

	public void setResultPage(String resultPage) {
		this.resultPage = resultPage;
	}

	public String getErrorAction() {
		return errorAction;
	}

	public void setErrorAction(String errorAction) {
		this.errorAction = errorAction;
	}

	public ArrayList<Article> getArticlesList() {
		return articlesList;
	}

	public void setArticlesList(ArrayList<Article> articleList) {
		this.articlesList = articleList;
	}

	public String isArticlePresent() {
		return articlePresent;
	}

	public void setArticlePresent(String articlePresent) {
		this.articlePresent = articlePresent;
	}



	public String getArticleName() {
		return articleName;
	}



	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

}
