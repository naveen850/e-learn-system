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
<form:form action="add" method="post" modelAttribute="course" enctype="multipart/form-data" >
<form:select path="course" >
<option>Select</option>
<option>Java</option>


</form:select>
<form:input path="file" type="file" name="file1"/>
<input type="submit" value="ADD">


</form:form>
</body>
</html>