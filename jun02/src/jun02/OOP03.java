package jun02;

import java.util.Scanner;

//여기1 = 클래스가 추가로 들어갈 수 있는 자리
class Apple {

}

public class OOP03 {
//여기2 = 메소드 = 한가지 일을 한다. 코드의 집합. 그 결과를 출력하거나 호출한 메소드에게 준다
//여기 3

	public static void main(String[] args) {
		// 대부분 여기서 시작
		// 객체 생성 = 변수 선언
		// 데이터타입 변수명 = 값;
		//Cat cat = new Cat();// 생성자 R
		// int num = 10; //값 대입 P
		// Scanner sc = new Scanner(System.in);// R
		// cat.name = "R2D2";
		//cat.age = 150;
		//cat.eat();

		OOP03 oop03 = new OOP03();// 생성자
		int result = oop03.makeBread(50);// 반환 타입이 있을 때
		// oop03.makeBread();//반환 타입이 없을 때
		System.out.println(result);

		System.out.println(oop03.makeBread(6));// 위의 두 문장을 하나로 압축

		System.out.println(oop03.sayHi("aa"));

		System.out.println(oop03.check(false));

	}// 메인메소드 종료

	// 여기2 = 메소드 = 한가지 일을 한다. 코드의 집합. 그 결과를 출력하거나 호출한 메소드에게 준다

	public int makeBread(int count) {
		int result = 0;
		for (int i = 1; i <= count; i++) {
			result += i;
		}
		System.out.println();
		return result;
	}

	/*
	 * public boolean makeBreed() { return true; }
	 */

	public String sayHi(String name) {// 가상 변수
		String result = "Hi";
		result = name + result;
		return result;

	}

	public String check(boolean tf) {

		if (tf) {
			return "1 입니다";
		} else {

			return "2 입니다";
		}

	}

//여기1 = 클래스가 추가로 들어갈 수 있는 자리 + 인스턴스 변수 + 메소드

//객체 : 현실세계에 존재하는 모든 것 (사물, 개념, 정보, 행동)
//클래스 : 설계도 (변수, 메소드)
//인스턴스 : 메모리 상에 만들어진 객체들

	class Cat {

		// 속성 = 인스턴스 변수 = 명사 = 선언만 해도 됨. new 생성자()
		// 이름, 나이, 품종

		String name = "동수";
		int age = 5;
		String breed = "코숏";

		// 행동 = 메소드() = 동사
		// 밥먹기, 잠자기, 그루밍, 울기, 사냥

		public void sleep() {
			System.out.println(name + "(이)가 잠을 잔다. ZZzz");
		}

		public void eat() {
			System.out.println(name + "(이)가 밥을 먹는다.");

		}

		public void grooming() {
			System.out.println(name + "(이)가 그루밍 한다.");

		}
	}

}
