<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="update.do" method="post">
    <table>
        <tr>
            <td colspan="2"><h1>个人详细信息</h1></td>

        </tr>
        <tr>
            <td>姓名：</td>
            <td><input name="uname" value="${user.uname}" /></td>
        </tr>
        <tr></tr>
        <tr>
            <td>密码：</td>
            <td><input name="upwd" value="${user.upwd }" /></td>
        </tr>
        <tr></tr>
        <tr>
            <td>性别：</td>
            <td><input name="usex" value="${user.usex }" /></td>
        </tr>
        <tr></tr>
        <tr>
            <td>生日：</td>
            <td><input name="ubirthday" value="${user.ubirthday}" /></td>
        </tr>
        <tr></tr>
        <tr></tr>
        <tr>
            <td><input type="submit" value="更改"/></td>
            <td><input type="reset" value="重置"/></td>
        </tr>
    </table>
</form>

</body>
</html>