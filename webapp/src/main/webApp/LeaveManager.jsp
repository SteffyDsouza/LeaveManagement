<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

 <script type="text/javascript">
    function go(){
        var duration;
    	var e1 = document.getElementById("startDate").value;
        var e2 = document.getElementById("endDate").value;
        var date1=e1.substring(8,10);
        var date2=e2.substring(8,10); 
        if(date1>date2){
        	 duration=date1-date2;
            }else{
            	document.getElementById("note").innerHTML="start date should be smaller than end date";
                }
       
        document.getElementById("duration").value=duration;
        
        
        }
 </script>
<body>
 Inside leaveManager
 <form action="addleave" method="post" id="form_id" >
  <div >
    
    <p>Please fill in this form </p>
    <hr>
    
        <label for="startDate"><b>Select Start date</b></label>
    <input type="date" placeholder="Enter start date" name="startDate" id="startDate" required>
   <br>    
    
       <label for="endDate"><b>Select End date</b></label>
    <input type="date" placeholder="Enter end date" name="endDate" id="endDate" required>
   <br>    

    <label for="duration"><b>Duration</b></label>
    <input type="text" placeholder="Enter Email" id="duration" name="duration" onfocus="go()">
     <br>
     
     <label for="reason"><b>Reason for Leave</b></label>
    <textarea form="form_id" placeholder="Enter Password" name="reason" id="Reason" required></textarea>
     <br>

    <label for="contact"><b>contact No</b></label>
    <input type="text" placeholder="Enter project" name="contact" required>
     <br>
 
    

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>
   
</form>
<p id="note"></p>

</body>
</html>