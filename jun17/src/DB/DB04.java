package DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB04 {
	public static void main(String[] args) {
		
		//����ڿ��� �Է¹ޱ� : �̸�, ����, ��� ��
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.next();

		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();

		System.out.println("��� ���� �Է��ϼ���.");
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
