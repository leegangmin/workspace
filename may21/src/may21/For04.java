package may21;

import java.util.Scanner;

//사용자가 입력한 숫자만큼 구구단 2단 출력하기.
public class For04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력할 단을 입력하세요.");
		int dan = sc.nextInt();
		
		System.out.println("숫자를 입력하세요.");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}

	}

}
