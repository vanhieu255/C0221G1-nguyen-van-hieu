<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Student</h1>
<table border="1">
    <tr>
        <th>Stt</th>
        <th>Id</th>
        <th>Name</th>
        <th>DateOfBirth</th>
        <th colspan="2" >Action</th>
    </tr>
    <c:forEach var="list" items="${studentList}" varStatus="loop" >
        <tr>
            <td>${loop.index+1}</td>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.dateOfBirth}</td>
           <td><a href="/student/detail?idStudent=${list.id}">Detail student RP</a></td>
           <td><a href="/student/detail/${list.id}">Detail student PV</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
