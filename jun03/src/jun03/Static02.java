package jun03;


class Car{
	String model;
	String color;
	String speed;
	int id;
	static int number = 0;

	
	//this()
	//������
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String color) {
		this(model);
		System.out.println("this(1��¥��) ȣ���մϴ�.");
		this.color = color;
	}

	public Car(String model, String color, String speed) {
		this(model, color);//������ ȣ��
		System.out.println("Car(2��¥��)�� ȣ���մϴ�.");
		/* ���� Ŭ�������� ���ǵ� �ٸ� �����ڸ� ȣ���ϴ� Ű����
		 * this(type, type...)
		 * ȣ���Ϸ��� �������� �Ķ������ ������ �°� ȣ���ϸ� �˴ϴ�.
		 * �� this������ ȣ���� ������ ù�Ӹ������� ȣ�Ⱑ���մϴ�.
		 * �� �ѹ��� �ҷ��� �� �ֽ��ϴ�.
		 */
		this.speed = speed;
		this.id = ++number;
		start();
	}
	/* ������(�޼ҵ�) �����ε�
	 * ���� �̸��� �޼ҵ� �Ǵ� �����ڸ� ������ �� �������� �Ǻ���ҷ�
	 * ����Ǵ� ������ �޼ҵ� �Ǵ� ������ �ñ״��Ķ�� �մϴ�.
	 * �� �ñ״��Ĵ� �Ķ������ ����, ����, Ÿ���� ��� ���� ����
	 * ���� ������ �Ǵ� �޼ҵ�� �ν��� �ϰ� 
	 * �ϳ��� �ٸ��� �ٸ� �޼ҵ峪 �����ڷ� �����Ϸ��� �ν��մϴ�.
	 * �Ͽ� ȣ��� ȣ���ϴ� �Ķ������ �ñ״��ĸ� ����
	 * �ش� ������ �Ǵ� �޼ҵ带 �������� ȣ���ϵ��� ���� �Ǿ��ֽ��ϴ�.
	 * �̷��� ���� �̸��� ������, �޼ҵ带 �ñ״��ĸ� �ٸ���
	 * �����Ͽ� ȣ���ϴ� ���� �����ε��̶�� �մϴ�.
	 * 
	 * 
	 */
	
	public Car() {
		
	}
	
			
	
	
	
	//�޼ҵ�
	public void start() {
		System.out.println("�ϼ��߽��ϴ�.");
	}
}


public class Static02 {
	public static void main(String[] args) {

		Car car1 = new Car("K5", "���", "159");
		System.out.println("==============================");
		Car car2 = new Car("K9", "�˻�");
		System.out.println("==============================");
		Car car3 = new Car("K3");
		System.out.println("==============================");
		Car car4 = new Car();
		System.out.println("==============================");
		Car car5 = new Car("K3", "������", "159");
		System.out.println("==============================");
		Car car6 = new Car("K9", "���", "159");
		System.out.println("==============================");
		
		System.out.println(Car.number);
	}
}
