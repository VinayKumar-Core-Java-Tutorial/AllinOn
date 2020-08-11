<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script src=Javascript/indexpage.jsp></script>
<link rel="stylesheet" href="CSS/indexpage.css" type="text/css" />
<style>
div {
  background-color: cream;
  background-image: url("images/indexlogo.jpg");
   background-repeat: no-repeat;
  background-size: cover;
 
}
</style>
</head>
<body>
<div class="cotn_principal">
	<div class="cont_back_info2">
		<div style="text-align: center">
			<h3>User Login</h3>
			<br><br>
			<form action="login" method="get">
			<table>
			    <tr><td><b>Email:</b></td><td><input type = "email" name="email" size="30" /></td></tr>
			    <tr><td><b>Password:</b></td><td> <input type="password" name="password" size="30" /></td></tr>    
			    <tr><td> </td><td><button class="btn_sign_up" onclick="cambiar_sign_up()">Login</button></td></tr>
			    <tr><td>${message}</td></tr>    
			</table>
			</form>
		</div>
	</div>
</div>
</body>
</html>