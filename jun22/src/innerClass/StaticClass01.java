package innerClass;
//static class
/* class �տ� static�� ���� ���� ������.
 * stastic�� �پ��� ������ ��ü �������� ��� ������.
 * Ŭ������ static ����ó�� ����.
 * �ܺ� Ŭ������ ���� Ŭ������ �ٸ��� ������.
 * �ܺ� Ŭ������ ���� Ŭ������ ����� private�̶� ��ȣ ���� ����.
 * ��θ� �����ȴٸ� �ܵ����� ���� ����� �� ����.
 * 
 * å 390p
 */
public class StaticClass01 {
	private int num = 1;//��ü ����, �ܺ�X
	int sc = num;//��ü ����, �ܺ�O
	private static int outterSI = 0;//Ŭ������. ��üX, �ܺ�X
	public static void outterMethod() {
		System.out.println(SInner.innerSM);
	}
	
	public static class SInner {
		private int innerMember = 200;
		private static int innerSM = 300;
		final int LV = 100;
		
		public static void innerMethod() {
			System.out.println("static Ŭ���� ���� static �޼ҵ�");
		}
		
		public void innerM() {
			System.out.println("static Ŭ���� ���� Ŭ����");
			System.out.println("this.innerSM : " + this.innerSM);
			System.out.println("outterSI : " + outterSI);
		}
	}
	public static void main(String[] args) {
		StaticClass01 staticClass01 = new StaticClass01();
		StaticClass01.SInner si = new SInner();
		StaticClass01.SInner si2 = new StaticClass01.SInner();
	
		si.innerMethod();
		si.innerM();
		//si.innerMember;
		//si.LV;
		
		StaticClass01.SInner.innerMethod();
		//StaticClass01.SInner.innerM();//��ü ���� �� ȣ��

		//AAA ��ü ����
		AAA aaa = new AAA();
		//System.out.println(aaa.BBB);//�Ұ�
		//System.out.println(AAA.BBB);//�Ⱥ���
		AAA.BBB bbb = new AAA.BBB();
		//bbb.number2//�̰� ����.
	
	}
}

class AAA {
	private static int innerNum = BBB.number;//���� ����
	private static int outternum = 100;
	
	static class BBB {
		private static int number = 10;
		int number2 = outternum;//�ܺ��� �͵� ���� ����.
	}
}


