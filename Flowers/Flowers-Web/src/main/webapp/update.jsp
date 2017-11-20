<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateUser.do" method="post" id="form">
    <table>
        <tr>
            <td colspan="2"><h1>个人详细信息</h1></td>

        </tr>
        <tr>
            <td>姓名：</td>
            <td><input name="uname" id="uname" value="${user.uname}" /></td>
            <td><div id="name"></div></td>
        </tr>
        <tr></tr>
        <tr>
            <td>密码：</td>
            <td><input name="upwd" id="upwd" value="${user.upwd }" /></td>
            <td><div id="pwd"></div></td>
        </tr>
        <tr></tr>
        <tr>
            <td>性别：</td>
            <td><input name="usex" id="usex" value="${user.usex }" /></td>
            <td><div id="sex"></div></td>
        </tr>
        <tr></tr>
        <tr>
            <td>生日：</td>
            <td><input name="ubirthday" id="ubirthday" value="${user.ubirthday}" /></td>
            <td><div id="birthday"></div></td>
        </tr>
        <tr></tr>
        <tr></tr>
        <!-- <tr>
            <td><input type="submit" value="更改"/></td>
            <td><input type="reset" value="重置"/></td>
        </tr> -->
    </table>
    <input class="inp" value="修改" type="button" onclick="validate()">
    <input type="reset" value="重置"/>
</form>

</body>
<script type="text/javascript">

$(function (){	
	var info = $(".inp").val();
	if( info =="修改成功"){
		alert("修改成功");
	}else{
		alert("修改失败");
	}
	
})
    function check() {
        var uname=document.getElementById("uname").value;
        var upwd=document.getElementById("upwd").value;
        var usex=document.getElementById("usex").value;
        var ubirthday=document.getElementById("ubirthday").value;
        if(uname==""){
        	document.getElementById("name").innerHTML="请填写用户名";
        	document.getElementById("uname").focus();
            return false;
        }
        if(upwd==""){
        	document.getElementById("pwd").innerHTML="请填写密码";
        	document.getElementById("upwd").focus();
            return false;
        }
        if(usex==""){
        	document.getElementById("sex").innerHTML="请填写性别";
        	document.getElementById("usex").focus();
            return false;
        }
        if(ubirthday==""){
        	document.getElementById("birthday").innerHTML="请填写生日";
        	document.getElementById("ubirthday").focus();
            return false;
        }
        return true;
    }
    function validate() {
        if(check()){
            document.getElementById('form').submit();
        }
    }
</script>
</html>