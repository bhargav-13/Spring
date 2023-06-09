<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        #t1{
            margin-left: 100px;
        }
 </style>
</head>
<body>
 <h1>insert form</h1>
 
 <%
 	Student s = (Student)request.getAttribute("s");
 %>

    <form action="StudentController" name="update" method="post">
        <table>
        	<tr>
        		<td><input type="hidden" name="id" value="<%=s.getId() %>" ></td>
        	</tr>
        
            <tr>
                <td><input type="text" name="fname"  value="<%=s.getFname()%>">
            </tr>

            <tr>
                <td>
               	<input type="text" name="lname" value="<%=s.getLname() %>" >
                </td>
            </tr>

            <tr>
               <td>
               	<input type="text" name="email" value="<%=s.getEmail() %>" >
                </td>
            </tr>

            <tr >
                <td><button  id="t1" type="submit" name="action" value="update">EDIT</button></td>
            </tr>
        </table>
    </form>
    <a href="show.jsp"> Show all Student</a>
</body>
</html>