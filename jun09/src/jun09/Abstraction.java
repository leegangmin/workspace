package jun09;
//추상화

/*
 * 클래스 만드는 목적 -> 인스턴스 생성하기 위해서
 * 추상화는 클래스를 대략적으로 만들어서 인스턴스를 생성할 수 없어요.
 * 왜 존재해야하지?
 * 
 * 자바에서는 추상화라는 개념을 구현할 수 있습니다.
 * 일단 추상이라는 의미부터 보겠습니다.
 * 추상이라는 것은 현실화 되어질 필요가 없는 클래스를 말합니다.
 * 
 * 자바에서는 객체지향을 통해 프로그램이 실행되는데
 * 이 추상이라는 개념을 클래스에 적용시키면
 * 자신의 인스턴스를 발생시킬 수 없는 형태로 만들어집니다.
 * 
 * 이렇게 인스턴스화 할 필요는 없지만 상속개념에서 중요한 위치를
 * 가지는 클래스를 보통 추상 클래스로 선언하여 사용합니다.
 *
 *  추상 클래스 선언 규칙
 *  
 *  1. 클래스의 정의된 메소드 중 추상 메소드가 하나라도 있다면
 *  		해당 클래스는 무조건 추상 클래스가 됩니다.
 *  
 *  2. 추상 메소드는 메소드 바디가 없는 형태 {}이고
 *  	abstact라는 키워드를 리턴 타입 앞에 선언합니다.
 *  	파라미터 괄호()뒤에 세미콜론;을 붙여줍니다.
 *  	public abstract void print();
 *  
 *  3. 추상 클래스는 자신의 인스턴스를 발생시킬 수 없습니다.
 *  	하지만 생성자, 메소드, 필드는 모두 선언/정의 할 수 있습니다.
 *  	또한 super type 전개 가능하므로 다형성(다양한 형태)도 적용가능합니다.
 
 *  4. 만약 추상 메소드가 하나라도 없을 때 클래스를 추상화 하고 싶다면
 *  	abstract라는 키워드를 붙여서 추상화 시킬 수 있습니다.
 */

abstract class Animal {// 부모 클래스 슈퍼 클래스 상위 클래스
	String name;
	int age;

	//생성자
	
	public abstract void sleep();// 강제적으로 사용하게 하려면
	public abstract void eat(); // 인터페이스
}

class Cat extends Animal {// 자식 클래스 하위 클래스

	@Override
	public void sleep() {
	}

	@Override
	public void eat() { // 부모에게 없는 괄호만 붙여주셔도 통과
	}
}

class Dog extends Animal {

	@Override
	public void sleep() {
	}

	@Override
	public void eat() {
	} // 자식 클래스

}

public class Abstraction {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
	}		// Animal animal = new Animal();
}