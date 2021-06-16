package jun01;
//객체지향
/* 절차지향 프로그래밍           객체지향 프로그래밍
 * 
 */

//요기1

public class OOP01 {
	int number = 90;
	//여기3 = 변수 선언 = 인스턴스 변수 = 멤버변수, 멤버 필드
//					클래스 바디에 생성
	//				초기화 하지 않아도 자바가 알아서 해줍니다.
	//				클래스에서 사용하기 위해서 이곳에서 만듭니다.
	
	//지역 변수 = 메소드 괄호 안에서 선언 { } 
	//				괄호가 닫히면 사라집니다. = 데이터스코프
	//				사용하기 전에 초기화 해야 합니다. 
	
	public static void main(String[] args) {
		int app = 0;
		System.out.println(app);
		
		//지금까지 우리는 여기에만 적었습니다.
		OOP01 oop01 = new OOP01();//생성자 메소드
		
		oop01.print2();//점 = 소유
		System.out.println(oop01.number);//0
		oop01.number = 1000;
		System.out.println(oop01.number);//1000
		
		
		Apple apple = new Apple();
		apple.print();
		
		//다른 메소드를 실행시키기 위해서 호출하기
		
	}
	//여기2 = 메소드를 만들고 그 속에 코드를 적겠습니다.
	void print2() {
		System.out.println("실제 코드가 여기 들어갑니다.");
	}
	
	int print3() {
		return 0;
	}
	String print4() {
		return "Hello";
	}
	
	double print5() {
		return 3.14;
	}
	
}//클래스 끝.


//여기1 = 클래스를 만들고, 메소드를 만들고, 그 속에 코드를 적겠습니다.
class Apple{//class
	public void print() {//method
		System.out.println("실제 코드가 여기 들어갑니다.");//code
	}
}

//붕어빵 붕어빵 틀




























