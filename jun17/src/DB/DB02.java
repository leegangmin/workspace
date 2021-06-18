package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:mariadb://220.70.33.29:3306/poseidon";
		String id = "poseidon";
		String pw = "01234567";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
			System.out.println("connected");
//			ResultSet rs = stmt.executeQuery("Show Databases;");
//			ResultSet rs = stmt.executeQuery("Show Tables;");
			ResultSet rs = stmt.executeQuery("SELECT * FROM member;");
			
			/* stmt.execute(); = 결과값이 필요 없을 때
			 * 					 수정, 삭제, 삽입
			 * stmt.executeQuery(); = 결과값이 되돌아와야 할 때
			 * 						 조회
			 * 
			 */
			System.out.println("번호		이름		나이		사는곳");
			System.out.println("------------------------------------------");
			while (rs.next()) {
				String result = rs.getString(1);//데이터베이스는 1
				//System.out.println(result);
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
