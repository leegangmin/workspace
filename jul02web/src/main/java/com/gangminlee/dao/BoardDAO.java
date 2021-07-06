package com.gangminlee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gangminlee.db.DBConnection;
import com.gangminlee.dto.BoardDTO;

public class BoardDAO {
	public com.gangminlee.dto.BoardDTO detail(int bno) {
		com.gangminlee.dto.BoardDTO dto = new com.gangminlee.dto.BoardDTO();

		DBConnection db = new DBConnection();
		Connection conn = db.dbConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String detail = "SELECT * FROM boardview WHERE bno=?";
		try {
			pstmt = conn.prepareStatement(detail);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto.setBno(rs.getInt("bno"));
				dto.setBtitle(rs.getString("btitle"));
				dto.setBcontent(rs.getString("bcontent"));
				dto.setBdate(rs.getString("bdate2"));
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setBcount(rs.getInt("bcount"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	public ArrayList<com.gangminlee.dto.BoardDTO> list() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		DBConnection db = new DBConnection();
		Connection conn = db.dbConn();
		PreparedStatement pstmt = null;
		String query = "SELECT * FROM boardview";
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				com.gangminlee.dto.BoardDTO dto = new com.gangminlee.dto.BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setBtitle(rs.getString("btitle"));
				dto.setBdate(rs.getString("bdate"));
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setBcount(rs.getInt("bcount"));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public void insert(BoardDTO dto) {
		// conn객체 생성 pstmt
		Connection conn = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO board (btitle, bcontent, no) " + "VALUES (?,?, (SELECT no FROM login WHERE id=?))";
		// 우리가 받은 값은 ID인데 데이터베이스에는 no를 저장해야함.
		// 서브쿼리로 돌려서 no를 뽑아 저장시킴.
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBtitle());
			pstmt.setString(2, dto.getBtitle());
			pstmt.setString(3, dto.getId());
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행이 영향을 받음.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			{
				try {
					if (pstmt != null) {
						pstmt.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public int delete(int bno, String id) {

		int result = 0;
		Connection conn = DBConnection.dbConn();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM board WHERE bno=? AND no=(SELECT no FROM login where id=?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
