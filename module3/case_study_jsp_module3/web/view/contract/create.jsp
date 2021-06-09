<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/7/2021
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="assert/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">
    <script src="assert/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>
    <style>
        .col-md-6{
            padding: 0px;
            margin: 0px;
            text-align: center;
            border: 1px solid;
        }

    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">
            <h1>Add Contract</h1>
            <form action="" method="post">
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdHopDong</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="idHopDong" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdNhanVien</label>
                    <div class="col-md-10">
                        <%--                        <input type="text" class="form-control " name="idloaikhach" >--%>
                        <select name="idNhanVien" class="form-control">
                            <c:forEach var="employee" items="${employees}">
                                <option value="${employee.idNhanVien}">${employee.hoTen}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdKhachHang</label>
                    <div class="col-md-10">

                        <select name="idKhachHang" class="form-control">
                            <c:forEach var="customer" items="${customers}">
                                <option value="${customer.idKhachHang}">${customer.hoTen}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdDichVu</label>
                    <div class="col-md-10">
                        <%--                        <input type="text" class="form-control " name="idloaikhach" >--%>
                        <select name="idDichVu" class="form-control">
                            <c:forEach var="service" items="${services}">
                                <option value="${service.idDichVu}">${service.tenDichVu}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">NgayLamHopDong</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="ngayLamHopDong" >
                    </div>
                </div>

                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">NgayKetThuc</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="ngayKetThuc" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">TienDatCoc</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="tienDatCoc" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">TongTien</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="tongTien" >
                    </div>
                </div>

                <div class="mb-3 row">
                    <div class="col-md-2"></div>
                    <div class="col-md-10 d-flex justify-content-between">

                        <input type="submit" class="btn btn-success" value="Save">
                        <a href="/contracts" class="btn btn-success">Back to list Contract</a>

                    </div>
                </div>

            </form>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
</body>
</html>
