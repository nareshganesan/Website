<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
  <title>My Reflections</title>
  <link rel="stylesheet" href="CSS/style1.css">
  </head>
  <body>
    <div id="default" style="height:100px;margin-right:150px;margin-left:150px;background-color:blue;">
		<div id="login" style="float:right;height:25px;width:25%;background-color:yellow;">
		Login
		</div>
		<div id="sitename" style="float:left;height:50px;width:30%;background-color:red;margin-top:30px;padding-left:10px;font-family:Comic Sans MS;">
		
		My Reflections - Naresh
		</div>
		<div id="searchbar" style="float:right;height:50px;width:25%;background-color:red;margin-top:0px;margin-left:200px;padding-left:10px;padding-right:10px;">
			<form method="post" action="findArticles.action">
			<input id="articleName" class="category inputBox" type="text" name="articleName" style="width:70%;" />
			<input id="search-button" class="button" type="submit" value="search" name="search" />
			</form>
		</div>
	</div>
	<div id="menu" style="height:30px;margin-right:150px;margin-left:150px;background: #cccccc;;border-style:Solid;border-color:white;border-left-width:0px;border-right-width:0px;">
		<ul>
		<li><a href="#">Home</a></li>
		<li><a href="#">About Me</a></li>
		<li><a href="Resume.jsp">Resume</a></li>
		<li><a href="References.jsp">References</a>
			<ul>
				<li><a href="#">Java</a></li>
				<li><a href="#">J2EE</a></li>
				<li><a href="#">Frameworks</a>
					<ul>
						<li><a href="#">Structs 2</a></li>
						<li><a href="#">Springs</a></li>
						<li><a href="#">Hibernate</a></li>
					</ul>
				</li>
				<li><a href="#">Android</a></li>
				<li><a href="#">HTML</a></li>
				<li><a href="#">CSS</a></li>
			</ul>
		</li>
		<li><a href="Articles.jsp">Articles</a></li>
		<li><a href="#">Interview Questions</a></li>
		<li><a href="Contactme.jsp">Contact Me</a></li>
	</ul>

	</div>
	
	<div id="mainbody" style="height:400px;margin-right:150px;margin-left:150px;background-color:green;border-style:Solid;border-color:white;border-left-width:0px;border-right-width:0px;border-top-width:0px;margin-bottom-width:0px;">
		<div id="breadcrumbs" style="float:left;height:25px;width:45%;background-color:red;margin-top:5px;padding-left:10px;">
		breadcrumbs
		</div>
		<div id="keywords" style="float:right;height:25px;width:45%;background-color:orange;margin-top:5px;padding-left:10px;">
		Keywords
		</div>
		<div id="global-nav" style="float:left;height:92.5%;width:20%;background-color:grey;padding-left:0px;">
					<!---<div id="global-nav">-->
				<ul>
					<li><a href="#One">March 13</a>
						<div id="global-subnav">
							<ul>
								<li><a href="#A">A</a></li>
								<li><a href="#B">B</a></li>
								<li><a href="#C">C</a></li>
							</ul>
						</div>
					</li>
					<li><a href="#Two">April 13</a>
						<div id="global-subnav">
							<ul>
								<li><a href="#1">1</a></li>
								<li><a href="#2">2</a></li>
								<li><a href="#3">3</a></li>
							</ul>
						</div>
					</li>
				</ul>
			<!---</div>-->
		</div>
		<div id="content" style="height:370px;width:80%;margin-top:0px;float:left;background-color:white">
			<h1>  My Reflections </h1>
			<p> This Website is a collection of my knowledge on different areas of interest. 
			I would like to maintain this as a repository of the topics which I have learnt in course of time.
			 </p>
			 <% String url = request.getRequestURL().toString(); %>
			 <a href="<%= url %>doLogin.action"> Login </a>
			 <a href="<%= url %>Register.jsp"> Register </a>
			 <a href="<%= url %>getArticle.action?articleName=java"> Java </a>
		</div>
	</div>

	<div id="footer" style="height:100px;margin-right:150px;margin-left:150px;background-color:blue;border-style:Solid;border-color:white;border-left-width:0px;border-right-width:0px;">
		<div id="footer1" style="float:left;width:47%;background-color:red;margin-top:5px;padding-left:10px;height:92.5%;margin-left:10px">
		Footer1
		</div>
		<div id="footer2" style="width:47%;background-color:orange;margin-top:5px;margin-left:50%;padding-left:10px;height:92.5%">
		Footer2
		</div>
		<!--<div id="footer3" style="float:right;width:30%;background-color:orange;margin-top:5px;padding-left:10px;height:92.5%">
		Footer3
		</div>-->
	</div>
	</body>
</html>