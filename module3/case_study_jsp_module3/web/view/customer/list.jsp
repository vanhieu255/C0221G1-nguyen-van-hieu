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
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
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
                    <form class="d-flex mb-1" method="post" action="/customers?action=search" >
                        <input class="form-control me-3" type="search" placeholder="Search" aria-label="Search" name="key">
<%--                        <button class="btn btn-outline-success" type="submit" name="key" >Search</button>--%>
                        <input type="submit" class="btn btn-outline-success"  value="Search">
                    </form>
                </div>
            </nav>
            <table border="1" class="table table-success table-striped">
                <tr>
                    <td>IdKhachHang</td>
                    <td>IdLoaiKhach</td>
                    <td>HoTen</td>
                    <td>NgaySinh</td>
                    <td>SoCMND</td>
                    <td>SDT</td>
                    <td>Email</td>
                    <td>Dia Chi</td>
                    <td>Edit</td>
                    <td>Delete</td>
                </tr>
                <c:forEach var="customer" items="${customers}"  >
                    <tr>
<%--                        <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>--%>
                        <td>${customer.idKhachHang}</td>
                        <td>${customer.idLoaiKhach}</td>
                        <td>${customer.hoTen}</td>
                        <td>${customer.ngaySinh}</td>
                        <td>${customer.soCmnd}</td>
                        <td>${customer.sdt}</td>
                        <td>${customer.email}</td>
                        <td>${customer.diaChi}</td>
                        <td><a href="/customers?action=edit&id=${customer.idKhachHang}" class="btn btn-success btn-sm">edit</a></td>
<%--                        <td><a href="/customers?action=delete&id=${customer.idKhachHang}" class="btn btn-danger btn-sm">delete</a></td>--%>
                        <td><button type="button" class="btn btn-danger btn-sm" onclick="sendDataToModal('${customer.idKhachHang}')"  data-bs-toggle="modal" data-bs-target="#exampleModal">
                            Delete
                        </button></td>
                    </tr>
                </c:forEach>
            </table>
            <!-- Button trigger modal -->
<%--            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
<%--                Delete--%>
<%--            </button>--%>

            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <form action="/customers" method="get">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <input hidden type="text" name="id" id="idCustomer">
                            <p>Bạn có muốn xóa Customer không</p>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <input type="hidden" name="action" value="delete">
                            <button type="submit" class="btn btn-primary">OK</button>
                        </div>
                    </div>
                </div>
                </form>
            </div>
            <script>
                function sendDataToModal(id) {
                    document.getElementById("idCustomer").value=id;
                }
            </script>


        </div>
    </div>
</div>


</body>
</html>
