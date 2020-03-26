<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Employee Details</h1>
   <h2>${msg}</h2>
   <table border="2" height="50%" width="50%">
   <tr>
    <td>ID</td>
    <td>FIRST NAME</td>
    <td>LAST NAME</td>
    <td>SALARY</td>
    </tr>
    
   <tbody>
   <c:forEach items="${list}" var="emp">
   <tr>
   <td>${emp.id}</td>
   <td>${emp.firstname}</td>
   <td>${emp.lastname}</td>
   <td>${emp.salary }</td>
   </tr>
   </c:forEach>
   </tbody>
   </table>
   
   <a href="insert"><button type="button" height="100px" width="50px">INSERT</button></a>
   <a href="delete"><button type="button" height="100px" width="50px">DELETE</button></a>
   <a href="update"><button type="button" height="100px" width="50px">UPDATE</button></a>
   
</body>
</html>