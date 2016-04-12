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

<h4>Choose the branch to apply.</h4>
<br>
</div>

<form action="StudentNewapplicationServlet" method="post" >

<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">

<div class="text">
<div class="col-sm-4" style="background-color:white;">Choose the Department:<div class="col-sm-1" style="color:red;">*</div>
  </div>
  <select name="department">
  <option value=" "></option>
 <option value="CS">Computer Science</option>
 <option value="EE">Electrical Engineering</option>
  <option value="ME">Mechanical Engineering</option>
 </select><span style="color:red"><%=(session.getAttribute("errmsg")==null ? "":session.getAttribute("errmsg") )%></span>
</div>
<div>  <br><br> <input class="btn btn-info center-block " type="submit" value="next">
 </div>
 
 </form>
 </div>
 </body>
