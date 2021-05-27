<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/27/2021
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Cutomers</title>
    <link rel="stylesheet" href="/bootstrap-5.0.1-dist/css/bootstrap.min.css">
    <script src="/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>

    <style>
        img{
            height: 50px;
            width :50px;
        }
    </style>
</head>
<body>
<div class="container">
    <table border="1px" style="border-collapse: collapse">
        <tr style="border: 1px solid">
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Địa Chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach items="${Customer1}" var="customer" >
            <tr style="border:1px solid">
                <td><c:out value="${customer.ten}"></c:out></td>
                <td><c:out value="${customer.ngaySinh}"></c:out></td>
                <td><c:out value="${customer.diaChi}"></c:out></td>
                <td><img src="<c:out value="${customer.anh}"></c:out>" alt=""></td>

            </tr>
        </c:forEach>
    </table>


</div>



</body>
</html>
