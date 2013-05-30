<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>My Reflections - Naresh</title>
</head>
<body>
<h1>  My Reflections </h1>
<p> This Website is a collection of my knowledge on different areas of interest. 
I would like to maintain this as a repository of the topics which I have learnt in course of time.
 </p>
 <% String url = request.getRequestURL().toString(); %>
 <a href="<%= url %>doLogin.action"> Login </a>
 <a href="<%= url %>Register.jsp"> Register </a>
 <a href="<%= url %>getArticle.action?articleName=java"> Java </a>
</body>
</html>