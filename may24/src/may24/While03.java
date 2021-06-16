package may24;
//while을 사용하여 숫자게임을 만들어주세요.

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {

		//사용자 입력
		Scanner sc = new Scanner(System.in);
		
		//컴 두자리 숫자 뽑기
		int com = (int) (Math.random() * 99 + 1);
		
		//while로 비교
		//Up/down / 일치하면 "축하합니다" 프로그램 종료
		int count = 0;//초기화
		
		while (true) {
			System.out.println("숫자를 입력하세요.");
			int input = sc.nextInt();
			count++;//횟수 증가, 위치 변경

			if(input > com) {
				System.out.println("DOWN");
			} else if(input < com) {
				System.out.println("UP");
			} else {
				System.out.println("축하합니다");
				//몇 번 시도 했는지 프로그램 종료 후 출력해주세요.
				System.out.println(count + "번 시도했습니다.");
				break;
			}
		}
	}
}
