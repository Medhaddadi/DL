<%@ taglib  prefix="c" tagdir=""%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Jeu de dès</title>
</head>
<body>

<h1>Opération effectuée avec succés</h1>

<ul>

    <c: items="${requestScope.messages}" var="msg">

        <li style="color: green">${msg.text}</li>
    </c:>
</ul>


</body>
</html>
