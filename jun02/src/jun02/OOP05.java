package jun02;

import java.util.Arrays;

//메소드
/* 자바는 클래스를 정의하고 정의된 클래스의 객체를 만들어서
 * 여러가지 기능적인 일을 처리하도록 하는 객체지향 언어입니다.
 * 위에서 기능적인 일을 담당하는 것이 메소드 입니다.
 * 
 * 메소드는 우리가 산수 시간에 배웠던 함수와 같은 개념입니다.
 * 특정 기능(또는 일)을 수행하도록 메소드를 정의하고
 * 그 일이 필요할 때 마다 해당 메소드를 호출해서 사용합니다.
 * 
 * 이렇게 하는 주요 이유는 같은 일을 수행하는 것을 반복적으로
 * 코딩하지 않아도 되는 큰 잇점이 있어서 입니다.
 * 
 * 메소드의 기본 형식
 * [접근지정자] 리턴타입 메소드명 ([파라미터],[파라미터]){
 * 		//메소드 구현부, 즉 메소드가 할 일 = 명령문
 * 
 * }
 * []안의 내용은 있어도 되고 없어도 됨. 나머지는 필수.
 * 
 * 접근지정자는 추후에...
 * 
 * 리턴타입은 크게 두가지로 나뉨.
 * 리턴할 값이 없을 때에는 void,
 * 리턴할 값이 있을 때에는 리턴되는 값의 타입을 적어줘야 함.(p, r 공통)
 * 
 * 	void 타입의 리턴일 때에는 메소드가 값을 리턴하게 될 경우 에러남.
 *  그 반대의 경우에도 에러가 남.
 *  
 *  메소드 파라미터는 없어도 되고 있어도 됨.
 *  하나 또는 여러개를 나열할 수 있음.
 *  반드시 데이터타입과 변수명을 적어야 함.
 *  하나 이상을 나열할 경우에는 각 변수 사이에 ,를 찍음.
 *  
 *  값을 되돌려 줄 때에는 return을 적고 반환할 변수나 값을 적어줌.
 *  
 *  메소드 실행중에 return이 된다면 return 이후의 실행은 무시되고
 *  메소드는 종료됨.
 *  
 * 
 */

public class OOP05 {

	public static void main(String[] args) {

		OOP05 o05 = new OOP05();
		o05.print(3, 9, 1);
		o05.print(3, 9);
		o05.plus(1, 3, 2, 2, 2, 2);

	}

	public void print(int number, int check, int nu1) {
		for (int i = 1; i <= number; i++) {
			System.out.println("print() 입니다");
		}

	}

	public int print(int number, int check) {
		System.out.println("number");
		return check;
	}

	// 메소드 오버로드(오버로딩)
	// 파라미터의 수, 순서, 타입이 다름
	// 파라미터가 다르면 같은 이름으로 메소드 생성 가능
	/*
	 * 메소드는 클래스에서 특정기능을 담당하도록 설계되어있음. 정의시 컴파일러는 같은 메소드로 중복정의가 있는지 확인함. 확인 기준 요소는 메소드
	 * 이름과 메소드 파라미터임. 이중 파라미터는 다시 세가지로 구분됨.
	 * 
	 * 파라미터 갯수, 순서, 타입으로 구분. 위 세가지 요소를 통칭하여 메소드 시그니쳐라고 함.
	 * 
	 * 만약 정의된 메소드 이름과 시그니쳐까지 같다면 같은 메소드로 인식하여 에러가 남.
	 * 
	 * 만약 시그니쳐중 하나라도 틀리면 다른 메소드로 인지함. 따라서 필요시 같은 이름으로 메소드를 정의할 수 있음. 단, 시그니쳐를 다르게
	 * 정의해야 함.
	 * 
	 * 이렇게 같은 이름의 메소드를 시그니쳐만 다르게 해서 정의하는 것을 오버로드/오버로딩이라고 함. 호출시에는 반드시 호출하려는 메소드의
	 * 시그니쳐에 맞게 호출해야함.
	 * 
	 * 오버로딩 ====/==== 오버라이드 /전혀 다른 기술임.
	 */

	// 계산기
	public void plus(int a, int b) {
		System.out.println(a + b);
	}

	public void plus(double a, byte b) {

	}// 만약 같은 타입이 무한으로 들어온다면?

	public void plus(int... is) {
		int result = 0;
		for (int i = 0; i < is.length; i++) {
			result += is[i];
		}
		System.out.println(result);
	}

}
