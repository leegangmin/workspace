package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class DBConnection {
	
	public static Connection getConn() {
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://220.70.33.29:3306/gangminlee";
			conn = DriverManager.getConnection(url, "gangminlee", "01234567");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return conn;
	}
}

public class Login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String id, pw, query, name;
		
		System.out.println("아이디 입력.");
		id = sc.next();
		
		System.out.println("비번 입력.");
		pw = sc.next();
		
		//입력 끝, 데이터베이스로 가기 = conn 정보 넣기
		conn = DBConnection.getConn();//객체 생성 없이 바로
		//SELECT name FROM login WHERE id='apple' AND pw='01234567'
		query = "SELECT name FROM login WHERE id='" + id + "' AND pw = '" + pw + "';";
		
		try {
			stmt = conn.createStatement();//접속정보를 stmt에게 넣기
			rs = stmt.executeQuery(query);//결과값이 있어서 rs
			
			//결과 뽑기 = id, pw가 일치하는 것은 하나이므로			
			if (rs.next()) {
				System.out.println("데이터 있음");
				name = rs.getString("name"); //컬럼명
				System.out.println(name + " welcome");
			} else {//id, pw가 일치하지 않으면 오는 데이터 null
				System.out.println("데이터 없음");
			} 


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();//마지막에 연 것을 먼저 닫기
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
