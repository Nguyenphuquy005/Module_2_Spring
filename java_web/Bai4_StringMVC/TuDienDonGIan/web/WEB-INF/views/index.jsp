<%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 13/02/2020
  Time: 2:13 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Từ Điển</title>
  </head>
  <body>
  <h1>Từ điển</h1>
  <form action="/result" method="post">
    <input type="text" name="input">
    <input type="submit" name="sreach" value="Tìm">
  </form>
  <h3>${result}</h3>
  </body>
</html>
