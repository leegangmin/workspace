package jun01;
/* ��ü�� �ν��Ͻ�
 * Ŭ������ ���ؼ� ������ ��ü�� �ν��Ͻ���� �մϴ�, 
 * �׷��ٸ� ��ü�� �ν��Ͻ��� ���̴�?
 * Animal a1 = new Animal();�� ������� a1�� ��ü�Դϴ�. 
 * �׸��� a1 ��ü�� Animal�� �ν��Ͻ�(instance)�Դϴ�.
 * �� �ν��Ͻ���� ���� Ư�� ��ü�� � Ŭ������ ��ü������ 
 * �������ַ� ������ �� ����մϴ�. 
 * ��, "a1�� �ν��Ͻ�'���ٴ� 'a1�� ��ü",
 * 'a1�� Animal�� ��ü'���ٴ� 'a1�� Animal�� �ν��Ͻ�'��� ǥ����
 * �� �� ��︳�ϴ�.
 * 
 * 
 * Ŭ������ �ν��Ͻ�
 * ���ڸ� ����� ����Ʋ�� ������� ���ڰ� �ֽ��ϴ�.
 * ����Ʋ -> Ŭ����
 * ���� -> ��ü- �ν��Ͻ� 
 * 
 * Animal a1 = new Animal();
 * Animal a2 = new Animal();
 * Animal a3 = new Animal();
 * Animal a4 = new Animal();
 * Animal a5 = new Animal();
 * Animal a6 = new Animal();
 * Animal a7 = new Animal();
 * 
 */

class Animal{
	String name;//�������� �⺻�� null
	int age; //�������� �⺻�� 0
			//�Ǽ����� �⺻�� 0.0
			//�������� �⺻�� 0
			//������ �⺻�� false
	//null
	// name�� �����ϸ� null�� ���Խ��ϴ�.
	//null�̶�� ���� ���� �Ҵ���� ���� ���¸� ���մϴ�. 
	//Animal�̶�� Ŭ������ �ν��Ͻ� ������ name�� �߰�������
	//�ƹ��� ���� �������� �ʾұ� ������ null�̶�� ���� ��µ˴ϴ�.
	
	//�޼ҵ�
	public void setName(String name) {//����
		this.name = name;
	}
	public String getName() {//�� �ҷ�����
		return this.name;
	}
}
/* �� Animal�̶�� Ŭ������ ���� ������ Ŭ���� �Դϴ�. 
 * Ŭ���� ���� �ְ� ������ ���� ������ Ŭ�����Դϴ�.
 * �ν��Ͻ� ���� �����մϴ�.* 
 */
public class OOP03 {
	public static void main(String[] args) {
		
		Animal r2d2 = new Animal();//�ν��Ͻ� ����
		System.out.println(r2d2.name);//null
		System.out.println(r2d2.age);
		//r2d2.name = "R2D2";
		
		Animal cat = new Animal();
		cat.name = "����";
		
		Animal dog = new Animal();
		dog.name = "3PO";
		
		System.out.println(r2d2.name);
		System.out.println(cat.name);
		System.out.println(dog.name);
		
		cat.setName("����");
		String name = cat.getName();
		System.out.println(name);
		
	}
}
