<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
		<title>移除书籍</title>
		<link rel="stylesheet" type="text/css" href="css/login.css">		
</head>
    <h3><div align="center">移除指定id书籍：</div></h3><br>
<body>

<form method="POST" action="/bookshop/deletebook">
	
	<div align="center">id：<input type="text" name="bookid" size="20"></div>
	<br>
	
	<div align="center"	>
	<p><input type="submit" value="提交" name="B1">
	   <input type="reset" value="重置" name="B2">
	</p>
	</div>
</form>

</body>

</html>