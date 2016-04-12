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
<h4><b>Custom Questions</b></h4>
<br>
<br>

<form action="StudentCustomServlet" method="post">
<input type="hidden" name ="email" value="<%= request.getAttribute("email") %>">
<div class="row">
<div  class="col-sm-4" style="background-color:white;"><%= request.getAttribute("custom1") %>
  </div>
  <div class="col-sm-4" style="background-color:white;">
  <select name="custom1">
  <option value="custom1"></option>
 <option value="Yes">Yes</option>
 <option value="No">No</option>
 </select>
</div>
</div>
 <br>

<div class="row">
<div  class="col-sm-4" style="background-color:white;"><%= request.getAttribute("custom2") %>
  </div>
  <div class="col-sm-4" style="background-color:white;">
  <select name="custom2">
  <option value="custom2"></option>
 <option value="Yes">Yes</option>
 <option value="No">No</option>
 </select>
</div>
</div>
 <br>

<div class="row">
<div  class="col-sm-4" style="background-color:white;"><%= request.getAttribute("custom3") %>
  </div>
  <div class="col-sm-4" style="background-color:white;">
  <select name="custom3">
  <option value="custom3"></option>
 <option value="Yes">Yes</option>
 <option value="No">No</option>
 </select>
</div>
</div>
 <br>
 
 <div class="row">
<div  class="col-sm-4" style="background-color:white;"><%= request.getAttribute("custom4") %>
  </div>
  <div class="col-sm-4" style="background-color:white;">
  <select name="custom4">
  <option value="custom4"></option>
 <option value="Yes">Yes</option>
 <option value="No">No</option>
 </select>
</div>
</div>
 <br>
 
 <div class="row">
<div  class="col-sm-4" style="background-color:white;"><%= request.getAttribute("custom5") %>
  </div>
  <div class="col-sm-4" style="background-color:white;">
  <select name="custom5">
  <option value="custom5"></option>
 <option value="Yes">Yes</option>
 <option value="No">No</option>
 </select>
</div>
</div>
 <br>
 
<div class ="submit"> <input type="submit" name="previous" value="previous"> <input type="submit" name="submit" value="submit"></div>
 </form>
</body>
</html>