<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="Model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifier User</title>
<style type="text/css">
    body{
    font-family: Helvetica;
    -webkit-font-smoothing: antialiased;
    background: rgba( 71, 147, 227, 1);
    
}

 a{
    text-decoration: none;
    color: black;
    line-height: 50px;
    text-transform: uppercase;
  }
  
  .mydiv{
     position: absolute;
     top: 30%;
     bottom: 50%;
     right: 50%;
  }
  
  h1{
    text-align: center;
    text-transform: capitalize;
  }
  
</style>
</head>
<body>
<h1>Modifier Utilisateur</h1>
<p style="color:red"><c:out value="${message}"></c:out></p>
   <form action="modifierPassword" method="post">
   <div class="mydiv">
    <label>usernname</label>
    <input name="newUserName" type="text" value="${user.getUserName()}" />
    <br/>
    <label>password</label>
    <input name="newPassword" type="text" value="${user.getPassword()}"/>
    <br/>
    <input  type="submit" value="Modifier">
    </div>
   </form>
</body>
</html>