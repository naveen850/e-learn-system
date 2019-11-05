<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

   
<title>Student Login Form</title>
</head>
<body>
<body background="" alt="no image"style="background-repeat: no-repeat; background-size: cover;">
<form:form action="studentRegister" method="post" modelAttribute="student">
 <table align="center" style="margin-top: 1%;" >
  <div class="form-group" style="margin-left: 2%; margin-right: 2%;">
  
  <tr> <td><label for="inputid"><b>Id :</b></label></td>
  	<td><form:input path="id" class="form-control" id="inputid" placeholder="Id"/></td></tr>
  
  <tr> <td><label for="inputName"><b>Name :</b></label></td>
  	<td><form:input path="name" class="form-control" id="inputName" placeholder="Name"/></td>
  	<td><form:errors path="name" cssClass="error"/></td></tr>
  	
       <tr> <td><label for="inputEmail"><b>Email :</b></label></td>
       <td> <form:input path="email" class="form-control" id="inputEmail" placeholder="Email"/></td>
       	<td><form:errors path="email" cssClass="error"/></td></tr></tr>
       
           <tr> <td><label for="inputMobile"><b>MobileNumber :</b></label></td>
       <td> <form:input path="mobileNumber" class="form-control" id="inputMobile" placeholder="Number"/></td>
       	<td><form:errors path="mobileNumber" cssClass="error"/></td></tr>
    
       <tr><td> <label for="inputPassword"><b>Password :</b></label></td>
       <td> <form:input path="password" class="form-control" id="inputPassword" placeholder="Password"/></td>
       <td><form:errors path="password" cssClass="error"/></td></tr>
       
        <tr> <td><label for="inputCourse"><b>CourseName :</b></label></td>
       <td> <form:input path="courseName" class="form-control" id="inputCourse" placeholder="CourseName"/></td>
       	<td><form:errors path="courseName" cssClass="error"/></td></tr>
    
           <tr> <td><label for="inputDoorNo"><b>DoorNumber :</b></label></td>
       <td> <form:input path="doorNumber" class="form-control" id="inputDoorNo" placeholder="DoorNumber"/></td>
       	<td><form:errors path="doorNumber" cssClass="error"/></td></tr>
    
       <tr> <td><label for="inputStreet"><b>Street :</b></label></td>
       <td> <form:input path="street" class="form-control" id="inputStreet" placeholder="StreetName"/></td>
       	<td><form:errors path="street" cssClass="error"/></td></tr>
    
       <tr> <td><label for="inputArea"><b>Area :</b></label></td>
       <td> <form:input path="area" class="form-control" id="inputArea" placeholder="Area"/></td>
       	<td><form:errors path="area" cssClass="error"/></td></tr>
    
       <tr> <td><label for="inputCity"><b>City :</b></label></td>
       <td> <form:input path="city" class="form-control" id="inputCity" placeholder="City"/></td>
       	<td><form:errors path="city" cssClass="error"/></td></tr>
    
       <tr> <td><label for="inputState"><b>DoorNumber :</b></label></td>
       <td> <form:input path="state" class="form-control" id="inputState" placeholder="State"/></td>
       	<td><form:errors path="state" cssClass="error"/></td></tr>
       	
       	<tr><td><label for="inputPincode"><b>PinCode :</b></label></td>
       	<td><form:input path="pincode" class="form-control" id="inputPincode" placeholder="pincode"/></td>
       	<td><form:errors path="pincode" cssClass="error"/>
    
    <tr><td><input type="submit" value="Register"></td></tr>
          </div>
        </table>
 </form:form>
  ${Message }

</body>
</html>