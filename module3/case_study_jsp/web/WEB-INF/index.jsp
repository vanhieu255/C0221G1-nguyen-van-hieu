<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 8:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang Chủ</title>
    <style>
        .header {
            margin: 0px;
            padding:0px;
            background-color: #328058;
        }
        .nav ul li{
            display: flex;
            justify-content: space-between;

        }

        .body{
            margin: 0px;
            padding: 0px;
            height: 400px;
            border: 1px solid;
        }
        .body .col-md-3{
            background-color: #0dcaf0;
            height: 400px;
        }
        .footer{
            margin: 0px;
            padding: 0px;
            border: solid;
        }

    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</head>
<body>
<div class="header">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12 d-flex justify-content-between align-items-center" >
                <img src="img/furuma2.png" alt="" class="img-fluid">
                <h3>Nguyễn Văn Hiếu</h3>
            </div>
        </div>
    </div>
</div>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">

        <div class="collapse navbar-collapse " id="navbarSupportedContent">
            <div class="col-md-10 ">
                <ul class="navbar-nav mb-2 mb-lg-0 d-flex justify-content-between ">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Employee</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Customer</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Service</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contract</a>
                    </li>

                </ul>
            </div>
            <div class="col-md-2">
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>


        </div>
    </div>
</nav>
<div class="body">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3" >
                <p><a href="">Item One</a></p>
                <p><a href="">Item Two</a></p>
                <p><a href="">Item Three</a></p>

            </div>
            <div class="col-md-9" style="text-align: center">

                <h1>Customers</h1>
                <p>
                    <a href="/customers?action=create">Create new customer</a>
                </p>
                <table border="1">
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
                            <td><a href="/customers?action=edit&id=${customer.getId()}">edit</a></td>
                            <td><a href="/customers?action=delete&id=${customer.getId()}">delete</a></td>
                        </tr>
                    </c:forEach>
                </table>


            </div>
        </div>
    </div>
</div>

<div class="footer">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12" style="text-align: center">
                <h1>FOOTER</h1>
            </div>
        </div>

    </div>
</div>
</body>
</html>
