package jun02;

import java.util.Scanner;

//����1 = Ŭ������ �߰��� �� �� �ִ� �ڸ�
class Apple {

}

public class OOP03 {
//����2 = �޼ҵ� = �Ѱ��� ���� �Ѵ�. �ڵ��� ����. �� ����� ����ϰų� ȣ���� �޼ҵ忡�� �ش�
//���� 3

	public static void main(String[] args) {
		// ��κ� ���⼭ ����
		// ��ü ���� = ���� ����
		// ������Ÿ�� ������ = ��;
		//Cat cat = new Cat();// ������ R
		// int num = 10; //�� ���� P
		// Scanner sc = new Scanner(System.in);// R
		// cat.name = "R2D2";
		//cat.age = 150;
		//cat.eat();

		OOP03 oop03 = new OOP03();// ������
		int result = oop03.makeBread(50);// ��ȯ Ÿ���� ���� ��
		// oop03.makeBread();//��ȯ Ÿ���� ���� ��
		System.out.println(result);

		System.out.println(oop03.makeBread(6));// ���� �� ������ �ϳ��� ����

		System.out.println(oop03.sayHi("aa"));

		System.out.println(oop03.check(false));

	}// ���θ޼ҵ� ����

	// ����2 = �޼ҵ� = �Ѱ��� ���� �Ѵ�. �ڵ��� ����. �� ����� ����ϰų� ȣ���� �޼ҵ忡�� �ش�

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

	public String sayHi(String name) {// ���� ����
		String result = "Hi";
		result = name + result;
		return result;

	}

	public String check(boolean tf) {

		if (tf) {
			return "1 �Դϴ�";
		} else {

			return "2 �Դϴ�";
		}

	}

//����1 = Ŭ������ �߰��� �� �� �ִ� �ڸ� + �ν��Ͻ� ���� + �޼ҵ�

//��ü : ���Ǽ��迡 �����ϴ� ��� �� (�繰, ����, ����, �ൿ)
//Ŭ���� : ���赵 (����, �޼ҵ�)
//�ν��Ͻ� : �޸� �� ������� ��ü��

	class Cat {

		// �Ӽ� = �ν��Ͻ� ���� = ��� = ���� �ص� ��. new ������()
		// �̸�, ����, ǰ��

		String name = "����";
		int age = 5;
		String breed = "�ڼ�";

		// �ൿ = �޼ҵ�() = ����
		// ��Ա�, ���ڱ�, �׷��, ���, ���

		public void sleep() {
			System.out.println(name + "(��)�� ���� �ܴ�. ZZzz");
		}

		public void eat() {
			System.out.println(name + "(��)�� ���� �Դ´�.");

		}

		public void grooming() {
			System.out.println(name + "(��)�� �׷�� �Ѵ�.");

		}
	}

}
