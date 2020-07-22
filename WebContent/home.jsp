<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center">
        <h1>Welcome to User Repository System</h1>
        
        <b>${user.uname} </b>
        <br><br>
        
        <form action="logout" method = "get">
        <input type ="submit" value="Logout">
        </form>
        
    </div>
</body>
</html>