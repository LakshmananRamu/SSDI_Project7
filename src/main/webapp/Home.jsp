<html>

<title>Home Page</title>
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900|Quicksand:400,700" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />

<style>
.button {
    background-color: white;
    border: none;
    color: white;
    padding: 4px 8px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
}

.button1 {
    background-color: white; 
    color: black; 
    border: 2px solid #4CAF50;
}

.button1:hover {
    background-color: #4CAF50;
    color: white;
}

.button2 {
    background-color: white; 
    color: black; 
    border: 2px solid #008CBA;
}

.button2:hover {
    background-color: #008CBA;
    color: white;
}

.button3 {
    background-color: white; 
    color: black; 
    border: 2px solid #f44336;
}

.button3:hover {
    background-color: #f44336;
    color: white;
}

.button4 {
    background-color: white;
    color: black;
    border: 2px solid #e7e7e7;
}

.button4:hover {background-color: #e7e7e7;}

.button5 {
    background-color: white;
    color: black;
    border: 2px solid #555555;
}

.button5:hover {
    background-color: #555555;
    color: white;
}
form {
    display: inline-block;
    text-align: center;
    }
    
</style>
<script type="text/javascript">

  <%if(request.getAttribute("msg")!=null){%>
  <% String a = (String)request.getAttribute("msg"); %>
  <%if(a.equals("error")){%>
  alert("already applied please do to edit appication to access application");
  <% }%>
  <%if(a.equals("no profile")){%>
  alert("Please complete profile to apply for departments");
  <% }%>
 <% }%> 
 </script>
 
</head>  
  <%@ page import = "com.institute.models.students" %>
 <div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="#">UNC Charlotte</a></h1>
			<div id="menu">
				<ul>
					<li class="current_page_item"><a href="Home.jsp" accesskey="1" title="">Home</a></li>
	
					<li class="current_page_item"><a href="index.jsp" accesskey="1" title="">LogOut</a></li>
					
				</ul>
			</div>
		</div>
	</div>
</div>
<div id="page-wrapper">
	<div id="page" class="container">
		<div class="title">
			<h2>Welcome <%= session.getAttribute("email") %></h2>
		</div>
		
	</div>
</div>
 
 
<div id="wrapper">
	<div id="three-column" class="container">
		<div><span class="arrow-down"></span></div>
		<div id="tbox1">
			<form action="StudentHomeServlet"  method="post" class="button">
			<input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
  
<input type = "submit" class="button button1" size="350" width="300" name="Student profile" value = "Student profile">
</form>			</div>

<div><span class="arrow-down"></span></div>
		<div id="tbox1">
			
			<form action="student_newapplication.jsp"  method="post" class="button">
			<input type="hidden"  name ="email" value="<%= session.getAttribute("email") %>">
 <input type = "submit" class="button button3" name="new" value = "create new application">
</form>  </div>
 <div><span class="arrow-down"></span></div>
		<div id="tbox1">
 
 <form action="StudentEditapplicationServlet" method="post" class="button"> 
 <input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
 
<input type = "submit" class="button button2" name="new" value = "Edit application">
</form></div>
<div><span class="arrow-down"></span></div>
		<div id="tbox1">

 <form action="StudentApplicationServlet" align="center" method="post" class="button">
 <input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
 
<input type = "submit" class="button button1" name="" value = "Submitted application">
 </form>
</div>
	<div id="tbox1">
			
			<form action="StudentEditapplicationServlet"  method="post" class="button">
			<input type="hidden"  name ="email" value="<%= session.getAttribute("email") %>">
 <input type = "submit" class="button button3" name="new" value = "Application Status">
</form>  </div>
 </div>
 </div>
 <div id="copyright" class="container">
	<p>&copy; Untitled. All rights reserved. | Photos by <a href="http://fotogrph.com/">Fotogrph</a> | Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>
		<ul class="contact">
			<li><a href="#" class="icon icon-twitter"><span>Twitter</span></a></li>
			<li><a href="#" class="icon icon-facebook"><span></span></a></li>
			<li><a href="#" class="icon icon-dribbble"><span>Pinterest</span></a></li>
			<li><a href="#" class="icon icon-tumblr"><span>Google+</span></a></li>
			<li><a href="#" class="icon icon-rss"><span>Pinterest</span></a></li>
		</ul>
</div>
 </html>
 