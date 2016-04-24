<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "com.institute.models.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>personal info</title>
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
<div id="nav">
<b>Personal Information</b><br>
<p> Enter your name Exactly as it appears on your Unites States social Security Card(or Passport if you are an international student).Leave the middile name 
<br>field blank if you do not have middle name.
<br>
</div>

<form action="StudentProfileServlet" method="post" >
<div class="container">


<input type="hidden" name="model" value="<%= session.getAttribute("model") %>">
<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
<%Student_profile m = new Student_profile();
	String sal="";
	String fn="";
	String sn="";
	String sex="";
	String dob="";
	String pref="";
	%>
<%if(session.getAttribute("model")!=null ) {%>
<% m= (Student_profile)session.getAttribute("model");
 sal=(m.getSalutation() == null) ? " ":m.getSalutation() ;
 fn = (m.getFirstname() == null) ? "":m.getFirstname();
sn= (m.getLastname() == null) ? "":m.getLastname() ;
sex=(m.getSex() == null) ? " ":m.getSex();
dob= (m.getDob() == null) ? "":m.getDob();
pref=(m.getPrefname() == null) ? "":m.getPrefname() ;

}  %>

<div class="row">
 <div class="col-sm-4" style="background-color:white;">Salutation:
 </div> 
 <div class="col-sm-4" style="background-color:white;">
 <select name="Salutation" >

 <option value="Mr." <%if(sal.equals("Mr.")){ %>selected<%} %>>Mr.</option>
 <option value="Mrs." <%if(sal.equals("Mrs.")){ %>selected<%} %>>Mrs.</option>
 <option value="Ms." <%if(sal.equals("Ms.")){ %>selected<%} %>>Ms.</option>
</select></div>
</div>
 <br>
<div class="row">
<div class="col-sm-4" style="background-color:white;">First Name:<span style="color:red">*</span>
</div>
<div class="col-sm-4" style="background-color:white;"><input type="text" name="firstname" value="<%= fn %>" required></div>
</div>
 <br>
<div class="row">
 <div class="col-sm-4">Last Name (Family):<span style="color:red">*</span>
</div>
 <div class="col-sm-4" style="background-color:white;"><input type="text" name="lastname" value="<%=sn%>" required> </div>
 </div>
 <br>
   <br>
   <div class="row">
<div class="col-sm-4" style="background-color:white;">Preferred First Name:
  </div> <div class="col-sm-4" style="background-color:white;"><input type="text" name="preffered_firstname" value="<%= pref%>"></div>
  </div>
<br>
<!--------
<div class="text">
<div class="col-sm-4" style="background-color:white;">Other Names that may appear on Transcripts
  </div><input type="text" name="othername"></div>
-->

 
<div class="row">
<div class="col-sm-4" style="background-color:white;">Sex:<span style="color:red">*</span>
  </div>
   <div class="col-sm-4" style="background-color:white;" >
  <select name="Sex">
  <option value="Male"  <%if(sex.equals("Male")){ %>selected<%} %>>Male             </option>
   <option value="Female"  <%if(sex.equals("Female")){ %>selected<%} %>>Female           </option>



 </select>
 </div>
</div>
 <br>
<div class="row">
<div class="col-sm-4" style="background-color:white;">Date of birth:<span style="color:red">*</span>
  </div>  <div class="col-sm-4" style="background-color:white;"><input type="date" name="dob" value="<%=dob%>">
 </div>
 <br><br>
  </div><div>   <input class="btn btn-info center-block " type="submit" value="next">
 </div>
</div> 
 </form>
 
 </body>
