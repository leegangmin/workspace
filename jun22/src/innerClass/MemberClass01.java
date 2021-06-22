package innerClass;
//��� Ŭ����
/* ��� Ŭ������ static Ŭ������ �ܺ� Ŭ������ ��� ������ ���� ��ġ�� �����.
 * ���� ��� ������ ���� ������ ����.
 * 
 * �ٸ� å������ ��� ������ �̷��� ���ϰ� ����.
 * ���� Ŭ���� static�� �ƴ� ��� (static������ ������)
 * ���� Ŭ������� �θ�.
 * 
 * ���� Ŭ������ Ŭ���� ���� ����ǹǷ� �ν��Ͻ� �Ӽ� ����ó�� Ȱ���.
 * �� �޼ҵ�{} �ȿ����� ��ȿ��.
 * 
 * �ν��Ͻ� ������ Ŭ���� ������ ��������� �޼ҵ� �ۿ���,
 * ������ �ۿ���, �ٸ� ��� �ۿ��� �����. (�� ��� �ݵ�� �ʱ�ȭ�� �ʿ���)
 * 
 * ���� Ŭ������ �ܺ� Ŭ������ ����� Ȱ���� �� ������
 * �ܺ� Ŭ������ ���� Ŭ������ ��� ������ Ȱ���� �� ����.
 * ���� static �� ���� �޼ҵ� �������� ���� Ŭ������ ��ü ���� X
 * 
 * 
 */
public class MemberClass01 {
	private int outerDf = 10;
	private static int osi = 55;
	int number = 777;
	
	void outerMethod() {
		System.out.println(number);
		System.out.println(osi);
		System.out.println(this.osi);
	}
	
	static void outterSM() {
		System.out.println(osi);
		//System.out.println(number);//X
	}
	
	public class InnerClass {
		private int x = 100;
		int innerDf = 100;
		static final int ISI = 123;
		
		public void innerMethod() {
			int imnum = osi;//�ܺ� Ŭ����
			System.out.println(x);
			System.out.println(innerDf);
			System.out.println(number);
			System.out.println(outerDf);
		}
		
	}
	
	
	
	public static void main(String[] args) {

		MemberClass01 memberClass01 = new MemberClass01();
		MemberClass01.InnerClass in = memberClass01.new InnerClass();
		in.innerMethod();
		

	}

}
