<%@page import="lombok.EqualsAndHashCode.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>



<!-- <link rel="stylesheet" href="css/bootstrap.css"> -->
<!-- <script src="js/jquery.min.js"></script> -->
<!-- <script src="js/bootstrap.min.js"></script> -->




<title>Insert title here</title>
</head>
<body>
 <%@include file="navbar.jsp" %>
<form action="add" method="post" >
  <div >
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
       <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
   <br>    

    <label for="email"><b>Email</b></label>
    <input type="email" placeholder="Enter Email" name="email" required>
     <br>
     
     <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
     <br>

    <label for="projectname"><b>Project Name</b></label>
    <input type="text" placeholder="Enter project" name="projectname" required>
     <br>
    <label for="projectname"><b>Project Name</b></label>
    <select><c:forEach items="${list}" var="obj">
    
    <option></option>
    </select>
     <br>
     
 
    <label for="supervisor"><b>Supervisor</b></label>
    <input type="text" placeholder="Enter supervisor name" name="supervisor" required>
     <br>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>
   
</form>
</body>
</html>