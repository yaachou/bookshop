<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
		<title>添加书籍</title>
		<link rel="stylesheet" type="text/css" href="css/login.css">		
</head>
    <h3><div align="center">添加新书到库存：</div></h3><br>
<body>

<form method="POST" action="/bookshop/save">

	<div align="center">书名：<input type="text" name="bookname" size="20"></div><br>
	<div align="center">价格：<input type="text" name="price" size="20"></div><br>
	<div align="center">数量：<input type="text" name="quantity" size="20"></div><br>	
		
	<div align="center">
	    <p><input type="submit" value="提交" name="B1">
	       <input type="reset" value="重置" name="B2">
	    </p>
	</div>
</form>

</body>

</html>