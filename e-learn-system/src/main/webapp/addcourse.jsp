<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addcourse" method="post" modelAttribute="course">
<table>
    <tr><td>Course Id:</td><td><form:input path="courseId" type="text"/></td></tr>
    <tr><td>Course Name:</td><td><form:input path="courseName" type="text"/></td></tr>
    <tr><td>Duration:</td><td><form:input path="duration" type="text"/></td></tr>
     <tr><td>Fee:</td><td><form:input path="fees" type="text"/></td></tr>
     <tr><td><input type="submit" value="Add Course"></td></tr>
   
    


</table>



</form:form>

${message}
</body>
</html>