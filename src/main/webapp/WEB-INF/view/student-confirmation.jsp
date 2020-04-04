<%--
  User: Kusal
  Date: 4/4/2020
--%>
<!DOCTYPE html>
<html>
<head>
    <title>SpringMVC</title>
</head>
<body>
<h1>Student Confirmation</h1>
<br>
<hr>
<br>

The student is confirmed : ${student.firstName}  ${student.lastName}
<br><hr>
Country : ${student.country}

<br>
<a href="${pageContext.request.contextPath}/">Go Home</a>

</body>
</html>