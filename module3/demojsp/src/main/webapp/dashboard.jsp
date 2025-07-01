<%--
  Created by IntelliJ IDEA.
  User: Nguyễn Bá Tuấn Anh (anhnbt.it@gmail.com)
  Date: 30/06/2025
  Time: 5:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="pageTitle" value="Dashboard" />
<%@ include file="header.jsp" %>
<%@ include file="nav.jsp" %>
<div class="container mt-5">
  <div class="row">
    <div class="col-12">
      <div class="card">
        <div class="card-header bg-secondary text-white">Dashboard</div>
        <div class="card-body">
          <h5 class="card-title">Xin chào <c:out value="${username}"/></h5>
          <p class="card-text">Số lượng khách hàng: <span class="badge bg-info"><c:out value="${customers.size()}"/></span></p>
          <div class="table-responsive">
            <table class="table table-striped table-bordered">
              <thead class="table-light">
                <tr>
                  <th>ID</th>
                  <th>Name</th>
                  <th>Email</th>
                  <th>Date of Birth</th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="customer" items="${customers}">
                  <tr>
                    <td>${customer.getId()}</td>
                    <td>${customer.getName()}</td>
                    <td>${customer.getEmail()}</td>
                    <td>${customer.getDateOfBirth()}</td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<%@ include file="footer.jsp" %>