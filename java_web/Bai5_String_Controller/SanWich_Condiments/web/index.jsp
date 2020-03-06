<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/2/2020
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/conditon" method="post">
    <h1>SanWich Condition</h1> <br>
    <input type="checkbox" value="muoi" name="muoi"> <label for="">Muối</label> <br>
    <input type="checkbox" value="nam" name="mam">
    <label for="">Mắm</label> <br>
    <input type="checkbox" value="vitinh" name="vitinh">
    <label for="">Vị Tinh</label> <br>
    <input type="checkbox" value="dau" name="dau">
    <label for="">Dầu</label>
    <br>
    <input type="submit" value="save">
    <h3>List + ${result}</h3>
</form>
</body>
</html>
