<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<style>

    .left {
        width: 30%;
        height: 600px;
        float: left;
        margin-left: 0px;
        /* background-image: url("image/注册背景.jpg"); */
        background-color: pink;
        font-size: 30px;
        
    }

    .d{
        margin-top:200px;
        margin-lift:500px;
    }
    .right {
        width: 70%;
        height: 600px;
        float: right;
        /* background-color: red; */
        background-image: url("image/注册背景.jpg");
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
        <ul style="margin-left: 180px;color: black;">
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
            <li><a href="update.jsp">详情信息</a></li>
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
<iframe name="mainFrame" width="1050" height="1000px;" scrolling="yes" src="update.jsp"></iframe>
</div>
</body>
</html>