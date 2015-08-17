<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<head>
    <title>Create player form</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >

</head>

<h2>
    Create your player here
</h2>
<sf:form method="POST" commandName="playerForm">
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
            <td>Birth country:</td>
            <td><sf:select path="country">
                <sf:option value="Canada">Canada</sf:option>
                <sf:option value="USA">USA</sf:option>
                <sf:option value="France">France</sf:option>
                <sf:option value="Brazil">Brazil</sf:option>
            </sf:select></td>
        </tr>
        <tr>
            <td>Age:</td>
            <td><sf:input path="age" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td><sf:input path="salary" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td>Goals:</td>
            <td><sf:input path="goals" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td>Bookings:</td>
            <td><sf:input path="bookings" cssErrorClass="error"/></td>
        </tr>
        <tr>
            <td>Position:</td>
            <td><sf:select path="position">
                    <sf:option value="FORWARD">FORWARD</sf:option>
                    <sf:option value="GOALKEEPER">GOALKEEPER</sf:option>
                    <sf:option value="DEFENDER">DEFENDER</sf:option>
                    <sf:option value="MIDFIELDER">MIDFIELDER</sf:option>
                </sf:select></td>
        </tr>
    </table>


    <br/>
    <input type="submit" value="Register"/>

</sf:form>

<button onclick="document.location='/'" />Cancel</button>

</body>
</html>
