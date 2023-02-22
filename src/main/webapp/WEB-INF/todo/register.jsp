<%--
  Created by IntelliJ IDEA.
  User: lyaes
  Date: 2023-02-17
  Time: 오전 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Todo register</title>
</head>
<body>
<form action="/todo/register" method="post">
    <div>
        <input type="text" name="title" placeholder="INSERT TITLE"/>
    </div>
    <div>
        <input type="date" name="dueDate"/>
    </div>
    <div>
        <button type="reset">RESET</button>
        <button type="submit">REGISTER</button>
    </div>
</form>
</body>
</html>
