package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Wishlist;
import com.util.ProjectUtil;

public class WishlistDao {

	public static void Add_to_wishlist(Wishlist w) {
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "insert into wishlist(bid,uid) values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getBid());
			pst.setInt(2, w.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Wishlist> getWishlistbyUsr(int uid) {
		List<Wishlist> list = new ArrayList<>();
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "Select * from wishlist where uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Wishlist w = new Wishlist();
				w.setWid(rs.getInt("wid"));
				w.setBid(rs.getInt("bid"));
				w.setUid(rs.getInt("uid"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public static boolean checkWishlist(int uid, int bid) {
		boolean flag = false;
		
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "select * from wishlist where uid=? and bid=?";
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
	
	public static void deleteProduct(Wishlist w)
	{
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "delete from wishlist where bid=? and uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getBid());
			pst.setInt(2, w.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
