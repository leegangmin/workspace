package may24;

import java.io.IOException;

//while
/* 무한 반복문
 * 
 * while(조건식){
 * 		조건식이 참이면 계속 실행합니다.
 * }
 * 
 * while은 보통 무한 반복을 실행하다가 특정 조건이 되면
 * 탈출하도록 합니다. 많이 활용됩니다.
 * 채팅이나 게임 등 무한 반복 로직에서 활용합니다.
 * 계속 돕니다...
 */
public class While01 {
	public static void main(String[] args) throws IOException {
		
		boolean exit = true;
		
		while (exit) {
			System.out.println("조건식이 참이면 돕니다.");
			System.out.println("멈출까요?(Y/N)");
			char input = (char) System.in.read();
			System.in.read();//엔터도 == \n \r
			System.in.read();//이 문장은 엔터키 처리입니다.
			
			if(input == 'Y' || input == 'y') {
				exit = !exit;
				System.out.println("종료합니다.");
			}
		}
		
		System.out.println("while문 아래 출력문 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
