<%--
Created by IntelliJ IDEA.
User: Admin
Date: 7/2/2020
Time: 3:23 PM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<fieldset >
  <legend>Product Discount Calculator</legend>
  <p>Lất xất hả fen</p>
  <form action="/caculation" method="post">
    <label>Product Description:</label>
    <input style="margin-left: 1em" name="decription"> <br>
    <label>List Price:         </label>
    <input style="margin-left: 6em" name="price"> <br>
    <label>Discount Percent:   </label>
    <input style="margin-left: 2.4em "  name="discount"> <br>
    <input style  ="margin-left: 11.3em ; border-radius: 25px" type="submit" value="caculation discount">
  </form>
</fieldset>
</body>
</html>
