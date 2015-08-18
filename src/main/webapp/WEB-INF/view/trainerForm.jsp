<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<html>
<head >
    <meta charset="UTF-8">
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
            <td><spring:message code="first.name"/></td>
            <td><sf:input path="firstName" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td><spring:message code="second.name"/></td>
            <td><sf:input path="secondName" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td><spring:message code="age"/></td>
            <td><sf:input path="age" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td><spring:message code="salary"/></td>
            <td><sf:input path="salary" cssErrorClass="error"/></td>
        </tr>
    </table>
    <br/>
  <input type="submit" value="Register" />


</sf:form>
<button onclick="document.location='/'" />Cancel</button>

</body>
</html>
