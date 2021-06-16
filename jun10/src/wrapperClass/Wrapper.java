package wrapperClass;

import java.util.ArrayList;

//����Ŭ����
/*
 * �÷��� �ϱ� ���ؼ� = ���� ���� �� ������ R�� ���� �� ����.
 * �⺻ �ڷ����� �÷��ǿ� ���� �� ���� ������
 * �⺻ �ڷ����� ��ü Ÿ������ ����� �ִ� ���� ���� Ŭ������.
 * 
 * �⺻ �ڷ����� ���� �÷��ǿ� ��� ���ؼ��� ���� Ŭ������ �����.
 * ��� �⺻ �ڷ����� ���� �׿� �����ϴ� ���� Ŭ������ ����.
 * �⺻ �ڷ����� ���� ��� ������ ������ �����ϰ�
 * �� �� ������ ���� �����ϴ� �޼ҵ� ���� ���ΰ� �ִٰ� �ؼ�
 * ���� wrapper: ���δ� Ŭ������� �Ҹ�.
 * 
 * �⺻ �ڷ���		���� Ŭ����
 * byte				Byte
 * short			Short
 * int				Integer
 * long				Long
 * 
 * float			Float
 * double			Double
 * 
 * char				Character
 * boolean			Boolean
 */

public class Wrapper {

	public static void main(String[] args) {
		
		//�⺻Ÿ���� ��üŸ��ó�� �����
		//�⺻Ÿ�� + �޼ҵ� = ���� Ŭ����
		//�÷��ǿ� �����ϱ� ���ؼ� ��ü���·� ��
		
		
		//���� �� �����ϱ�
		String str = new String("value");
		Integer integer = new Integer(10);
		Integer integer2 = 10;
		

		System.out.println(integer);
		System.out.println(integer2);
		
		//Integer to int
		int numInt = integer;
		int numInt2 = integer2.intValue();
		short numShort = integer2.shortValue();//ĳ���� ���� ��ȯ
		long numLong = integer2.longValue();//������
		
		str = "10";
		numInt = Integer.parseInt(str);//str ���� ���ڶ�� �� �� ��������

		//�ִ밪 �ּҰ�
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//16���� ����
		//0x�� ����
		//0~9ABCDEF
		//public static final int	MIN_VALUE = 0x80000000;
		//public static final int	MAX_VALUE = 0x7fffffff;
		System.out.println("--------------------------");
		
		System.out.println(Integer.toBinaryString(3));
		System.out.println(Integer.toOctalString(9));
		System.out.println(Integer.toHexString(17));
		
		System.out.println("--------------------------");
		
		String b = Integer.toBinaryString(3);
		String o = Integer.toOctalString(9);
		String h = Integer.toHexString(17);
		
		System.out.println(b);
		System.out.println(o);
		System.out.println(h);
		System.out.println("--------------------------");
		
		System.out.println(Integer.parseInt(b, 2));
		System.out.println(Integer.parseInt(o, 8));
		System.out.println(Integer.parseInt(h, 16));
		
		System.out.println("--------------------------");
		int bi = 0b11;
		int oi = 011;
		int hi = 0x11;
		
		System.out.println(bi);
		System.out.println(oi);
		System.out.println(hi);
		
		System.out.println("--------------------------");
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max / min);
		
		System.out.println("--------------------------");
		
		//���� ��ڽ� / ���� �ڽ�
		Integer integer3 = 200;//����ڽ�
		//Integer integer3 = new Integer(200);
		//�� ��ȯ �ƴ�. �⺻ �ڷ����� ���������� �ٲ�� ��
		
		integer = 200;
		integer2 = new Integer(200);
		
		if (integer == integer2) {
			System.out.println("same");
		} else {
			System.out.println("not");
		}
		
		System.out.println("--------------------------");
		/*
		 * integer�� integer2�� ���� int���� ������ �ִ���
		 * �Ǻ��ϱ� ���ؼ��� integer�ӿ� �ִ� equals()�� ��� ��.
		 * Integer�� equals()�� ���� int���� �Ǵ��ϵ���
		 * Object���� �� equals()�� �������̵� ��.
		 */
		
		if (integer.equals(integer2)) {
			System.out.println("same");
		} else {
			System.out.println("not");
		}
		
		System.out.println("--------------------------");
		
		System.out.println(integer.equals(integer2));
		System.out.println(integer.compareTo(integer2));
		
		System.out.println("--------------------------");
		integer = 10;
		integer2 = 11;
		int check = integer.compareTo(integer2); //1 0 -1
		
		if (check == 0) {
			System.out.println("same");
		} else if (check == 1) {
			System.out.println("integer is bigger");//���� Ŭ��
		} else {//-1
			System.out.println("integer2 is bigger");//�ڰ� Ŭ��
		}
		
		System.out.println("--------------------------");
		
		numInt = 200;//int
		integer3 = 200;//Integer
		
		if (integer3.equals(numInt)) {//�����Ϸ��� �� �ڵ带 Ȯ�� �� numInt�� new Integer(numInt)�� ������
			System.out.println("same");
		} else {
			System.out.println("not");
		}
		
		System.out.println("--------------------------");
		
		numInt2 = integer3; //p = R
		//integer3 ��ü �ȿ� int���� ���ͼ� newInt2�� ���Ե�.
		//���� ��ڽ� (���� ����)
		
		integer3 = numInt2; // ���� �ڽ� R = p
		
		double pi = 3.14;
		
		Double rPI = pi; //RŸ������ ����
		rPI = 3.14;
		
		Object obj = 10;
		System.out.println(obj);
		
		int num4 = (int) obj + 1;//ĳ����
		
		obj = "10";
		int num5 = Integer.valueOf((String)obj) + 1;
		
		obj = 10;
		int num6 = 5 + ((Integer)obj).intValue();
		/*
		 * �ٸ� ���·�.
		 * obj���� 10�� �����ϴ� Integer��ü�� �������� ����
		 * ������ �ܰ迡�� Object = new Integer(10);���� ����
		 * Object Ÿ���� ���۷����� Integer ������ �޼ҵ带 ȣ�� �� �� ����.
		 * ȣ���Ϸ��� ����ȯ�� �ʿ���.
		 */
		
		
		
		
		
		
		
		
	}
}
