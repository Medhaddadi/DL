<%@ taglib  prefix="c" tagdir=""%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Jeu de dès<</title>
</head>
<body>

<h1>Page d'érreur</h1>


<ul>

  <c: forEach items="${requestScope.messages}" var="msg">

    <li style="color: red">${msg.text}</li>
  </c:>
</ul>


</body>
</html>
