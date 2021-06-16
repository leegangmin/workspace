package may20;

import java.util.Scanner;

//사용자의 숫자를 받아서
//0 ~ 9
//숫자가 5보다 큰지 작은지 표시하기
//같을때는?
public class If02 {
	public static void main(String[] args) {
		//사용자가 숫자 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 9 중 숫자 하나를 입력해주세요.");
		//변수로 받기
		int input = sc.nextInt();
		//if로 물어보기
		
		if(input > 5) {
			System.out.println("5보다 큽니다.");
		} else {
			System.out.println("5보다 작습니다.");			
		}
		
		
		
		
		
	}
}