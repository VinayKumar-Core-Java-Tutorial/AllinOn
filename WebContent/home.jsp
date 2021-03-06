<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<title>Profile</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif}
</style>
<body class="w3-light-grey">
<div style="text-align: center">
        <h1>WELCOME TO ONE PLACE FOR ALL</h1>
        
        
        
        <br><br>
    </div>
<!-- Page Container -->
<div class="w3-content w3-margin-top" style="max-width:1400px;">

  <!-- The Grid -->
  <div class="w3-row-padding">
  
    <!-- Left Column -->
    <div class="w3-third">
    
      <div class="w3-white w3-text-grey w3-card-4">
        <div class="w3-display-container">
          <img src="images/logo.png.png" style="width:100%" alt="Avatar">
          <div class="w3-display-bottomleft w3-container w3-text-black">
            <h2>${user.uname} </h2>
          </div>
        </div>
        <div class="w3-container">
          <p><i class="fa fa-briefcase fa-fw w3-margin-right w3-large w3-text-teal"></i>Designer</p>
          <p><i class="fa fa-home fa-fw w3-margin-right w3-large w3-text-teal"></i>London, UK</p>
          <p><i class="fa fa-envelope fa-fw w3-margin-right w3-large w3-text-teal"></i> ${user.uemail} </p>
          <p><i class="fa fa-phone fa-fw w3-margin-right w3-large w3-text-teal"></i>1224435534</p>
          <hr>         
          <div class="w3-container">
          
          	<h5 class='w3-opacity'><a href= "EditUser?username= ${user.uname}&userpwd=${user.upwd}&useremail= ${user.uemail}&userid=${user.id}">Edit User</a></h5>
          	<h5 class='w3-opacity'><a href= "DeleteUserAccount?userid=${user.id}">Delete Account </a></h5>
            <h5 class='w3-opacity'><a href="AddLinks?id=${user.id}&username= ${user.uname}&userpwd=${user.upwd}&useremail= ${user.uemail}&fbcheckbx=${user.fcheck}&fbname=${user.fname}&fbpswd=${user.fpwd}&gmcheck = ${user.gcheck}&gmname=${user.gname}&gmpwd=${user.gpwd}">Add links </a></h5>     
            <h5 class='w3-opacity'><a href="DeleteLink?id=${user.id}&username= ${user.uname}&userpwd=${user.upwd}&useremail= ${user.uemail}&fbcheckbx=${user.fcheck}&fbname=${user.fname}&fbpswd=${user.fpwd}&gmcheck = ${user.gcheck}&gmname=${user.gname}&gmpwd=${user.gpwd}">Delete links </a></h5>
          </div>
          <br>
        </div>
      </div><br>

    <!-- End Left Column -->
    </div>

    <!-- Right Column -->
    <div class="w3-twothird">
    
      <div class="w3-container w3-card w3-white w3-margin-bottom">
        <h2 class="w3-text-grey w3-padding-16"><i class="fa fa-suitcase fa-fw w3-margin-right w3-xxlarge w3-text-teal"></i>User have access to</h2>
        
        <div class="w3-container">
        
        <% String gcheck1 = (String)request.getAttribute("gcheck"); %>
        <% String fcheck1 = (String)request.getAttribute("fcheck"); %>
       
        
       <% if("1".equals(gcheck1)){
        	out.print("<a href= 'FbGmailWelcome?gmailname = '"+request.getAttribute("user.gname")+"'></a>");
        	if("1".equals(gcheck1)){ %>
        	<h5 class='w3-opacity'><a href= "FbGmailWelcome?gmailname= ${user.gname}">Gmail</a></h5>
       <% } 
       }
       else if("1".equals(fcheck1)){
    	   out.print("<a href= 'FbGmailWelcome?facebookname = '"+request.getAttribute("user.fname")+"'></a>");
    	   if ("1".equals(fcheck1)){ %>
       	<h5 class='w3-opacity'><a href= "FbGmailWelcome?facebookname= ${user.fname}">Facebook</a></h5>
      <% }
       }
        
        
        else{
        	out.print("<a href= 'ViewUser'>Add checkbox</a>");
        }
        	%>
        	

        
        </div>
        
        
    <!-- End Right Column -->
    </div>
    
  <!-- End Grid -->
  </div>
  
  <!-- End Page Container -->
</div>
</div>
<div style="text-align: center">
        
        
        <b>${user.uname} </b>
        <br><br>
        
        <form action="logout" method = "get">
        <input type ="submit" value="Logout">
        </form>
        
    </div>

<footer class="w3-container w3-teal w3-center w3-margin-top">
  <p>Find me on social media.</p>
  <i class="fa fa-facebook-official w3-hover-opacity"></i>
  <i class="fa fa-instagram w3-hover-opacity"></i>
  <i class="fa fa-snapchat w3-hover-opacity"></i>
  <i class="fa fa-pinterest-p w3-hover-opacity"></i>
  <i class="fa fa-twitter w3-hover-opacity"></i>
  <i class="fa fa-linkedin w3-hover-opacity"></i>
  <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
</footer>

</body>
</html>


   
