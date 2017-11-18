<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<!-- <style type="text/css">

body {
	background-image: url("image/个人信息背景.jpg");
}
</style>
<body>
<div class="content">

    <div class="dd" align="right">
        <div class="d">
            <ul class="r" >
                <li class="a" style="margin-right: 250px">
                    <a href="login.jsp" rel="nofollow" >你好，请登录</a>
                    <a href="register.jsp" rel="nofollow" >注册</a>
                    <a href="#" rel="nofollow">查询订单</a>
                    <a href="#" rel="nofollow" >购物车</a>
                    <a href="#" rel="nofollow" >个人中心</a>
                </li>
            </ul>
        </div>
    </div>

    <div id="left">
        <span class="a">个人中心</span><br>

        <span class="b">个人资料</span><br>
        <a href="#" target="mainFrame">详细信息</a><br>
        <a href="#" target="mainFrame">修改密码</a><br>

        <a href="#" target="mainFrame">我的收藏</a><br>
        <a href="#" target="mainFrame">足迹</a><br>
    </div>
    <div id="right">
        <iframe name="mainFrame" width="1050" height="1000px;" scrolling="yes" src="update.jsp"></iframe>
    </div>
</div> -->

<style>

    .left {
        width: 30%;
        height: 600px;
        float: left;
        margin-left: 0px;
        background-color: blue;
    }

    .d{
        margin-top:200px;
        margin-lift:500px;
    }
    .right {
        width: 70%;
        height: 600px;
        float: right;
        background-color: red;
    }
    ul li{
        list-style-type:none;
    }
    a{
        color: #fff;
        background-color: transparent;
        text-decoration: none;

        padding-bottom: 8px;
        padding-left: 30px;
        padding-right: 30px;
    }
</style>
</head>
<body>
	<div class ="left">
    <div class="d">
        <ul style="margin-left: 180px">
            <li><a>个人中心</a></li>
            <!-- <li><a>个人资料</a></li>
            <li><a>详情信息</a></li>
            <li><a>修改密码</a></li>
            <li><a>我的收藏</a></li>
            <li><a>足迹</a></li> -->
        </ul>
        <ul style="margin-left: 180px">

            <li><a>个人资料</a></li>
            <!-- <li><a>详情信息</a></li>
            <li><a>修改密码</a></li>
            <li><a>我的收藏</a></li>
            <li><a>足迹</a></li>  -->
        </ul>
        <ul style="margin-left: 180px">

            <li><a href="#">个人资料</a></li>
            <!-- <li><a>详情信息</a></li>
            <li><a>修改密码</a></li>
            <li><a>我的收藏</a></li>
            <li><a>足迹</a></li>  -->
        </ul>
        <ul style="margin-left: 180px">
            <li><a href="#">详情信息</a></li>
        </ul>
        <ul style="margin-left: 180px">
            <li><a href="#">修改密码</a></li>
        </ul>
        <ul style="margin-left: 180px">
            <li><a href="#">我的收藏</a></li>
        </ul>
        <ul style="margin-left: 180px">
            <li><a href="#">足迹</a></li>
        </ul>
    </div>
</div>
<div class = "right">

</div>
</body>
</html>