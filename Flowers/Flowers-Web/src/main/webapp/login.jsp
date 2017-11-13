<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/login.css">
</head>
<body class="home">
<div>
            <img src="image/5.jpg" height="100" width="100%">
        </div>
<div class="a">
    <ul class="r" >
        <li class="a" style="margin-right: 250px">
            <a href="login.jsp" rel="nofollow" >你好，请登录</a>
            <a href="register.jsp" rel="nofollow" >注册</a>
            <a href="order.jsp" rel="nofollow">查询订单</a>
            <a href="car.jsp" rel="nofollow" >购物车</a>
        </li>
    </ul>
</div>
<header>
    <div class="logo">
        <h1><a href="/" class="logo-bd">中国鲜花礼品网</a></h1>
        <i></i>

        <div class="delivery-city">
            <div class="dropdown csqh">
                欢迎登录
            </div>
        </div>

    </div>
    <form method="post">
        <a class="search">
            <div>
                <input type="text" style="width: 230px;height: 25px" placeholder="商品关键词">
                <input type="button"  style="height: 30px;width: 45px" value="搜索">
            </div>
        </a>
    </form>
</header>

<div class="login-wrapper">
    <div class="container">
        <div class="login-box">
            <!-- 登录/注册tab -->
            <ul class="login-tabs">
                <li class="active"><a href="#">登录</a></li>
                <li><a href="register.jsp">注册</a></li>
            </ul>
            <form action="LoginServlet" id="form" method="post">
                <div id="add">
                    <input id="user" type="text" class="uname" name = "name" placeholder="请输入用户名" >
                    <br><br>
                    <input id="password" type="password" class="upwd" name = "pwd" placeholder="请输入密码" ><br><br>
                    <a class="pull-right" href="#" target="_blank">忘记密码？</a>
                    <input type="submit" value="登陆">
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>