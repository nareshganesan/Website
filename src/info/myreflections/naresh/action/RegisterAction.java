package info.myreflections.naresh.action;

import java.io.IOException;
import java.util.HashMap;

import info.myreflections.naresh.service.BusinessService;
import info.myreflections.naresh.service.LoginService;
import info.myreflections.naresh.service.RegisterService;

public class RegisterAction {

	private BusinessService service;
	private String loginName;
	private String password;
	private String userType;
	private String resultPage;
	private String errorAction;
	
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
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
	
	public String execute() throws Exception{
		service = new RegisterService();
		HashMap requestData = new HashMap();
		requestData.put("loginName", loginName);
		requestData.put("password", password);
//		System.out.println(getLoginName()); // user input from the front end
		HashMap responseData = service.executeService(requestData);
		setLoginName(responseData.get("loginName").toString());
		setErrorAction(getLoginName() + " User Not Found");
		setResultPage(responseData.get("resultPage").toString());
		return getResultPage();
	}
	
}
