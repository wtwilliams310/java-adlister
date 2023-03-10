<%--
  Created by IntelliJ IDEA.
  User: tituswilliams
  Date: 3/9/23
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

<%-- We can also use this   --%>
<%-- String method = request.getMethod("POST");
     if (method.equals("POST")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
        if(username.equals("admin") && password.equals("password")){
                    response.sendRedirect("/profile.jsp");
                   } else {
                           response.sendRedirect("/login.jsp")
                           --%>

response.sendRedirect("")--%>
    request.getParameter("password");

    if (username == null | password == null){
    } else if(username.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }


    System.out.println(username);
%>

<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login Form</h1>

    <form method="POST">
        <lable or="username">Username</lable>
        <input type="text" name="username">

        <lable for="password">Password</lable>
        <input type="password" name="password">
        <button>Submit</button>
    </form>

</body>
</html>
