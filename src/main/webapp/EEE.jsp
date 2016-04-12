<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
#header {
		background-color:#00703C;
		color:white;
		text-align:center;
		padding:10px;
}
 #nav {
 		line-height:25px;
 		background-color:white;
 		height:10;
 		padding:5px;
 }
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

</head>
<body>
<div id="header">
<h1>The Graduate School- Online Application portal</h1>
</div>
<br>
<br>
<div id="nav">
<h1>Electrical and Electronic Engineering</h1>
</div>
<p>To Apply for Electrical and Electronic Engineering in this college. please click on Create new application form. </p>
<br>
<form action="ApplicationForm.jsp"> 
<button type="submit" value="Create new application form" onclick="ApplicationFom.jsp">Create New Application form</button>
</form>
<br>
<p>If you already applied for this application please click on login to check the status of your application. </p>
<form action="login">
<input type="button" value="Login">
</form>
</body>
</html>