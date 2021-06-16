package jun04;

import java.util.Scanner;

public class Object02 {
	public static void main(String[] args) {

		String id = "hong";
		String pw = "01234567";

		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		String inputID = "", inputPW = "";
		for (int i = 1; i <= 5; i++) {

			do {
				System.out.println("ID?");
				inputID = sc.next();
			} while (inputID.length() < 3);

			do {
				System.out.println("PW?");
				inputPW = sc.next();
			} while (inputPW.length() < 3);

			// 저장된 값과 같은지를 비교하기
			if (id.equals(inputID) && pw.equals(inputPW)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("정보가 다름");
			}
			
			System.out.println(i + "번 시도함");
			
			if (i == 5) {
				System.out.println("시도 횟수 초과. 끝");
				break;
			}

		}
	}

}
