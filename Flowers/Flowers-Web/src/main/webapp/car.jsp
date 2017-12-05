<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css"/>
<script type="text/javascript" src="js/demo.js"></script>
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

        <%-- <div class="b">
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
                    <td align="center"><a href="deleteCar.do?id=${c.carid }")">删除</a>&nbsp;
                        &nbsp;<a href="order.do?type=add">立即购买</a></td>
                    </tr>
                    
                </c:forEach>

            </table>

        </div> --%>
        <div class="catbox">
  <table id="cartTable">
    <thead>
      <tr>
        <th><label>
            <input class="check-all check" type="checkbox"/>&nbsp;&nbsp;全选</label></th>
        <th>商品</th>
        <th>单价</th>
        <th>数量</th>
        <th>小计</th>
        <th>操作</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${car}" var="c">
    <tr>
        <td class="checkbox"><input class="check-one check" type="checkbox"/></td>
        <td class="goods"><img src="image/玫瑰/${c.product.picture.piname }" alt=""/><span>${c.product.pname}</span></td>
        <td class="price">${c.product.pcost }</td>
        <td class="count"><span class="reduce"></span>
          <input class="count-input" type="text" value="1"/>
          <span class="add">+</span></td>
        <td class="subtotal">${c.product.pcost }</td>
        <td class="operation"><span class="delete">删除</span></td>
      </tr> 
    </c:forEach>
      
      <tr>
        <td class="checkbox"><input class="check-one check" type="checkbox"/></td>
        <td class="goods"><img src="images/2.jpg" alt=""/><span>Canon/佳能 PowerShot SX50 HS</span></td>
        <td class="price">3888.50</td>
        <td class="count"><span class="reduce"></span>
          <input class="count-input" type="text" value="1"/>
          <span class="add">+</span></td>
        <td class="subtotal">3888.50</td>
        <td class="operation"><span class="delete">删除</span></td>
      </tr>
      <tr>
        <td class="checkbox"><input class="check-one check" type="checkbox"/></td>
        <td class="goods"><img src="images/3.jpg" alt=""/><span>Sony/索尼 DSC-WX300</span></td>
        <td class="price">1428.50</td>
        <td class="count"><span class="reduce"></span>
          <input class="count-input" type="text" value="1"/>
          <span class="add">+</span></td>
        <td class="subtotal">1428.50</td>
        <td class="operation"><span class="delete">删除</span></td>
      </tr>
      <tr>
        <td class="checkbox"><input class="check-one check" type="checkbox"/></td>
        <td class="goods"><img src="images/4.jpg" alt=""/><span>Fujifilm/富士 instax mini 25</span></td>
        <td class="price">640.60</td>
        <td class="count"><span class="reduce"></span>
          <input class="count-input" type="text" value="1"/>
          <span class="add">+</span></td>
        <td class="subtotal">640.60</td>
        <td class="operation"><span class="delete">删除</span></td>
      </tr>
    </tbody>
  </table>
  <div class="foot" id="foot">
    <label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;&nbsp;全选</label>
    <a class="fl delete" id="deleteAll" href="javascript:;">删除</a>
    <div class="fr closing" onclick="getTotal();">结 算</div>
    <input type="hidden" id="cartTotalPrice" />
    <div class="fr total">合计：￥<span id="priceTotal">0.00</span></div>
    <div class="fr selected" id="selected">已选商品<span id="selectedTotal">0</span>件<span class="arrow up">︽</span><span class="arrow down">︾</span></div>
    <div class="selected-view">
      <div id="selectedViewList" class="clearfix">
        <div><img src="images/1.jpg"><span>取消选择</span></div>
      </div>
      <span class="arrow">◆<span>◆</span></span> </div>
  </div>
</div>
</div>
</body>
 
</html>