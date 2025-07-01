<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" value="Trang chủ"/>
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-8">
      <div class="card">
        <div class="card-header bg-success text-white">Demo JSP & JSTL</div>
        <div class="card-body">
          <h5 class="card-title">Hello World!</h5>
          <p class="card-text">Ví dụ sử dụng JSP Expression, Scriplet, và Declaration:</p>
          <ul class="list-group mb-3">
            <li class="list-group-item">Ngày hôm nay: <%= new Date().toString() %></li>
            <li class="list-group-item">Tổng 10 + 20 = <%= 10 + 20 %></li>
            <li class="list-group-item">Hiệu 10 - 20 = <%= 10 - 20 %></li>
          </ul>
          <p class="card-text">Sử dụng JSTL: <span class="badge bg-primary">JSTL hoạt động!</span></p>
        </div>
      </div>
    </div>
  </div>
</div>
<%@ include file="footer.jsp" %>
