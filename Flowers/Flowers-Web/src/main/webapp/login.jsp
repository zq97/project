<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
#add {
	margin-left: 500px;
	font-size: 30px;
}
#zhuce{
margin-left: 500px;
}
input {
	border-radius: 10px;
	font-size: 20px; width : 350px;
	height: 50px;
	width: 350px;
}

#from {
	font-size: 20px;
}

.add-img {
	margin-left: 105px;
	height: 120px;
	width: 120px;
	margin-bottom: 10px;
}

body {
	background-image: url("image/主页.jpg");
}
h1{
color:black}
</style>
</head>
<body class="home">
<!-- 温文尔雅 -->
	<form action="index.jsp" id="form" method="post">
		<div id="add">
			<img src="image/人头像.png" class="add-img" /><br> 
			<h1>
		Login to ZQ！ </h1><input id="user"
				type="text" class="user" placeholder="请输入用户名"
				style="margin-left: 0px" maxlength="10"><br> <input
				id="password" type="password" class="pwd" placeholder="请输入密码"
				maxlength="16" style="margin-left: 0px; margin-top: 35px;"><br>
			<div class="add-info">
				<span style="font-weight: 300">温馨提示：<br>登陆时请确保您信息安全
				</span>
			</div>
			<br> <input class="submit" type="submit" onclick="validate()"
				value="登陆" style="margin-left: 0px; background-color:silvery">
				<br>						
		</div>
	</form>	
				<form action="register.jsp" id="zhuce" method="post">
				 <input class="submit" type="submit" onclick="validate()"
				value="注册" style="margin-left: 0px; background-color: silvery">
	</form>
</body>
</html>