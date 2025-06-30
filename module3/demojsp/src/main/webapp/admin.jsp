<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 4:32 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard Administration</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
%>
<ul>
    <li>Xin: <%= username %></li>
    <li>Mat khau cua ban: <%= password %></li>
</ul>
<c:set scope="request" var="username" value="CodeGym"></c:set>
<c:set scope="request" var="password" value="Admin@123"></c:set>
<ul>
    <li>Xin chao <c:out value="${username}"></c:out></li>
    <li>Mat khau: <c:out value="${password}"></c:out></li>
    <li></li>
</ul>
<%--<h1>Xin chao <c:out value="${username}"></c:out></h1>--%>
<%--<div>So luong nguoi la: <c:out value="customers.size()"></c:out></div>--%>
<%--renter table--%>
</body>
</html>
