package DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB04 {
	public static void main(String[] args) {
		
		//사용자에게 입력받기 : 이름, 나이, 사는 곳
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.next();

		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();

		System.out.println("사는 곳을 입력하세요.");
		String addr = sc.next();

		Connection conn = null;
		DBConnection dbc = new DBConnection();
		conn = dbc.getConnection();
		
		Statement stmt = null;
		String sql = "INSERT INTO member (member_name, member_age, member_addr) "
				+ " VALUES('" + name + "', " + age + ", '" + addr + "')";
		
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			//insert, delete, update
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
