package jun08_inher;

/* �޼ҵ� �������̵�
 * �޼ҵ� �������̵�� ��ü������� ���� ���Ǵ�
 * ��ӹ��� �θ� �޼ҵ��� ������ �������ؼ� �ڽĿ� �°Բ� Ȱ���ϴ� ��.
 * 
 * ������ ��.
 * 1. �޼ҵ��� ������ ��ӹ��� �޼ҵ�� �����ؾ���.
 * 2. ���������ڴ� �ݵ�� �θ��� �Ͱ� ���� �����ų� �� ū �������� �Ѵ�.
 * 3. �����ǵ� �޼ҵ��� �θ� �޼ҵ�� �ڽ��� �Ϳ����� ����(hide)�Ǿ�����
 * 	  ������ ���������δ� ���̻� ȣ����� ����.
 * 4. ���� �� �θ� �޼ҵ带 ȣ���� ���� super���
 * 	  �θ� ��ü�� ȣ���ϴ� Ű���带 ���� ȣ����.
 * 
 * 
 */

class Animal extends Object {// �θ�/���� Ŭ����
	String name;
	int age;
	String breed;
	String addr;

	public void sleep() {
	}
}

class Cat extends Animal {// Animal�� �ڽ�/���� Ŭ����
	// �� Ŭ������ ���� ����̶��
	// �ڽ� Ŭ�������� �����ָ� ��� ������

	// �ڽ� Ŭ�������� �θ� �޼ҵ带 �����ؼ� ���
	// ������̼� = ����
	@Override
	public void sleep() {
		// super.sleep(); //�θ��� �޼ҵ带 ȣ���ϱ�
		System.out.println("ħ�� ������ ��");
	}
}

class Dog extends Animal {

	@Override
	public void sleep() {
		System.out.println("�ۿ��� ��");
	}
}

class Human extends Animal {

}

//�ֻ��� ��ü Object

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
		// �θ� -> �ڽ�
		// �ڽ� -/-> �θ�

	}

}
