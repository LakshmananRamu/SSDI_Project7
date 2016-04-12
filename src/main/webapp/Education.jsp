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
 
 	</style>
</head>
<body>
<div id="header">
<h1>The Graduate School- Online Application Portal</h1>
</div>
<h4><b>EDUCATION HISTORY</b></h4>
<br>
<form action="StudentEducationServlet" method="post">
<input type="hidden" name ="email" value="<%= request.getAttribute("email") %>">
<div class="text">
<div class="col-sm-4" style="background-color:white;">GRE<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="GRE">
 </div>
 <br>
 <P>You need to submit either TOEFL or IELTS score Mandatory </P>
 <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">TOEFL
  </div><input type="text" name="TOFEL">
 </div>
 <br>
 <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">IELTS
  </div><input type="text" name="IELTS">
 </div>
 <br>
 <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">College or University
  </div><input type="text" name="college">
 </div>
 <br> 
 <br>
<div class="text">
<div class="col-sm-3" style="background-color:white;">Attend From Date<div class="col-sm-1" style="color:red;">*</div>
  </div>
    <input type="text" name="from_m">
  <div class="col-sm-1" style="background-color:white;"> </div>
  <input type="text" name="from_y">
  (mm/yyyy)
 </div>
 <br>
 <div class="text">
<div class="col-sm-3" style="background-color:white;">Attend To Date<div class="col-sm-1" style="color:red;">*</div>
  </div>
   <input type="text" name="to_m">
  <div class="col-sm-1" style="background-color:white;"> </div>
  <input type="text" name="to_y">
  (mm/yyyy)
 </div>
 <br>
 <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">Degree<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="degree">
 </div>
 <br>
 <br>
<div class="text">
<div class="col-sm-4" style="background-color:white;">Major<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="major">
 </div>
 <br>
 <br>
<div class="text">
<div class="col-sm-4" style="background-color:white;">GPA<div class="col-sm-1" style="color:red;">*</div>
  </div><input type="text" name="GPA">
 </div>
 <br>
 <br>
 <div class ="submit"> <input type="submit" name="previous" value="previous"> <input type="submit" name="next" value="next"></div>
 
</form>
</body>
</html>