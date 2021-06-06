<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/4/2021
  Time: 6:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="assert/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">
<script src="assert/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>
<%--<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>--%>
<link rel="stylesheet" href="assert/datatables/css/dataTables.bootstrap4.min.css">

<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="header text-center" >
                <h1>Employee</h1>
            </div>

            <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <a href="/employees?action=create" class="btn btn-success btn-sm">Create new employee</a>
                    <form class="d-flex mb-1" method="post" action="/employees?action=search" >
                        <input class="form-control me-3" type="search" placeholder="Search" aria-label="Search" name="key">
                        <%--                        <button class="btn btn-outline-success" type="submit" name="key" >Search</button>--%>
                        <input type="submit" class="btn btn-outline-success"  value="Search">
                    </form>
                </div>
            </nav>
            <table border="1" class="table table-success table-striped table-bordered" id="tableEmployee">
                <thead>
                <tr>
                    <td>IdNhanVien</td>
                    <td>HoTen</td>
                    <td>IdViTri</td>
                    <td>IdTrinhDo</td>
                    <td>IdBoPhan</td>
                    <td>NgaySinh</td>
                    <td>SoCMND</td>
                    <td>Luong</td>
                    <td>SDT</td>
                    <td>Email</td>
                    <td>Dia Chi</td>
                    <td>Edit</td>
                    <td>Delete</td>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="employee" items="${employees}"  >
                    <tr>
                            <%--                        <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>--%>
                        <td>${employee.idNhanVien}</td>
                        <td>${employee.hoTen}</td>
<%--                                <td>${employee.tenViTri}</td>--%>
<%--                                <td>${employee.tenTrinhdo}</td>--%>
<%--                                <td>${employee.tenBoPhan}</td>--%>
                                <c:forEach var="position" items="${employeePositions}">
                                    <c:if test="${position.idViTri == employee.idViTri}">
                                        <td>${position.tenViTri}</td>
                                    </c:if>
                                </c:forEach>
                                <c:forEach var="education" items="${employeeEducations}">
                                    <c:if test="${education.idTrinhDo == employee.idTrinhDo}">
                                        <td>${education.trinhDo}</td>
                                    </c:if>
                                </c:forEach>
                                <c:forEach var="division" items="${employeeDivisions}">
                                    <c:if test="${division.idBoPhan == employee.idBoPhan}">
                                        <td>${division.tenBoPhan}</td>
                                    </c:if>
                                </c:forEach>
                        <td>${employee.ngaySinh}</td>
                        <td>${employee.soCmnd}</td>
                        <td>${employee.luong}</td>
                        <td>${employee.sdt}</td>
                        <td>${employee.email}</td>
                        <td>${employee.diaChi}</td>
                        <td><a href="/employees?action=edit&id=${employee.idNhanVien}" class="btn btn-success btn-sm">edit</a></td>
                            <%--                        <td><a href="/customers?action=delete&id=${customer.idKhachHang}" class="btn btn-danger btn-sm">delete</a></td>--%>
                        <td><button type="button" class="btn btn-danger btn-sm" onclick="sendDataToModal('${employee.idNhanVien}')"  data-bs-toggle="modal" data-bs-target="#exampleModal">
                            Delete
                        </button></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <!-- Button trigger modal -->
            <%--            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
            <%--                Delete--%>
            <%--            </button>--%>

            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <form action="/employees" method="get">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <input hidden type="text" name="id" id="idEmployee">
                                <p>Bạn có muốn xóa Employee không</p>

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
                    document.getElementById("idEmployee").value=id;
                }
            </script>
            <script src="assert/jquery/jquery-3.5.1.min.js"></script>
            <script src="assert/datatables/js/jquery.dataTables.min.js"></script>
            <script src="assert/datatables/js/dataTables.bootstrap4.min.js"></script>
            <script>
                $(document).ready(function () {
                    $('#tableEmployee').dataTable({
                        "dom":"lrtip",
                        "lengthChange":false,
                        "pageLength":5
                    });

                });
            </script>


        </div>
    </div>
</div>
</body>
</html>
