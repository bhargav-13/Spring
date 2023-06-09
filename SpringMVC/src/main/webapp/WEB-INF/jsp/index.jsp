<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insert" name="insert"  method="post" >
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname"  ></td>	
			</tr>
			
			<tr>
				<td>last Name</td>
				<td><input type="text" name="lname"  ></td>	
			</tr>
			
			<tr>
				<td>Email</td>
				<td><input type="email" name="email"  ></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center" >
					<input type="submit" value="Insert" name="insert" >
				</td>
			</tr>
			
			
		</table>
	</form>
</body>
</html>