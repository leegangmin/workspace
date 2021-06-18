package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// 프로그램으로 제작하기

public class DB06_allQuery {
	static Connection conn;
	static Statement stmt;

	public static void main(String[] args) {
		DB06_allQuery aq = new DB06_allQuery();// 객체 생성
		DBConnection dbc = new DBConnection();
		conn = dbc.getConnection();

		Scanner sc = new Scanner(System.in);
		boolean check = true;

		try {
			stmt = conn.createStatement();
			while (check) {
				System.out.println("회원목록입니다.");
				aq.select();
				System.out.println("원하는 작업을 선택하세요.");
				System.out.println("1.추가  2.삭제  3.수정 9.나가기");

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
					System.out.println("종료합니다.");
					check = false;
					break;

				default:
					System.out.println("그런 번호는 없습니다.");
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
		System.out.println("수정입니다.");
		System.out.println("수정할 번호를 입력하세요.");
		int number = sc.nextInt();
		System.out.println("수정할 이름을 입력하세요.");
		String name = sc.next();
		System.out.println("수정할 나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("수정할 사는 곳을 입력하세요.");
		String addr = sc.next();

		String sql = "UPDATE member SET member_name='" + name + "', member_age=" + age + ", member_addr='" + addr
				+ "' WHERE member_no=" + number;

		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println("심각한 문제가 발생하였습니다.");
		}

		System.out.println("수정하였습니다.");

	}

	private void insert(Scanner sc) {
		System.out.println("신규 등록입니다.");
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("사는 곳을 입력하세요.");
		String addr = sc.next();

		String sql = "INSERT INTO member (member_name, member_age, member_addr) " + " VALUES('" + name + "', " + age
				+ ", '" + addr + "')";

		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println("심각한 문제가 발생하였습니다.");
		}

		System.out.println("완료하였습니다.");

	}

	public void delete(Scanner sc) {
		System.out.println("삭제할 번호를 입력하세요.");
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
			System.out.println("┌──────┬──────────┬──────┬───────────┐");
			System.out.println("│ 번호 │  이  름  │ 나이 │  사는 곳  │");
			System.out.println("├──────┼──────────┼──────┼───────────┤");
			while (rs.next()) {
				String no = rs.getString("member_no");
				String name = sortString(rs.getString("member_name"));
				String age = rs.getString("member_age");
				String addr = sortString(rs.getString("member_addr"));
				
				System.out.printf("│%5.5s │%5s│%5.5s │%5.5s │\n",
						no, name, age, addr);
			}
			System.out.println("└──────┴──────────┴──────┴───────────┘");
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
				temp = "　" + temp;
			}
			str = temp;
		}
		return str;
	}
}
