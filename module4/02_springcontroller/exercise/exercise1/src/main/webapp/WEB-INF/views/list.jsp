<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save/sandwich"method="post">
    <input type="checkbox" name="condiment" value="lectuce">Lectuce
    <input type="checkbox" name="condiment" value="tomato">Tomato
    <input type="checkbox" name="condiment" value="mustard">Mustard
    <input type="checkbox" name="condiment" value="sprouts">Sprouts
    <br>
    <input type="submit" value="submit">

</form>
</body>
</html>
