<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
		<title>全部库存</title>
		<link rel="stylesheet" type="text/css" href="css/login.css">		
</head>

<body>
<div class="panel panel-primary">

	<div class="panel-heading">
		<div align="center"><h3>以下为全部库存：</h3></div>
	</div>
</div>
<div class="container">
	
	<div class="col-md-12">
			
			  <div class="panel-body">
	
				<div class="table table-responsive">
				
					<table class="table table-bordered table-hover">
						<thead>
						    <table border="1" width="631" align="center">						    
							<tr>
							    <td width="58"><div align="center">id</div></td>
								<td width="194"><div align="center"><b>书名</b></div></td>
                                <td width="47"><div align="center"><b>单价</b></div></td>
                                <td width="58"><div align="center"><b>库存</b></div></td>
							</tr>
						</thead>
						<tbody class="text-center">
							<c:forEach items="${requestScope.books}" var="book">
								<tr>
								    <td width="174"><div align="center">${book.id}</div></td>	
								    <td width="174"><div align="center">${book.bookname}</div></td>
								    <td width="174"><div align="center">${book.price}</div></td>
								    <td width="174"><div align="center">${book.quantity}</div></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			</div>
		</div>
</div>
</body>
</html>