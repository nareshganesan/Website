package info.myreflections.naresh.action;

import java.io.IOException;
import java.util.HashMap;

import info.myreflections.naresh.service.BusinessService;
import info.myreflections.naresh.service.ContactFormService;


public class ContactFormAction {

	private BusinessService service;
	private String fromEmail;
	private String subject;
	private String message;
	private String resultPage;
	
	public String execute() throws Exception{
		service = new ContactFormService();
		HashMap requestData = new HashMap();
		requestData.put("fromEmail", getFromEmail());
		requestData.put("subject", getSubject());
		requestData.put("message", getMessage());
		HashMap responseData = service.executeService(requestData);
		setResultPage(responseData.get("resultPage").toString());
		return getResultPage();
		
	}
	
	
	public BusinessService getService() {
		return service;
	}
	public void setService(BusinessService service) {
		this.service = service;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getResultPage() {
		return resultPage;
	}
	public void setResultPage(String resultPage) {
		this.resultPage = resultPage;
	}
	
}
