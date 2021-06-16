package may24;

import java.util.Scanner;

//do~while
/* do~while문은 while과 다르게 무조건 한 번 실행하고 다음에
 * 조건문에 따라서 반복하게 끔 하는 반복문입니다.
 * while문은 조건식이 거짓이면 한 번도 안 돌지만
 * do~while문은 무조건 한 번은 도는 형태를 가지고 있습니다.
 * 
 * wisejia.com
 */
public class DoWhile01 {
	public static void main(String[] args) {

		do {
			//조건식이 참일때 실행할 문장;
			System.out.println("조건식이 거짓이라도 무조건 한 번은 실행");
		} while (!true);
		
		int java, jsp, total;
		double avg;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		//점수 입력받기
		do {
			System.out.println("자바 점수를 입력하세요.");
			java = sc.nextInt();
		} while (java < 0 || java > 100);//105?
		
		
		do {
			System.out.println("jsp 점수를 입력하세요.");
			jsp = sc.nextInt();
		} while (jsp > 100 || jsp < 0);//jsp점수가 0보다 작거나, 100보다 크다면
		
		//두 점수를 더해서 total에 저장해주세요
		total = jsp + java;
		//평균은 avg에 저장해주세요
		avg = total / 2.0;
		//출력 -> "java점수는 80점, jsp점수는 69점,
		//			총점은 149점, 평균은 75점입니다."
		System.out.printf("java 점수는 %3d점,\n",java);
		System.out.printf("jsp 점수는 %3d점,\n",jsp);
		System.out.printf("평균은 %.2f점,\n",avg);
		
		
		/* 정수 %d --> %자릿수d   ---> 20을 %3d로 출력하면 -> _20 
		 * 실수 %f --> %.자릿수f  ---> 2.000을 %.2f로 출력 -> 2.00   
		 * 
		 */
		
		
		
		
		
		
		
	}
}
