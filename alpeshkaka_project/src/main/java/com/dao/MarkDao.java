package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.mark;
import com.util.ProjectUtil;

public class MarkDao {
	
	public static void AddMarks(mark m) {
		int total;
		try {
			Connection conn = ProjectUtil.createConnection();
			String sql = "insert into marks(enr, sub, the, prac, total ) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, m.getEnrollment());
			pst.setString(2, m.getSubject());
			pst.setInt(3, m.getTheory());
			pst.setInt(4, m.getPracticle());
			total = m.getPracticle() + m.getTheory();
			pst.setInt(5, total);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
