package com.gangminlee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gangminlee.db.DBConnection;
import com.gangminlee.dto.BoardDTO;

public class BoardDAO {
	// 게시판 리스트를 보여줄 메소드 select
	public ArrayList<BoardDTO> list() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		Connection conn = DBConnection.dbConnection();
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM boardview";
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
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
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
		return list;
	}

	// 게시판 세부 글을 볼 메소드 detail
	public BoardDTO detail(int bno) {
		// conn
		Connection conn = DBConnection.dbConnection();
		// stmpt
		PreparedStatement pstmt = null;
		// rs
		ResultSet rs = null;
		// sql
		String sql = "SELECT * FROM boardview WHERE bno=?";
		// dto
		BoardDTO dto = new BoardDTO();

		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto.setBno(rs.getInt("bno"));
				dto.setBtitle(rs.getString("btitle"));
				dto.setBdate(rs.getString("bdate2"));
				dto.setBcontent(rs.getString("bcontent"));
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setBcount(rs.getInt("bcount")+1);//미리 1 증가 시켜서 저장
				
				//카운트 올리는 메소드
				countUp(bno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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

		return dto;
	}

	// 게시판에 글을 쓸 메소드 insert
	public void insert(BoardDTO dto) {
		Connection conn = DBConnection.dbConnection();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO board (btitle, bcontent, no) VALUES (?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBtitle());
			pstmt.setString(2, dto.getBcontent());
			pstmt.setString(3, dto.getId());// 임시로 여기에 저장.
			int count = pstmt.executeUpdate();
			System.out.print(count + "행이 insert 영향 받음");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// 게시판 글을 삭제할 메소드 delete
	public int delete(int bno) {
		
		int count = 0;
		Connection conn = DBConnection.dbConnection();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM board WHERE bno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			count = pstmt.executeUpdate();
			System.out.print(count + "행이 delete 영향 받음");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	
	}
	// 게시판 글을 수정할 메소드 update
	public void update(BoardDTO dto) {
		
	}
	
	// 게시글 조회수 +1 시키는 메소드 countUp(int bno)
	public void countUp(int bno) {
		//conn
		Connection conn = DBConnection.dbConnection();
		//pstmt
		PreparedStatement pstmt = null;
		//sql
		String sql = "UPDATE board SET bcount=bcount+1 WHERE bno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			int count = pstmt.executeUpdate();//적용값 확인용
			System.out.println(count + "행에 countUp 적용됨.");//적용값 확인용
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	
	}
	
}
