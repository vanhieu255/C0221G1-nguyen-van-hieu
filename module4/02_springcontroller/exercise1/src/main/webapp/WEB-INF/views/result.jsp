<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2021
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Sandwich :</p>
<c:forEach var="con" items="${condiment}" >
<span>${con}</span>
</c:forEach>
</body>
</body>
</html>
