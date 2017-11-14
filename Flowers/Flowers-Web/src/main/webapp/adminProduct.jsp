<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div class="i_bg bg_color">
    <!--Begin 用户管理中心 Begin -->
	<div class="content">
   		<div class="left">
        	<h1>管理中心</h1>
            <div class="a">
            	<div class="b">商品</div>
                <ul>
                	<li><a href="Member_Order.jsp">商品查询</a></li>
                    <li><a href="Member_Address.jsp">商品管理</a></li>
                    <li><a href="#">缺货登记</a></li>
                    <li><a href="#">订单查询</a></li>
                </ul>
            </div>
        
        </div>
		<div class="right">
            <p></p>
            <div class="t">商品</div>
            <table border="0">
              <tr>                                                                                                                                                    
                <td width="30%">名称</td>
                <td width="30%">类别</td>
                <td width="30%">描述</td>
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
            <p align="center" style="font-size:36px"><a href="admin_insertPro.jsp">增加</a></p>
        </div>
    </div> 
</div>

</body>
</html>