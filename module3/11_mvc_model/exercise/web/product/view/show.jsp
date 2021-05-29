<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/28/2021
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show Product</title>
</head>
<body>
<h1>Product</h1>
<form action="">
    <input type="text" placeholder="Input Name" name="">
    <input type="button" value="Search">
</form>
<p>
    <a href="/product?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>id</td>
        <td>productName</td>
        <td>price</td>
        <td>describe</td>
        <td>producer</td>
    </tr>
    <c:forEach var="product" items="${products}" >
        <tr>

            <td>${product.getId()}</td>
            <td><a href="/product?action=view&id=${product.getId()}">${product.productName}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescribe()}</td>
            <td>${product. getProducer()}</td>
            <td><a href="/product?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/product?action=delete&id=${product.getId()}">delete</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
