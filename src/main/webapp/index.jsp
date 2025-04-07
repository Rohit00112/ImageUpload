<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="POST" enctype="multipart/form-data">
    <label>Username:</label>
    <input type="text" name="username" /> </br>

<label>Email:</label>
<input type="email" name="email" /> </br>

<label>Password:</label>
<input type="password" name="password" /> </br>

<label>Image:</label>
<input type="file" name="image" /> </br>

    <input type="submit">

</form>
</body>
</html>