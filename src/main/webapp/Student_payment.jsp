 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ page import = "com.institute.models.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>payment</title>
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
<br>
<h4> Please enter valid card details to pay for application. Application will not be submitted until Fee is paid.</h4>
<br>
</div>

<form action="StudentPaymentServlet" method="post" >

<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">

<input type="hidden" name="department" value="<%= session.getAttribute("d") %>">

<input type="hidden" name="m" value="<%= session.getAttribute("m") %>">
 <div><%= session.getAttribute("email") %></div>
<div><%= session.getAttribute("d") %></div>
<div><%= session.getAttribute("m") %></div> -->
<div><% String d= (String)session.getAttribute("d"); %></div>

	<% if(d.equals("CS")){
	csdepartment model = new csdepartment();
	model=(csdepartment)session.getAttribute("m");
		%>
		<div class="row">
			<div class="col-sm-4" style="background-color:white;"><h2 >Payment:</h2>
 	    	</div>
 	    </div><br><br>
 	    <div class="row">
			<div class="col-sm-3" style="background-color:white;">Card Details :<span style="color:red;">*</span>
  			</div>
			<input type="number" name="card" value="<% if(model.getCard()!=0){ %><%=model.getCard()%><% }%>" required><span style="color:red"><%=(session.getAttribute("errmsg")== null)? "": session.getAttribute("errmsg") %></span>
			<br>
		</div ><br><br>
		<div  >   <input class="btn btn-info center-block " type="submit" value="Pay and Submit">
 		</div>
 	<%} 
else if(d.equals("ME")){
	medepartment model = new medepartment();
	model=(medepartment)session.getAttribute("m");
	 %>	<div class="row">
<div class="col-sm-4" style="background-color:white;"><h2>Payment:</h2>
  </div>
  </div>
  <br><br>
<div class="row">
		
<div class="col-sm-3" style="background-color:white;">Card Details :<span style="color:red;">*</span>
  </div>
<input type="number" name="card" value="<% if(model.getCard()!=0){ %><%=model.getCard()%><% }%>" required> <span style="color:red"><%=(session.getAttribute("errmsg")== null)? "": session.getAttribute("errmsg") %></span>
			<br>
</div ><br><br>
<div>   <input class="btn btn-info center-block "  type="submit" value="Pay and Submit">
 </div>
 <%} 
else if(d.equals("EE")){
	eedepartment model = new eedepartment();
	model=(eedepartment)session.getAttribute("m");
	 %>
		<div class="row">
<div class="col-sm-4" style="background-color:white;"><h2>Payment:</h2>
  </div>
  </div>
  <br><br>
<div class="row">
		
<div class="col-sm-3" style="background-color:white;">Card Details :<span style="color:red;">*</span>
  </div>
<input type="number" name="card" value="<% if(model.getCard()!=0){ %><%=model.getCard()%><% }%>" required> <span style="color:red"><%=(session.getAttribute("errmsg")== null)? "": session.getAttribute("errmsg") %></span>
			<br>
</div ><br><br>
<div >   <input class="btn btn-info center-block " type="submit" value="Pay">
 </div>
 <%} 
 %>
 </form>
 
</div>
 </body>
