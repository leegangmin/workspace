package may18;
// 2021-05-18
/* 능력단위명 : 응용 SW 기초 기술 활용
 * 능력단위요소 : 데이터베이스 기초 활용하기
 */
// 화면에 Hello라고 출력하는
// 클래스 및 메소드를 완성해주세요.
// 출석해주세요.

// 윤승현 010-2799-2216

public class Hello{//클래스 대문자
	
	public static void main(String[] args) {//메소드()
		int number = 10;//명령문장;
		System.out.print("Hello");//명령문장;
		//불러오기 = 호출 = 메소드 이름을 작성
		print();//명령문장;
	}

	public static void print() {
		System.out.println("프린트 문장입니다");
	}
	
}

/* 이름 만들기
 * 1. 사용가능한 문자
 * 		영어 대문자, 소문자, 숫자, 특수문자 _ $
 * 		유니코드로 한글도 가능, 비추
 * 
 * 2. 클래스 이름				파스칼 표기법
 * 		1번과 동일
 * 		숫자가 앞에 올 수 없음
 * 		단어별 대문자로 시작
 * 		예) Hello, HelloKorea
 * 
 * 3. 메소드 / 변수 이름		카멜 표기법
 * 		1번과 동일
 * 		숫자가 앞에 올 수 없음
 * 		소문자로 시작
 * 		두 단어 결합시 뒤의 단어만 대문자로 시작
 * 		예) hello, helloKorea
 * 
 * 4. 상수 이름					스네이크 표기법
 * 		1번과 동일
 * 		숫자 앞에 올 수 없음
 * 		모두 대문자
 * 		예) HELLO, HELLO_KOREA
 * */
