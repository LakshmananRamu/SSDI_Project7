 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ page import = "com.institute.models.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submit Form</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  #next,
#previous{
    display: inline-block;
    vertical-align: top;
}
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
<br>
<h4> You can edit the form any number of times.But Once submitted, Application cann't be changed and decision will be made according 
to the information provided</h4>
</div>

<form action="StudentSubmitServlet" method="post" >

<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">

<input type="hidden" name="department" value="<%= session.getAttribute("d") %>">

<input type="hidden" name="m" value="<%= session.getAttribute("m") %>">
<!-- <div><%= session.getAttribute("email") %></div>
<div><%= session.getAttribute("d") %></div>
<div><%= session.getAttribute("m") %></div> -->
<p>Once submited application can't be undone.</p>
<p>Are u sure u like to submit</p><br><br><br>

<input id ="previous"class="btn btn-info center-block " type="submit"  name="edit_application" value="Return Home">
<input id="next" class="btn btn-info center-block " type="submit" name="submit" value="submit"><br><br>

</form>
 
</div>
 </body>
