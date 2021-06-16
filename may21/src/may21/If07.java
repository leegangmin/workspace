package may21;

import java.util.Scanner;

//가위바위보 게임

public class If07 {

	public static void main(String[] args) {
		
		//1. 사용자의 입력 받기 = Scanner
		//데이터타입 변수명 = 값;
		Scanner sc = new Scanner(System.in);//객체 생성
		System.out.println("1. 가위\t2. 바위\t3. 보");//\t tab
		System.out.println("원하는 번호를 눌러주세요.");
		int user = sc.nextInt();
		System.out.println(user);
		
		//2. 컴퓨터 숫자 저장하기
		int com = (int) (Math.random() * 3 + 1);
		System.out.println(com);
		
		//3. 판정하기 & 출력하기
		if((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
			System.out.println("당신이 이겼습니다.");
		} else if((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else {//(user == com)
			System.out.println("비겼습니다.");
		}
		
	}
	
}
	


