<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

*{
    box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
}

body{
    font-family: Helvetica;
    -webkit-font-smoothing: antialiased;
    background: rgba( 71, 147, 227, 1);
    
}

.mydiv{
   position: absolute;
   right: 50%;
   bottom: 50%;
   
}

label{
  font-size: 20px;
  color: black;
  text-transform: uppercase;
}


h1{
  text-align: center;
}

.env{
  cursor: pointer;
  color: green;
  font-size: 15px;
  border: 1px solid grey;
  margin-top: 60px;
  margin-left: 130px;
}

.autreClass{
  cursor: pointer;
  color: red;
  font-size: 15px;
  border: 1px solid grey;
  float: right;
  margin-top: -22px;
  margin-right: 90px;
}
</style>
<meta charset="ISO-8859-1">
<title>Formulaire</title>
</head>
<body>
<h1> Formulaire Commande </h1>
<form action="controller" method="post">
<div class="mydiv">
   <label>num commande</label>
   <input type="text" name="num-commande"/>
   <br/>
   <br/>
   
   <label>date commande</label>
   <input type="date" name="date-commande"/>
   <br/>
   <br/>
   
   <label>quantite commande</label>
   <input type="text" name="quantite-commande"/>
   <br/>
   <br/>
   
   <label>nom fournisseur</label>
   
   <select name="fournisseur">
   <option value="Karim">Karim</option>
   <option value="yassin">yassin</option>
   <option value="youssef">youssef</option>
   <option value="farid">farid</option>
   </select>
   <br/>
   
   <input type="submit" value="envoyer" class="env"/>
</form>

 
 
</body>
</html>