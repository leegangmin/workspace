package may21;
// 지금까지 배운 것

/* 4일차
 * 자바 설치 OracleJDK, OpenJDK
 * JDK = Java Development Kit
 * JRE = Java Runtime Environment (포함 JVM = Java Vitual Machine)
 * 
 * 변수 = 프로그램 실행 중 값이 변해야 하는 것을 담아둠.
 * 상수 = final int INT_NUMBER = 100; // 변하지 않음.
 * 
 * 표기법
 * 
 * 		자바에서 사용가능한 문자는? 영어 대소문자, 숫자, _, $
 * 
 * 		파스칼 = 첫글자 대문자, 클래스에 사용, 두 단어 결합시 뒤에 오는 단어 첫글자 대문자 ex) HelloKorea
 * 		카멜 = 첫글자 소문자, 메소드, 변수에 사용, 두 단어 결합시 뒤에 오는 단어 첫글자 대문자 ex) helloKorea
 * 		스네이크 = 상수에 사용, 모두 대문자, 단어 사이는 언더바 ex) HELLO_KOREA
 * 
 * 데이터 타입
 * Primitive
 * 	숫자, 정수 : byte(1), short(2), int(4)(기본), long(8)
 *  숫자, 실수 : float(4), double(8)(기본)
 *  문자 : char
 *  논리 : boolean
 * 
 * Reference : 기본 타입을 제외한 모든 타입, 지금도 만들어지고 있음.
 * 	문자열 : String
 * 
 * 데이터 타입변환
 * 		작은 타입이 큰 타입에 들어갈 때 = 프로모션
 * 		큰 타입이 작은 타입에 들어갈 때 = 캐스트
 * 			캐스팅의 문제 = 값이 변경될 수 있음 (오염, 절상이라고도 표현함)
 * 			왼쪽 = (왼쪽타입) 오른쪽
 * 			<-------------- 데이터 흐름
 * 
 * 데이터 스코프 = 오늘 할 것.
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
	//	if (조건식) {//조건식은 참/거짓
	//		조건식이 참일때 실행할 명령문;
	//	} else if (다른 조건식) {
	//		다른 조건식이 참일때 실행할 명령문;
	//	} else if (또 다른 조건식){
	//		또 다른 조건식이 참일때 실행할 명령문;
	//	}
		
		
		

		if (input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		sc.close();// 입력 들어오는 스캐너를 닫기

	}

}
