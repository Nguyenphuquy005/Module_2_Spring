<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 11/10/2019
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Customer Management Application</title>
</head>
<body>
<h1 style="text-align: center">Customer Management</h1>
<h2 style="text-align: center">
  <a href="?action=create">Add New Customer</a>
  <a href="list">List All Customer</a>
</h2>
<div align="center">
  <table border="1" cellpadding="5">
    <caption><h2>List Of Customer</h2></caption>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Dia Chi</th>
      <th>Email</th>
      <th>Action</th>
    </tr>

    <%--        Hiển thị danh sách customer--%>
    <c:forEach var="customer" items="${listCustomer}">
      <tr>
        <td><c:out value="${customer.getId()}"></c:out></td>
        <td><c:out value="${customer.getName()}"></c:out></td>
        <td><c:out value="${customer.getAddress()}"></c:out></td>
        <td><c:out value="${customer.getEmail()}"></c:out></td>
        <td>
          <a href="edit?id=<c:out value='${customer.getId()}' />">Edit</a>
          <a href="delete?id=<c:out value='${customer.getId()}' />">Delete</a>
        </td>
      </tr>
    </c:forEach>

  </table>
</div>
</body>
</html>
