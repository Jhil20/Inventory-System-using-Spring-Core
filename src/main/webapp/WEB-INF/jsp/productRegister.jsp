<%--
  Created by IntelliJ IDEA.
  User: jhilb
  Date: 26-10-2024
  Time: 00:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="registerProduct" method="post">
    <h1>Product Details</h1>
    Enter Product name <input type="text" name="ProductName">
    Enter Product Description <input type="text" name="ProductDescription">
    Enter Product price <input type="text" name="ProductPrice">
    Enter Product stock <input type="text" name="productStock">
    <br>
    <br>
    <br>
    <br>
    <h1>Supplier Details</h1>
    Enter supplier name <input type="text" name="supplierName">
    Enter supplier phone <input type="number" name="supplierPhone">
    <br>
    <br>
    <br>
    <br>
    Enter Category name <input type="text" name="categoryName">
    <input type="submit" value="register">
</form>
</body>
</html>
