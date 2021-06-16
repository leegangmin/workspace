package may18;
//변수 꼭 기억
//var
//변하는 수 =/= 상수

//byte -128~0~127
//서울시 인구 
/* 변수를 사용하는 주 목적은 같은 타입(type)의 값이
 * 프로그램 실행시에 자주 변경되어야 할 때
 * 이를 변수에 담아서 활용하기 위함입니다.
 * 변수는 정말 많이 사용됩니다.
 * 
 * 1. 변수의 선언(초기화) 규칙 (★★★★★)
 * 		1. 변수는 특정 블럭{중괄호}내부 어디에서건 선언 가능합니다.
 * 		만약 메소드 바디 내부에서 처음 선언되면 = 지역(local)변수
 * 		클래스 바디 내에서 선언되면 = 인스턴스(객체) 변수
 * 2. 변수가 처음 선언되어지면 그 변수를 포함하고 있는 블럭내에서
 * 		절대로 재선언이 불가능.(★★★★★)
 * 		같은 이름으로 선언 불가, 이름이 겹칠 수 없습니다.
 * 3. 변수가 처음 선언될 때는 반드시 변수 좌측에
 * 		변수의 타입(type) 일명 데이터 타입이 선언되어야 합니다.
 * 		(데이터 타입은 변수 이후에..)
 * 4. 같은 타입의 변수는 한 라인에 ;없이 계속 선언되어질 수 있고
 * 		,로 구문하여 마지막 변수 긑에 ;를 붙여줍니다.
 * 5. 지역 변수는 반드시 사용전에 값이 초기화 되어야 합니다.
 * 
 */
public class Variable {//클래스 바디 시작
	//int num = 100; 인스턴스 변수
	public static void main(String[] args) {//메소드 바디 시작
		//데이터타입 변수명 = 값
		//int num = 100;//변수 선언!!!!
		//int num1 = 10;
		//int num2 = 1;
		//위의 3줄과 같음 int num = 100, num1 = 10, num2 = 1;
		int num, num1, num2; //변수선언
		int num4 = 100; //변수선언 + 초기화
		num=1000;//변수 불러서 + 값대입 (초기화)
		System.out.println(num);
		//값 누르고 ALT+SHIFT+R 누르면 한번에 변경가능
		//CTRL + 변수 처음 선언된 변수 찾기
		
		
		
		//상수
		final int PAGE_NUMBER = 10; //final 수정불가, 변수선언 + 초기화
		//리터럴 찾아오기
		/*/소스 코드의 고정된 값을 대표하는 용어다. 거의 모든 프로그래밍 언어는 정수, 부동소수점 숫자, 문자열, 불린 자료형과 같은 용어를 가지고 있다. 어떤 언어는 열거 타입이나, 배열, 자료형, 객체와 같은 용어도 있다. 리터럴과 대조적으로, 고정된 값을 가질 수 있는 변수나 변경되지 않는 상수가 있다. 다음의 예제와 같이, 리터럴은 변수 초기화에 종종 사용된다. 

int i = 1;
String s = "봄싹";


일부 ECMAScript와 같은 객체 지향 언어들 중에는, 리터럴로 객체를 표현할 수 있다. 함수 리터럴 방식을 이용한 객체 리터럴에서는 이 객체의 메소드도 리터럴이 될 수 있다. 배열 리터럴을 표현하기 위해서도 쓰이는 아래의 예제는, 객체 리터럴을 표현하는 가장 흔한 방법 중 하나이다. 

{"cat","dog"}
{name:"cat",length:57}

		 * 
		 */
		//PAGE_NUMBER = 100;
		System.out.println(PAGE_NUMBER);
		
		
	}//메소드 바디 끝

}//클래스 바디 끝
