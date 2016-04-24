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
 		 #next,
#previous{
    display: inline-block;
    vertical-align: top;
}
 
 	</style>
</head>
<body>
<div id="header">
<h1>The Graduate School- Online Application Portal</h1>
</div>
<h4><b>Working HISTORY</b></h4>
<br>
<br>

<form action="StudentEmployerServlet" method="post">

<input type="hidden" name="model" value="<%= session.getAttribute("model") %>">
<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
<%Student_profile m = new Student_profile();
	int exp=0;
	String emp="";
	String firm="";
	String pos="";
	String con="";
	
	%>
<%if(session.getAttribute("model")!=null ) {%>
<% m= (Student_profile)session.getAttribute("model");
 exp=(int)m.getExp()  ;
emp=(m.getEmp_status() == null) ? " ":m.getEmp_status() ;
firm= (m.getFirm()== null) ? "":m.getFirm();
pos=(m.getPos() == null) ? "": m.getPos() ;
con=(m.getCon() == null) ? "":m.getCon() ;

}  %>


<div class="col-sm-4" style="background-color:white;"><p>What is your current employee status<span style="color:red">*</span></p>
  </div>
  <select name="emp_status">
 <option value="employed" <%if(emp.equals("employed")){ %>selected <%} %>>employed</option>
 <option value="unemployed" <%if(emp.equals("unemployed")){ %>selected <%} %>>unemployed</option>
 </select>

 <br>

<br>
<div class="text">
<p> If Yes,</p>
<div class="col-sm-4" style="background-color:white;">Employer or Firm:
  </div><input type="text" name="frim" value="<%=firm%>">
 </div>
 <br>
<div class="text">
<div class="col-sm-4" style="background-color:white;">Position:
  </div><input type="text" name="pos" value="<%=pos%>">
</div>
 <br>
 <div class="text">
<div class="col-sm-4" style="background-color:white;">Country
  </div><input type="text" name="con" value="<%=con%>">
 </div><br>
<div class="text">
<div class="col-sm-4" style="background-color:white;">Experience(in months)
  </div><input type="text" name="exp" value="<%=exp %>">
 </div>
 <br>
<div class ="submit"> <input type="submit" name="previous" value="previous"> <input type="submit" name="submit" value="submit"></div>
 </form>
</body>
</html>