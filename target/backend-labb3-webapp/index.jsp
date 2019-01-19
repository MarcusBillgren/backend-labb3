<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function showForm(divName){
	
	var x = document.getElementById(divName);
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }	
	}
	
function hideDiv(){
	var x = document.getElementById("createUser");
	x.style.display = "none";
}
</script>
</head>
<body onload="hideDiv()">
<h2>Please click on button to perform action!</h2>

<br>
<br>
	<form action="Labb3Servlet" method="GET">
		<input type="submit" name="getAll" value="Get all users">
	</form>

	<form action="Labb3Servlet" method="POST">
		<input type="button" name="createNew" value="Create new user" onclick="showForm('createUser')">
		<div id="createUser">
		<br>
		Name: <input type="text" name="name">
		<br>
		Profession: <input type="text" name="profession">	
		<br>
		<br>
		<button type="submit">Create user</button>
		</div>

	</form>
</body>
</html>
