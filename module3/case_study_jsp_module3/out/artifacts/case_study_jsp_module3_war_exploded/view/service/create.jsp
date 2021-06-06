<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/5/2021
  Time: 8:36 PM
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
            <h1>Add Service</h1>
            <form action="" method="post">
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdDichVu</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="idDichVu" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">TenDichVu</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="tenDichVu" >

                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">DienTich</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="dienTich" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">SoTang</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="soTang" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">SoNguoiToiDa</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="soNguoiToiDa" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">ChiPhiThue</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="chiPhiThue" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">IdKieuThue</label>
                    <div class="col-md-10">
                        <select name="idLoaiKhach" class="form-control">
                            <c:forEach var="rentType" items="${serviceTypeRents}">
                                <option value="${rentType.idKieuThue}">${rentType.tenKieuThue}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>

                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">LoaiDichVu</label>
                    <div class="col-md-10">
                        <select name="idLoaiKhach" class="form-control">
                            <c:forEach var="type" items="${serviceTypes}">
                                <option value="${type.idLoaiDichVu}">${type.tenLoaiDichVu}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">TieuChuanPhong</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="tieuChuanPhong" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">TienNghiKhac</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="tienNghiKhac" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">DienTichHoBoi</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="dienTichHoBoi" >
                    </div>
                </div>







                <%--                <div class="mb-3 row">--%>
                <%--                    <label class="col-md-2 col-form-label">Date</label>--%>
                <%--                    <div class="col-md-4">--%>
                <%--                        <div class="input-group">--%>
                <%--                            <input type="text" class="fromDate form-control"  placeholder="dd">--%>
                <%--                            <div class="input-group-prepend"><span class="input-group-text">-</span></div>--%>
                <%--                            <input type="text" class="toDate form-control" placeholder="mm">--%>
                <%--                            <div class="input-group-prepend"><span class="input-group-text">-</span></div>--%>
                <%--                            <input type="text" class="toDate form-control"  placeholder="yyyy">--%>
                <%--                        </div>--%>
                <%--                    </div>--%>

                <%--                </div>--%>

                <div class="mb-3 row">
                    <div class="col-md-2"></div>
                    <div class="col-md-10 d-flex justify-content-between">
                        <%--                        <button id="btn-save" name="btn-save" class="btn btn-success">Save</button>--%>
                        <input type="submit" class="btn btn-success" value="Save">
                        <a href="/customers" class="btn btn-success">Back to list Customer</a>

                    </div>
                </div>

            </form>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
</body>
</html>
