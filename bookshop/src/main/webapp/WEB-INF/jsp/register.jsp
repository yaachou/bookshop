<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
		<title>欢迎注册</title>
		<link rel="stylesheet" type="text/css" href="css/login.css">		
</head>
    <h3><div align="center">欢迎新用户注册：</div></h3><br>
<body>

<form method="POST" action="/bookshop/saveuser">

	<div align="center">账号：<input type="text" name="username" size="20"></div><br>
	<div align="center">密码：<input type="password" name="password" size="20"></div><br>
	<div align="center">	
	<p>
	   <input type="submit" value="提交" name="B1">
	   <input type="reset" value="重置" name="B2">
	</p>
	</div>
</form>


</body>

</html>