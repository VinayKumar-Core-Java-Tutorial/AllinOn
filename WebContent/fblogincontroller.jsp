<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <% String user_name=(String)request.getParameter("user_name");
        String user_email=(String)request.getParameter("user_email"); %>

     <%=user_name %><br>
     <%=user_email %>
     
     <div id="fb-root"></div>
     <script async defer crossorigin="anonymous" src="https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v8.0&appId=981974898908358&autoLogAppEvents=1" nonce="VRLx1uez"></script>
     <div class="fb-login-button" data-size="medium" data-button-type="login_with" data-layout="rounded" data-auto-logout-link="true" data-use-continue-as="true" data-width="" data-scope="public_profile,email" data-onlogin="checkLoginState();"></div>
</body>
</html>