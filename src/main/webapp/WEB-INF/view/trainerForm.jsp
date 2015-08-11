<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<html>
<head >
    <title>Create player form</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>

<h2>
  Create your player here
</h2>
<sf:form method="POST" commandName="trainerForm">
    <sf:errors path="*" element="div" cssClass="error"/>
  First Name:<sf:input path="firstName" cssErrorClass="error" /><br/>
  Last Name: <sf:input path="secondName" cssErrorClass="error"/><br/>
  Age: <sf:input path="age" cssErrorClass="error"/><br/>
  Salary: <sf:input path="salary" cssErrorClass="error"/><br/>

  <input type="submit" value="Register" />
</sf:form>

</body>
</html>
