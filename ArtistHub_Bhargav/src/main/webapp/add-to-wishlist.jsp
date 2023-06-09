<%@page import="java.util.List"%>
<%@page import="com.bean.Wishlist"%>
<%@page import="com.dao.WishlistDao"%>
<%@ include file="header.jsp"%>

<%
	int bid=Integer.parseInt(request.getParameter("bid"));
	int uid=u.getUid();
	Wishlist w = new Wishlist();
	w.setBid(bid);
	w.setUid(uid);
	WishlistDao.Add_to_wishlist(w);
	List<Wishlist> list = WishlistDao.getWishlistbyUsr(u.getUid());
	int wishlist_count = list.size();
	  session.setAttribute("wishlist_count", wishlist_count);
	response.sendRedirect("wishlist.jsp");
%>