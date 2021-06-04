<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/4/2021
  Time: 1:52 PM
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
            <h1>Edit Employee</h1>
            <form action="/employees?action=edit&id=${employee.idNhanVien}" method="post">
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdNhanVien</label>
                    <div class="col-md-10">
                        <c:if test="${employee != null}">
                            <input type="hidden" class="form-control " name="idNhanVien" value="<c:out value='${employee.idNhanVien}' />" >
                        </c:if>
                    </div>
                </div>

                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">HoTen</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="hoTen" value="<c:out value='${employee.hoTen}' />">
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdViTri</label>
                    <div class="col-md-10">

                        <input type="text" class="form-control " name="idViTri" value="<c:out value='${employee.idViTri}' />">

                    </div>
                </div><div class="mb-3 row">
                <label class="col-md-2 col-form-label">IdTrinhDo</label>
                <div class="col-md-10">

                    <input type="text" class="form-control " name="idTrinhDo" value="<c:out value='${employee.idTrinhDo}' />">

                </div>
            </div><div class="mb-3 row">
                <label class="col-md-2 col-form-label">IdBoPhan</label>
                <div class="col-md-10">

                    <input type="text" class="form-control " name="idBoPhan" value="<c:out value='${employee.idBoPhan}' />">

                </div>
            </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">NgaySinh</label>
                    <div class="col-md-10">

                        <input type="text" class="form-control " name="ngaySinh" value="<c:out value='${employee.ngaySinh}' />">

                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">SoCmnd</label>
                    <div class="col-md-10">

                        <input type="text" class="form-control "name="soCmnd" value="<c:out value='${employee.soCmnd}' />">

                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">Luong</label>
                    <div class="col-md-10">

                        <input type="text" class="form-control "name="luong" value="<c:out value='${employee.luong}' />">

                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">SDT</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="sdt" value="<c:out value='${employee.sdt}' />">

                    </div>
                </div>

                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">Email</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control "  name="email" value="<c:out value='${employee.email}' />">
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label ">DiaChi</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control "  name="diaChi" value="<c:out value='${employee.diaChi}' />">
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
