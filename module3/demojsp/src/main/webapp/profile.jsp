<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 4:26 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    int age = Integer.parseInt(request.getParameter("age") != null ? request.getParameter("age") : "0");
%>
<ul>
    <li>Ten: <%= name %></li>
    <li>Tuoi: <%= age %></li>
</ul>
</body>
</html>
