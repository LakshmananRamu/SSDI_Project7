
<title>Home Page</title>
  
  <%@ page import = "com.institute.models.students" %>
 
<center><h2>Home Page</h2></center>
 Welcome,
 
<%= session.getAttribute("email") %>


<div class = "application">

 <form action="StudentHomeServlet" method="post">
 <input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
 
<input type = "submit" name="" value = "profile">
</form><br>
<br>
 
 <form action="student_newapplication.jsp" method="post">
 <input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
 
<input type = "submit" name="" value = "+create new application">
</form><br>
<br>
 <form action="StudentEditapplicationServlet" method="post">
 <input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
 
<input type = "submit" name="" value = "Edit application">
</form><br>
<br>
 <form action="StudentApplicationServlet" method="post">
 <input type="hidden" name ="email" value="<%= session.getAttribute("email") %>">
 
<input type = "submit" name="" value = "Submitted application">
<br>

 </form>

 </div>
 