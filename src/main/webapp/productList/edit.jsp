<%--
  Created by IntelliJ IDEA.
  User: Nam_Phuong
  Date: 2019-04-16
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1> Edit product</h1>
<p>
    <c:if test="${requestScope['message'] !=null}">
<div class="alert alert-success">
    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
    <strong>${requestScope['message']}</strong>
</div>
</c:if>
</p>

<form method="post">
    <fieldset>
        <legend>Form edit product</legend>
        <table class="table">
            <thead>
            <tr class="d-flex">
                <th class="col-2"></th>
                <th class="col-3">Description</th>
                <th class="col-7">Value</th>
            </tr>
            </thead>

            <tbody>
            <tr>
                <td></td>
                <td>ID:</td>
                <td><input type="number" name="id" id="id" required></td>
            </tr>
            <tr>
                <td></td>
                <td>Product Name</td>
                <td><input type="text" name="name" id="name" required></td>
            </tr>

            <tr>
                <td></td>
                <td>Product Price</td>
                <td><input type="text" name="price" id="price" required></td>
            </tr>

            <tr>
                <td></td>
                <td>Description</td>
                <td><input type="text" name="description" id="description" required></td>
            </tr>

            <tr>
                <td></td>
                <td>Supplier</td>
                <td><input type="text" name="supplier" id="supplier" required></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Create Product"></td>
            </tr>
        </table>
    </fieldset>

</form>

</body>
</html>
