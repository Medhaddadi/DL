<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<!doctype html>
<html lang="en">
<head>

    <title>Jeu de dès</title>
</head>

<body>

<div class="container">

    <form class="form-signin" method="POST"
          action="${pageContext.request.contextPath}/LoginServlet">
        <%--@declare id="inputemail"--%>
        <div>
            <a href="${pageContext.request.contextPath}/gestionJoueur?creer">S'inscrire</a>
        </div>
        <h2 class="form-signin-heading">Connexion</h2>
        <label for="inputEmail" class="sr-only">Nom d'utilisateur</label> <input type="text" class="form-control" placeholder="Nom d'utilisateur" required autofocus name="login">
        <label for="inputPassword" class="sr-only">Mot de passe</label> <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>

    <div>


        <ul>

            <c: forEach items="${requestScope.messages}" var="msg">


                <c: choose>
                    <c: when test="${msg.type == Message.WARN}">
                        <li style="color: yellow">${msg.text}</li>
                    </c:>
                    <c: when test="${msg.type == Message.INFO}">
                        <li style="color: green">${msg.text}</li>
                    </c:>
                    <c: when test="${msg.type == Message.ERROR}">
                        <li style="color: red">${msg.text}</li>
                    </c:>
                    <c: otherwise>
                        <li >${msg.text}</li>
                    </c:>
                </c:>

            </c:>
        </ul>
    </div>
</div>
</body>
</html>
