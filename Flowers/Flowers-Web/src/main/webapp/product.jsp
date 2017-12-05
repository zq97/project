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
			<!-- <img src="image/5.jpg" height="100" width="100%"> -->
			<img src="image/主页顶端.jpg" width="100%" height="100">
		</div>
		<div class="img"><!-- <img src="image/7.jpg" width="450" height="80"> -->
              <img src="image/主页标题.png" width="550" height="100"></div>      
                  
                <form method="post" action="selectProduct.do">
                        <div class="search">
                            <input type="text" name="name" style="width: 230px;height: 25px" placeholder="商品关键词">
                            <input type="submit"  style="height: 30px;width: 45px" value="搜索">
                        </div>
                </form>
		<div class="a">
			<div class="d">
				<ul class="r" style="margin-right: 100px">
					<li><a href="index.jsp" rel="nofollow">首页</a> <a href="#">鲜花</a>
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
		<div id="bb">
			 	<c:forEach var="i" items="${p}">
					<div id="bbb" style="display: block;float: left;margin-left: 20px;margin-top: 20px;">			
						<a href="showAllProduct.do?type=mei" name="showAllProduct.do"><img src="image/玫瑰/${i.picture.piname }" style="height: 150px; width: 150px;"></a><br><br> 
                       ${i.pname}<br><br>
						<c:choose>
							<c:when test="${i.pstate==0 }">已售完</c:when>
							<c:when test="${i.pstate==1 }">销售中</c:when>
						</c:choose>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ￥${i.pcost } <br><br>
						
						<input type="hidden" value="${i.pid }" name="pid" >
					<input type="hidden" value="${user.uid }" name="uid"> 
						<%-- <input type="button" value="加入购入车" onclick="location.href='addCar.do?pid=${i.pid}&uid=${user.uid }'"> --%>
						<input type="button" value="加入购入车" onclick="check()">
						<input type="button" value="收藏">
		              
					</div>
					
				</c:forEach> 
					 
		</div>
<input class="info" type="text" name="uname" style="display: none" value="${user.uname }" />
	</div>
</body>
<script type="text/javascript">
function  check(){
	/* var info = $(".info").val();
	if(info == ""){
		alert("用户需先登录！！！");
		
	}else{
		location.href="addCar.do?pid=${p.pid}&uid=${user.uid }";
	} */
	
};
</script>
</html>