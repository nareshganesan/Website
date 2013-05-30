<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Register - My Reflections</title>
</head>
<body>
<form method="post" action="doRegister.action">
	<label> Login Name : </label> <input type ="text" id="loginName" name="loginName"/> <br />
	<label> Password : </label> <input type ="password" id="password" name="password"/> <br />
		<input type= "submit" name="Register" value="Register"/>
</form>
</body>
</html>