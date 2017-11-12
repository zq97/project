<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/n_nav.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>    
        
	<script type="text/javascript" src="js/select.js"></script>
        
    <style type="text/css" >
.leftNav{
    display: none;
}

</style>
</head>
<body>
<div class="i_bg bg_color">
    <!--Begin 用户中心 Begin -->
	<div class="m_content">
   		<div class="m_left">
        	<div class="left_n"><h1>管理中心</h1></div>
            <div class="left_m">
            	<div class="left_m_t t_bg1">商品</div>
                <ul>
                	<li><a href="Member_Order.jsp">商品查询</a></li>
                    <li><a href="Member_Address.jsp">商品管理</a></li>
                    <li><a href="#">缺货登记</a></li>
                    <li><a href="#">订单查询</a></li>
                </ul>
            </div>
        
        </div>
		<div class="m_right">
            <p></p>
            <div class="mem_tit">商品</div>
            <table border="0" class="order_tab" style="width:930px; text-align:center; margin-bottom:30px;">
              <tr>                                                                                                                                                    
                <td width="50%">名称</td>
                <td width="30%">类别</td>
                <td width="20%">描述</td>
                <td width="20%">价格</td>
                <td width="20%">销售数量</td>
                <td width="20%">库存数量</td>
                <td width="20%">种类</td>
                <td width="20%">进货价</td>
              </tr>
              <c:forEach items="${products}" var="list">	
	              <tr>
	                	<td>${list.pname }</td>
	                	<td>${list.type }</td>
	                	<td>${list.pinfo }</td>
	                	<td>${list.pcost}</td>
	                	<td>${list.psnum }</td>
	                	<td>${list.prnum }</td>
	                	<td>${list.kind }</td>
	                	<td>${list.insertCost }</td>
	                	<td>
		                	<a href="DeleteProServlet>id=${list.id }">删除</a>
	                	</td>
	              </tr>
	          </c:forEach>
            </table>
            <p align="center" style="font-size:36px"><a href="Admin_InsertPro.jsp">增加</a></p>
        </div>
    </div> 
</div>

</body>
</html>