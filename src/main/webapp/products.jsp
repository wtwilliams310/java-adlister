<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: tituswilliams
  Date: 3/10/23
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Product product1 = new Product("soap", 350);
    Product product2 = new Product("tissue", 200);

    List<Product> products = new ArrayList<>(Arrays.asList(
            product1,
            product2
    ));

    request.setAttribute("products", products);

%>
<html>
<head>
    <title>Products Practice</title>
</head>
<body>
    <h1>Products</h1>
    <c:forEach var="product" items="${products}">
        <div>
            <h3>${product.name}</h3>
            <h3>${product.costInCents}</h3>
        </div>

    </c:forEach>

</body>
</html>
