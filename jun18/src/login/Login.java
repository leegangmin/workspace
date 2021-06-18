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
		
		System.out.println("���̵� �Է�.");
		id = sc.next();
		
		System.out.println("��� �Է�.");
		pw = sc.next();
		
		//�Է� ��, �����ͺ��̽��� ���� = conn ���� �ֱ�
		conn = DBConnection.getConn();//��ü ���� ���� �ٷ�
		//SELECT name FROM login WHERE id='apple' AND pw='01234567'
		query = "SELECT name FROM login WHERE id='" + id + "' AND pw = '" + pw + "';";
		
		try {
			stmt = conn.createStatement();//���������� stmt���� �ֱ�
			rs = stmt.executeQuery(query);//������� �־ rs
			
			//��� �̱� = id, pw�� ��ġ�ϴ� ���� �ϳ��̹Ƿ�			
			if (rs.next()) {
				System.out.println("������ ����");
				name = rs.getString("name"); //�÷���
				System.out.println(name + " welcome");
			} else {//id, pw�� ��ġ���� ������ ���� ������ null
				System.out.println("������ ����");
			} 


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();//�������� �� ���� ���� �ݱ�
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
