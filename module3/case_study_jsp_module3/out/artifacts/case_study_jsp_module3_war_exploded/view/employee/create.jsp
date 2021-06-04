<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/4/2021
  Time: 7:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
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
            <h1>Add Employee</h1>
            <form action="" method="post">
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdNhanVien</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="idNhanVien" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">HoTen</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="hoTen" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdViTri</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="idViTri" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdTrinhDo</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="idTrinhDo" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdBoPhan</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="idBoPhan" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">NgaySinh</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="ngaySinh" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">SoCmnd</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="soCmnd" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">Luong</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="luong" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">SDT</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="sdt" >
                    </div>
                </div>

                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">Email</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="email" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">DiaChi</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" name="diaChi" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <div class="col-md-2"></div>
                    <div class="col-md-10 d-flex justify-content-between">
                        <input type="submit" class="btn btn-success" value="Save">
                        <a href="/employees" class="btn btn-success">Back to list Employee</a>

                    </div>
                </div>

            </form>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
</body>
</html>
