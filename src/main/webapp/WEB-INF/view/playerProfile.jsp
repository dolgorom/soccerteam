<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page  isELIgnored="false" session="false" %>
<html>
  <head>
    <title>player</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Player Profile</h1>
    <table >
      <tr>
        <td>First Name:</td>
        <td><c:out value="${player.firstName}" /></td>
      </tr>
      <tr>
        <td>Second name:</td>
        <td><c:out value="${player.secondName}" /></td>
      </tr>
      <tr>
        <td>Country:</td>
        <td> <c:out value="${player.birthcountry}" /></td>
      </tr>
      <tr>
        <td>Age:</td>
        <td> <c:out value="${player.age}" /></td>
      </tr>
      <tr>
        <td>Position:</td>
        <td><c:out value="${player.position}" /></td>
      </tr>
      <tr>
        <td>Salary:</td>
        <td><c:out value="${player.salary.amount}" /></td>
      </tr>
      <tr>
        <td>Goals:</td>
        <td><c:out value="${player.stats.numberOfGoals}" /></td>
      </tr>
      <tr>
        <td>Bookings:</td>
        <td><c:out value="${player.stats.numberOfBookings}" /></td>
      </tr>
    </table>
    <br/>
    <button onclick="document.location='/'" />Return</button>
  </body>
</html>
