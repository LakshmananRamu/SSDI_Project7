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
<div id="nav">
<b>Personal Information</b><br>
<p> Enter your name Exactly as it appears on your Unites States social Security Card(or Passport if you are an international student).Leave the middile name 
<br>field blank if you do not have middle name.
<br>
</div>

<form action="StudentProfileServlet" method="post" >
<div class="container">


<input type="hidden" name ="email" value="l@uncc.e">

<div class="row">
 <div class="col-sm-4" style="background-color:blue;">Salutation:
 </div> 
 <div class="col-sm-4" style="background-color:white;">
 <select name="Salutation">
 <option value=" "></option>
 <option value="Mr.">Mr.</option>
 <option value="Mrs.">Mrs.</option>
 <option value="Mr.">Ms.</option>
</select></div>
</div>
 <br>
<div class="row">
<div class="col-sm-3" style="background-color:white;">First Name:</div>
<div class="col-sm-1" style="color:red;">*</div>
<div class="col-sm-4" style="background-color:white;"><input type="text" name="firstname"></div>
</div>
 <br>
<div class="text">
 <div class="col-sm-4">Last Name (Family):<div class="col-sm-1" style="color:red;">*</div>
</div><input type="text" name="lastname"> </div>
 <br>

<div class="text">
<div class="col-sm-4" style="background-color:white;">Suffix:
  </div>

 <select name="Suffix">
 <option value=" "></option>
 <option value="jr.">jr.</option>
 <option value="Sr.">Sr.</option>
 <option value="II.">II</option>
 <option value="III.">III</option>
 <option value="IV.">IV</option>
 <option value="V.">V</option>
</select>
</div>
   <br>
   <div class="text">
<div class="col-sm-4" style="background-color:white;">Preferred First Name:
  </div><input type="text" name="preffered_firstname"></div>
<br>
<!--------
<div class="text">
<div class="col-sm-4" style="background-color:white;">Other Names that may appear on Transcripts
  </div><input type="text" name="othername"></div>
-->
 <br> 
 
<div class="text">
<div class="col-sm-4" style="background-color:white;">Sex:<div class="col-sm-1" style="color:red;">*</div>
  </div>
  <select name="Sex">
  <option value=" "></option>
 <option value="male">Male</option>
 <option value="Female">Female</option>
 </select>
</div>
 <br>
<div class="text">
<div class="col-sm-2" style="background-color:white;">Date of birth:<div class="col-sm-1" style="color:red;">*</div>
  </div> <input type="text" name="Month">
 <div class="col-sm-1" style="background-color:white;"> </div>
  <input type="text" name="Date">

 <div class="col-sm-1" style="background-color:white;"> </div>
  <input type="text" name="year">
  (mm/dd/yyyy)
  </div><div>   <input type="submit" value="next">
 </div>
</div> 
 </form>
 
 </body>
