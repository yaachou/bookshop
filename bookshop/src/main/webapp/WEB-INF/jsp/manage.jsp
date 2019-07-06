<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
	<title>管理员操作菜单</title>
	<link rel="stylesheet" type="text/css" href="css/login.css">		
</head>

    <h3><div align="center">欢迎使用管理员权限：</div></h3>
    
<body>
    <div align="center"><font color="#FF0000">对书籍操作：</font></div><br>
    <div align="center"><a href="/bookshop/addform"><input type="button" value="添加书籍"></a></div><br>
    <div align="center"><a href="/bookshop/deleteform1"><input type="button" value="移除书籍"></a></div><br>
    <div align="center"><a href="/bookshop/getAllbook"><input type="button" value="查看库存"></a></div><br>
    <br>
    <div align="center"><font color="#FF0000">对用户操作：</font></div><br>
    <div align="center"><a href="/bookshop/deleteform2"><input type="button" value="注销用户"></a></div><br>
    <div align="center"><a href="/bookshop/getAlluser"><input type="button" value="查看全部用户"></a></div><br>

</body>

</html>