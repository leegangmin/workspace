package com.gangminlee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gangminlee.db.DBConnection;
import com.gangminlee.dto.CommentDTO;
import com.gangminlee.util.Util;

public class CommentDAO {
	// bno값이 들어와야 작업함.

	public ArrayList<CommentDTO> commentList(int bno) {
		// 내보낼 객체 생성 = 먼저 null 처리함.
		ArrayList<CommentDTO> commentList = null;

		Connection conn = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM commentview WHERE bno=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			if (rs != null) {// 테스트
				commentList = new ArrayList<CommentDTO>();
			}
			while (rs.next()) {
				CommentDTO dto = new CommentDTO();
				dto.setCno(rs.getInt("cno"));
				dto.setBno(rs.getInt("bno"));
				dto.setCcontent(rs.getString("ccontent"));
				dto.setClike(rs.getInt("clike"));
				dto.setCdate(rs.getString("cdate"));
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setCip(rs.getString("cip"));
				// 리스트에 붙이기
				commentList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(rs, pstmt, conn);
		}

		return commentList;// 반환값 처리
	}

	public void commentInsert(CommentDTO dto) {
		Connection conn = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO comment (bno, ccontent, no, cip)" + "VALUES(?,?,(SELECT no FROM login WHERE id=?), ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getBno());
			pstmt.setString(2, dto.getCcontent());
			pstmt.setString(3, dto.getId());
			pstmt.setString(4, dto.getCip());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(null, pstmt, conn);
		}

	}

}
