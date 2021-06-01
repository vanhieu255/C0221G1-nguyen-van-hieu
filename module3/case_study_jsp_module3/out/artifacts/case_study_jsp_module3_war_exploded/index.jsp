<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Trang Chủ</title>
  </head>
  <style>
    .header {
      margin: 0px;
      padding:0px;
      background-color: #328058;
    }
    .nav ul li{
      display: flex;
      justify-content: space-between;

    }

    .body{
      margin: 0px;
      padding: 0px;
      height: 400px;
      border: 1px solid;
    }
    .body .col-md-3{
      background-color: #0dcaf0;
      height: 400px;
    }
    .footer{
      margin: 0px;
      padding: 0px;
      border: solid;
    }
  </style>
  <link rel="stylesheet" href="bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">
  <script src="bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>


  <body>
  <div class="header">
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-12 d-flex justify-content-between align-items-center" >
          <img src="img/furuma2.png" alt="" class="img-fluid">
          <h3>Nguyễn Văn Hiếu</h3>
        </div>
      </div>
    </div>
  </div>

  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">

      <div class="collapse navbar-collapse " id="navbarSupportedContent">
        <div class="col-md-10 ">
          <ul class="navbar-nav mb-2 mb-lg-0 d-flex justify-content-between ">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Employee</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/customers">Customer</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="">Service</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Contract</a>
            </li>

          </ul>
        </div>
        <div class="col-md-2">
          <form class="d-flex mb-1">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success" type="submit">Search</button>
          </form>
        </div>


      </div>
    </div>
  </nav>
  <div class="body">
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-3" >
          <p><a href="">Item One</a></p>
          <p><a href="">Item Two</a></p>
          <p><a href="">Item Three</a></p>

        </div>
        <div class="col-md-9" style="text-align: center">




        </div>
      </div>
    </div>
  </div>

  <div class="footer">
    <div class="container-fluid">
      <div class="row">
        <div class="col-md-12" style="text-align: center">
          <h1>FOOTER</h1>
        </div>
      </div>

    </div>
  </div>


  </body>
</html>
