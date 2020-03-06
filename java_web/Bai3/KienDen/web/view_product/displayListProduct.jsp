<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/2/2020
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr class="head">
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Suppliers</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <tr>

       <c:forEach var="products" items="product">
           <td title="Display Information Product">product
              ${product.productName}
           </td>
           <td>${product.productPrice}</td>
           <td>${product.productDesc}</td>
           <td>${product.supplier}</td>
           <td title="Edit Information Product"><a href="/products?action=edit&id=${product.getProductId()}">Edit</a>
           </td>
           <td title="Delete Information Product"><a
                   href="/products?action=delete&id=${product.getProductId()}">Delete</a></td>

       </c:forEach>
    </tr>
</table>
</body>
</html>
