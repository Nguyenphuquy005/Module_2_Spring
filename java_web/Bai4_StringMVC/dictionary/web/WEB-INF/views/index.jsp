<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/2/2020
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Từ điển</h1>
  <form action="/result" method="post">
    <input type="text" name="input">
    <input type="submit" name="sreach" value="Tìm">
      <h3>${result}</h3>
  </form>

  </body>
</html>
