<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/26/2021
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>Product Description: <c:out value="${ProductDescription}"></c:out></h3>
<h3>List Price: <c:out value="${ListPrice}"></c:out></h3>
<h3>Discount Percent: <c:out value="${DiscountPercent}"></c:out></h3>
<h3>Discount Amount: <c:out value="${DiscountAmount}"></c:out></h3>
<h3>Discount Price: <c:out value="${DiscountPrice}"></c:out></h3>


</body>
</html>
