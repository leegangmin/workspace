package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// ���α׷����� �����ϱ�

public class DB06_allQuery {
	static Connection conn;
	static Statement stmt;

	public static void main(String[] args) {
		DB06_allQuery aq = new DB06_allQuery();// ��ü ����
		DBConnection dbc = new DBConnection();
		conn = dbc.getConnection();

		Scanner sc = new Scanner(System.in);
		boolean check = true;

		try {
			stmt = conn.createStatement();
			while (check) {
				System.out.println("ȸ������Դϴ�.");
				aq.select();
				System.out.println("���ϴ� �۾��� �����ϼ���.");
				System.out.println("1.�߰�  2.����  3.���� 9.������");

				int input = sc.nextInt();
				switch (input) {
				case 1:
					aq.insert(sc);
					break;
				case 2:
					aq.delete(sc);
					break;
				case 3:
					aq.update(sc);
					break;
				case 9:
					System.out.println("�����մϴ�.");
					check = false;
					break;

				default:
					System.out.println("�׷� ��ȣ�� �����ϴ�.");
					break;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
				sc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private void update(Scanner sc) {
		System.out.println("�����Դϴ�.");
		System.out.println("������ ��ȣ�� �Է��ϼ���.");
		int number = sc.nextInt();
		System.out.println("������ �̸��� �Է��ϼ���.");
		String name = sc.next();
		System.out.println("������ ���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		System.out.println("������ ��� ���� �Է��ϼ���.");
		String addr = sc.next();

		String sql = "UPDATE member SET member_name='" + name + "', member_age=" + age + ", member_addr='" + addr
				+ "' WHERE member_no=" + number;

		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println("�ɰ��� ������ �߻��Ͽ����ϴ�.");
		}

		System.out.println("�����Ͽ����ϴ�.");

	}

	private void insert(Scanner sc) {
		System.out.println("�ű� ����Դϴ�.");
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.next();
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		System.out.println("��� ���� �Է��ϼ���.");
		String addr = sc.next();

		String sql = "INSERT INTO member (member_name, member_age, member_addr) " + " VALUES('" + name + "', " + age
				+ ", '" + addr + "')";

		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println("�ɰ��� ������ �߻��Ͽ����ϴ�.");
		}

		System.out.println("�Ϸ��Ͽ����ϴ�.");

	}

	public void delete(Scanner sc) {
		System.out.println("������ ��ȣ�� �Է��ϼ���.");
		int input = sc.nextInt();
		try {
			// stmt = conn.createStatement();
			stmt.execute("DELETE FROM member WHERE member_no=" + input);
		} catch (SQLException e) {
		}
	}

	public void select() {
		ResultSet rs = null;

		try {
			rs = stmt.executeQuery("SELECT * FROM member LIMIT 10");
			System.out.println("����������������������������������������������������������������������������");
			System.out.println("�� ��ȣ ��  ��  ��  �� ���� ��  ��� ��  ��");
			System.out.println("����������������������������������������������������������������������������");
			while (rs.next()) {
				String no = rs.getString("member_no");
				String name = sortString(rs.getString("member_name"));
				String age = rs.getString("member_age");
				String addr = sortString(rs.getString("member_addr"));
				
				System.out.printf("��%5.5s ��%5s��%5.5s ��%5.5s ��\n",
						no, name, age, addr);
			}
			System.out.println("����������������������������������������������������������������������������");
		} catch (Exception e) {

		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	public static String sortString(String str) {
		if(str.length() > 5) {
			str = str.substring(0, 5);
		}else if(str.length() < 5){
			String temp = str;
			for (int i = 0; i < 5 - str.length(); i++) {
				temp = "��" + temp;
			}
			str = temp;
		}
		return str;
	}
}
