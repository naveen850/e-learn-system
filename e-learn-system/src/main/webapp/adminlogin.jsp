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
<form:form action="login" method="post" modelAttribute="admin">
<form:input path="user" type="text"/><br>
<form:input path="password" type="password"/><br>
<input type="submit" value="login">

</form:form>
</body>
</html>