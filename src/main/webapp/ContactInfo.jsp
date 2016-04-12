<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ page import = "com.institute.models.students" %>
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
 	</style>
 	</head>

<body>
<div id="header">
<h1>The Graduate School- Online Application Portal</h1>
</div>
<div id="nav">
<b><h4>CONTACT INFORMATION:</h4></b>
<p>The information you provide will used to contact you during the application process. 
Therefore, it is very important that you enter the information carefully, 
and update it if any changes occur.  If you need to update this information after submitting your application, 
logon to the portal and click the "Update Your Profile Information" left menu item.
</div>

<form action="StudentContactinfoServlet" method="post" >

<input type="hidden" name ="email" value="<%= request.getAttribute("email") %>">
 <br>
 <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">Country<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="Country">
 </div>
 <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">Address Line 1<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="Addline1">
 </div>
 <br>
 
 <div class="text">
<div class="col-sm-4" style="background-color:white;">Address Line 2
  </div><input type="text" name="Addline2">
 </div>
 <br>
 
 <div class="text">
<div class="col-sm-4" style="background-color:white;">City<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="City">
 </div>
 <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">State/Province:<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="State">
</div>
 <br>
<div class="text">
<div class="col-sm-4" style="background-color:white;">Postal code:<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="Postal"></div>
  
   <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">Phone Number:<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="Phone">
 </div>
 <br>
  
  <br>
  <div class ="submit"> <input type="submit" name="previous" value="previous"> <input type="submit" name="next" value="next"></div>
 </form>

  
 <br> 
</body>
</html>