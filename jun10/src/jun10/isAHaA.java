package jun10;
//is a, Has a
/*
 * is a ~�� ~�̴�.
 * 
 * has a ~�� ~�� ���� �ִ�.
 * 
 * �޸�
 * enum
 * ����Ŭ����
 * �÷���******
 * �ͼ���
 * (db)
 * ����Ŭ����
 * �����
 * ������
 * �������÷���
 * ��Ʈ��ũ
 * �׷���
 * 
 */
class Human{
	String name;
	int age;
	
}

class Student extends Human{
	int number;
}

class Gun{
	String number;
	int count;
}

class Police{
	String name;
	int polNumber;
	Gun gun;//��������� ��ü�� ����.
	//������ ���� �������� ������ ���� Ŭ���� �ȿ� ���� Ŭ������
	//��ü�� ����� ������ ����
}


public class isAHaA {

	public static void main(String[] args) {
		
		Student student = new Student();
	
		Police police = new Police();
		
		System.out.println(police.gun);
		
		Gun gun = new Gun();
		
		police.gun = gun;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
