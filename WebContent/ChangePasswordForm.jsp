<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ChangePwd" method="post">  
	<table>  
		<tr >
			<td><input type= 'hidden' name="firstname" value = "${firstname}"/></td>
		</tr> 
		<tr >
			<td><input type= 'hidden' name="lastname" value = "${lastname}"/></td>
		</tr>  
		<tr>
			<td>Password:</td><td><input type="text" name="upwd" value = "${upwd}"/></td>
		</tr>  
		<tr>
			<td><h1>${uniqueid}</h1><input type='hidden' name="uniqueid" value = "${uniqueid}"/></td>
		</tr>
		
		<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
	</table>
</form>  
</body>
</html>