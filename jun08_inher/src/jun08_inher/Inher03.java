package jun08_inher;
//��� �� �������̵� �ٽ�

/*
 * �����ε�
 * 		���� �̸��� �޼ҵ带 ������ ���� �� �ִ� ���
 * 		�޼ҵ� �Ķ������ ��, ����, Ÿ���� �޶���� = �ñ״���*****
 * 		sleep()
 * 		sleep(int age)
 * 		sleep(int age, int nam)
 * 		sleep(int age, int nam, String name)
 * 
 * 		this();
 * 		this.�޼ҵ�();
 * 
 * 
 * ���
 * 		Ŭ������ ������ �� �� �ߺ��Ǵ� �ڵ尡 �ִٸ�
 * 		�̰��� ���� Ŭ������ ���� �ְ� �����޾Ƽ� ���� ��
 * 		�ڵ� �ߺ� ���� �� ����
 * 		���������� ���� ���� �� �� ����
 * 
 * 		super();			�θ� ������ ȣ��
 * 		super.�޼ҵ��();	�θ� �޼ҵ� ȣ��
 * 
 * 
 * �������̵�
 * 		��Ӱ��迡���� ����.*****
 * 		�θ��� �޼ҵ带 �ڽ� Ŭ�������� �ڽ��� ��Ȳ�� �°�
 * 		�������ؼ� ����ϴ� ��.*****
 * 		����������, ���� Ÿ��, �Ķ���ʹ� �״��.
 * 
 * 
 */

class OldMan {
	String name;
	String ssn;

	public OldMan(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public void myInfo() {
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�ֹι�ȣ�� " + ssn + "�Դϴ�.");

	}
}

class NewMan extends OldMan {
	String tel;

	public NewMan(String name, String ssn, String tel) { // �����ε�
		super(name, ssn);
		// this.name = name;
		// this.ssn = ssn;
		this.tel = tel;
	}

	@Override
	public void myInfo() {// �� �κ��� �����ϸ� �����ε�
		// super.myInfo();
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("��������� " + ssn.substring(0, 6) + "�Դϴ�.");
		System.out.println("��ȭ��ȣ�� " + tel + "�Դϴ�.");
	}

}

public class Inher03 {

	public static void main(String[] args) {

		OldMan o01 = new OldMan("ȫ�浿", "423423-3423423");
		o01.myInfo();

		NewMan n01 = new NewMan("��浿", "123433-2352332", "030-32423-324234");
		n01.myInfo();

	}

}
