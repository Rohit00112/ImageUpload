<%--
  Created by IntelliJ IDEA.
  User: sujansubedi
  Date: 11/04/2025
  Time: 08:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="POST">
  <label>Username:</label>
  <input type="text" name="username" /> </br>

  <label>Password:</label>
  <input type="password" name="password" /> </br>

  <input type="submit">

</form>
</body>
</html>