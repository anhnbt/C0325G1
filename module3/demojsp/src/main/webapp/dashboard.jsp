<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 5:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--formater--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
<%-- add bootstrap 5   --%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
</head>
<body>

<h1>Xin chao <c:out value="${username}"></c:out></h1>
<div>So luong nguoi la: <c:out value="${customers.size()}"></c:out></div>
<table class="table table-striped">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Date of Birth</th>
    </tr>
    <c:forEach var="customer" items="${customers}">
    <tr>
        <th>${customer.getId()}</th>
        <th>${customer.getName()}</th>
        <th>${customer.getEmail()}</th>
<%--        formater--%>
        <th><fmt:formatDate value="${customer.getDateOfBirth()}" pattern="dd/MM/yyyy"/></th>
    </tr>
    </c:forEach>
</table>
<footer>
    <div class="container">
        <c:set var="currentYear" value="<%= new Date() %>" scope="request"/>
        <p class="text-center">© <fmt:formatDate value="${currentYear}" pattern="yyyy"></fmt:formatDate> CodeGym. All rights reserved.</p>
    </div>
</footer>
</body>
</html>
