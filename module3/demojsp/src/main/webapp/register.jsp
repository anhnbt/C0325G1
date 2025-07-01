<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 4:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" value="Register" />
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-4">
      <div class="card">
        <div class="card-header bg-info text-white">Đăng ký</div>
        <div class="card-body">
          <form action="profile.jsp" method="get">
            <div class="mb-3">
              <label for="name" class="form-label">Tên của bạn</label>
              <input type="text" class="form-control" id="name" name="name" placeholder="Nhập tên của bạn">
            </div>
            <div class="mb-3">
              <label for="age" class="form-label">Tuổi của bạn</label>
              <input type="number" class="form-control" id="age" name="age" placeholder="Nhập tuổi của bạn">
            </div>
            <button type="submit" class="btn btn-info w-100 text-white">Gửi đi</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
<%@ include file="footer.jsp" %>
