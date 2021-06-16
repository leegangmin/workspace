package may25;

import java.util.Scanner;

//do~while문, 배열, 최종정리
/*
 * 능력단위명 : 화면구현
 * 능력단위요소 : UI 설계 확인하기 
 */
public class DoWhile02 {

	public static void main(String[] args) {
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		//변수
		int java, jsp, spring, total;
		double avg;
		char grade;
		
		//점수 입력
		do {
			System.out.println("자바 점수 입력");
			java = sc.nextInt();
		} while (java < 0 || java > 100);

		do {
			System.out.println("JSP 점수 입력");
			jsp = sc.nextInt();
		} while (jsp < 0 || jsp > 100);
		
		do {
			System.out.println("Spring 점수 입력");
			spring = sc.nextInt();
		} while (spring < 0 || spring > 100);
		
		//평균, 총점, 출력
		total = java + jsp + spring;
		avg = total / 3.0;
		
		//등급 평균 100~90 A, 89~80 B, 79~70 C, 나머지 F
		switch ((int) avg/10) {
		case 10 :
		case 9:
			grade = 'A';
			break;
			
		case 8:
			grade = 'B';
			break;
			
		case 7:
			grade = 'C';
			break;
			
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("평균은 " + avg);
		System.out.println("총점은 " + total);
		System.out.println("등급은 " + grade);
		
		//정리
		/* 변수
		 * 변수 이름
		 * 데이터타입
		 * 연산자
		 * if
		 * for
		 * while
		 * do~while
		 * switch
		 * 
		 * 
		 * 
		 * 
		 * 배열
		 * 
		 */
		
		
		
		
	}

}
