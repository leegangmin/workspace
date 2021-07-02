package score;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ScoreDAO {
	public Connection getConn() {
		Connection conn = null;
		//마리아디비 접속 jar연결해주세요.
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://220.70.33.29:3306/poseidon";
			conn = DriverManager.getConnection(url, "poseidon", "01234567");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}//getConn()
	
	//데이터 불러오기 getScore()
	public Vector getScore() {
		Vector data = new Vector();//나중에 수정해주세요.
		Connection conn = getConn();
		Statement stmt = null;//나중에 수정해주세요.
		ResultSet rs = null;
		String sql = "SELECT * FROM score ORDER BY name ASC";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("name"));
				row.add(rs.getInt("kor"));
				row.add(rs.getInt("eng"));
				row.add(rs.getInt("mat"));
				row.add(rs.getInt("tot"));
				row.add(rs.getInt("ave"));
				data.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {rs.close();}
				if(stmt != null) {stmt.close();}
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;
	}
	
	
	
	
	
	
	
	
	//데이터 저장하기 insertScore()
	//데이터 수정하기 updateScore()
	//데이터 삭제하기 deleteScore()
	
	
}


