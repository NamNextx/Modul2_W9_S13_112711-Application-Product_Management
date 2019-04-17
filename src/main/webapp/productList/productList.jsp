<%--
  Created by IntelliJ IDEA.
  User: Nam_Phuong
  Date: 2019-04-16
  Time: 06:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <p>
        <a href="/products?action=create">Create new Product</a>
    </p>
    <table class="table">
        <thead>
        <tr class="d-flex">
            <th class="col-1"></th>
            <th class="col-2">ID</th>
            <th class="col-3"> Product Name</th>
            <th class="col-2"> Product price</th>
            <th class="col-2"> Product Description</th>
            <th class="col-2">Supplier</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
       <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <th></th>
            <td>${product.getId()}</td>
            <td>${product.getProduct_Name()}</td>
            <td>${product.getProduct_Price()}</td>
            <td>${product.getProduct_Description()}</td>
            <td>${product.getProduct_Supplier()}</td>
            <td><a class="btn btn-success" href="/products?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a class="btn btn-danger" href="products?action=delete&id=${product.getId()}">Delete</a></td>

        </tr>
        </c:forEach>

    </table>
</body>
</html>
