<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot JSP Page</title>
</head>
<body>
    Welcome to Ria Tandan's page
	
	<form action ="addAlien">
	<!--		Enter 1st number : <input type="text" name="number1"><br>
				Enter 2nd number : <input type="text" name="number2"><br>
			-->
			Enter your id : <input type="text" name="aid"><br>
			Enter your name : <input type="text" name="aname"><br>
		<input type="submit">
	</form>
	<hr>
	    <form action="getAlien" method=:"get">
	    Enter your id: <input type="text" name="aid"><br>
	    <input type="submit">
	    </form>
	     <hr>
	        <form action="getAlienByName" method=:"get">
	        Enter your name: <input type="text" name="aname"><br>
	        <input type="submit">
	        </form>
</body>
</html>