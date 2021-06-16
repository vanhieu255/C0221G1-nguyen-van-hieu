<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/caculator" method="get">
    <input type="text" name="number1">
    <input type="text" name="number2">
    <br>
    <input type="submit" value="Addition(+)" name="cacul">
    <input type="submit" value="Subtraction(-)" name="cacul">
    <input type="submit" value="Multiplication(*)" name="cacul" >
    <input type="submit" value="Division(/)" name="cacul">
</form>
${message}${result}
</body>
</html>
