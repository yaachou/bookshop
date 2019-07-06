<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
		<title>注销账号</title>
		<link rel="stylesheet" type="text/css" href="css/login.css">		
</head>
    <h3><div align="center">注销指定id用户：</div></h3><br>
<body>

<form method="POST" action="/bookshop/deleteuser">
	
	<div align="center">用户id：<input type="text" name="userid" size="20"></div>
	<br>
	
	<div align="center">	
	<p><input type="submit" value="提交" name="B1">
	   <input type="reset" value="重置" name="B2">
	</p>
	</div>
</form>

</body>

</html>