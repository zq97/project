<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
#zhuce {
	margin-left: 500px;
}
#ljzc{	
margin-left: 606px;
height: 50px;
	width: 212px;
}
h1 {
	margin-left: 666px;
	color: black
}

input {
	border-radius: 10px;
	font-size: 20px;
	height: 50px;
}

body {
	background-image: url("image/注册背景.jpg");
}
</style>
</head>
<body>
	<form action="addUser.do" method="post">
		<table id="zhuce">

			<h1>注册</h1>

			<tr>
				<td align="right">&nbsp;用户名： &nbsp;</td>
				<td><input type="text" id="uname" name="uname" /><span
					class="s_ln" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="right">&nbsp;密码： &nbsp;</td>
				<td><input type="password" id="upwd" name="upwd" /> <span
					class="s_pwd" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="right">&nbsp;确认密码： &nbsp;</td>
				<td><input type="password" id="reupwd" name="reupwd" /><span
					class="s_repwd" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="right">&nbsp;&nbsp;&nbsp;性别：&nbsp;&nbsp;</td>
				<td>男<input type="radio" value="1" name="usex"
					checked="checked" /> 女<input type="radio" value="2" name="usex" />
				</td>
			</tr>
			<tr>
				<td align="right">出生日期： &nbsp;</td>
				<td><input type="date" id="ubirthday" name="ubirthday" /> <span
					class="s_ic" style="color: red"></span></td>
			</tr>
			<tr>
				<td align="right">&nbsp;类别： &nbsp;</td>
				<td><input type="text" value="1" id="utype" name="utype"
					readonly="readonly" /><span class="s_un" style="color: red"></span></td>
			</tr>		
		</table>
		<input id="ljzc" type="submit" value="立即注册" class= "log_btn" />
	</form>

</body>
<script type="text/javascript">
	function check() {
		var uname = $("#uname").val();
		var upwd = $("#upwd").val();
		var reupwd = $("#reupwd").val();
		var reupwd = $("#ubirthday").val();
	}
</script>
</html>