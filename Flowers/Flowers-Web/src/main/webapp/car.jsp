<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css" >
        .leftNav{
            display: none;
        }
    </style>
</head>
<body>
<div class="i_bg">
    <div class="content mar_20">
        <img src="image/5.jpg" />
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

    <div class="content mar_20">
        <div class="two_bg">
            <div class="two_t">
                <span class="fr"><h2>购物车详细信息</h2></span>
            </div>
            <table border="1" class="car_tab" style="width:1110px;"
                   cellspacing="0" cellpadding="0">
                <tr>
                    <td class="car_th" width="550">商品</td>
                    <td class="car_th" width="140">类别</td>
                    <td class="car_th" width="150">购买数量</td>
                    <td class="car_th" width="130">小计</td>
                    <td class="car_th" width="140">返还积分</td>
                </tr>
                <c:forEach items="${car }" var="c" varStatus="status">
                    <tr>
                    <td height="90" width="100">
                        <div class="c_s_img">
                            <img src="image/1.jpg" width="73" height="73" />
                        </div>${c.pname}
                    </td>

                    <td align="center">
                        ${c.type}
                    </td>
                    <td align="center" style="color:#ff4e00;">￥${c.pnum}</td>
                    <td align="center">26R</td>
                    <td align="center"><a  href="#">删除</a>&nbsp;
                        &nbsp;<a href="#">加入收藏</a></td>
                    </tr>
                </c:forEach>

            </table>

            <div class="two_t">
                <h2>收货人信息</h2>
                <span class="fr"><a href="#">修改</a></span>
            </div>
            <table border="2" class="peo_tab" style="width:1110px;"
                   cellspacing="0" cellpadding="0">
                <tr>
                    <td class="p_td" width="160">商品名称</td>
                    <td width="395">$</td>
                    <td class="p_td" width="160">电子邮件</td>
                    <td width="395">$</td>
                </tr>
                <tr>
                    <td class="p_td">详细信息</td>
                    <td>四川省成都市武侯区</td>
                    <td class="p_td">邮政编码</td>
                    <td>6011111</td>
                </tr>
                <tr>
                    <td class="p_td">电话</td>
                    <td></td>
                    <td class="p_td">手机</td>
                    <td>18600002222</td>
                </tr>

            </table>
            <table border="0" style="width:900px; margin-top:20px;"
                   cellspacing="0" cellpadding="0">

                <tr height="70">
                    <td align="right"><b style="font-size:14px;">应付款金额：<span
                            style="font-size:22px; color:#ff4e00;">${total }</span></b></td>
                </tr>
                <tr height="70">
                    <td align="right"><a href="BuyCar_Three.jsp"><img
                            src="images/btn_sure.gif" /></a></td>
                </tr>
            </table>

        </div>
    </div>

</div>

</body>
</html>