package jun04;

import java.util.Scanner;

public class EmailCheck {

	public static void main(String[] args) {

		/*
		 * String email = "gangminlee@kakao.com";
		 * 
		 * String id = email.substring(0, email.indexOf('@')); String domain =
		 * email.substring(email.indexOf('@')+1, email.length());
		 * 
		 * System.out.println(id + "@" + domain);
		 */

		// 사용자가 메일 주소를 입력하기

		// 진짜 메일 주소가 맞는지 검사하기 = @, .com, .co.kr, .net, .org

		// 입력받은 email값을 @ 기준으로 분리해.
		// @앞 값은 id라는 변수에 담아.
		// @뒤 값은 server 라는 변수에 담아.
		// @가 없는 email이라면 "이메일을 입력해"

		// 올바른 이메일인 경우 분리된 id를 아래와 같이 조건에 부합되게 만들기.

		/*
		 * 1. id의 길이는 5~10자 이어야 한다. 2. 첫 문자는 반드시 영어 대문자이어야 한다. 3. 나머지 문자는 영문자와 숫자로만
		 * 구성되어야 한다. 4. 모든 조건에 맞으면 "올바른 ID"라고 출력. 5. 위 조건에 맞지 않는다면 틀린 이유를 출력 시키고 프로그램
		 * 종료.
		 */

		Scanner sc = new Scanner(System.in);

		String email = "";

		for (int i = 1; i <= 5; i++) {

			do {

				System.out.println("이메일 주소를 입력해");
				email = sc.next();

				String id = email.substring(0, email.indexOf('@'));
				String server = email.substring(email.indexOf('@') + 1, email.length());

				if (email.contains("@")) {
					if (server.contains(".com")
							|| server.contains(".co.")
							|| server.contains(".net")
							|| server.contains(".org")) {
						if (id.length() <= 10 && id.length() >= 5) {
					}
					System.out.println("정상");
				}
			} while (i == 5);
				if (i == 5) {
					System.out.println("5회 시도 초과");
					break;
				}
			System.out.println("정상");
			break;
			
			for (int j = 0; j < args.length; j++) {
				
				
			}
			if (id.length() >= 5 && id.length() <= 10) {
				if(Character.isUpperCase(id.charAt(0)) {
					for (int j = 0; j < args.length; j++) {
						char m = id.charAt(j);
						if (Character.isUpperCase(m)||Character.isLowerCase(m)||Character.isDigit(m))  {
							
						}
					}
				}
				
			}
			
			
			

		}
}
	}
}

