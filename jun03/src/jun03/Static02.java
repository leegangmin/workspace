package jun03;


class Car{
	String model;
	String color;
	String speed;
	int id;
	static int number = 0;

	
	//this()
	//생성자
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String color) {
		this(model);
		System.out.println("this(1개짜리) 호출합니다.");
		this.color = color;
	}

	public Car(String model, String color, String speed) {
		this(model, color);//생성자 호출
		System.out.println("Car(2개짜리)를 호출합니다.");
		/* 같은 클래스에서 정의된 다른 생성자를 호출하는 키워드
		 * this(type, type...)
		 * 호출하려는 생성자의 파라미터의 순서에 맞게 호출하면 됩니다.
		 * 단 this생성자 호출은 생성자 첫머리에서만 호출가능합니다.
		 * 딱 한번만 불러올 수 있습니다.
		 */
		this.speed = speed;
		this.id = ++number;
		start();
	}
	/* 생성자(메소드) 오버로딩
	 * 같은 이름의 메소드 또는 생성자를 정의할 때 같은지의 판별요소로
	 * 적용되는 기준을 메소드 또는 생성자 시그니쳐라고 합니다.
	 * 이 시그니쳐는 파라미터의 갯수, 순서, 타입이 모두 같을 때만
	 * 같은 생성자 또는 메소드로 인식을 하고 
	 * 하나라도 다르면 다른 메소드나 생성자로 컴파일러가 인식합니다.
	 * 하여 호출시 호출하는 파라미터의 시그니쳐를 보고
	 * 해당 생성자 또는 메소드를 동적으로 호출하도록 정의 되어있습니다.
	 * 이렇게 같은 이름의 생성자, 메소드를 시그니쳐만 다르게
	 * 정의하여 호출하는 것을 오버로딩이라고 합니다.
	 * 
	 * 
	 */
	
	public Car() {
		
	}
	
			
	
	
	
	//메소드
	public void start() {
		System.out.println("완성했습니다.");
	}
}


public class Static02 {
	public static void main(String[] args) {

		Car car1 = new Car("K5", "흰색", "159");
		System.out.println("==============================");
		Car car2 = new Car("K9", "검색");
		System.out.println("==============================");
		Car car3 = new Car("K3");
		System.out.println("==============================");
		Car car4 = new Car();
		System.out.println("==============================");
		Car car5 = new Car("K3", "빨간색", "159");
		System.out.println("==============================");
		Car car6 = new Car("K9", "녹색", "159");
		System.out.println("==============================");
		
		System.out.println(Car.number);
	}
}
