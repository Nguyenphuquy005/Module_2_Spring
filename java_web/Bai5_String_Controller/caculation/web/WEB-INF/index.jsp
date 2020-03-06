<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/2/2020
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <h1>Caculation mini</h1>
 <form action="/caculation" method="post">
     <input type="text" value="" name="number1">
     <input type="text" name="number2">
     <input type="submit" value="cong" name="cong">
     <input type="submit" value="tru" name="tru">
     <input type="submit" value="nhan" name="nhan">
     <input type="submit" value="chia" name="chia">
     <h2>${result}</h2>

 </form>
  </body>
</html>
