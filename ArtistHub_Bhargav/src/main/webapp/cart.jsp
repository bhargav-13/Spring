<%@page import="com.dao.CartDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Random"%>
<%@page import="com.bean.book"%>
<%@page import="com.dao.BookDao"%>
<%@page import="com.bean.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title>cart</title>

</head>

<body>
	<%@include file="header.jsp"%>


	<!-- Navbar Start -->
	<div class="container-fluid">
		<div class="row border-top px-xl-5">
			<div class="col-lg-3 d-none d-lg-block">
				<a
					class="btn shadow-none d-flex align-items-center justify-content-between bg-primary text-white w-100"
					data-toggle="collapse" href="#navbar-vertical"
					style="height: 65px; margin-top: -1px; padding: 0 30px;">
					<h6 class="m-0">Categories</h6> <i
					class="fa fa-angle-down text-dark"></i>
				</a>
				<nav
					class="collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0 bg-light"
					id="navbar-vertical" style="width: calc(100% - 30px); z-index: 1;">
					<div class="navbar-nav w-100 overflow-hidden" style="height: 410px">
						<div class="nav-item dropdown">
							<a href="#" class="nav-link" data-toggle="dropdown">Dresses <i
								class="fa fa-angle-down float-right mt-1"></i></a>
							<div
								class="dropdown-menu position-absolute bg-secondary border-0 rounded-0 w-100 m-0">
								<a href="" class="dropdown-item">Men's Dresses</a> <a href=""
									class="dropdown-item">Women's Dresses</a> <a href=""
									class="dropdown-item">Baby's Dresses</a>
							</div>
						</div>
						<a href="" class="nav-item nav-link">Shirts</a> <a href=""
							class="nav-item nav-link">Jeans</a> <a href=""
							class="nav-item nav-link">Swimwear</a> <a href=""
							class="nav-item nav-link">Sleepwear</a> <a href=""
							class="nav-item nav-link">Sportswear</a> <a href=""
							class="nav-item nav-link">Jumpsuits</a> <a href=""
							class="nav-item nav-link">Blazers</a> <a href=""
							class="nav-item nav-link">Jackets</a> <a href=""
							class="nav-item nav-link">Shoes</a>
					</div>
				</nav>
			</div>
			<div class="col-lg-9"></div>
		</div>
	</div>
	<!-- Navbar End -->


	<!-- Page Header Start -->
	<div class="container-fluid bg-secondary mb-5">
		<div
			class="d-flex flex-column align-items-center justify-content-center"
			style="min-height: 300px">
			<h1 class="font-weight-semi-bold text-uppercase mb-3">Shopping
				Cart</h1>
			<div class="d-inline-flex">
				<p class="m-0">
					<a href="">Home</a>
				</p>
				<p class="m-0 px-2">-</p>
				<p class="m-0">Shopping Cart</p>
			</div>
		</div>
	</div>
	<!-- Page Header End -->


	<!-- Cart Start -->
	<div class="container-fluid pt-5">
		<div class="row px-xl-5">
			<div class="col-lg-8 table-responsive mb-5">
				<table class="table table-bordered text-center mb-0">
					<thead class="bg-secondary text-dark">
						<tr>
							<th>Products</th>
							<th>Price</th>
							<th>Quantity</th>
							<th>Total</th>
							<th>Remove</th>
						</tr>
					</thead>
					<tbody class="align-middle">
						<%
                    		int netprice = 0;
                      		List<Cart> list =CartDao.getCartbyuser(u.getUid());

                      		for(Cart c : list){
                    	  		book b = BookDao.getBookByBid(c.getBid());
                    	  		netprice = netprice+c.getTotal_price();
                      	%>	
						<tr>
							<td class="align-middle"><img src="book_pdf/<%=b.getBook_pdf() %>" alt=""
								style="width: 50px;"><%=b.getBname() %></td>
							<td class="align-middle"><%=b.getPrice() %></td>
							<td class="align-middle">
								<div class="input-group quantity mx-auto" style="width: 100px;">
									<div class="input-group quantity mx-auto" style="width: 50px;">
                                    <form name="change_qty" method="post"  action="CartController">
                                    <input type="hidden" name="cid" value="<%=c.getCid() %>" >
                                    <input type="number" name="product_qty" min="1" max="10"  class="form-control form-control-red form-control-sm bg-dark text-white border-2 text-center" value="<%=c.getBook_qty()%>" onchange="this.form.submit();">
                                    </form>
                                	</div>
								</div>
							</td>

							<td class="align-middle"><%=c.getTotal_price() %></td>
							<td class="align-middle">
							<a href="remove-from-cart.jsp?pid=<%=b.getBid()%>">
								<button
									class="btn btn-sm btn-danger">
									<i class="fa fa-times"></i>
								</button>
								</a>
								</td>
						</tr>
						<%
                      		}
                      		Random randomGenerator = new Random();
              		  		int randomInt = randomGenerator.nextInt(1000000);
                        %>
					</tbody>
				</table>
			</div>
			<div class="col-lg-4">
				<form class="mb-5" action="">
					<div class="input-group">
						<input type="text" class="form-control p-4"
							placeholder="Coupon Code">
						<div class="input-group-append">
							<button class="btn btn-primary">Apply Coupon</button>
						</div>
					</div>
				</form>
				<div class="card border-secondary mb-5">
					<div class="card-header bg-secondary border-0">
						<h4 class="font-weight-semi-bold m-0">Cart Summary</h4>
					</div>
					<div class="card-body">
						<div class="d-flex justify-content-between mb-3 pt-1">
							<h6 class="font-weight-medium">Subtotal</h6>
							<h6 class="font-weight-medium"><%=netprice %></h6>
						</div>
						<div class="d-flex justify-content-between">
							<h6 class="font-weight-medium">Shipping</h6>
							<h6 class="font-weight-medium">FREE</h6>
						</div>
					</div>
					<div class="card-footer border-secondary bg-transparent">
						<div class="d-flex justify-content-between mt-2">
							<h5 class="font-weight-bold">Total</h5>
							<h5 class="font-weight-bold"><%=netprice %></h5>
						</div>
						<button class="btn btn-block btn-primary my-3 py-3">Proceed
							To Checkout</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Cart End -->


	<!-- Footer Start -->
	<div class="container-fluid bg-secondary text-dark mt-5 pt-5">
		<div class="row px-xl-5 pt-5">
			<div class="col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5">
				<a href="" class="text-decoration-none">
					<h1 class="mb-4 display-5 font-weight-semi-bold">
						<span
							class="text-primary font-weight-bold border border-white px-3 mr-1">E</span>Shopper
					</h1>
				</a>
				<p>Dolore erat dolor sit lorem vero amet. Sed sit lorem magna,
					ipsum no sit erat lorem et magna ipsum dolore amet erat.</p>
				<p class="mb-2">
					<i class="fa fa-map-marker-alt text-primary mr-3"></i>123 Street,
					New York, USA
				</p>
				<p class="mb-2">
					<i class="fa fa-envelope text-primary mr-3"></i>info@example.com
				</p>
				<p class="mb-0">
					<i class="fa fa-phone-alt text-primary mr-3"></i>+012 345 67890
				</p>
			</div>
			<div class="col-lg-8 col-md-12">
				<div class="row">
					<div class="col-md-4 mb-5">
						<h5 class="font-weight-bold text-dark mb-4">Quick Links</h5>
						<div class="d-flex flex-column justify-content-start">
							<a class="text-dark mb-2" href="index.jsp"><i
								class="fa fa-angle-right mr-2"></i>Home</a> <a
								class="text-dark mb-2" href="shop.jsp"><i
								class="fa fa-angle-right mr-2"></i>Our Shop</a> <a
								class="text-dark mb-2" href="detail.jsp"><i
								class="fa fa-angle-right mr-2"></i>Shop Detail</a> <a
								class="text-dark mb-2" href="cart.jsp"><i
								class="fa fa-angle-right mr-2"></i>Shopping Cart</a> <a
								class="text-dark mb-2" href="checkout.jsp"><i
								class="fa fa-angle-right mr-2"></i>Checkout</a> <a class="text-dark"
								href="contact.jsp"><i class="fa fa-angle-right mr-2"></i>Contact
								Us</a>
						</div>
					</div>
					<div class="col-md-4 mb-5">
						<h5 class="font-weight-bold text-dark mb-4">Quick Links</h5>
						<div class="d-flex flex-column justify-content-start">
							<a class="text-dark mb-2" href="index.jsp"><i
								class="fa fa-angle-right mr-2"></i>Home</a> <a
								class="text-dark mb-2" href="shop.jsp"><i
								class="fa fa-angle-right mr-2"></i>Our Shop</a> <a
								class="text-dark mb-2" href="detail.jsp"><i
								class="fa fa-angle-right mr-2"></i>Shop Detail</a> <a
								class="text-dark mb-2" href="cart.jsp"><i
								class="fa fa-angle-right mr-2"></i>Shopping Cart</a> <a
								class="text-dark mb-2" href="checkout.jsp"><i
								class="fa fa-angle-right mr-2"></i>Checkout</a> <a class="text-dark"
								href="contact.jsp"><i class="fa fa-angle-right mr-2"></i>Contact
								Us</a>
						</div>
					</div>
					<div class="col-md-4 mb-5">
						<h5 class="font-weight-bold text-dark mb-4">Newsletter</h5>
						<form action="">
							<div class="form-group">
								<input type="text" class="form-control border-0 py-4"
									placeholder="Your Name" required="required" />
							</div>
							<div class="form-group">
								<input type="email" class="form-control border-0 py-4"
									placeholder="Your Email" required="required" />
							</div>
							<div>
								<button class="btn btn-primary btn-block border-0 py-3"
									type="submit">Subscribe Now</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="row border-top border-light mx-xl-5 py-4">
			<div class="col-md-6 px-xl-0">
				<p class="mb-md-0 text-center text-md-left text-dark">
					&copy; <a class="text-dark font-weight-semi-bold" href="#">Your
						Site Name</a>. All Rights Reserved. Designed by <a
						class="text-dark font-weight-semi-bold"
						href="https://htmlcodex.com">HTML Codex</a><br> Distributed
					By <a href="https://themewagon.com" target="_blank">ThemeWagon</a>
				</p>
			</div>
			<div class="col-md-6 px-xl-0 text-center text-md-right">
				<img class="img-fluid" src="img/payments.png" alt="">
			</div>
		</div>
	</div>
	<!-- Footer End -->


	<!-- Back to Top -->
	<a href="#" class="btn btn-primary back-to-top"><i
		class="fa fa-angle-double-up"></i></a>


	<!-- JavaScript Libraries -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
	<script src="lib/easing/easing.min.js"></script>
	<script src="lib/owlcarousel/owl.carousel.min.js"></script>

	<!-- Contact Javascript File -->
	<script src="mail/jqBootstrapValidation.min.js"></script>
	<script src="mail/contact.js"></script>

	<!-- Template Javascript -->
	<script src="js/main.js"></script>
</body>

</html>