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

<!-- Page Container -->
<div class="w3-content w3-margin-top" style="max-width:1400px;">

  <!-- The Grid -->
  <div class="w3-row-padding">
  
    <!-- Left Column -->
    <div class="w3-third">
    
      <div class="w3-white w3-text-grey w3-card-4">
        <div class="w3-display-container">
          <img src="/w3images/avatar_hat.jpg" style="width:100%" alt="Avatar">
          <div class="w3-display-bottomleft w3-container w3-text-black">
            <h2>${username} </h2>
          </div>
        </div>
        <div class="w3-container">
          <p><i class="fa fa-briefcase fa-fw w3-margin-right w3-large w3-text-teal"></i>Designer</p>
          <p><i class="fa fa-home fa-fw w3-margin-right w3-large w3-text-teal"></i>London, UK</p>
          <p><i class="fa fa-envelope fa-fw w3-margin-right w3-large w3-text-teal"></i> ${uemail}cx </p>
          <p><i class="fa fa-phone fa-fw w3-margin-right w3-large w3-text-teal"></i>1224435534</p>
          <hr>         
          <div class="w3-container">
          	<h5 class='w3-opacity'><a href= "EditUser?username= ${username}&userpwd=${upwd}&useremail= ${uemail}&userid=${id}">Edit User</a></h5>
          	<h5 class='w3-opacity'><a href= "DeleteUser? userid=${id}">Delete Account </a></h5>
            <h5 class='w3-opacity'><a href="AddLinks?id=${id}&username= ${username}&userpwd=${upwd}&useremail= ${uemail}&fbcheckbx=${fcheck}&fbname=${fname}&fbpswd=${fpwd}&gmcheck = ${gcheck}&gmname=${gname}&gmpwd=${gpwd}">Delete links </a></h5>     
            <h5 class='w3-opacity'><a href="DeleteLinks?id=${id}&username= ${username}&userpwd=${upwd}&useremail= ${uemail}&fbcheckbx=${fcheck}&fbname=${fname}&fbpswd=${fpwd}&gmcheck = ${gcheck}&gmname=${gname}&gmpwd=${gpwd}">Delete links </a></h5>
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
	       
	      <form action='DeleteLink' method='post'> 
        <table>
        <tr><td></td><td><input type='hidden' name='id' value="${id}"/></td></tr>
      <tr>
			<td>
				<% String gcheck1 = (String)request.getAttribute("gmcheck"); %>
	        	<% String fcheck1 = (String)request.getAttribute("fbcheck"); %>
				<%if ("1".equals(fcheck1)){ %>
					 <input type="checkbox" name ="fbcheck" id="fcheck" value = "0" >
					 <label for= "fcheck">FaceBook</label>
					 <input id='fbcheckbox' type='hidden' value='${fbcheck}' name='fbcheck'>
			</td>
		</tr>
		
		<tr>
			<td>
				<%if ("1".equals(gcheck1)){ %>
					<input type="checkbox"  name ="gmcheck"  value = "0" >
					<label for= "gcheck">Gmail</label>
					<input id='gmcheckbox' type='hidden' value='${gmcheck}' name='gmcheck'>
			</td>
		</tr>
		
        
        <tr><td colspan='2'><input type='submit' value='Delete Chekcbox'/></td></tr>  
        <%}else { %>
					<h5>User have no links to delete</h5>
					
				<%}} %>
       </table>
        </form> 
        
        </div>
        
    <!-- End Right Column -->
    </div>
    
  <!-- End Grid -->
  </div>
  
  <!-- End Page Container -->
</div>
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

<script>
if(document.getElementById("fbcheck").checked) {
    document.getElementById("fbcheckbox").disabled = true;
}
if(document.getElementById("gmcheck").checked) {
    document.getElementById("gmcheckbox").disabled = true;
}
</script>

</body>
</html>
