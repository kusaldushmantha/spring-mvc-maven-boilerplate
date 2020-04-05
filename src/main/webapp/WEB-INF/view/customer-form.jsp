<%--
  User: Kusal
  Date: 4/4/2020
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringMVC</title>
    <style>
        .error {color: red}
    </style>
</head>
<body>
    <h1>Customer Registration Form</h1>
    <br>
    <form:form action="processForm" modelAttribute="customer">
        First Name : <form:input path="firstName"/>
        <br><br>
        Last Name(*) : <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
        <input type="submit" value="submit"/>
    </form:form>
</body>
</html>
