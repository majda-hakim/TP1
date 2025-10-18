<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>Forward Source</title></head>
<body>

<%
    System.out.println("Avant le forward : Exécution dans ForwardSource.jsp");
    out.println("<h3>Avant le forward : affichage dans la page source</h3>");
%>

<jsp:forward page="ForwardTarget.jsp" />

<%
    System.out.println("Après le forward : ce code ne s'exécute PAS !");
    out.println("<h3>Après le forward : ce texte ne s'affichera jamais</h3>");
%>

</body>
</html>
