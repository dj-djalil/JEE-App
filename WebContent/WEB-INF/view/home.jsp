<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

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
<h1>welcome home</h1>

<div class="mydiv">

  
 <a href="commandeForm">Ajouter Commande</a>
 <br/>
 <a href="list">Consulter la liste des Commandes</a>
 <br/>
 <a href="modifierPassword">Modifier Utilisateur</a>
 
 <br/>
 </div>
 
</body>
</html>