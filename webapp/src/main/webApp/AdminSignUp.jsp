<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="adminSignUp" method="post" >
  <div >
  
   <%@include file="AdminNavbar.jsp" %>
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
       <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
   <br>    

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
     <br>
     
     <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
     <br>

 <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>
 ${msg}
</form>
</body>
</html>