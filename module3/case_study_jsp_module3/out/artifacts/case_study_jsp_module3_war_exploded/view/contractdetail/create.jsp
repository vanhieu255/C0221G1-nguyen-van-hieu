<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/7/2021
  Time: 1:53 PM
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
            <h1>Add ContractDetail</h1>
            <form action="" method="post">
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdHopDongChiTiet</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="idHopDongChiTiet" >
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdHopDong</label>
                    <div class="col-md-10">
                        <select name="idHopDong" class="form-control">
                            <c:forEach var="contract" items="${contracts}">
                                <option value="${contract.idHopDong}">${contract.idHopDong}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">IdDichVuDiKem</label>
                    <div class="col-md-10">

                        <select name="idDichVuDiKem" class="form-control">
                            <c:forEach var="serviceAttache" items="${serviceAttaches}">
                                <option value="${serviceAttache.idDichVuDiKem}">${serviceAttache.tenDichVuDiKem}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label class="col-md-2 col-form-label">SoLuong</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control " name="soLuong" >
                    </div>
                </div>


                <div class="mb-3 row">
                    <div class="col-md-2"></div>
                    <div class="col-md-10 d-flex justify-content-between">

                        <input type="submit" class="btn btn-success" value="Save">
                        <a href="/contractdetails" class="btn btn-success">Back to list ContractDetail</a>

                    </div>
                </div>

            </form>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
</body>
</html>
