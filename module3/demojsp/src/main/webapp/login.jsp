<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 4:31 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" value="Login" />
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-4">
      <div class="card">
        <div class="card-header bg-primary text-white">Đăng nhập</div>
        <div class="card-body">
          <form action="admin" method="post">
            <div class="mb-3">
              <label for="username" class="form-label">Tên đăng nhập</label>
              <input type="text" class="form-control" id="username" name="username" placeholder="Nhập tên đăng nhập">
            </div>
            <div class="mb-3">
              <label for="password" class="form-label">Mật khẩu</label>
              <input type="password" class="form-control" id="password" name="password" placeholder="Nhập mật khẩu">
            </div>
            <button type="submit" class="btn btn-primary w-100">Đăng nhập</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
<%@ include file="footer.jsp" %>