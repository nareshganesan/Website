package info.myreflections.naresh.action;

import info.myreflections.naresh.service.BusinessService;
import info.myreflections.naresh.service.LoginService;

import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private BusinessService service;
	private String resultPage;
	private String loginName;
	private String password;
	private String errorAction;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getResultPage() {
		return resultPage;
	}

	public void setResultPage(String resultPage) {
		this.resultPage = resultPage;
	}

	public void validate() {
		if(StringUtils.isEmpty(getLoginName())){
			addFieldError("loginName", "Login Name cannot be Empty");
		}
//		if(StringUtils.isEmpty(getPassword())){
//			addFieldError("password", "Passowrd cannot be Empty");
//		}
    } 
	
	// Action class is mapped in the struts xml 
	// execute methods always expects a string which is the name of the next page used in the struts xml
	// used to authenticate the user name and password using the login service 
	public String execute() throws Exception{
		service = new LoginService();
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
	


	public String getErrorAction() {
		return errorAction;
	}

	public void setErrorAction(String errorAction) {
		this.errorAction = errorAction;
	}

}
