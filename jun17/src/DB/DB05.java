package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//번호 입력받아서 삭제하기
public class DB05 {
	static Connection conn;// dbc에서 수정해주면 바로 대입가능.
	static Statement stmt;//이것도 클래스 변수로

	public static void main(String[] args) {
		DBConnection dbc = new DBConnection();// 객체 생성
		conn = dbc.getConnection();// 접속정보 대입
		try {
			stmt = conn.createStatement();
			select();// 리스트 보여주기

			System.out.print("삭제할 번호를 입력하세요_");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			delete(number);// 삭제하기

			select();// 리스트 출력하기

			//INSERT = 이름, 나이, 주소
			//insert(String name, int age, String addr);
			
			//수정하기
			//번호받기
			//UPDATE = 이름 다시, 나이 다시, 주소 다시
			//update(int number, String name, int age, String addr);
			
			
			sc.close();// 스케너 닫기
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
			System.out.println("┌─────┬────────┬─────┬─────────┐");
			System.out.println("│ 번호│ 이  름 │ 나이│ 사는 곳 │");
			System.out.println("├─────┼────────┼─────┼─────────┤");

			while (rs.next()) {
				System.out.printf("│ %3.3s │ %3.3s │ %3.3s │ %5.5s │\n", rs.getString("member_no"),
						rs.getString("member_name"), rs.getString("member_age"), rs.getString("member_addr"));
			}
			System.out.println("└─────┴────────┴─────┴─────────┘");
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
