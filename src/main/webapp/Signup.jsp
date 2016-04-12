<html>
<head>
<title>Student Registration Form</title>
<style type="text/css">

table{font-family: Calibri; font-size: 11pt; font-style: normal; background-color: white; border-collapse: collapse; }
table.inner{border: 0px}
.signup input[type=email], .signup input[type=password], .signup input[type=Retype-password] , .signup input[type=text]  {
  width: 278px;
    border: 1px solid;
  border-color: #c4c4c4 #d1d1d1 #d4d4d4;
  border-radius: 2px;
  -moz-outline-radius: 3px;
  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
}
.signup h3{
font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:Green;
text-align: center;
line-height: 60px;
  background: white;
  
  border-radius: 3px 3px 0 0;
  background-image: linear-gradient(to bottom, Green, #eef2f5);
}
</style>
</head>
 
<body>
<div class="signup">
<h3>STUDENT REGISTRATION FORM</h3>
<form action="SignupControllerServlet" method="POST">
 
<table  >
 
<!----- First Name ---------------------------------------------------------->
<tr>
<td> NAME :</td>
<td><input type="text" name="Name" maxlength="30" required><br>
</td>
</tr>

<!----- Email Id ---------------------------------------------------------->
<tr>
<td>EMAIL ID :</td>
<td><input type="email" name="emailid" maxlength="100" required/><br></td>
</tr>

<!----- password ---------------------------------------------------------->
<tr>
<td>PASSWORD :</td>
<td><input type="password" name="password" maxlength="20" required /><br></td>
</tr>

<!----- re-pass ---------------------------------------------------------->
<tr>
<td>Re-PASSWORD :</td>
<td><input type="password" name="Retype-Password" maxlength="20" /><br></td>
</tr>
    
<!----- Mobile Number ---------------------------------------------------------
<tr>
<td>MOBILE NUMBER :</td>
<td>
<input type="text" name="Mobile_Number" maxlength="10" />
(10 digit number)
</td>
</tr>
  ->
<!----- Gender ----------------------------------------------------------->
<tr>
<td>GENDER :</td>
<td>
Male <input type="radio" name="Gender" value="Male" />
Female <input type="radio" name="Gender" value="Female" /><br>
</td>
</tr>
  
<!----- Address ---------------------------------------------------------
<tr>
<td>Location :</td>
<td><input type="text" name="Location" maxlength="100" /><br></td>
</tr>
 -->
 <tr><td></td><td><p><%= (request.getAttribute("errmessage") == null) ? "": request.getAttribute("errmessage")%></p><br></td></tr>
<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">

</td>
</tr>
</table>
 
</form>
</div > 
</body>
</html>