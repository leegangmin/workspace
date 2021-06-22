package innerClass;

import java.util.ArrayList;
import java.util.List;

//익명 클래스
/* Anonymous Class
 * 
 * 클래스명 없는 클래스
 * 선언과 동시에 인스턴스 생성을 하나로 통합한 클래스
 * 클래스를 인수의 값으로 활용하는 클래스
 * 
 * 객체를 한번만 사용할 경우 사용함.
 * 클래스의 선언부가 없기 때문에 이름이 없으므로 생성자를 가질 수 없음.
 * 슈퍼 클래스의 이름이나 구현할 인터페이스를 구현하거나 둘 이상의 인터페이스를 구현할 수 없음.
 * 오직 하나의 클래스를 상속받거나 하나의 인스턴스만 구현 가능함.
 * 
 * 코드 블럭에 클래스 선언을 하는 점만 빼고는 생성자를 호출하는 것은 동일함.
 * 
 * 객체를 구성하는 new 문장 뒤에 클래스의 블럭{}을 첨부하여 몸통을 닫는 형식으로 구성됨
 * 
 * new 슈퍼 클래스 또한 인터페이스명(){};
 * 
 * 객체를 생성한 후에 {}; 즉 메소드를 구현한 블록이 있고 블록 끝에는 세미콜론이 붙음.
 * 
 * new 뒤에 오는 생성자명이 기존 클래스명이면 익명 클래스가 자동으로 클래스의 하위클래스가 됨.
 * 
 * 인터페이스인 경우에는 인터페이스를 상속하는 부모 클래스가 object가 됨.
 * 
 */

class AMClass {
	public void method() {
		System.out.println("method");
	}
}

public class Anonymous {
	public static void main(String[] args) {
		//상속 -> 추상화 -> 인터페이스 -> 다형성
		//List<String> list = new List<String>();
		//위와 같이 만들 수 없음. = 미구현된 메소드 완벽하지 않음.
		//인터페이스는 상속받는 자식 클래스로 생성함.
		AMClass amc = new AMClass() {
			@Override
			public void method() {
				// TODO Auto-generated method stub
				super.method();
				System.out.println("오버라이드 함.");
			}
		};
		
		amc.method();
		
		
	}

}
