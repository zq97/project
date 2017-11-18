<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/product.css">
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<body>
	<div class="top">
		<div>
			<img src="image/5.jpg" height="100" width="100%">
		</div>
		<img src="image/7.jpg" width="600" height="100">
		<div>
			<div class="b">
				<input type="text" style="width: 200px; height: 25px"> <input
					type="button" style="height: 30px; width: 45px" value="搜索">
			</div>
		</div>
		<div class="a">
			<div class="d">
				<ul class="r" style="margin-right: 100px">
					<li><a href="shouye.html" rel="nofollow">首页</a> <a href="#">鲜花</a>
						<a href="#">永生花</a> <a href="#">蛋糕</a> <a href="#">礼品</a> &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp; <a href="#">你好，请登录</a> <a href="#">注册</a> <a
						href="#">查询订单</a> <a href="#">购物车</a></li>
				</ul>
			</div>
		</div>
		<div id="b">
		<!-- <a href="product1.jsp" target="_blank">
		<img src="image/玫瑰/玫瑰1.jpg" style="height: 200px; width: 200px;" alt="浪漫缤纷">
		</a>
		<span>￥400</span>
		<a href="product1.jsp" target="_blank">玫瑰/浪漫缤纷</a>
		<a href="#" target="_blank">收藏</a>
		<a href="addCar.do" target="_blank">加入购物车</a> -->
			<form action="addCar.do" method="post">
			 	<c:forEach var="i" items="${p}">
					<div>			
						<img src="image/玫瑰/${i.picture.piname }" style="height: 200px; width: 200px;"><br>
						<br> ${i.pname}<br><br>
						<c:choose>
							<c:when test="${i.pstate==0 }">已售完</c:when>
							<c:when test="${i.pstate==1 }">销售中</c:when>
						</c:choose>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ￥:${i.pcost } 
						<a href="#" target="_blank">收藏</a>
		                <a href="addCar.do" target="_blank">加入购物车</a>
					</div>
					<input type="hidden" value="${i.pid } name="pid" >
					<input type="hidden" value="${user.uid } name="uid">
				</c:forEach> 
			</form> 
		</div>

	</div>

</body>
</html>