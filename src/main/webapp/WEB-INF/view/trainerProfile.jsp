<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page  isELIgnored="false" session="false" %>
<html>
  <head>
    <title>Trainer</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>trainer Profile</h1>

    <c:out value="${trainer.firstName}" /><br/>
    <c:out value="${trainer.secondName}" /><br/>
    <c:out value="${trainer.age}" /><br/>
    <c:out value="${player.salary.amount}" /><br/>
  </body>
</html>
