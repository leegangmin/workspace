package jun01;
//��ü����
/* �������� ���α׷���           ��ü���� ���α׷���
 * 
 */

//���1

public class OOP01 {
	int number = 90;
	//����3 = ���� ���� = �ν��Ͻ� ���� = �������, ��� �ʵ�
//					Ŭ���� �ٵ� ����
	//				�ʱ�ȭ ���� �ʾƵ� �ڹٰ� �˾Ƽ� ���ݴϴ�.
	//				Ŭ�������� ����ϱ� ���ؼ� �̰����� ����ϴ�.
	
	//���� ���� = �޼ҵ� ��ȣ �ȿ��� ���� { } 
	//				��ȣ�� ������ ������ϴ�. = �����ͽ�����
	//				����ϱ� ���� �ʱ�ȭ �ؾ� �մϴ�. 
	
	public static void main(String[] args) {
		int app = 0;
		System.out.println(app);
		
		//���ݱ��� �츮�� ���⿡�� �������ϴ�.
		OOP01 oop01 = new OOP01();//������ �޼ҵ�
		
		oop01.print2();//�� = ����
		System.out.println(oop01.number);//0
		oop01.number = 1000;
		System.out.println(oop01.number);//1000
		
		
		Apple apple = new Apple();
		apple.print();
		
		//�ٸ� �޼ҵ带 �����Ű�� ���ؼ� ȣ���ϱ�
		
	}
	//����2 = �޼ҵ带 ����� �� �ӿ� �ڵ带 ���ڽ��ϴ�.
	void print2() {
		System.out.println("���� �ڵ尡 ���� ���ϴ�.");
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
	
}//Ŭ���� ��.


//����1 = Ŭ������ �����, �޼ҵ带 �����, �� �ӿ� �ڵ带 ���ڽ��ϴ�.
class Apple{//class
	public void print() {//method
		System.out.println("���� �ڵ尡 ���� ���ϴ�.");//code
	}
}

//�ؾ �ؾ Ʋ




























