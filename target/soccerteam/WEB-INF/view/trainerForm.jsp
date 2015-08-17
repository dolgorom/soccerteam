<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<html>
<head >
    <title>Create trainer form</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>

<h2>
  Create your trainer here
</h2>
<sf:form method="POST" commandName="trainerForm">
    <sf:errors path="*" element="div" cssClass="error"/>
    <table >
        <tr>
            <td>First Name:</td>
            <td><sf:input path="firstName" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><sf:input path="secondName" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td>Age:</td>
            <td><sf:input path="age" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td><sf:input path="salary" cssErrorClass="error"/></td>
        </tr>
    </table>
    <br/>
  <input type="submit" value="Register" />


</sf:form>
<button onclick="document.location='/'" />Cancel</button>

</body>
</html>
