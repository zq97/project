<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
#a {
	width: 500px;
	height: 500px;
	margin-bottom: 600px;
	margin-left: 700px;
	border: solid red 1px;
	margin-top: -390px;
}

.r {
	float: right;
	margin-bottom: 20px;
	margin-left: 10px;
}

.d {
	width: 100%;
	/* max-width: none !important; */
	padding-right: 0;
	padding-left: 0;
	background-color: red;
}

ul li {
	list-style-type: none;
}

a {
	color: #737373;
	padding-bottom: 3px;
	padding-left: 5px;
	padding-right: 5px;
}

.img {
	margin-top: 40px;
	margin-left: 40px;
}

.search {
	float: right;
	width: 600px;
	margin-top: -45px;
	margin-right: 200px;
}
#img{
margin-left: 200px;
margin-top: 50px;
}
</style>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<body>
	
	<div id="top">
        <div>
            <!-- <img src="image/5.jpg" height="100" width="100%"> -->
            <img src="image/主页顶端.jpg" width="100%" height="100">
        </div>
    <div class="dd" align="right">
        <div class="d">
            <ul class="r" >
                <li class="a" style="margin-right: 250px">
                    <a class="dl" href="login.jsp" rel="nofollow"  >你好，请登录</a>
                    <a class="dl" href="register.jsp" rel="nofollow" >注册</a>
                    <a class="hy" style="display: none" > 你好,欢迎  ${user.uname }</a>
                    <a href="order.do?type=find" rel="nofollow" onclick="return check()">查询订单</a>
                    <a href="selectCar.do" rel="nofollow" onclick="return check()" >查看购物车</a>
                    <a href="user.jsp" rel="nofollow" onclick="return check()">个人中心</a>
                    <a href="exit.jsp" rel="nofollow" class="exit" style="display: none"  >退出登录</a>
                </li>
            </ul>
        </div>
    </div>
    <div>
        <header>
              <div class="img">
              <!-- <img src="image/7.jpg" width="450" height="80"> -->
              <img src="image/主页标题.png" width="550" height="100">
              </div>      
                  
                <form method="post" action="selectProduct.do">
                        <div class="search">
                            <input type="text" name="name" style="width: 230px;height: 25px" placeholder="商品关键词">
                            <input type="submit"  style="height: 30px;width: 45px" value="搜索">
                        </div>
                </form>
        </header>
    </div>
</div>
	
	<div id="img">
	<img src="image/玫瑰/${list.picture.piname }"
		style="width: 400px; height: 400px;">
	</div>	
	<div id="a">
		<h2>浪漫缤纷</h2>
		<div>
			<dl>
				<dt>商品类别:</dt>
				<dd>${list.type.tname }</dd>
			</dl>
			<dl>
				<dt>商品描述:</dt>
				<dd>${list.pinfo }</dd>
			</dl>
			<dl>
				<dt>商品销量:</dt>
				<dd>${list.psnum }</dd>
			</dl>
			<div style="color: red; font-size: 23px" name="pcost">
				价格:<strong>￥${list.pcost }</strong>
			</div>
		</div>
		<br>
		<br>
		<br> <a href="order.do?type=add"
			style="color: red; font-size: 30px">立即购买</a> <a href="#"
			style="color: red; font-size: 30px">加入收藏</a>
	</div>
	
	<input class="info" type="text" name="uname" style="display: none" value="${user.uname }" />
</body>

<script>
function  check(){
	var info = $(".info").val();
	if(info == ""){
		alert("用户未登录！！！！！！！！");
		return false;
	}
	return true;
};
$(function (){
	var info = $(".info").val();
	if(info !=""){
		$(".dl").hide();
		$(".hy").show();
		$(".exit").show();
	}else{
		$(".dl").show();
		$(".hy").hide();
	}
})

        function mouseDown(){
            document.getElementById("bs").style.color="blue"
        }
    </script>
</html>