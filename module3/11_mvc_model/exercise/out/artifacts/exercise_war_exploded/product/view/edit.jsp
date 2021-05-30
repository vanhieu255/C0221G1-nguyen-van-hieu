<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/29/2021
  Time: 12:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
<%--            <tr>--%>
<%--                <td>Id: </td>--%>
<%--                <td><input type="text" name="id" id="id" value="${requestScope["product"].getId()}"></td>--%>
<%--            </tr>--%>
            <tr>
                <td>ProductName: </td>
                <td><input type="text" name="productName" id="productNam" value="${requestScope["product"].getProductName()}"></td>
            </tr>
            <tr>
                <td>Price: </td>
                <td><input type="text" name="price" id="price" value="${requestScope["product"].getPrice()}"></td>
            </tr>
            <tr>
                <td>Describe: </td>
                <td><input type="text" name="describe" id="describe" value="${requestScope["product"].getDescribe()}"></td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td><input type="text" name="producer" id="producer" value="${requestScope["product"].getProducer()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
