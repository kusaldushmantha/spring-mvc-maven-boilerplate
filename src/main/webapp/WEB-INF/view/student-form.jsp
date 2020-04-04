<%--
  User: Kusal
  Date: 4/4/2020
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>SpringMVC</title>
</head>
<body>
    <h1>Student Registration Form</h1>
    <br>
    <hr>
    <br>

    <form:form action="processForm" modelAttribute="student">
        First name : <form:input path="firstName"/>
        <br><br>

        Last name : <form:input path="lastName"/>
        <br><br>

        <form:select path="country">
            <form:option value="Brazil" label="Brazil"/>
            <form:option value="India" label="India"/>
            <form:option value="France" label="France"/>
            <form:option value="USA" label="USA"/>
            <form:option value="Sri Lanka" label="Sri Lanka"/>
        </form:select>
        <br><br>

        <input type="submit" value="submit" />
    </form:form>

</body>
</html>