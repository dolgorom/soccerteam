<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<head>
    <title>Create player form</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >

</head>
<body>

<h2>
    Create your player here
</h2>
<sf:form method="POST" commandName="registerForm">
    <sf:errors path="*" element="div" cssClass="error"/>
    First Name:<sf:input path="firstName" cssErrorClass="error"/><br/>
    Last Name: <sf:input path="secondName"/><br/>
    Birth country: <sf:select path="country">
    <sf:option value="Canada">Canada</sf:option>
    <sf:option value="USA">USA</sf:option>
    <sf:option value="France">France</sf:option>
    <sf:option value="Brazil">Brazil</sf:option>
</sf:select><br/>
    age: <sf:input path="age"/><br/>

    Salary: <sf:input path="salary"/><br/>
    Goals: <sf:input path="goals"/><br/>
    Bookings: <sf:input path="bookings"/><br/>

    Position<sf:select path="position">
    <sf:option value="FORWARD">FORWARD</sf:option>
    <sf:option value="GOALKEEPER">GOALKEEPER</sf:option>
    <sf:option value="DEFENDER">DEFENDER</sf:option>
    <sf:option value="MIDFIELDER">MIDFIELDER</sf:option>
</sf:select>
    <input type="submit" value="Register"/>
</sf:form>

</body>
</html>
