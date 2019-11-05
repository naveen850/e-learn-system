<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

   
</head>
<body>
<form:form action="addfaculty" method="post" modelAttribute="faculty">
<table class="table">
   
    <tr><td>Faculty Name:</td><td><form:input path="name" type="text"/></td></tr>
    <tr><td>Email:</td><td><form:input path="email" type="text"/></td></tr>
     <tr><td>Mobile:</td><td><form:input path="mobileNumber" type="text"/></td></tr>
     <tr><td>password:</td><td><form:input path="password" type="text"/></td></tr>
     <tr><td>Door Number:</td><td><form:input path="doorNumber" type="text"/></td></tr>
     <tr><td>Street:</td><td><form:input path="street" type="text"/></td></tr>
     <tr><td>Area:</td><td><form:input path="area" type="text"/></td></tr>
     <tr><td>City:</td><td><form:input path="city" type="text"/></td></tr>
     <tr><td>State:</td><td><form:input path="state" type="text"/></td></tr>
     <tr><td>PinCode:</td><td><form:input path="pincode" type="text"/></td></tr>
     <tr><td><input type="submit" value="Add Faculty"></td></tr>
   
    


</table>



</form:form>

${message}
</body>
</html>