package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//��ȣ �Է¹޾Ƽ� �����ϱ�
public class DB05 {
	static Connection conn;// dbc���� �������ָ� �ٷ� ���԰���.
	static Statement stmt;//�̰͵� Ŭ���� ������

	public static void main(String[] args) {
		DBConnection dbc = new DBConnection();// ��ü ����
		conn = dbc.getConnection();// �������� ����
		try {
			stmt = conn.createStatement();
			select();// ����Ʈ �����ֱ�

			System.out.print("������ ��ȣ�� �Է��ϼ���_");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			delete(number);// �����ϱ�

			select();// ����Ʈ ����ϱ�

			//INSERT = �̸�, ����, �ּ�
			//insert(String name, int age, String addr);
			
			//�����ϱ�
			//��ȣ�ޱ�
			//UPDATE = �̸� �ٽ�, ���� �ٽ�, �ּ� �ٽ�
			//update(int number, String name, int age, String addr);
			
			
			sc.close();// ���ɳ� �ݱ�
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void delete(int number) {
		try {
			stmt = conn.createStatement();
			stmt.execute("DELETE FROM member WHERE member_no=" + number);
		} catch (SQLException e) {
		}
	}

	public static void select() {
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM member LIMIT 10");
			System.out.println("����������������������������������������������������������������");
			System.out.println("�� ��ȣ�� ��  �� �� ���̦� ��� �� ��");
			System.out.println("����������������������������������������������������������������");

			while (rs.next()) {
				System.out.printf("�� %3.3s �� %3.3s �� %3.3s �� %5.5s ��\n", rs.getString("member_no"),
						rs.getString("member_name"), rs.getString("member_age"), rs.getString("member_addr"));
			}
			System.out.println("����������������������������������������������������������������");
		} catch (Exception e) {

		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
