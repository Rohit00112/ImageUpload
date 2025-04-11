<%--
  Created by IntelliJ IDEA.
  User: sujansubedi
  Date: 11/04/2025
  Time: 08:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% String username = (String) session.getAttribute("username"); %>
<h1>Home Page</h1>
<%= username %>
</body>
</html>
