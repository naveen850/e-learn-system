<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     
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

   
<title>Faculty Login Form</title>
          <script type=text/javascript>
        function validate()
        {
             var object=document.getElementById("mail");
            var email=object.value;
            
            var atposition=email.indexOf("@");
            var dotposition=email.indexOf(".");
            var at=0;
            var dot=0;
            for( var i=0;i<email.length;i++)
            {
                if(email.charAt(i)=='@')
                {
                    at++;
                }
                if(email.charAt(i)=='.')
                {
                    dot++;
                }
            }
               
                      if(((at==1)&&(dot==1))&&(atposition<dotposition))
                             {
                              alert("email is correct");
                                }
                         else{
             alert("plearse enter valid email address");

                      return false;
                          }
        }
        </script>
</head>
<body>
<form:form action="facultyLogin" method="post" modelAttribute="faculty" onsubmit="return validate()">
 <table class="table table-hover">
     <tr>
 	<td>Email</td><td><form:input path="email" type="text" id="mail"/></td>
 	</tr>
 	<tr>
 	<td>Password</td><td><form:input path="password" type="text"/></td>
 	</tr>
 	
 	<tr>
 	<td><input type="submit" value="Login"></td>
    </tr>
 
 </table></form:form>
  ${Message }
</body>
</html>