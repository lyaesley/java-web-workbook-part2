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
    <title>Todo List</title>
</head>
<body>
    <h1>Todo List</h1>

    <ul>
    <c:forEach var="dto" items="${dtoList}">
        <li>${dto}</li>
    </c:forEach>
    </ul>
</body>
</html>
