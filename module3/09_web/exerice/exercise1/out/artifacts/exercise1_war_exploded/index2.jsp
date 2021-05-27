<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/26/2021
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String productDescription=request.getParameter("Product Description");
    float listPrice=Float.parseFloat(request.getParameter("List Price"));
    float discountPercent=Float.parseFloat(request.getParameter("Discount Percent"));
    float discountAmount= (float) request.getAttribute("DiscountAmount");
    float discountPrice= (float) request.getAttribute("DiscountPrice");
%>
<h3>Product Description: <%=productDescription%></h3>
<h3>List Price: <%=listPrice%></h3>
<h3>Discount Percent :<%=discountPercent%></h3>
<h3>Discount Amount :<%=discountAmount%> </h3>
<h3>Discount Price :<%=discountPrice%></h3>
</body>
</html>
