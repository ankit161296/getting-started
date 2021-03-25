<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login">
		
		Enter email : <input type="uname" name="email" placeholder="Enter EmailID" required>
		Enter Password : <input type="password" name="password" placeholder="Enter password" required>
		<input type="submit" value="Sign In">
	</form>
	
	<p>New user..?</p>
	<form action="register">
	Name : <input type="text" name="name" placeholder="Enter name" required>
	Age : <input type="text" name="age" placeholder="Enter Age" required>
	Occupation : <input type="text" name="occ" placeholder="Enter Occupation" required>
	Email ID : <input type="email" name="newemail" placeholder="Enter EmailID" required>
	New Password : <input type="password" name="newpass" placeholder="Enter Password" required>
	Confirm Password : <input type="password" name="confpass" placeholder="Confirm Password" required>
	<input type="submit" value="Resigter">
	</form>
	
	
</body>
</html>