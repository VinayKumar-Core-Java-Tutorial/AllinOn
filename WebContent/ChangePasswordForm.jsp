<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
<script src=Javascript/indexpage.jsp></script>
<link rel="stylesheet" href="CSS/indexpage.css" type="text/css" />
<style type="text/css">
	body {
	    text-align: center;
	}
	form {
	    display: inline-block;
	}
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
			<h3>Change Password</h3>
			<br><br>
			<form action="ChangePwd" method="post" id = "form">  
				<table>  
					<tr >
						<td><input type= 'hidden' name="firstname" value = "${firstname}"/></td>
					</tr> 
					<tr >
						<td><input type= 'hidden' name="lastname" value = "${lastname}"/></td>
					</tr>  
					<tr>
						<td><input type='hidden' name="uniqueid" value = "${uniqueid}"/></td>
					</tr>
					<tr>
						<td><input type='hidden' id="oldupwd" value = "${upwd}"/></td>
					</tr>
					<tr>
						<td>Existing Password:</td><td><input type="text" name="existingupwd" id = "existingupwd" onblur = "passwordvalid();"/></td>
					</tr>  
					<tr>
						<td>New Password:</td><td><input type="text" name="newupwd" id="newupwd" /></td>
					</tr>  
					<tr>
						<td>Confirm Password:</td><td><input type="text" name="confirmupwd" id="confirmupwd" /></td>
					</tr>  
					
					<tr><td colspan="2"><input type="button" value="Change Password" onclick='checkBeforeSubmit();'/></td></tr>  
				</table>
			</form> 
		</div>
	</div>
</div> 
</body>
<script type="text/javascript">

var checkBeforeSubmit = function(){
        
	var firstInput = document.getElementById("newupwd").value;
	var secondInput = document.getElementById("confirmupwd").value;
    
    if(firstInput == secondInput)
    	document.getElementById("form").submit();
    else 
	    alert("new password and confirm password should be same");
}

function passwordvalid()
	{ 
	
	var oldpwd = document.getElementById("oldupwd").value;
	var existingpwd = document.getElementById("existingupwd").value;
	
	if(oldpwd == existingpwd)
	{
		document.getElementById("existingupwd").value = oldpwd;
	}
	else
	{
	alert('Please enter valid password.');
	}
}

</script>
</html>