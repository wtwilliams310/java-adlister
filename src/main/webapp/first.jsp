<%--
  Created by IntelliJ IDEA.
  User: tituswilliams
  Date: 3/9/23
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

%>
<!doctype html>
<html>
<head>
    <title>Implicit Object Example</title>
</head>
<body>
<h1>Welcome To The Site!</h1>
<h1><%=request.getAttribute("myName") %></h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"method" attribute: <%= request.getMethod() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>


<h1>Some Input: ${someInput}</h1>
</body>
</html>
