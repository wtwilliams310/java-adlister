<%--
  Created by IntelliJ IDEA.
  User: tituswilliams
  Date: 3/14/23
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Products</title>
</head>
<body>
<form action="products" method="POST">
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <label for="price">Price</label>
    <input type="text" name="price" id="price">
    <button>Submit</button>
</form>

<h2>Here are all the products</h2>
<c:forEach var="product" items="${products}">
    <div class="product">
        <h3>${product.name}</h3>
        <p>Price: $${product.price}</p>
    </div>
</c:forEach>
</body>
</html>
