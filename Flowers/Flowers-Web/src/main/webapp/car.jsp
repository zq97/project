<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<body>
<div class="total">
    <div class="a">
        <img src="image/5.jpg" />
    </div>

    <div class="dd" align="right">
        <div class="d">
            <ul class="r" >
                <li class="a" style="margin-right: 250px">
                    <a href="login.jsp" rel="nofollow" >你好，请登录</a>
                    <a href="register.jsp" rel="nofollow" >注册</a>
                    <a href="#" rel="nofollow">查询订单</a>
                    <a href="car.jsp" rel="nofollow" >购物车</a>
                    <a href="user.jsp" rel="nofollow" >个人中心</a>
                </li>
            </ul>
        </div>
    </div>

        <div class="b">
            <div class="bb">
                <h2>购物车详细信息</h2>
            </div>
            <table border="1">
                <tr>
                    <td>商品</td>
                    <td>购买数量</td>
                    <td >价格</td> 
                    <td>操作</td>              
                </tr>
                <c:forEach items="${car}" var="c">
                    <tr>
                    <td height="90" width="100">
                        <div class="img">
                            <img src="image/玫瑰/${c.product.picture.piname }" width="73" height="73" />
                        </div>${c.product.pname}
                    </td> 
                    <td align="center">${c.num}</td>
                    <td style="color:#ff4e00;">￥${c.product.pcost }</td>
                    <td align="center"><a  href="#">删除</a>&nbsp;
                        &nbsp;<a href="#">立即购买</a></td>
                    </tr>
                </c:forEach>

            </table>

        </div>
   

</div>

</body>

</html>