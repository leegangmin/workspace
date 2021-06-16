package jun08_inher;

/* 메소드 오버라이드
 * 메소드 오버라이드는 객체지향언어에서 자주 사용되는
 * 상속받은 부모 메소드의 내용을 재정의해서 자식에 맞게끔 활용하는 것.
 * 
 * 주의할 점.
 * 1. 메소드의 형식은 상속받은 메소드와 동일해야함.
 * 2. 접근제어자는 반드시 부모의 것과 같은 범위거나 더 큰 범위여야 한다.
 * 3. 재정의된 메소드의 부모 메소드는 자식의 것에서는 은닉(hide)되어지기
 * 	  때문에 직접적으로는 더이상 호출되지 않음.
 * 4. 은닉 된 부모 메소드를 호출할 때엔 super라는
 * 	  부모 객체를 호출하는 키워드를 통해 호출함.
 * 
 * 
 */

class Animal extends Object {// 부모/상위 클래스
	String name;
	int age;
	String breed;
	String addr;

	public void sleep() {
	}
}

class Cat extends Animal {// Animal의 자식/하위 클래스
	// 이 클래스의 고유 기능이라면
	// 자식 클래스에서 적어주면 사용 가능함

	// 자식 클래스에서 부모 메소드를 수정해서 사용
	// 어노테이션 = 정보
	@Override
	public void sleep() {
		// super.sleep(); //부모의 메소드를 호출하기
		System.out.println("침대 위에서 잠");
	}
}

class Dog extends Animal {

	@Override
	public void sleep() {
		System.out.println("밖에서 잠");
	}
}

class Human extends Animal {

}

//최상위 객체 Object

public class Inher02 {

	public static void main(String[] args) {

		Cat c01 = new Cat();
		c01.name = "R2D2";
		c01.sleep();

		Dog d01 = new Dog();
		d01.name = "3PO";
		d01.sleep();

		Animal a01 = new Animal();
		// a01.eat();
		// 부모 -> 자식
		// 자식 -/-> 부모

	}

}
