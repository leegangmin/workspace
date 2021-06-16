package may26;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {
	public static void main(String[] args) {
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("암호화 할 문자를 입력하세요.");
		String input = sc.next();
		
		System.out.println("몇 칸 이동할까요? 숫자를 입력하세요.");
		int number = sc.nextInt();
		
		input = input.toUpperCase();//문자열을 모두 대문자로.
		
		//캐릭터 배열로 만들기
		char[] inputArray = input.toCharArray();

		//배열을 돌면서 정해진 숫자만큼 밀기 -> 출력
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] + number > 'Z') {//넘어갑니다. 처리해주세요.
				//XYZ -> ABC
				inputArray[i] = (char) (inputArray[i] + number - 26);//?
				
			} else {
				inputArray[i] = (char) (inputArray[i] + number);
			}
		}
		
		System.out.println("아래는 배열을 문자열로 변환합니다.");
		String conv = String.valueOf(inputArray);//char array to String
		System.out.println(conv);
		String.valueOf(123); // -> "123"
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
