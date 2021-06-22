package innerClass;
//���� Ŭ����
/* Local Class
 * �޼ҵ� �ȿ� ������ Ŭ����
 * ������ �޼ҵ� �������� ����ϱ� ���ؼ� ���ο� ������.
 * 	�޼ҵ� �ȿ����� ��������ó�� Ŭ������ Ȱ���ϹǷ�
 * 	�޼ҵ��� ������ ������ ���� Ŭ������ ���ŵ�.
 * 
 * 	�ܺο��� �ν��Ͻ��� ������ �� ����.
 * 	���� static�� ����� �� ����.
 * 	instance���� ���� �޼ҵ�� ����� �� ����.
 * 
 * 	final ���� ��������(���ó��)�ϰų� �Ű�������
 * 	����Ŭ������ �޼ҵ忡�� ���� ������
 * 
 * 	��ü�� �����ؼ� Ȱ���ؾ���.
 * 	������ �ϸ� �ܺ� Ŭ����$����+���� Ŭ������.class�� �������.
 * 	���ڴ� ���� �ٸ� �޼ҵ��� ��� ���� �̸��� Ŭ������
 * 	������ �� �־ �����ϱ� ���ؼ� ����.
 * 	
 * 
 */
public class LocalClass01 {
	private int a = 10;
	final int LV = 100;
	
	void method() {
		int in = 100;
		final int inD = 1000;
		
		class LocalClass{
			int no = 99;
			void msg() {
				no = no + 10;
				System.out.println("�ܺ� a " + a);
				System.out.println(LocalClass01.this.a);
				System.out.println(in);
				System.out.println(inD);
				
			}
		}//LocalClass ��
		//���� Ŭ������ ����� �޼ҵ� �ȿ��� ��ü�� ����.
		LocalClass local = new LocalClass();
		local.msg();//��ü ���� �Ŀ� ȣ���ؼ� �����.
	}//�޼ҵ� ��
	
		
	public static void main(String[] args) {

		LocalClass01 localClass01= new LocalClass01();
		localClass01.method();
	}

}
