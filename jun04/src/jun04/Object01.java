package jun04;

/*
 * object Ŭ������ java.lang �� �ֻ��� Ŭ�����̸�
 * �ٸ� Ÿ�Ե��� �⺻�� ���·� ����Ǿ�����.
 * �ڹٰ� api�� ������ ��� Ŭ������ ����ڰ� ���� Ŭ������ �ֻ��� Ŭ������.
 * ��� Ŭ������ �� Object�� ��ӹ޾Ƽ� �����.
 * 
 * Object�� �ڵ����� import ��.
 * 
 * Object --- String
 * 		  --- Boolean
 *		  --- StringBuffer
 *		  --- Character
 *		  --- Number	--- Byte
 *						--- Short
 *						--- Integer
 *						--- Long
 *						--- Float
 *						--- Double 
 *
 */
public class Object01 {

	public static void main(String[] args) {

		String str1 = "Hi";
		String str2 = new String("Hi");
		//String str2 = "Hi";
		
		System.out.println(str1);
		System.out.println(str2);
		
		if (str1 == str2) { // == -> ���� ��ü���� ���°���
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
		
		
		
		if (str1.equals(str2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		str2 = str1;
		
		str1 = "Hello";
		str2 = "world";
		
		//String�� ���� immutable �ּҸ� ��� �����ϴ��� ���� �Һ�
		//��ü �񱳴� ==, �� �񱳴� equals
		
		if (str1 == str2) { 
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
		
		for (int i = 0; i < args.length; i++) {
			str1 += i + "";
		}
		
		//StringBuffer or StringBuilder recommended in field.
		
		str1 = "Hello";
		str2 = "Hello";
		str2 = str1;
		
		System.out.println(str1.getBytes());
		System.out.println(str2.getBytes());
		//�����ڵ� ���ڿ��� ����Ʈ�ڵ��
		
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		//� Ŭ������ ���ϴ���
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//��ü�� �޸� ������ �̿��ؼ� �ؽ��ڵ带 ����� ������.

	}

}
