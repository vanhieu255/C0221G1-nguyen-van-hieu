<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/27/2021
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Application Calculator </title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="cacul" method="post">
   <p>First operand:</p>
    <input type="text" name="number1">
      <p>Operator</p>
    <select name="operator">
        <option value="add" name="add" >Addition</option>
        <option value="sub" name="sub">Subtraction</option>
        <option value="mul" name="mul">Multiplication</option>
        <option value="div" name="div">Division</option>
    </select>
      <lable>Second operand </lable>
      <input type="text" name="number2">
      <input type="submit" value="Calculate" id="submit">

      
  </form>


  </body>
</html>
