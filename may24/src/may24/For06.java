package may24;

import java.util.Scanner;

//숫자 맞추기
/*
 * 컴퓨터가 랜덤한 숫자 두자리수를 뽑습니다.
 * 사용자가 숫자를 입력하면 UP / DOWN을 출력하고
 * 일치한다면 "축하합니다"라고 하면서 출력 종료는 프로그램
 * 1. for문으로 20번 실행하기
 * 2. 일치하면 for문 강제 종료하고 프로그램 종료하기
 */
public class For06 {
	public static void main(String[] args) {

		// 컴퓨터가 숫자 뽑기
		// 사용자 입력 대기
		// for문으로 20번 검사하기
		// 사용자 숫자가 작다면 UP
		// 사용자 숫자가 크다면 DOWN
		// 일치한다면 "축하합니다" 프로그램 종료
		// for, break, if

		// double random = Math.random() * 99 + 1;//0.45676371565
		int random02 = (int) (Math.random() * 99 + 1);
		System.out.println(random02);// 1~99

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {
			System.out.println("숫자를 입력하세요.");
			int input = sc.nextInt();

			if (input < random02) {// 컴퓨터 숫자가 클 경우
				System.out.println("UP");
			} else if (random02 < input) {// 컴퓨터 숫자가 작을 경우
				System.out.println("DOWN");
			} else {// 동일할 경우
				System.out.println("축하합니다.");
				break;
				//i = 20;
			}
			
		} // for
		sc.close();// 이건 덤. 스캐너 닫기

	}

}
