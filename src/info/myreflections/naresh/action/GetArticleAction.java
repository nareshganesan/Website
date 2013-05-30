package info.myreflections.naresh.action;

import java.io.IOException;
import java.util.HashMap;

import info.myreflections.naresh.service.BusinessService;
import info.myreflections.naresh.service.GetArticleService;

import com.opensymphony.xwork2.ActionSupport;

public class GetArticleAction extends ActionSupport {
	
	private BusinessService service;
	private String articleName;
	private String articleContent;
	private String articlePostedBy;
	private String errorAction;
	private String resultPage;
	
	public String execute() throws Exception{
		service = new GetArticleService();
		HashMap requestData = new HashMap();
		requestData.put("articleName", getArticleName());
		HashMap responseData = service.executeService(requestData);
		setResultPage(responseData.get("resultPage").toString());
		if(getResultPage().equals("success")){
			setArticleName(responseData.get("articleName").toString());
			setArticleContent(responseData.get("articleContent").toString());
			setArticlePostedBy(responseData.get("articlePostedBy").toString());
			return getResultPage();
		}
		else {
			setErrorAction("Article Not Found");
			return getResultPage();
		}
		
		
		
	}

	public BusinessService getService() {
		return service;
	}

	public void setService(BusinessService service) {
		this.service = service;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticlePostedBy() {
		return articlePostedBy;
	}

	public void setArticlePostedBy(String articlePostedBy) {
		this.articlePostedBy = articlePostedBy;
	}

	public String getErrorAction() {
		return errorAction;
	}

	public void setErrorAction(String errorAction) {
		this.errorAction = errorAction;
	}

	public String getResultPage() {
		return resultPage;
	}

	public void setResultPage(String resultPage) {
		this.resultPage = resultPage;
	}

}
