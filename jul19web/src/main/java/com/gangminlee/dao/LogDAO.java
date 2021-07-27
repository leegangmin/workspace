package com.gangminlee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

import com.gangminlee.db.DBConnection;
import com.gangminlee.util.Util;

public class LogDAO {
	private LogDAO() { }
	private static LogDAO instance = new LogDAO();
	public static LogDAO getInstance() {
		return instance;
	}
	
	public static void insertLog(HashMap<String, Object> dto) {
		Connection conn = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO log (log_ip, log_target, log_id, log_etc) "
				+ "VALUES (?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String) dto.get("ip"));
			pstmt.setString(2, (String) dto.get("target"));
			pstmt.setString(3, (String) dto.get("id"));
			pstmt.setString(4, (String) dto.get("etc"));
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(null, pstmt, conn);
		}

	}
}
