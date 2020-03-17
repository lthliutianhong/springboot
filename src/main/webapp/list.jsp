 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="http://localhost:8080/demotwo/js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="http://localhost:8080/demotwo/js/change.js"></script>
</head>
<body>

<form  id='sform' action="query" method="post">
<input  id="pageNo" type="hidden" name="pageNo"/>
	<div id="main">
		<a href="query.jsp">返回</a>
		<table>
		<tr><th>用户列表</th></tr>
		<tr>
			<td>用户名称</td>
			<td>用户密码</td>
		</tr>		
		<c:forEach var="game" items="${user}">
			<tr>
				<td>${game.username}</td>
				<td>${game.password}</td>
			</tr>
		</c:forEach>		
	</table>
	</div>	
	</form>
<UL>
  <LI class='current'><A href="javascript:jump(1)">首页</A></LI>
  <LI><A href="javascript:jump(${page.getPageNum()-1})">上一页</A></LI> 
  <LI><A href="javascript:jump(${page.getPageNum()+1})">下一页</A></LI>
  <LI><A href="javascript:jump(${page.getPages()})">末页</A></LI>
  <li>共${page.getTotal()}条记录&nbsp;&nbsp;</li>
  </UL>
  <SPAN 
 class='total'>${page.getPageNum()}/${page.getPages()}页</SPAN>
</body>

</html>