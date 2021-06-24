package com.gangminlee.dao;
//���� �����ؼ� ���ϴ� DAO
//���� ���õ� ��� ���� ���⼭ ó����.
//conn

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gangminlee.dto.BoardDTO;
import com.gangminlee.web.DBConnection;

public class BoardDAO {
	public ArrayList<BoardDTO> list(){
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
		}
		
		
		return list;
	}

}
