package may18;
//�Ǽ�
	//float
	//double(�⺻)
public class DataType2 {

	public static void main(String[] args) {
		//������Ÿ�� ������ = ��;
		//3.14
		double pi = 3.14;
		System.out.println(pi);
		
		int intNum = (int) pi;
		System.out.println(intNum);
		
		long longNum = (long) pi;
		System.out.println(longNum);
		
		pi = longNum;
		System.out.println(pi);
		
		pi = (int) longNum;
		System.out.println(pi);
		
		pi = Long.MAX_VALUE;
		System.out.println(pi);
		
		//float
		float fNum = (float) 3.14;
		float fNum2 = 3.14F;
		System.out.println(fNum);
		System.out.println(fNum2);
		//float int
		fNum2 = intNum;
		intNum = (int) fNum;
		System.out.println(fNum);
		
		//float long
		longNum = (long) fNum;
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		pi = Double.MAX_VALUE;
		longNum = (long) pi;
		
		System.out.println(longNum);
		
		/* �Ǽ���
		 * float�� double�� ����
		 * double�� �⺻Ÿ��
		 * float�� ���� �Ǽ��� �ʱ�ȭ �� ���� ǥ����(f,F)�� �־�� ��
		 * (�� �׷� ������ ����)
		 * ������ �Ǽ� �� ��ü�� double �޸𸮷� ��������� �빮�� float�� �����ϴ� ���� �Ұ���
		 * 
		 *  ����2
		 *  ���� ���̶� �Ǽ��� �������� ������ ū Ÿ������ ������
		 *  ���� float�� 4byte��� �ϴ��� long���� ū Ÿ������ ������
		 *  ���� ���� ������ ���� ĳ���� �ؾ���
		 *  
		 */
		
		
		
		fNum = 3.14F + 3.14F;
		fNum2 = fNum + 3.14F;//��Ģ������ �⺻Ÿ������ �ؾ��ϱ� ������ ǥ���� �ٿ���
		intNum = 3 + (int)longNum;
		
		//byte short
		byte bNum = 3;
		short sNum = 5;
		sNum = 3 + 100;
		bNum = (byte) (126 + 19);
		/* ���� Ÿ�԰� ū Ÿ�� ���ÿ� �⺻ Ÿ�� �����̸� �⺻Ÿ������ ��ȯ, ����
		 * �⺻Ÿ�� �̻��� ��쿡�� ������ ū Ÿ������ ��ȯ �� ����
		 * 
		 */
		
		/* ����
		 * 8������ ����0��, 16���� ����0x��
		 */
		
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
		
		
		
		
		
		
		
		
	}

}
