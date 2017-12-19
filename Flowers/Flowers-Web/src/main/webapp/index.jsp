<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/index.css">
<script>
        window.onload = function(){

            var images = document.getElementsByClassName('tu');
            var pos = 0;
            var len = images.length;

            setInterval(function(){

                images[pos].style.display = 'none';
                pos = ++pos == len ? 0 : pos;
                images[pos].style.display = 'inline';

            },2000);

        };
    </script>
    
</head>
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
                    <a href="collection.do?uname=${user.uname}" rel="nofollow" onclick="return check()">我的收藏</a>
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

<div class="left">
    <div class="n">
        <div>
            <h2 align="center">全部商品导购</h2>
        </div>
        <div>
            <h4 style="color: coral">鲜花用途</h4>
            <div>
                <ul>
                    <li>
                        <a href="#">爱情鲜花</a>
                        <a href="#">生日鲜花</a>
                        <a href="#">友情鲜花</a>
                    </li>
                    <li>
                        <a href="#">问候长辈</a>
                        <a href="#">探病慰问</a>
                        <a href="#">道歉鲜花</a>
                    </li>
                    <li>
                        <a href="#">祝贺鲜花</a>
                        <a href="#">婚庆鲜花</a>
                        <a href="#">商务鲜花</a>
                    </li>
                </ul>
            </div>
            <div>
                <h4 style="color: coral">鲜花花材</h4>
                <ul>
                    <li>
                        <a href="showAllProduct.do?type=all" name="showAllProduct">玫瑰</a>
                        <a href="product.jsp">康乃馨</a>
                        <a href="#">郁金香</a>
                        <a href="#">百合</a>
                    </li>
                    <li>
                        <a href="#">扶朗</a>
                        <a href="#">马蹄莲</a>
                        <a href="#">向日葵</a>
                        <a href="#">薰衣草</a>
                    </li>
                </ul>
            </div>
            <div>
                <h4 style="color: coral">鲜花类别</h4>
                <ul>
                    <li>
                        <a href="#">花束</a>
                        <a href="#">花盒</a>
                        <a href="#">瓶花</a>
                        <a href="#">精品鲜花</a>
                    </li>
                    <li>
                        <a href="#">花篮</a>
                        <a href="#">桌面花篮</a>
                        <a href="#">开业花篮</a>
                    </li>
                </ul>
            </div>
            <div>
                <h4 style="color: coral">永生花</h4>
                <ul>
                    <li>
                        <a href="#">经典花盒</a>
                        <a href="#">巨型玫瑰</a>
                        <a href="#">薰衣草</a>
                    </li>
                </ul>
            </div>

        </div>
    </div>
</div>
<input class="info" type="text" name="uname" style="display: none" value="${user.uname }" />

<div class="right">
	 <div style=" overflow:hidden; width:950px; height:450px; position:relative; float:left;">
                <a href="#"><img src="tu/1.jpg" width="850" height="450" class="tu"/></a>
                <a  href="#"><img src="tu/5.jpg" width="850" height="450" class="tu"/></a>
                <a  href="#"><img src="tu/6.jpg" width="850" height="450" class="tu" style="display: none"/></a>

            </div>
</div>
</body>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
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