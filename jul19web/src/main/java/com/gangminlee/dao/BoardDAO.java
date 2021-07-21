package com.gangminlee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.gangminlee.db.DBConnection;
import com.gangminlee.util.Util;

public class BoardDAO {
	// 전체 글 읽어오는 method()
	public ArrayList<HashMap<String, Object>> boardList() {
		ArrayList<HashMap<String, Object>> boardList = null;
		// DB접속
		// conn
		Connection con = DBConnection.dbConn();
		// pstmt
		PreparedStatement pstmt = null;
		// rs
		ResultSet rs = null;
		// sql ---> 테이블 새로 만들겁니다 빈칸으로 두세요.
		String sql = "SELECT * FROM freeview LIMIT 0, 10";
		// 로직은 테이블명 완성 후에 짜겠습니다.

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs != null) {
				boardList = new ArrayList<HashMap<String, Object>>();
				while (rs.next()) {
					// 저장 DTO
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("totalcount", rs.getInt("totalcount"));
					map.put("commentcount", rs.getInt("commentcount"));
					map.put("fno", rs.getInt("fno"));
					map.put("ftitle", rs.getString("ftitle"));
					// map.put("fcontent", rs.getString("fcontent"));
					map.put("fdate", rs.getDate("fdate"));
					map.put("fcount", rs.getInt("fcount"));
					map.put("fip", rs.getString("fip"));
					map.put("no", rs.getInt("no"));
					map.put("id", rs.getString("id"));
					map.put("name", rs.getString("name"));
					// boardList.add(dto)
					boardList.add(map);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(rs, pstmt, con);
		}
		return boardList;
	}

	public HashMap<String, Object> detail(int fno) {
		HashMap<String, Object> dto = null;
		Connection con = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM freeview WHERE fno=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, fno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new HashMap<String, Object>();
				dto.put("commentcount", rs.getInt("commentcount"));
				dto.put("fno", rs.getInt("fno"));
				dto.put("ftitle", rs.getString("ftitle"));
				dto.put("fcontent", rs.getString("fcontent"));
				dto.put("fdate", rs.getString("fdate"));
				dto.put("fcount", rs.getInt("fcount"));
				dto.put("fip", rs.getString("fip"));
				dto.put("no", rs.getInt("no"));
				dto.put("id", rs.getString("id"));
				dto.put("name", rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(rs, pstmt, con);
		}
		return dto;
	}

	public ArrayList<HashMap<String, Object>> commentList(int fno) {
		ArrayList<HashMap<String, Object>> commentList = null;
		// DB접속
		// conn
		Connection con = DBConnection.dbConn();
		// pstmt
		PreparedStatement pstmt = null;
		// rs
		ResultSet rs = null;
		// sql ---> 테이블 새로 만들겁니다 빈칸으로 두세요.
		String sql = "SELECT * FROM freecommentview WHERE fno=?";
		// 로직은 테이블명 완성 후에 짜겠습니다.

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, fno);
			rs = pstmt.executeQuery();

			if (rs != null) {
				commentList = new ArrayList<HashMap<String, Object>>();
				while (rs.next()) {
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("fcno", rs.getInt("fcno"));
					map.put("fno", rs.getInt("fno"));
					map.put("fccontent", rs.getString("fccontent"));
					map.put("fcdate", rs.getDate("fcdate"));
					map.put("fclike", rs.getInt("fclike"));
					map.put("fcip", rs.getString("fcip"));
					map.put("no", rs.getInt("no"));
					map.put("id", rs.getString("id"));
					map.put("name", rs.getString("name"));
					commentList.add(map);
				}
			}
			// System.out.println(commentList);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(rs, pstmt, con);
		}
		return commentList;
	}

	public int commentModify(HashMap<String, Object> dto) {
		int result = 0;
		// DB접속
		// conn
		Connection con = DBConnection.dbConn();
		// pstmt
		PreparedStatement pstmt = null;
		// sql
		String sql = "UPDATE freecomment SET fccontent=? WHERE fcno=?";
		// 로직은 테이블명 완성 후에 짜겠습니다.

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, (String) dto.get("content"));
			pstmt.setInt(2, Util.str2Int((String) dto.get("fcno")));
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(null, pstmt, con);
		}
		return result;
	}

}
