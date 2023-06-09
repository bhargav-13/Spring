<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>

<div class="container mt-3">

<div class="row">
	<div class="col-md-6 offset-md-3">
	<h1 class="container text-center">insert form</h1>

    <form action="handle-product" name="insert" method="post">
    <div class="form-group">
        <table class="table table-striped table-dark">
        
            <tr>
                <td >Product Name</td>
                <td><input class="form-control" name="name" type="text" placeholder="enter product name"></td>
            </tr>

            <tr>
                <td >Product Description</td>
                <td> <textarea class="form-control" rows="10" cols="50" placeholder="Enter Product Description" name="description"></textarea> </td>
            </tr>

            <tr>
                <td >product Price</td>
                <td> <input class="form-control" type="text" name="price"> </td>
            </tr>

            <tr>
            <td>Submit by click</td>
            <td>
                <div class="container text-center">
                <button class="btn btn-primary"   id="t1" type="submit" name="action" value="add">Add</button>
                </div>
                </td>
            </tr>

        </table>
     </div>
    </form>
    <br>
    <br>
    <div class="container text-center">

    <a class="btn btn-danger" href="${pageContext.request.contextPath }/" >Back</a>
    </div>
    </div>
    </div>
</div>
</body>
</html>