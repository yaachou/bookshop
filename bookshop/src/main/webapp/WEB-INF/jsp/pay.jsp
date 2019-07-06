<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
		<title>支付</title>
		<link rel="stylesheet" type="text/css" href="css/login.css">		
</head>
    <div align="center"><h3>提示信息：</h3></div>
<body>		
	<div align="center">支付成功！您的当前账户余额为802.0元。。。</div>
	<div align="center">如有需要，可联系管理员（QQ：123456789）进行充值</div>	
	<HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="60%" color=#987cb9 SIZE=3><br>
	
	<div align="center">您提交的个人信息为：</div>
    <table border="1" align="center">
    	<tr>
    		<td width="80"><div align="center">收件人</div></td>
    		<td width="200"><div align="center">${recipient}</div></td>
    	</tr>
		<tr>
	    	<td width="80"><div align="center">手机号</div></td>
	    	<td width="200"><div align="center">${phone}</div></td>
	    </tr>	 	
	    <tr>
	    	<td width="80"><div align="center">地址</div></td>
	    	<td width="200"><div align="center">${address}</div></td>
	    </tr>
    </table>
</body>

</html>