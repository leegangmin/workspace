package jun03;
//static
/*
 * staitc은 정적이라는 의미를 가지고 있습니다. 
 * 자바에서는 정적 개념과 동적 개념을 구분하고 있습니다. 
 * 쉽게 표현하면 정적은 클래스가 로그되는 시점을 이야기하고 
 * 동적은 로드된 클래스가 실행된 이후를 말합니다. 
 * 
 * 이 중 객체는 동적 데이터라고 해서 프로그램이
 * 실행된 이후에 발생되는 대표적 형태입니다. 
 * ===========================================================
 * 정적 멤버, 클래스 멤버 -> 객체를 통하지 않고 사용할 수 있는 멤버
 * 모든 객체를 통틀어서 하나마 생성되고 모든 객체가 공유(!)합니다.
 * 
 * 인스턴스 멤버 : 인스턴스 생성시 가지는 자신의 변수
 * 					별도의 기억공간을 가지고 객체마다
 * 					각각 다른 값을 가집니다.
 * 					객체명.변수명
 * 
 * 
 * 
 * 정적 멤버 : 같은 클래스에서 나온 모든 객체가 공통적으로 사용하는 변수
 * 				클래스.변수명으로 호출합니다.
 * 				인스턴스를 생성하지 않고 사용합니다.
 * 				하나의 클래스에 하나의 변수만 가능합니다.
 * 				객체보다 클래스에 의지합니다.(클래스와 연결)
 * 				static을 붙이면 됩니다.
 * 
 * 정적 멤버처럼 정적 메소드도 만들 수 있습니다. = static붙이면 됩니다.
 * main 메소드에 static붙은 이유?
 * 					객체 생성 없이 메인을 호출하기 위해
 * 
 *  
 *  사용시 주의사항
 *  객체가 생성되지 않은 상태에서 호출되는 메소드 이므로 
 *  객체 안에서만 존재하는 인스턴스 변수들을 사용할 수 없습니다.
 *  
 * 	정적 변수와 지역변수만 사용 가능합니다.
 *  
 *  정적 메소드에서 인스턴스 메소드를 호출하면 에러가 납니다.
 *  인스턴스 메소드로 객체가 생성되어야 사용할 수 있어서 입니다.
 *  
 *  정적 메소드에서 정적 메소드를 호출하는 것은 가능합니다.
 *  정적 메소드는 this를 키워드로 사용할 수 없습니다.
 *  					:this가 참조할 인스턴스가 없기 때문입니다.
 *  
 *  ex) final을 붙인 상수는 모두 다 같이 쓰는 변수입니다.
 *  객체를 만들지 않고 쓰면 좋습니다.
 *  그래서 static을 붙여주면 좋습니다.
 *  
 *  
 * 
 * 
 * 
 * 
 */
class Animal2{
	final static int CODE = 123;
}

class Animal{
	String name;
	int age;
	static int number;//정적으로 변경->이텔릭체로
	static String lang = "Kr";
	final static int CODE = 102;//상수 
	
	public static void sleep() {
		System.out.println("Zzzz");
//		eat();
		sound();
		name = "";
	}
	
	
	public static void sound() {
		System.out.println("소리냅니다.");
	}
	
	public void eat() {
		System.out.println("먹습니다.");
		sleep();
		work();
	}
	
	public void work() {
		System.out.println("work");
		number = 1000;
	}
}


public class Static01 {
	public static void main(String[] args) {
	
		//정적멤버 호출    클래스명.static붙은 변수명
		Animal.number = 100;
		//정적 메소드 호출  클래스명.static붙은 메소드()
		Animal.sleep();
		
		
		//cat, dog, mouse
		Animal cat = new Animal(); 
		Animal dog = new Animal(); 
		
		cat.name = "R2D2";
		cat.age = 149;
		cat.number = 0;//이렇게 쓰지말아주세요. 객체로 부르지 말아주세요.
		Animal.number = 10;//이렇게 해주세요. 클래스명.static 변수명
		
		dog.name = "3PO";
		dog.age = 10;
		
		System.out.println(cat.name);
		System.out.println(cat.age);
		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(cat.number);//이렇게 하지 말아주세요
		System.out.println(dog.number);//이것도..
		
		
		
		
		
		
		
		
	}
}
