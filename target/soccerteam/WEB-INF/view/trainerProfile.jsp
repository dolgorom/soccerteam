<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page  isELIgnored="false" session="false" %>
<html>
  <head>
    <title>Trainer</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>trainer Profile</h1>
    <table >
      <tr>
        <td>First Name:</td>
        <td><c:out value="${trainer.firstName}" /></td>
      </tr>
      <tr>
        <td>Second name:</td>
        <td><c:out value="${trainer.secondName}" /></td>
      </tr>
      <tr>
        <td>Age:</td>
        <td> <c:out value="${trainer.age}" /></td>
      </tr>
      <tr>
        <td>Salary:</td>
        <td><c:out value="${trainer.salary.amount}" /></td>
      </tr>
    </table>

    <br/>
    <button onclick="document.location='/'" />Return</button>
  </body>
</html>
