<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<title>Add Checkbox</title>
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
          <p><i class="fa fa-envelope fa-fw w3-margin-right w3-large w3-text-teal"></i> ${uemail} </p>
          <p><i class="fa fa-phone fa-fw w3-margin-right w3-large w3-text-teal"></i>1224435534</p>
          <hr>         
          <div class="w3-light-grey w3-round-xlarge">
     
            <a href="AlterLinks?id=${id}">Add/ delete links </a>
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
        
        <form action='AddCheckbox' method='post'> 
        <table>
        <tr><td></td><td><input type='hidden' name='id' value="${id}"/></td></tr>
      <tr>
			<td>
				<% String gcheck1 = (String)request.getAttribute("gmcheck"); %>
	        	<% String fcheck1 = (String)request.getAttribute("fbcheck"); %>
				<%if ("1".equals(fcheck1)){ %>
					 <input type="checkbox" name ="fbcheck" id="fcheck" value = "${fbcheck}" checked>
					 <label for= "fcheck">FaceBook</label>
				<% }else {	%>
					<input type="checkbox" name ="fbcheck" id="fcheck" value = "1" >
					<label for= "fcheck">FaceBook</label>
				<%} %>
				
			</td>
		</tr>
		
		<tr>
			<td></td>
			<td >
			    <table id="text" >
			      <tr><td>Name:</td><td><input type="text" name="fbname" value= "${fbname}"/></td></tr>  
					<tr><td>Password:</td><td><input type="password" name="fbpwd" value="${fbpwd}"/></td></tr>  
				</table>
			</td>
		</tr>
		<tr>
			<td>
				<%if ("1".equals(gcheck1)){ %>
					<input type="checkbox"  name = "gmcheck"  value = "${gmcheck}" checked>
					<label for= "gcheck">Gmail</label>
				<%}else { %>
					<input type="checkbox" id="gmcheck" name = "gcheck"  value = "1">
					<label for= "gcheck">Gmail</label>
				<%} %>
					
				
			</td>
		</tr>
		
		<tr>
			<td></td>
			<td >
			    <table id="text2" >
			      <tr><td>Name:</td><td><input type="text" name="gmname" value = "${gmname}"/></td></tr>  
					<tr><td>Password:</td><td><input type="password" name="gmpwd" value="${gmpwd }"/></td></tr>  
				</table>
			</td>
		</tr>
        
        <tr><td colspan='2'><input type='submit' value='Add Chekcbox'/></td></tr>  
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

</body>
</html>
