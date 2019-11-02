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
                              return true;
                                }
                         else{
             alert("plearse enter valid email address");

                      return false;
                          }
        }
        </script>
</head>
<body background="faculty.jpg" style="background-repeat: no-repeat; background-size: cover;">
<form:form action="facultyLogin" method="post" modelAttribute="faculty" onsubmit="return validate()">
 <table align="center" style="margin-top: 19%;" >
 <div class="form-group" style="margin-left: 2%; margin-right: 2%;">
       <tr> <td><label for="inputEmail"><b>Email</b></label></td></tr>
       <tr><td> <form:input path="email" class="form-control" id="inputEmail" placeholder="Email"/></td></tr>
        
        </div>
        <div class="form-group" style="margin-left: 2%;margin-right: 2%;"><tr></tr>
       <tr><td> <label for="inputPassword"><b>Password</b></label></td></tr>
       <tr><td> <form:input path="password" class="form-control" id="inputPassword" placeholder="Password"/>
       </td></tr>
        </div>
         <div class="form-group" style="margin-left: 2%;margin-right: 2%;">
     <tr><td>   <label class="form-check-label"><input type="checkbox"> <b>Remember me</b></label></td></tr>
    </div>
   <tr><td> <button type="submit" class="btn btn-primary" style="margin-left: 2%;margin-right: 2%;">Login</button>
     </td></tr>
        </table>
 </form:form>
  ${Message }
</body>
</html>