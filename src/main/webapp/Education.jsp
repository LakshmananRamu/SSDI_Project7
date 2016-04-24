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
<h4><b>EDUCATION HISTORY</b></h4>
<br>
<form action="StudentEducationServlet" method="post">
<div class="container">

<input type="hidden" name="model" value="<%= session.getAttribute("model") %>">
<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
<%Student_profile m = new Student_profile();
	int GRE=0;
	int TOFEL=0;
	double IELTS=0;
	String college="";
	String date1="";
	String date2="";
	String degree="";
	String major="";
	double GPA=0;
	%>
<%if(session.getAttribute("model")!=null ) {%>
<% m= (Student_profile)session.getAttribute("model");
 GRE=(int)m.getGRE()  ;
 TOFEL=(int)m.getTOFEL();
 IELTS=m.getIELTS() ;
 GPA=m.getGPA();
college=(m.getCollege() == null) ? " ":m.getCollege() ;
date1= (m.getGrad_from()== null) ? "":m.getGrad_from();
date2=(m.getGrad_to() == null) ? "": m.getGrad_to() ;
degree=(m.getDegree() == null) ? "":m.getDegree() ;
major=(m.getMajor() == null) ? "":m.getMajor() ;
}  %>

<div class="row">
<div class="col-sm-4" style="background-color:white;">GRE<span style="color:red">*</span>
  </div><input type="number" name="GRE" value="<%if(GRE!=0){ %><%=GRE %><%} %>" required>
 </div>
 <br>
 <P>You need to submit either TOEFL or IELTS score Mandatory. Enter other as 0.</P>
 <br>
 <div class="row">
<div class="col-sm-4" style="background-color:white;">TOEFL<span style="color:red">*</span>
  </div><input type="number" name="TOFEL"  value="<%=TOFEL %>" required>
 </div>
 <br>

 <div class="row">
<div class="col-sm-4" style="background-color:white;">IELTS<span style="color:red">*</span>
  </div><input type="number" step="0.5" name="IELTS"  value="<%=IELTS %>" required>
 </div>
 <br>
 <div class="row">
<div class="col-sm-4" style="background-color:white;">College or University<span style="color:red">*</span>
  </div><input type="text" name="college"  value="<%=college %>" required>
 </div>
 <br> 
 <br>
<div class="row">
<div class="col-sm-4" style="background-color:white;">Attend From Date<span style="color:red">*</span>
  </div>
    <input type="date" name="grad_from" value="<%=date1 %>" required>
 </div>
 <br>
 <div class="row">
<div class="col-sm-4" style="background-color:white;">Attend To Date<span style="color:red">*</span>
  </div>
   <input type="date" name="grad_to" value="<%=date2 %>" required>
 </div>
 <br>
 <div class="row">
<div class="col-sm-4" style="background-color:white;">Degree<span style="color:red">*</span>
  </div><input type="text" name="degree" value="<%=degree %>" required>
 </div>
 <br>
 <br>
<div class="row">
<div class="col-sm-4" style="background-color:white;">Major<span style="color:red">*</span>
  </div><input type="text" name="major" value="<%=major %>" required>
 </div>
 <br>
 <br>
<div class="row">
<div class="col-sm-4" style="background-color:white;">GPA<span style="color:red">*</span>
  </div><input type="number" step="0.01" name="GPA" value="<%if(GPA!=0){ %><%=GPA %><%} %>" required>
 </div>
 <br>
 <br>
 <div class ="submit" align="center"> <input id="previous" class="btn btn-info center-block" type="submit" name="previous" value="previous">
 						 <input id="next" class="btn btn-info center-block" type="submit" name="next" value="next"></div>
 </div>
</form>
</body>
</html>