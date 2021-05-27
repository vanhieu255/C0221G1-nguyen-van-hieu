<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/26/2021
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action="/discount" method="post">
    <input type="text" name="Product Description" placeholder="Product Description: "/>
    <input type="text" name="List Price" placeholder="List Price: "/>
    <input type="text" name="Discount Percent" placeholder="Discount Percent: "/>
    <input type = "submit" id = "submit" value = "Calculate Discount"/>
  </form>


  </body>
</html>
