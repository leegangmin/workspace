package jun02;

/* �������̵�
 * 		[���� Ŭ����]�� �ִ� �޼ҵ�� ������ �޼ҵ带 ����� ����� [������] �ϴ� ��
 * 		��ӿ��� �����.
 * 
 * �����ε�
 * 		�� Ŭ���� ������ [���� �̸�]�� �޼ҵ尡 ������ �ȵ�.
 * 		��, [�Ķ����]�� �ٸ��� ���� �޼ҵ���� ���.
 * 		�Ķ������ [����, ����, Ÿ��]�� �ٸ��� �ٸ� �޼ҵ�.
 * 		�޼ҵ带 ȣ���� �� �Ķ���ͷ� ������.
 * 
 */
public class OOP06 {

	public static void main(String[] args) {
		// ��ü ����, ȣ��
		Alan alan = new Alan();
		Marc marc = new Marc();
		
		alan.breakfast = true;

		//marc.ask();
		//alan.answer();
		
		alan.answer(marc);
	}

}

//Ŭ���� ���� -> ����, �޼ҵ� ���� -> ��ü ���� -> ȣ���ؼ� ���
//Alan & Marc

class Alan {
	// ���� = ���� = �ν��Ͻ� ����
	String name;// null
	boolean breakfast;// false

	// ��� = �޼ҵ�()
	public void answer(Marc a) {
		a.ask();
		if (breakfast == true) {
			System.out.println("I have");
		} else {
			System.out.println("I haven't");
		}

	}
}

class Marc {
	// ����

	// ���
	public void ask() {
		System.out.println("Have you had a breakfast?");
	}
}
