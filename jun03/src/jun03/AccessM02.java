package jun03;
/*
 * public	 : ��� ������ ���. � Ŭ������ �����ϴ� �� open 
 * protected : ��� ���� Ŭ����, �Ǵ� ���� ��Ű�� �������� ���� ����
 * default	 : �⺻ ������, �ƹ��͵� ���� ���� ��.
 * 				Ŭ������ ���� ����Ű���� �־�� ���� �����մϴ�.
 * private	 : �ܺο��� ���� �Ұ���, ���� Ŭ���� �������� ���� ����
 * 
 * 
 * 
 * 
 * 				Ŭ��������		������Ű��			����Ŭ����		�׿�
 * ---------------------------------------------------------------------
 * public			O				O					O			O
 * protected		O				O					O			X
 * default			O				O					X			X
 * private			O				X					X			X
 * 
 */



public class AccessM02{
	private static int num = 10;
	protected static int age;
	static String name;//
	
	protected void print() {
		
	}
	
	public static void main(String[] args) {
		
		AAA aaa = new AAA();
		aaa.setAge(10);
		aaa.setName("3PO");
		
	}
}


