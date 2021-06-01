<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 9:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">
<script src="bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="header text-center" >
                <h1>Customers</h1>
            </div>

            <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <a href="/customers?action=create" class="btn btn-success btn-sm">Create new customer</a>
                    <form class="d-flex mb-1">
                        <input class="form-control me-3" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </nav>
            <table border="1" class="table table-success table-striped">
                <tr>
                    <td>Name</td>
                    <td>Email</td>
                    <td>Address</td>
                    <td>Edit</td>
                    <td>Delete</td>
                </tr>
                <c:forEach items='${requestScope["customers"]}' var="customer">
                    <tr>
                        <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
                        <td>${customer.getEmail()}</td>
                        <td>${customer.getAddress()}</td>
                        <td><a href="/customers?action=edit&id=${customer.getId()}" class="btn btn-success btn-sm">edit</a></td>
                        <td><a href="/customers?action=delete&id=${customer.getId()}" class="btn btn-danger btn-sm">delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
</body>
</html>
