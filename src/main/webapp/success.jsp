<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>
        success  用户登录 ${usersVo.username }
   </h1>
<form action="denglu" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input name="username" id="uname"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input name="password" type="password" id="upass"/></td>
		</tr>		
		<tr>
			<td><input type="image" src="image/submit.gif"/></td>
			<td><input type="submit" value="登录"/></td>
		</tr>
	</table>
</form>   
   
</body>
</html>