<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page  isELIgnored="false" session="false" %>
<html>
  <head>
    <title>player</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Player Profile</h1>

    <c:out value="${player.firstName}" /><br/>
    <c:out value="${player.secondName}" /><br/>
    <c:out value="${player.birthcountry}" /><br/>
    <c:out value="${player.position}" /><br/>
    <c:out value="${player.salary.amount}" /><br/>
  </body>
</html>
