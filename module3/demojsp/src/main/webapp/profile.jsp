<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 4:26 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" value="Profile" />
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<%
    String name = request.getParameter("name");
    String ageParam = request.getParameter("age");
    int age = 0;
    try {
        age = (ageParam != null && !ageParam.isEmpty()) ? Integer.parseInt(ageParam) : 0;
    } catch (NumberFormatException e) {
        age = 0;
    }
    if (name == null || name.isEmpty()) {
        name = "Chưa nhập tên";
    }
%>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-4">
            <div class="card">
                <div class="card-header bg-primary text-white">Profile</div>
                <div class="card-body">
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Tên: <strong><%= name %></strong></li>
                        <li class="list-group-item">Tuổi: <strong><%= age %></strong></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="footer.jsp" %>
