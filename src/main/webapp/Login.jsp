<!DOCTYPE >
<html lang="en"> 

<head>
<meta http-equiv="X-UA-Compatible" content="html for showing success page after login" charset="utf-8">
<title>Login page</title>
<link rel="stylesheet" href="css/login.css">
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

</style>

</head>
<body >
<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="#">UNC Charlotte</a></h1>
			<div id="menu">
				
			</div>
		</div>
	</div>
</div>
<div id="page-wrapper">
	<div id="page" class="container">
		<div class="title">
			<h2>Welcome Students</h2>
		</div>
		
	</div>
</div>

 <div class="container">
     <div class="login">
      <h1>Login for students</h1>

<form action="LoginControllerServlet" method="post" >

<input type= "hidden" name="action" value="student"/>
<h1>Login for Students</h1>
<pre class="input">Email-id  :  <input name = "emailid" type ="email" value="<%=(request.getAttribute("given_email") == null) ? "" : request.getAttribute("given_email") %>" required> </pre>

<pre class="text">Password : <input type="password" name="password" value ="<%= (request.getAttribute("given_password") == null) ? "": request.getAttribute("given_password")%>" required >  </pre>


<p class= "error"> <%= (request.getAttribute("errmessage") == null)? "": request.getAttribute("errmessage")%>
</p>
<p class="submit"><input type="submit" value="submit"></p><br>
<p class= "signup" ><a href="LoginControllerServlet?action=signup_page">Not registered? Click here to sign up</a><p>
</form>
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

</body>
</html>