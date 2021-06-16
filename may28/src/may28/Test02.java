package may28;

import java.util.Scanner;

//사용자가 입력 "가나다abc12@#$" ---> abc12 
//자바가 사용할 수 있는 변수로 변경하기
//영어 대문자 소문자, 숫자, _, $

//추가1, 숫자로 시작하면 삭제, 영문자로 시작하게 해주세요.


public class Test02 {
	public static void main(String[] args) {

		System.out.println("사용할 문장을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i))){					
				System.out.print(input.charAt(i));
				
			}else if (Character.isDigit(input.charAt(i))) {
				System.out.print(input.charAt(i));
			}//특수문자도 만들어주세요.

			sc.close();// 스캐너 닫기
		}
	}
}