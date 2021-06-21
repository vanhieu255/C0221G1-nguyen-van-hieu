<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/17/2021
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting</title>
</head>
<body>
<h1>Setting</h1>
<form:form action="/form" method="post" modelAttribute="settingEmail" >
    Languages :<form:select path="languages" items="${languages}"/>
    <br>
    Page Size : show <form:select path="size" items="${size}"/> email per page
    <br>
    Spams filter :<form:checkbox path="filter" />Enable spams filter
    <br>
    Signature :<form:textarea path="signature"/>
    <br>
    <input type="submit" value="update">
</form:form>



</body>
</html>
