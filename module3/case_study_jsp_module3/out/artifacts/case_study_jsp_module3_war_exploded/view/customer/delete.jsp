<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/1/2021
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap/bootstrap-5.0.1-dist/css/bootstrap.min.css">
    <script src="bootstrap/bootstrap-5.0.1-dist/js/bootstrap.min.js"></script>

</head>
<body>
<body>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["customer"].getName()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${requestScope["customer"].getEmail()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${requestScope["customer"].getAddress()}</td>
            </tr>
            <tr>
                <%--                <td><input type="submit" value="Delete customer" id="b"></td>--%>
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal" id="myD">Delete</button>
                <td><a href="/customers">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
    <div class="modal" id="">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4>Bạn có muốn xóa customer ?</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <div class="modal-body">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>

                </div>

            </div>

        </div>
    </div>
 </form>
</body>
</html>
