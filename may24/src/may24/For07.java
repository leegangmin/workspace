package may24;

import java.util.Scanner;

/*
 
 *
 **
 ***
 ****
 *****
 
 */
public class For07 {
	public static void main(String[] args) {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("=============================");

		for (int i = 0; i < 5; i++) {// 줄
			for (int j = 0; j < i + 1; j++) {// 별
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		// 10 9 8 7 6 5 4 3 2 1

		System.out.println("*****");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
		System.out.println("---------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("____*1");
		System.out.println("___***3");
		System.out.println("__*****5");
		System.out.println("_*******7");
		System.out.println("*********9");

		System.out.println("==============================");

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {// 스페이스 --
				// 4개 -> 0개
				System.out.print("_");
			}

			for (int j = 0; j < i * 2 + 1; j++) {// 별 ++
				// 1개 -> 5개
				System.out.print("*");
			}
			System.out.println("");// 엔터 처리
		}

		System.out.println("==============================");

		System.out.println("*****");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*****");

		System.out.println("==============================");

		for (int i = 0; i < 5; i++) {
			if (i % 4 == 0) {// 첫줄과 마지막줄만
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
				} // for
			} else {// 나머지는 다 여기로
				System.out.print("*   *");// for문으로 가능?
			} // if
			System.out.println("");
		} // for
		
		System.out.println("==============================");
		
		
		
		
		
		
		
		System.out.println("*___*");
		System.out.println("**__*");
		System.out.println("*_*_*");
		System.out.println("*__**");
		System.out.println("*___*");
		
		System.out.println("==============================");
		//식사하고 오시면 이어서 하겠습니다.
		
		//사용자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수를 입력하세요.");
		int input = sc.nextInt();
		//혹 짝수가 들어오면 홀수로 변경하는 코드도 넣어주면
		//더욱 더 좋습니다.
		if(input % 2 == 0) {
			input++;
		}
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {				
				if(j == 0 || j == input - 1 || i == j) {//수정!
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println("");
		}
		
		sc.close();//스캐너 닫기
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
