<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/2/2020
  Time: 2:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List Student</h2>
<a href="/student/addnew">Add new Student</a>
<table class="table table-hoverr">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Address</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${listStudent}">
        <tr>
            <td><c:out value="${student.id}" /></td>
            <td><c:out value="${student.name}" /></td>
            <td><c:out value="${student.address}" /></td>
            <td>
                <a href="/student/edit/">Edit</a> |
                <a href="/student/delete/${student.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
