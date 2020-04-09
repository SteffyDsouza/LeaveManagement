<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
 
Admin leave Manger page
<table>
   <thead>
      <tr>
      <th>Start Date</th>
      <th>End Date</th>
      <th>Duration</th>
      <th>Reason</th>
      <th>contact</th>
      </tr>
   </thead>
   <tbody>
    <c:forEach items="${list}" var="obj">
    <tr>
      <td>${obj.startDate}</td>
      <td>${obj.endDate}</td>
       <td>${obj.duration}</td>
       <td>${obj.reason} </td>
       <td>${obj.contact}</td> 
   </tr>
    </c:forEach>
   </tbody>
</table>
</body>
</html>