<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/9/2021
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="assert/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">
<script src="assert/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="assert/datatables/css/dataTables.bootstrap4.min.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="header text-center">
                <h1>Product</h1>
            </div>

            <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <a href="/products?action=create" class="btn btn-success btn-sm">Create new product</a>
                    <form class="d-flex mb-1" method="post" action="/products?action=search">
                        <input class="form-control me-3" type="search" placeholder="Search" aria-label="Search"
                               name="key">
                        <%--                        <button class="btn btn-outline-success" type="submit" name="key" >Search</button>--%>
                        <input type="submit" class="btn btn-outline-success" value="Search">
                    </form>
                </div>
            </nav>
            <table class="table table-success table-striped table-bordered" id="tableCustomer">
                <thead>
                <tr>
                    <td>STT</td>
                    <td>Id Product</td>
                    <td>Name Product</td>
                    <td>Price</td>
                    <td>Quantity</td>
                    <td>Color</td>
                    <td>Describe</td>
                    <td>Category</td>
                    <td>Edit</td>
                    <td>Delete</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="product" items="${products}" varStatus="status">
                    <tr>
                        <td><c:out value="${status.count}"></c:out></td>
                            <%--                        <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>--%>
                        <td>${product.idProduct}</td>
                            <%--                        <td>${customer.idLoaiKhach}</td>--%>
                        <td>${product.nameProduct}</td>
                        <td>${product.price}</td>
                        <td>${product.quantity}</td>
                        <td>${product.color}</td>
                        <td>${product.describe}</td>
                        <c:forEach var="productCategorie" items="${productCategories}">
                            <c:if test="${productCategorie.idCategory == product.idCategory}">
                                <td>${productCategorie.nameCategory}</td>
                            </c:if>
                        </c:forEach>
                        <td><a href="/products?action=edit&id=${product.idProduct}" class="btn btn-success btn-sm">Edit</a>
                        </td>
                            <%--                        <td><a href="/customers?action=delete&id=${customer.idKhachHang}" class="btn btn-danger btn-sm">delete</a></td>--%>
                        <td>
                            <button type="button" class="btn btn-danger btn-sm"
                                    onclick="sendDataToModal('${product.idProduct}')" data-bs-toggle="modal"
                                    data-bs-target="#exampleModal">
                               Delete
                            </button>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <!-- Button trigger modal -->
            <%--            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
            <%--                Delete--%>
            <%--            </button>--%>

            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <form action="/products" method="get">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                        aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <input hidden type="text" name="id" id="idProduct">
                                <p>Bạn có muốn xóa Product không</p>

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
                    document.getElementById("idProduct").value = id;
                }
            </script>


            <script src="assert/jquery/jquery-3.5.1.min.js"></script>
            <script src="assert/datatables/js/jquery.dataTables.min.js"></script>
            <script src="assert/datatables/js/dataTables.bootstrap4.min.js"></script>


            <script>
                $(document).ready(function () {
                    $('#tableCustomer').dataTable({
                        "dom": "lrtip",
                        "lengthChange": false,
                        "pageLength": 5
                    });

                });
            </script>
        </div>
    </div>
</div>
</body>
</html>
