<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
		<title>购物车</title>		
</head>

<script type="text/javascript">
function check(){
	if(<%= session.getAttribute("item") %>==null){
		alert("对不起，您未登录，请登录后重试！")；
	}
	else{
		window.self.location = "login.jsp”;
	}
}
</script>

<body>
		<h3><div align="center">欢迎查看购物车：</div></h3>
    <table border="1" align="center">
    	<tr bgcolor="#0FFF">
    		<td width="80"><div align="center">id</div></td>
    		<td width="80"><div align="center">书名</div></td>
    		<td width="80"><div align="center">单价</div></td>
    		<td width="80"><div align="center">数量</div></td>
    		<td width="80"><div align="center">小计</div></td>
    	</tr>

		    <tr>
	    		<td width="80"><div align="center">3</div></td>
	    		<td width="80"><div align="center">c</div></td>
	    		<td width="80"><div align="center">77.0</div></td>
	    		<td width="80"><div align="center">2</div></td>
	    		<td width="80"><div align="center">154.0</div></td>
	    	</tr>
	    	
	    	<tr>
	    		<td width="80"><div align="center">4</div></td>
	    		<td width="80"><div align="center">spring</div></td>
	    		<td width="80"><div align="center">44.0</div></td>
	    		<td width="80"><div align="center">1</div></td>
	    		<td width="80"><div align="center">44.0</div></td>
	    	</tr>
	    
	    <tr><td colspan="5" align="center">总计：198.0</td></tr>
    </table>
    <br>
    <div align="center"><a href="/bookshop/lists"><input type="button" value="继续购书"></a></div>
    <br>
    <HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="80%" color=#987cb9 SIZE=3><br>
    
<form method="POST" action="/bookshop/pay">
    <div align="center"><font color="#FF0000">请认真填写订单信息：</font></div><br>
    <div align="center">收件人：<input type="text" name="recipient" size="20"><br></div>
    <div align="center">手机号：<input type="text" name="phone" size="20"></div>
    <div align="center">地址：<input type="text" name="address" size="20"></div><br>
    <div align="center"><input type="submit" value="立即支付"></div>
    <div align="center"><font color="#FF0000">(支付前请确保个人信息填写完整！)</font></div><br>
</form>
</body>
</html>