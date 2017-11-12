<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/index.css">
    
</head>
<body>
<div id="top">
    <div >
        <div>
            <img src="image/5.jpg" height="100" width="100%">
        </div>
    </div>
    <div class="dd" align="right">
        <div class="d">
            <ul class="r" >
                <li class="a" style="margin-right: 250px">
                    <a href="login.jsp" rel="nofollow" >你好，请登录</a>
                    <a href="register.jsp" rel="nofollow" >注册</a>
                    <a href="order.jsp" rel="nofollow">查询订单</a>
                    <a href="car.jsp" rel="nofollow" >购物车</a>
                    <a href="user.jsp" rel="nofollow" >个人中心</a>
                </li>
            </ul>
        </div>
    </div>
    <div>
        <header>
            <i>
                <a >
                    <img src="image/7.png" width="750" height="120">
                </a>
                <form method="post">

                    <a class="search">
                        <div>
                            <input type="text" style="width: 230px;height: 25px" placeholder="商品关键词">
                            <input type="button"  style="height: 30px;width: 45px" value="搜索">
                        </div>
                    </a>
                </form>
            </i>
        </header>
    </div>
</div>

<div class="left">
    <div class="n">
        <div>
            <h3 align="center">全部商品导购</h3>
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
                        <a href="product.jsp">玫瑰</a>
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
<div class="right">
<div class="hua">
<img alt="load...." src="image/爱的祝福.jpg" width="400" hight="400">
</div>
</div>
</body>
<script>
        function mouseDown(){
            document.getElementById("bs").style.color="blue"
        }
    </script>
</html>