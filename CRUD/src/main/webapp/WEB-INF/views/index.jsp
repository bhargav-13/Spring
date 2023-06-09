<html>
<head>
<%@include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<style type="text/css">
#abc{
	color: red;
	border: 1
}
</style>

</head>



<body>

	<div class="container mt-3">
		<div clss="row">
			<div class="col-md-12">
				<h1 id="abc" class="text-center mb-3">Welcome to Product App</h1>

				<table class="table table-striped table-dark">
					<thead>
						<tr>
							<th scope="col">S.No</th>
							<th scope="col">Product name</th>
							<th scope="col">product Description</th>
							<th scope="col">Price</th>
							<th scope="col">Delete</th>
							<th scope="col">Edit</th>
						</tr>
					</thead>
					<tbody>
					
						<c:forEach items="${products }" var="p">
						<tr>
							<th scope="row">${p.id }</th>
							<td>${p.name }</td>
							<td>${p.description }</td>
							<td class="font-weight-bold"> &#x20B9; ${p.price }</td>
							<td> <a href="delete/${p.id }"><i class="fa-solid fa-trash text-danger" style="font-size: 20px;"></i></a> </td>
							<td> <a href="update/${p.id }"><i class="fas fa-pen-nib text-primary" style="font-size: 20px;"></i></a> </td>
						</tr>
						</c:forEach>
					</tbody>
				</table>

	<div class="container text-center">
		<a href="add_product" class="btn btn-outline-dark"><b>Add Product</b></a>
	</div>

			</div>

		</div>

	</div>

</body>
</html>
