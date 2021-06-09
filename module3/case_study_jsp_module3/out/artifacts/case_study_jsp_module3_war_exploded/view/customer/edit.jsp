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
<%--    <title>Title</title>--%>
<%--    <link rel="stylesheet" href="assert/bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">--%>
<%--    <script src="assert/bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>--%>
<%--    <style>--%>
<%--        .col-md-6{--%>
<%--            padding: 0px;--%>
<%--            margin: 0px;--%>
<%--            text-align: center;--%>
<%--            border: 1px solid;--%>
<%--        }--%>

<%--    </style>--%>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
    <title>Edit Customer</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        body {
            color: #fff;
            background: #63738a;
            font-family: 'Roboto', sans-serif;
        }
        .form-control {
            height: 40px;
            box-shadow: none;
            color: #969fa4;
        }
        .form-control:focus {
            border-color: #5cb85c;
        }
        .form-control, .btn {
            border-radius: 3px;
        }
        .signup-form {
            width: 450px;
            margin: 0 auto;
            padding: 30px 0;
            font-size: 15px;
        }
        .signup-form h2 {
            color: #636363;
            margin: 0 0 15px;
            position: relative;
            text-align: center;
        }
        .signup-form h2:before, .signup-form h2:after {
            content: "";
            height: 2px;
            width: 30%;
            background: #d4d4d4;
            position: absolute;
            top: 50%;
            z-index: 2;
        }
        .signup-form h2:before {
            left: 0;
        }
        .signup-form h2:after {
            right: 0;
        }
        .signup-form .hint-text {
            color: #999;
            margin-bottom: 30px;
            text-align: center;
        }
        .signup-form form {
            color: #999;
            border-radius: 3px;
            margin-bottom: 15px;
            background: #f2f3f7;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            padding: 30px;
        }
        .signup-form .form-group {
            margin-bottom: 20px;
        }
        .signup-form input[type="checkbox"] {
            margin-top: 3px;
        }
        .signup-form .btn {
            font-size: 16px;
            font-weight: bold;
            min-width: 140px;
            outline: none !important;
        }
        .signup-form .row div:first-child {
            padding-right: 10px;
        }
        .signup-form .row div:last-child {
            padding-left: 10px;
        }
        .signup-form a {
            color: #fff;
            text-decoration: underline;
        }
        .signup-form a:hover {
            text-decoration: none;
        }
        .signup-form form a {
            color: #5cb85c;
            text-decoration: none;
        }
        .signup-form form a:hover {
            text-decoration: underline;
        }
    </style>

</head>
<body>
<%--<div class="container-fluid">--%>
<%--    <div class="row">--%>
<%--        <div class="col-md-3"></div>--%>
<%--        <div class="col-md-6">--%>
<%--            <h1>Edit Customer</h1>--%>
<%--            <h3><c:if test="${message != null}">--%>
<%--                <span>${message}</span>--%>
<%--            </c:if></h3>--%>
<%--            <form action="/customers?action=edit&id=${customer.idKhachHang}" method="post">--%>
<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label">IdKhachHang</label>--%>
<%--                    <div class="col-md-10">--%>
<%--                        <c:if test="${customer != null}">--%>
<%--                        <input type="hidden" class="form-control " name="idKhachHang" value="<c:out value='${customer.idKhachHang}' />" >--%>
<%--                        </c:if>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label">IdLoaiKhach</label>--%>
<%--                    <div class="col-md-10">--%>

<%--&lt;%&ndash;                        <input type="text" class="form-control " name="idLoaiKhach" value="<c:out value='${customer.idLoaiKhach}' />">&ndash;%&gt;--%>
<%--                        <select name="idLoaiKhach" class="form-control" >--%>
<%--                            <c:forEach var="type" items="${customerTypes}">--%>
<%--                                <option value="${type.idLoaiKhach}">${type.tenLoaiKhach}</option>--%>
<%--                            </c:forEach>--%>
<%--                        </select>--%>

<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label">HoTen</label>--%>
<%--                    <div class="col-md-10">--%>
<%--                            <input type="text" class="form-control " name="hoTen" value="<c:out value='${customer.hoTen}' />">--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label">GioiTinh</label>--%>
<%--                    <div class="col-md-10">--%>
<%--&lt;%&ndash;                        <input type="text" class="form-control " name="hoten" value="<c:out value='${customer.hoTen}' />">&ndash;%&gt;--%>
<%--                             <select name="gioiTinh" class="form-control">--%>
<%--                                    <option value="nam" ${customer.gioiTinh=="nam" ?"selected":""}>nam</option>--%>
<%--                                 <option value="nu" ${customer.gioiTinh=="nu" ?"selected":""}>nu</option>--%>

<%--                             </select>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label">NgaySinh</label>--%>
<%--                    <div class="col-md-10">--%>

<%--                            <input type="text" class="form-control " name="ngaySinh" value="<c:out value='${customer.ngaySinh}' />">--%>

<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label ">SoCmnd</label>--%>
<%--                    <div class="col-md-10">--%>

<%--                            <input type="text" class="form-control "name="soCmnd" value="<c:out value='${customer.soCmnd}' />">--%>

<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label ">SDT</label>--%>
<%--                    <div class="col-md-10">--%>
<%--                        <input type="text" class="form-control " name="sdt" value="<c:out value='${customer.sdt}' />">--%>

<%--                    </div>--%>
<%--                </div>--%>

<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label">Email</label>--%>
<%--                    <div class="col-md-10">--%>
<%--                        <input type="text" class="form-control "  name="email" value="<c:out value='${customer.email}' />">--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="mb-3 row">--%>
<%--                    <label class="col-md-2 col-form-label ">DiaChi</label>--%>
<%--                    <div class="col-md-10">--%>
<%--                        <input type="text" class="form-control "  name="diaChi" value="<c:out value='${customer.diaChi}' />">--%>
<%--                    </div>--%>
<%--                </div>--%>

<%--                <div class="mb-3 row">--%>
<%--                    <div class="col-md-2"></div>--%>
<%--                    <div class="col-md-10 d-flex justify-content-between">--%>
<%--                        &lt;%&ndash;                        <button id="btn-save" name="btn-save" class="btn btn-success">Save</button>&ndash;%&gt;--%>
<%--                        <input type="submit" class="btn btn-success" value="Save">--%>
<%--                        <a href="/customers" class="btn btn-success">Back to list Customer</a>--%>

<%--                    </div>--%>
<%--                </div>--%>

<%--            </form>--%>
<%--        </div>--%>
<%--        <div class="col-md-3"></div>--%>
<%--    </div>--%>
<%--</div>--%>

<%--tạo mới --%>

<div class="signup-form">
    <%--    <form action="/examples/actions/confirmation.php" method="post">--%>
    <form action="/customers?action=edit&id=${customer.idKhachHang}" method="post">
        <h3>Edit Customer </h3>
                    <p><c:if test="${message != null}">
                        <span>${message}</span>
                    </c:if></p>
        <div class="form-group">
            <c:if test="${customer != null}">
                <input type="hidden" class="form-control " name="idKhachHang" placeholder="ID Khách Hàng" required="required" value="<c:out value='${customer.idKhachHang}'/>" >
            </c:if>
        </div>
        <div class="form-group">
            <select name="idLoaiKhach" class="form-control">
                <c:forEach var="type" items="${customerTypes}">
                    <option value="${type.idLoaiKhach}">${type.tenLoaiKhach}</option>
                </c:forEach>

            </select>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="hoTen" placeholder="Họ và Tên" required="required" value="<c:out value='${customer.hoTen}' />">
        </div>
        <div class="form-group">
            <select name="gioiTinh" class="form-control">
                <option value="nam" ${customer.gioiTinh=="nam" ?"selected":""}>nam</option>
                <option value="nu" ${customer.gioiTinh=="nu" ?"selected":""}>nu</option>

            </select>
        </div>
        <div class="form-group">
            <input type="date" class="form-control" name="ngaySinh" placeholder="Ngày Sinh" required="required" value="<c:out value='${customer.ngaySinh}'/>">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="soCmnd" placeholder="Số Cmnd" required="required" value="<c:out value='${customer.soCmnd}' />">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="sdt" placeholder="SDT" required="required" value="<c:out value='${customer.sdt}' />">
        </div>
        <div class="form-group">
            <input type="email" class="form-control" name="email" placeholder="Email" required="required" value="<c:out value='${customer.email}' />">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="diaChi" placeholder="Địa Chỉ" required="required" value="<c:out value='${customer.diaChi}' />">
        </div>


        <div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Edit</button>
        </div>
        <div class="form-group">
            <a href="/customers" class="btn btn-success btn-lg btn-block" style="color: white">Back to list Customer</a>
        </div>

    </form>
    </div>
</body>
</html>
