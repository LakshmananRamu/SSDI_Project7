<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.institute.models.*" %>
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
<br>
<h4>Please fill this department specific form. Decision will vary from departments according to vacancies</h4>
</div>

<form action="StudentQuestionsServlet" method="post" >


<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">

<input type="hidden" name="department" value="<%= session.getAttribute("d") %>">

<input type="hidden" name="m" value="<%= session.getAttribute("m") %>">
<!-- <div><%= session.getAttribute("email") %></div>
<div><%= session.getAttribute("m") %></div>
 -->
 <div><% String d= (String)session.getAttribute("d"); %></div>
<% if(d.equals("CS")){
	csdepartment model = new csdepartment();
	model=(csdepartment)session.getAttribute("m");
	int a1=0;int a2=0;int a3=0;int a4=0; int a5=0;
	if(model!=null){
	  a1= model.getQues1();
	  a2= model.getQues2();
	  a3= model.getQues3();
	  a4= model.getQues4();
	  a5= model.getQues5();}%>
	 	<div class="text">
<div class="col-sm-4" style="background-color:white;">Please complete the form:<div class="col-sm-1" style="color:red;">*</div>
  </div>
  <br><br>
 <div class="col-sm-4" style="background-color:white;">Q1:"<%= request.getAttribute("custom1") %>"
  </div>
<input type="radio" name="ans1" value="1" <%if(a1==1 ) {%> checked<%} %>>YES    
<input type="radio" name="ans1" value="0"<%if(a1!=1 ) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q2:"<%= request.getAttribute("custom2") %>"
  </div>
<input type="radio" name="ans2" value="1" <%if(a2==1) {%> checked<%} %>>YES
<input type="radio" name="ans2" value="0" <%if(a2!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q3:"<%= request.getAttribute("custom3") %>"
  </div>
<input type="radio" name="ans3" value="1" <%if(a3==1) {%> checked<%} %>>YES
<input type="radio" name="ans3" value="0" <%if(a3!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q4:"<%= request.getAttribute("custom4") %>"
  </div>
<input type="radio" name="ans4" value="1" <%if(a4==1) {%> checked<%} %> >YES
<input type="radio" name="ans4" value="0" <%if(a4!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q5:"<%= request.getAttribute("custom5") %>"
  </div>
<input type="radio" name="ans5" value="1" <%if(a5==1) {%> checked<%} %>>YES
<input type="radio" name="ans5" value="0" <%if(a5!=1) {%> checked<%} %>>NO<br>
<br>
</div>
<div>  <br> <input class="btn btn-info center-block " type="submit" value="next">
 </div>
 
	
	<%}
	else if(d.equals("ME")){
		medepartment model = new medepartment();
		model=(medepartment)session.getAttribute("m");
		int a1=0;int a2=0;int a3=0;int a4=0; int a5=0;
		if(model!=null){
		  a1= model.getQues1();
		  a2= model.getQues2();
		  a3= model.getQues3();
		  a4= model.getQues4();
		  a5= model.getQues5();}%>
		 
		 	<div class="text">
<div class="col-sm-4" style="background-color:white;">Please complete the form:<div class="col-sm-1" style="color:red;">*</div>
  </div>
  <br><br>
 <div class="col-sm-4" style="background-color:white;">Q1:"<%= request.getAttribute("custom1") %>"
  </div>
<input type="radio" name="ans1" value="1" <%if(a1==1 ) {%> checked<%} %>>YES    
<input type="radio" name="ans1" value="0"<%if(a1!=1 ) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q2:"<%= request.getAttribute("custom2") %>"
  </div>
<input type="radio" name="ans2" value="1" <%if(a2==1) {%> checked<%} %>>YES
<input type="radio" name="ans2" value="0" <%if(a2!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q3:"<%= request.getAttribute("custom3") %>"
  </div>
<input type="radio" name="ans3" value="1" <%if(a3==1) {%> checked<%} %>>YES
<input type="radio" name="ans3" value="0" <%if(a3!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q4:"<%= request.getAttribute("custom4") %>"
  </div>
<input type="radio" name="ans4" value="1" <%if(a4==1) {%> checked<%} %> >YES
<input type="radio" name="ans4" value="0" <%if(a4!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q5:"<%= request.getAttribute("custom5") %>"
  </div>
<input type="radio" name="ans5" value="1" <%if(a5==1) {%> checked<%} %>>YES
<input type="radio" name="ans5" value="0" <%if(a5!=1) {%> checked<%} %>>NO<br>
<br>
</div>
<div>  <br> <input class="btn btn-info center-block " type="submit" value="next">
 </div>
 
	
		 
		 
	<%}
	else if(d.equals("EE")){
		eedepartment model = new eedepartment();
		model=(eedepartment)session.getAttribute("m");
		int a1=0;int a2=0;int a3=0;int a4=0; int a5=0;
		if(model!=null){
		  a1= model.getQues1();
		  a2= model.getQues2();
		  a3= model.getQues3();
		  a4= model.getQues4();
		  a5= model.getQues5();}%>	 
		 
		 		 	<div class="text">
<div class="col-sm-4" style="background-color:white;">Please complete the form:<div class="col-sm-1" style="color:red;">*</div>
  </div>
  <br><br>
 <div class="col-sm-4" style="background-color:white;">Q1:"<%= request.getAttribute("custom1") %>"
  </div>
<input type="radio" name="ans1" value="1" <%if(a1==1 ) {%> checked<%} %>>YES    
<input type="radio" name="ans1" value="0"<%if(a1!=1 ) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q2:"<%= request.getAttribute("custom2") %>"
  </div>
<input type="radio" name="ans2" value="1" <%if(a2==1) {%> checked<%} %>>YES
<input type="radio" name="ans2" value="0" <%if(a2!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q3:"<%= request.getAttribute("custom3") %>"
  </div>
<input type="radio" name="ans3" value="1" <%if(a3==1) {%> checked<%} %>>YES
<input type="radio" name="ans3" value="0" <%if(a3!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q4:"<%= request.getAttribute("custom4") %>"
  </div>
<input type="radio" name="ans4" value="1" <%if(a4==1) {%> checked<%} %> >YES
<input type="radio" name="ans4" value="0" <%if(a4!=1) {%> checked<%} %>>NO<br>
<br>
<div class="col-sm-4" style="background-color:white;">Q5:"<%= request.getAttribute("custom5") %>"
  </div>
<input type="radio" name="ans5" value="1" <%if(a5==1) {%> checked<%} %>>YES
<input type="radio" name="ans5" value="0" <%if(a5!=1) {%> checked<%} %>>NO<br>
<br>
</div>
<div> <br>  <input class="btn btn-info center-block " type="submit" value="next">
 </div>
	
	<% }
	%>
</form>
</div>
 </body>
