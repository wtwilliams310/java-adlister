<%--
  Created by IntelliJ IDEA.
  User: tituswilliams
  Date: 3/17/23
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <form action="/register" method="POST">
        <label for="username">Username</label>
        <input type="text" name="username" id="username"><br>
        <label for="password">Password</label>
        <input type="password" name="password" id="password"><br>
        <label for="email">email</label>
        <input type="email" name="email" id="email">
        <button type="submit">Submit</button>
    </form>
</body>
</html>
