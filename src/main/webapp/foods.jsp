<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: tituswilliams
  Date: 3/9/23
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String foodType = request.getParameter("food");

    if (foodType.equals("rhubarb")){
        response.sendRedirect("/ew.jsp");
    }

    request.setAttribute("foodType", foodType);


    Map<String, List<String>> foods = new HashMap<>();
    List<String> meats = new ArrayList<>(Arrays.asList("Burgers", "Stead", "Hot Dogs"));
    List<String> dairy = new ArrayList<>(Arrays.asList("cheese", "Milk"));

    foods.put("meats", meats);
    foods.put("dairy", dairy);

    request.setAttribute("foods", foods.get(foodType));


%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Titles</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<h1>food type: ${foodType}</h1>
<h3>${foods}</h3>

<c:forEach var="food" items="${foods}">
    <h3>${food}</h3>
</c:forEach>


</body>
</html>
