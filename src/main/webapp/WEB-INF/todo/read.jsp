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
    <title>Todo Read</title>
</head>
<body>
    <div>
        <input type="text" name="tno" value="${dto.tno}" readonly/>
    </div>
    <div>
        <input type="text" name="title" value="${dto.title}" readonly/>
    </div>
    <div>
        <input type="date" name="dueDate" value="${dto.dueDate}"/>
    </div>
    <div>
        <input type="checkbox" name="finished" ${dto.finished ? "checked" : ""} readonly"/>
    </div>
    <div>
        <a href="/todo/modify?tno=${dto.tno}">Modify/Remove</a>
        <a href="/todo/list">List</a>
    </div>
</body>
</html>
