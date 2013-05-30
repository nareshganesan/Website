<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Login page</title>
</head>
<body>
	<form method="post" action="doLogin.action" >
		<label> username :  </label><input type="text" id="loginName" name="loginName"/> <br />
		<label>password : </label><input type="password" id="password" name="password"/> <br />
		<input type="submit" name="Submit"/>
	</form>
	
</body>
</html>