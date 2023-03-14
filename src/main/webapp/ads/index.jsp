<%--
  Created by IntelliJ IDEA.
  User: tituswilliams
  Date: 3/14/23
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>ALL ADS ON SITE</title>
</head>
<body>
<h1>ALL ADS ON SITE</h1>
 <c:forEach var="ads" items="${ads}">
     <h3>${ads.title}</h3>
     <p>${ads.description}</p>
 </c:forEach>

</body>
</html>
