<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div class="content">
    <div >
        <div>
            <img src="image/5.jpg" height="100" width="100%">
        </div>
    </div>
    <div class="dd" align="right">
        <div class="d">
            <ul class="r" >
                <li class="a" style="margin-right: 250px">
                    <a href="#" rel="nofollow" >你好，请登录</a>
                    <a href="#" rel="nofollow" >注册</a>
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
        <iframe name="mainFrame" width="1050" height="1000px;" scrolling="yes" src="update.html"></iframe>
    </div>
</div>

</body>
</html>