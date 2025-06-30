<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 27/06/2025
  Time: 3:53 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><% out.println("Hello World!"); %></h1>
<p><%= 2 + 3 %></p>
<p><% int x = 5; %> - <% out.println(x); %></p>
<p><%! int count = 0; %> - <% out.println(count); %></p>
</body>
</html>
