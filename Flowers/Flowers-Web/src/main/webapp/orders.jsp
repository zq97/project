<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<body>
<div>
<table border="1">
<tr>
<td>订单号</td>
<td>商品名</td>
<td>付款状态</td>
<td>下单时间</td>
<td>总价</td>
</tr>
<c:forEach var="list" items="${list }">
<tr>
<td>${list.onum}</td>
<td>${list.product.pname}</td>
<td><c:if test="${list.ostate==0 }">未付款</c:if>
<c:if test="${list.ostate==1}">已付款</c:if>
</td>
<td>${list.otime }</td>
<td>${list.ototal}</td>
</tr>
</c:forEach>
</table>
</div>
<h2>详细地址信息</h2>
<table border="1">
<tr>
<td>收货人姓名</td>
<td>收货人电话</td>
<td>收货人地址</td>
<td>收货人邮箱</td>
</tr>
<c:forEach items="${list }" var="list">
<tr>
<td>${list.address.aname }</td>
<td>${list.address.atel }</td>
<td>${list.address.aaddr }</td>
<td>${list.address.aemail}</td>
</tr>
</c:forEach> 
</table>
</body>
</html>