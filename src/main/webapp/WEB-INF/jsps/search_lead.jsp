<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
</head>
<body>
	<h2>Enter Lead Id</h2>
	
	<form action="findLeadById"method="post">
		Id <input type="text" name="id"/>
		<input type="submit" value="search"/>
	</form>
</body>
</html>