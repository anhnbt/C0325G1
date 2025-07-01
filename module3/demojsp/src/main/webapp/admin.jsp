<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 4:32 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" value="Admin" />
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card">
        <div class="card-header bg-warning text-dark">Thông tin Admin</div>
        <div class="card-body">
          <ul class="list-group mb-3">
            <li class="list-group-item">Xin chào: <strong><%= request.getParameter("username") %></strong></li>
            <li class="list-group-item">Mật khẩu của bạn: <strong><%= request.getParameter("password") %></strong></li>
          </ul>
          <c:set scope="request" var="username" value="CodeGym"/>
          <c:set scope="request" var="password" value="Admin@123"/>
          <ul class="list-group">
            <li class="list-group-item">Xin chào <c:out value="${username}"/></li>
            <li class="list-group-item">Mật khẩu: <c:out value="${password}"/></li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</div>
<%@ include file="footer.jsp" %>
