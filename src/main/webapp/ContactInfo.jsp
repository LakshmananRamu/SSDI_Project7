<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import = "com.institute.models.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ page import = "com.institute.models.students" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact info</title>
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
<div class="container">

<input type="hidden" name="model" value="<%= session.getAttribute("model") %>">
<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
<%Student_profile m = new Student_profile();
	String con="";
	String add1="";
	String add2="";
	String city="";
	String state="";
	String postal="";
	String phone="";
	%>
<%if(session.getAttribute("model")!=null ) {%>
<% m= (Student_profile)session.getAttribute("model");
 con=(m.getCountry() == null) ? " ":m.getCountry() ;
 add1= (m.getAdd1() == null) ? "":m.getAdd1();
 add2= (m.getAdd2() == null) ? "":m.getAdd2() ;
city=(m.getCity() == null) ? " ":m.getCity() ;
state= (m.getState()== null) ? "":m.getState();
postal=(m.getPostal() == null) ? "":m.getPostal() ;
phone=(m.getPhone() == null) ? "":m.getPhone() ;

}  %>
 <br>
 <br>
 <div class="row">
<div class="col-sm-4" style="background-color:white; ">Country<span style="color:red">*</span>
  </div><input type="text" name="Country" value="<%=con%>" required>
 </div>
 <br>
 <div class="row">
<div class="col-sm-4" style="background-color:white; ">Address Line 1<span style="color:red">*</span>
  </div><input type="text" name="Addline1" value="<%=add1%>" required>
 </div>
 <br>
 
 <div class="row">
<div class="col-sm-4" style="background-color:white;">Address Line 2
  </div><input type="text" name="Addline2" value="<%=add2%>">
 </div>
 <br>
 
 <div class="row">
<div class="col-sm-4" style="background-color:white;">City<span style="color:red">*</span>
  </div><input type="text" name="City" value="<%=city%>" required>
 </div>
 <br>
 <div class="row">
<div class="col-sm-4" style="background-color:white;">State/Province:<span style="color:red">*</span>
  </div><input type="text" name="State" value="<%=state%>" required>
</div>
 <br>
<div class="row">
<div class="col-sm-4" style="background-color:white;">Postal code:<span style="color:red">*</span>
  </div><input type="text" name="Postal" value="<%=postal%>" required></div>
  
   <br>
 <div class="row">
<div class="col-sm-4" style="background-color:white;">Phone Number:<span style="color:red">*</span>
  </div><input type="text" name="Phone" value="<%=phone%>" required>
 </div>
 <br>
  
  <br>
  <div class ="submit" align="center"> <input id="previous" class="btn btn-info center-block " type="submit"  name="previous" value="previous"> <input id="next" class="btn btn-info center-block " type="submit" name="next" value="next"></div>
 </div>
 </form>

  
 <br> 
</body>
</html>