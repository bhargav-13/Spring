package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart;
import com.util.ProjectUtil;

public class CartDao {
	
	public static void AddtoCart(Cart c) {
		
		try {
			Connection  conn  = ProjectUtil.createConnection();
			String sql = "insert into cart(uid, bid, book_price, book_qty, total_price, payment_status) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getUid());
			pst.setInt(2, c.getBid());
			pst.setInt(3, c.getBook_price());
			pst.setInt(4, c.getBook_qty());
			pst.setInt(5, c.getTotal_price());
			pst.setString(6, c.getPayment_status());
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<Cart> getCartbyuser(int uid){
		String payment_status = "pending";
		List<Cart> list = new ArrayList<>();
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "select * from cart where uid=? and payment_status=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setString(2, payment_status);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Cart c = new Cart();
				c.setCid(rs.getInt("cid"));
				c.setBid(rs.getInt("bid"));
				c.setUid(rs.getInt("uid"));
				c.setBook_price(rs.getInt("book_price"));
				c.setBook_qty(rs.getInt("book_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getString("payment_status"));
				list.add(c);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static Cart getCartbyCid(int cid){
		Cart c = null;
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "select * from cart where cid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				c = new Cart();
				c.setCid(rs.getInt("cid"));
				c.setBid(rs.getInt("bid"));
				c.setUid(rs.getInt("uid"));
				c.setBook_price(rs.getInt("book_price"));
				c.setBook_qty(rs.getInt("book_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getString("payment_status"));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static boolean checkCart(int uid, int bid)
	{
		boolean flag = false;
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "select * from cart where uid=? and pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, bid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
