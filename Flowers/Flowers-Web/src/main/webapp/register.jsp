<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="addUser.do" method="post">
    <table border="0"
           style="width:420px; font-size:14px; margin-top:20px;"
           cellspacing="0" cellpadding="0">
        <tr height="50" valign="top">
            <td width="95">&nbsp;</td>
            <td><span class="fl" style="font-size:24px;"><h1>注册</h1></span> </td>
        </tr>

        <tr height="50">
            <td align="right">&nbsp;用户名
                &nbsp;</td>
            <td><input type="text" value="" class="uname"
                       name="uname" /><span class="s_ln" style="color:red"></span></td>
        </tr>
        <tr height="50">
            <td align="right">&nbsp;密码
                &nbsp;</td>
            <td><input type="password" value="" class="upwd"
                       name="upwd" /> <span class="s_pwd" style="color:red"></span></td>
        </tr>
        <tr height="50">
            <td align="right">&nbsp;确认密码
                &nbsp;</td>
            <td><input type="password" value="" class="upwd"
                       name="rePassword" /><span class="s_repwd" style="color:red"></span></td>
        </tr>
        <tr height="50">
            <td align="right">&nbsp;性别
                &nbsp;&nbsp;&nbsp;</td>
            <td>男<input type="radio" value="1" name="usex"
                        checked="checked" /> 女<input type="radio" value="2" name="usex" />

            </td>
        </tr>
        <tr height="50">
            <td align="right">出生日期： &nbsp;</td>
            <td><input type="date" value="" class="ubirthday"
                       name="ubirthday" /> <span class="s_ic" style="color:red"></span>
            </td>
        </tr>
        <tr height="50">
            <td align="right">&nbsp;类别： &nbsp;</td>
            <td><input type="text" value="1" class="l_num"
                       name="utype" readonly="readonly" /><span class="s_un" style="color:red"></span></td>
        </tr>

        <tr height="60">
            <td>&nbsp;</td>
            <td><input type="submit" value="立即注册" class= "log_btn" /></td>
        </tr>
    </table>
</form>

</body>
</html>