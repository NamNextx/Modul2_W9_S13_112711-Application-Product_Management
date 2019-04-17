<%--
  Created by IntelliJ IDEA.
  User: Nam_Phuong
  Date: 2019-04-17
  Time: 09:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete form</title>
</head>
<body>
<p>
    <a href="/products">Back to list customer</a>
</p>

<form method="post">
    <h2> Are you sure?</h2>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td> Name: </td>
                <td>${requestScope["product"].getProduct_Name()}</td>
            </tr>

            <tr>
                <td>Price: </td>
                <td>${requestScope["product"].getProduct_Price()}</td>
            </tr>

            <tr>
                <td>Address: </td>
                <td>${requestScope["product"].getProduct_Description()}</td>
            </tr>

            <tr>
                <td> <input type="submit" value="Delete product"></td>
                <td> <a href="/products">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
