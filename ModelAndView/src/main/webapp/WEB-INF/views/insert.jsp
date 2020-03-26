<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>INSERT EMPLOYEE DETAILS</h1>
	<h2>${msg}</h2>
	<form:form action="insert" method="post" modelAttribute="employee">
		<form:label path="id">ID</form:label>
		<form:input path="id" /><br>
		<form:label path="firstname">FIRSTNAME</form:label>
		<form:input path="firstname" />
		<form:label path="lastname">LASTNAME</form:label>
		<form:input path="lastname" /><br>
		<form:label path="salary">SALARY</form:label>
		<form:input path="salary" /><br>
	<input type="submit" name="save" value="INSERT" />
	<input type="reset" name="reset" value="CLEAR">
</form:form>
<div id ="container" style="magin:auto; width:100%;">
<a href ="/ModelAndView/"><button type="button" height="100px" width="50px">DISPLAY</button></a>
</div>
</body>
</html>