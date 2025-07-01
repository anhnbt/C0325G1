<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 5:07 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page isErrorPage="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="pageTitle" value="Internal Server Error" />
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="alert alert-danger text-center" role="alert">
        <h1 class="mb-3">Lỗi hệ thống</h1>
        <p><c:out value="${error}"/></p>
      </div>
    </div>
  </div>
</div>
<%@ include file="footer.jsp" %>