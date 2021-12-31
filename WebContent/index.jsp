<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<style type="text/css">
*{
    box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    }
    
 .mydiv{
    position: absolute;
    right: 50%;
    bottom: 50%;
 }
 
 h1{
   text-align: center;
   margin-top: 150px
   
 }

body{
    font-family: Helvetica;
    -webkit-font-smoothing: antialiased;
    background: rgba( 71, 147, 227, 1);
    
}

label{
  font-size: 20px;
  color: black;
  text-transform: uppercase;
}

</style>
<h1>Login</h1>
<p style="color:red; text-align: center;"><c:out value="${error}"></c:out></p>
<form action="LoginController" method="post">
<div class="mydiv">
<label>User  :</label>
<input type="text" name ="user"/>
<br>
<label>Password  :</label>
<input type="text" name = "password"/>
<br>
<input type="submit" value="envoyer"/>
</div>
</form>
</head>
<body>

</body>
</html>