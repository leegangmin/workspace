package may18;
//������Ÿ��
/* �ڹٿ����� ����, ����� �� ���� ��� ���ؼ���
 * �ݵ�� �� ���� Ÿ�Կ� �´� ������ ����ؾ� �Ѵ�.
 * �̸� ������ Ÿ���̶�� ��
 * 
 * ������ Ÿ���� ũ��
 * Reference ����Ÿ��
 * Primitive �⺻Ÿ��
 * �� ���е�.
 * 
 * �� �߿� P���� ��
 * 
 * �ڹ��� ������Ÿ���� ũ�� 2����, P�� R �̶�� ���
 * 
 * P Ÿ���� ��ġ��, ������, ����
 * ������ Ÿ�Ե��� �޸� ũ�Ⱑ ������ ���ѵ�.
 * 
 * ��ġ��
 * 		������
 * 			byte
 * 			short
 * 			int(�⺻)
 * 			long
 * 
 * 		�Ǽ���
 * 			float
 * 			double(�⺻)
 * 
 * ������ = �ѱ��� = A, ��, �, $
 * 		char(actor)
 * 
 * ���� = ��/���� = true, false = ������ ������ ������ �ʿ����
 * 		boolean
 * 
 * 
 * 
 */
public class DataType1 {

	public static void main(String[] args) {
		//�޼ҵ� �ٵ� �ȿ��� ����� ���� = ���� ����
		byte byteNumber = 10;//������Ÿ�� ������ = ��;
		short shortNumber = byteNumber;
		shortNumber = 32767;
		
		int intNumber = 1000000;//���ͷ�
		
		intNumber = Integer.MAX_VALUE;
		intNumber = Integer.MIN_VALUE;
	
		long longNum = intNumber;
		longNum = Long.MAX_VALUE;
		longNum = Long.MIN_VALUE;
		longNum = 9223372036854775807L;//���� L�� �ٿ���� int�� �Ѿ�� ������ �ڵ忡 �ۼ�����
		
		System.out.println(byteNumber); //-128 ~ 127
		System.out.println(shortNumber); //-32,768 ~ 32767
		System.out.println(intNumber); //-2147483648 ~ 2147483647
		System.out.println(longNum);
		
		// = ����   == ����
		intNumber = (int) longNum; //cast casting
		short shortNum = (short) intNumber;
		
		byte byteNum = (byte) shortNum;
		
		byteNum = (byte) -1;
		System.out.println(byteNum);
		
		/* ĳ���� / ĳ��Ʈ
		 * ū Ÿ���� ���� Ÿ�Կ� ������ �� �ݵ�� �ؾ��ϴ� ����
		 * (type)�� ����ؼ� ���� ���Խ�ŵ�ϴ�.
		 * �̶� ������ ����
		 * ���� ��Ʈ�� �����Ҷ� ���� Ÿ�Կ� �°� �߶󳻱� �빮��
		 * ���� ��ȭ�� �� �� �ֽ��ϴ�.
		 * 
		 */
		
		shortNum = byteNum;
		//���θ�� <-> ĳ����
		/* ū Ÿ�Կ� ���� Ÿ���� ���ԵǴ� ��
		 * ���� Ÿ���� ū Ÿ�Կ� �ڵ����� ���� ��
		 * �� ��ȭ ����
		 */
		
		intNumber = (int) longNum; //ĳ���� �ؾ��� �ڡڡڡڡ�
		intNumber = byteNum; //�ڵ����� = ���θ��
		byteNum = (byte) ((short) ((int) (longNum)));
		
	}

}



