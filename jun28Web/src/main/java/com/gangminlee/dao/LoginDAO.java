package com.gangminlee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gangminlee.dto.LoginDTO;
import com.gangminlee.web.DBConnection;

public class LoginDAO {
	//반환값 있는 메소드로 변경함.
	public int join(LoginDTO dto) {
		// conn - db 연결

		// pstmt

		// rs

		// query

		DBConnection dbc = new DBConnection();
		Connection conn = dbc.dbConn();
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		String query = "INSERT INTO login (id, name, pw, email)" + "Value (?, ?, ?, ?)";
		int count = 0;
		
		try {
			// pstmt ?값 넣기
			pstmt = conn.prepareStatement(query);
			// 값 넣기
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPw());
			pstmt.setString(4, dto.getEmail());

			// 로직
			count = pstmt.executeUpdate();
			// rs에 담으려 했으나 이걸로 해봄.
			// 결과값을 숫자로 넘겨줌.
			// 변경된 row수를 표시함
			// execute() = 결과 값이 boolean으로 나옴.
			System.out.println(count + "개 변경");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();

			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		return count;

	}

	public LoginDTO login(LoginDTO dto) {
		LoginDTO login = new LoginDTO();

		// conn, pstmt, rs, query
		DBConnection dbc = new DBConnection();
		Connection conn = dbc.dbConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM login WHERE id=? AND pw=?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				login.setNo(rs.getInt("no"));
				login.setName(rs.getString("name"));
				login.setId(rs.getString("id"));
				login.setPw(rs.getString("pw"));
				login.setEmail(rs.getString("email"));
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return login;
	}
}
