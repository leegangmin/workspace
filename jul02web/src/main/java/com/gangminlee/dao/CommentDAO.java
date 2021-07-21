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
	// bno값이 들어와야 작업합니다.
	public ArrayList<CommentDTO> commentList(int bno) {
		// 내보낼 객체 생성 = 먼저 null처리합니다.
		ArrayList<CommentDTO> commentList = null;
		// 디비 연결해주세요
		// Conn
		Connection conn = DBConnection.dbConn();
		// pstmt
		PreparedStatement pstmt = null;
		// resultset
		ResultSet rs = null;
		String sql = "SELECT * FROM commentview WHERE bno=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			if (rs != null) {// 테스트 해보겠습니다.
				commentList = new ArrayList<CommentDTO>();
			}
			while (rs.next()) {
				CommentDTO dto = new CommentDTO();
				dto.setCno(rs.getInt("cno"));
				dto.setBno(rs.getInt("bno"));
				dto.setCcontent(rs.getString("ccontent"));
				dto.setClike(rs.getInt("clike"));
				dto.setCdate(rs.getTimestamp("cdate"));// 여기 변경했습니다.
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setCip(rs.getString("cip"));// 아이피도 적어주세요
				// 리스트에 붙이기
				commentList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(rs, pstmt, conn);// 닫기 해주세요
		}

		return commentList;// 반환값 처리합니다
	}

	
	public void commentInsert(CommentDTO dto) {
		// conn
		Connection con = DBConnection.dbConn();
		// stpt
		PreparedStatement pstmt = null;
		// sql
		String sql = "INSERT INTO comment (bno, ccontent, no, cip) "
				+ "VALUES(?, ?, (SELECT no FROM login WHERE id=?), ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getBno());
			pstmt.setString(2, dto.getCcontent());
			pstmt.setString(3, dto.getId());
			pstmt.setString(4, dto.getCip());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(null, pstmt, con);
		}

	}

	public int likeUp(CommentDTO dto) {
		Connection con = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		String sql = "UPDATE comment SET clike=clike+1 WHERE cno=? AND bno=?";
		int count = 0;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCno());
			pstmt.setInt(2, dto.getBno());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(null, pstmt, con);
		}
		return count;
	}

	public int deleteComment(CommentDTO dto) {
		Connection con = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM comment WHERE cno=? AND bno=? AND no=(SELECT no FROM login WHERE id=?)";
		int count = 0;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCno());
			pstmt.setInt(2, dto.getBno());
			pstmt.setString(3, dto.getId());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(null, pstmt, con);
		}
		return count;
	}

	public CommentDTO modifyComment(CommentDTO sendDTO) {
		CommentDTO resultDTO = null;
		Connection con = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT cno, bno, id, ccontent FROM commentview "
				+ "WHERE cno=? AND bno=? AND id=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sendDTO.getCno());
			pstmt.setInt(2, sendDTO.getBno());
			pstmt.setString(3, sendDTO.getId());
			rs = pstmt.executeQuery();
			if(rs != null) {//돌아오는 값이 있다면 객체 생성합니다.
				resultDTO = new CommentDTO();
			}
			if(rs.next()) {//DB에서 되돌아오는 값을 dto에 저장하기
				resultDTO.setCno(rs.getInt("cno"));
				resultDTO.setBno(rs.getInt("bno"));
				resultDTO.setId(rs.getString("id"));//id
				resultDTO.setCcontent(rs.getString("ccontent"));//ccontent
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeAll(rs, pstmt, con);
		}		
		return resultDTO;
	}
}
