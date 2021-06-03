<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 9:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">
    <script src="bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>
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
            <h1>Edit Customer</h1>
            <form action="/customers?action=edit&id=${customer.idKhachHang}" method="post">
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdKhachHang</label>
                    <div class="col-md-10">
                        <c:if test="${customer != null}">
                        <input type="hidden" class="form-control " name="idkhachhang" value="<c:out value='${customer.idKhachHang}' />" >
                        </c:if>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdLoaiKhach</label>
                    <div class="col-md-10">

                        <input type="text" class="form-control " name="idloaikhach" value="<c:out value='${customer.idLoaiKhach}' />">

                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">HoTen</label>
                    <div class="col-md-10">
                            <input type="text" class="form-control " name="hoten" value="<c:out value='${customer.hoTen}' />">
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">NgaySinh</label>
                    <div class="col-md-10">

                            <input type="text" class="form-control " name="ngaysinh" value="<c:out value='${customer.ngaySinh}' />">

                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">SoCmnd</label>
                    <div class="col-md-10">

                            <input type="text" class="form-control "name="socmnd" value="<c:out value='${customer.soCmnd}' />">

                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">SDT</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="sdt" value="<c:out value='${customer.sdt}' />">

                    </div>
                </div>

                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">Email</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control "  name="email" value="<c:out value='${customer.email}' />">
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">DiaChi</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control "  name="diachi" value="<c:out value='${customer.diaChi}' />">
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
