<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/2/2020
  Time: 2:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  modelAttribute="student" method="post" action="/student/addnew">

    <label >Id:</label>
    <input path="id" cssClass="form-control"/><br/>
    </div>
    <div class="form-group">
        <label >Name:</label>
        <input path="name" cssClass="form-control"/><br/>
    </div>
    <div class="form-group">
        <label >Address:</label>
        <input path="address" cssClass="form-control"/><br/>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
