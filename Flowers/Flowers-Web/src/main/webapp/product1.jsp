<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
#a{
float:right;
width: 500px;
height: 500px;
margin-bottom: 600px;
margin-left: 500px;
border: solid;
}
.r{
    float: right;
    margin-bottom: 20px;
    margin-left: 10px;
}

.d{
    width: 100%;
    /* max-width: none !important; */
    padding-right: 0;
    padding-left: 0;
    background-color: red;
}
ul li{
    list-style-type:none;
}

a {
    color: #737373;
    padding-bottom: 3px;
    padding-left: 5px;
    padding-right: 5px;
}
.img{
	margin-top: 40px;
	margin-left: 40px;
}
.search {
    float: right;
    width: 600px;
    margin-top: -45px;
    margin-right: 0px;
}
</style>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<body>
<div class="d">
            <ul class="r" >
                <li class="a" style="margin-right: 250px">
                    <a class="dl" href="login.jsp" rel="nofollow"  >你好，请登录</a>
                    <a class="dl" href="register.jsp" rel="nofollow" >注册</a>
                    <a class="hy" style="display: none" > 你好,欢迎  ${user.uname }</a>
                    <a href="order.do?select=find" rel="nofollow" name="find" onclick="return check()">查询订单</a>
                    <a href="selectCar.do" rel="nofollow" onclick="return check()" >查看购物车</a>
                    <a href="user.jsp" rel="nofollow" >个人中心</a>
                </li>
            </ul>
        </div>
        <div class="img"><img src="image/7.jpg" width="450" height="80"></div>      
                  
                <form method="post" action="selectProduct.do">
                        <div class="search">
                            <input type="text" name="name" style="width: 230px;height: 25px" placeholder="商品关键词">
                            <input type="submit"  style="height: 30px;width: 45px" value="搜索">
                        </div>
                </form>
<img src="image/玫瑰/${list.picture.piname }" style="width: 400px; height: 400px;">
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
<div  style="color: red;font-size: 23px">价格:<strong>￥${list.pcost }</strong></div>
</div><br><br><br>
<a href="order.do" style="color: red;font-size: 30px">立即购买</a>
<a href="#"  style="color: red;font-size: 30px">加入收藏</a>
</div>
</body>
</html>