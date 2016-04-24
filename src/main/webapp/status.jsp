<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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
required-field{
       color:red;  
       font-size:8px;
 }
</style>
</head>
<body>
<div id="header">
<h1>The Graduate School- Online Application Portal</h1>
</div>

<div class="container">

<div id="nav">
<h4>Choose to Edit application</h4><br>
<br>
</div>


<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">

<!-- 
<div><%= session.getAttribute("email") %></div>
<%=(session.getAttribute("d1") == null) ? "nothing" : session.getAttribute("m1") %><br>
<%=(session.getAttribute("d2") == null) ? "nothing" : session.getAttribute("m2") %><br>
<%=(session.getAttribute("d3") == null) ? "nothing" : session.getAttribute("m3") %><br>
 -->
<% if(session.getAttribute("m1") != null) {%>

<form action="StudentStatusServlet" method="post" >
<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>"><br>

<input type="hidden" name ="department" value="<%= session.getAttribute("d1") %>"><br>
<input class="btn btn-info center-block " type= "submit" name="action" value="CS application">
</form>
<% }%>

<% if(session.getAttribute("m2") != null) {%>

<form action="StudentStatusServlet" method="post" >
<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>"><br>

<input type="hidden" name ="department" value="<%= session.getAttribute("d2") %>"><br>
<input  class="btn btn-info center-block " name="action" type= "submit" value="ME application">
</form>
<% }%>

<% if(session.getAttribute("m3") != null) {%>

<form action="StudentStatusServlet" method="post" >
<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>"><br>

<input type="hidden" name ="department" value="<%= session.getAttribute("d3") %>"><br>
<input class="btn btn-info center-block " name="action" type= "submit" value="EE application">
</form>
<% }%>
 </div>
 </body>
