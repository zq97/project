<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
 .aa{
/* background-image: url("image/注册背景.jpg"); */
float: right;
margin-left: 250px;
margin-top: 100px;
} 
.r{
    float: right;
}

.d{
    width: 1200px;
    max-width: none !important;
    padding-right: 0;
    padding-left: 0;
}

.dd {
    font-size: 12px;
    min-width: 1200px;
    height: 35px;
    border-bottom: 1px solid #e6e6e6;
    background-color: #f2f2f2;

}
/* .aa{
float:right;
margin-left: 300px;
}

.aa{
float:right;
margin-left: 600px;
} */
ul li{
    list-style-type:none;
}

a {
    color: #737373;
    text-decoration: none;

    padding-bottom: 3px;
    padding-left: 5px;
    padding-right: 5px;
}
a:hover{
	text-decoration: underline;
	color: #fa3067;
}
</style>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<body><div>
            <img src="image/主页顶端.jpg" width="100%" height="100">
        </div>
    <div class="dd" align="right">
        <div class="d">
            <ul class="r" >
                <li class="a" style="margin-right: 250px">
                    <a class="dl" href="login.jsp" rel="nofollow"  >你好，请登录</a>
                    <a class="dl" href="register.jsp" rel="nofollow" >注册</a>
                    <%-- <a class="hy" style="display: none" > 你好,欢迎  ${user.uname }</a> --%>
                    <a href="order.do?type=find" rel="nofollow" onclick="return check()">查询订单</a>
                    <a href="selectCar.do" rel="nofollow" onclick="return check()" >查看购物车</a>
                    <a href="user.jsp" rel="nofollow" onclick="return check()">个人中心</a>
                    <a href="exit.jsp" rel="nofollow" class="exit" style="display: none"  >退出登录</a>
                </li>
            </ul>
        </div>
    </div>

<div class="aa">
<table border="1">
<tr >
<td colspan="5" align="center"><h2>订单信息</h2></td>
</tr>
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

<br><br><br>
<table border="1">
<tr >
<td colspan="4" align="center"><h2>详细地址信息</h2></td>
</tr>
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
</div>
</body>
</html>