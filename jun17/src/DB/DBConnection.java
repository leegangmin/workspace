package DB;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
//접속정보를 가지고 있는 클래스
//싱글턴 패턴으로 만들기
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://220.70.33.29:3306/poseidon";
			
			conn = DriverManager.getConnection(url, "poseidon", "01234567");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}	
	
}

/*
 * INSERT, SELECT, UPDATE, DELETE
 */