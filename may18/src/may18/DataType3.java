package may18;
//char ������
//���� �ϳ��� ����
/* �ݵ�� �����δ� ���� �ϳ��� �;� ��
 * �ϳ� �̻��� ��쿡�� String�� ����
 * ������ Ÿ�� 0~65,535 = 2byte
 * 
 * �������� ������ ����?
 * �ݵ�� Ȧ����ǥ
 * 
 * �������̱� ������ int�� ���θ�� ����
 * �ݴ�� int�� ���� ���ڷ� �ٲ� �� ����
 */
public class DataType3 {

	public static void main(String[] args) {
		//������ �ʱ�ȭ �ϱ�
		//������Ÿ�� ������ = '��';
		
		char char1 = 'A';
		char char2 = '��';
		char char3 = 'ʫ';
		char1 = 100;
		char2 = '\u0392';//�����ڵ�
		//�ƽ�Ű�ڵ�, �����ڵ� ---- utf-8, euc-kr, ms949
		
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		System.out.println((char) 76);
		
		//for (int i =1; i < 128; i++) {//i�� ����
		//	System.out.print(i	 + " : " + (char) i + "\n");
		//}
		
		
		String str = "������";//���ڿ� = ��Ʈ��
		str = ""+ char1 + char2 + char3;
		System.out.println(str);
	
		
		int iNum = char1;
		System.out.println(iNum);
		
		char3 = 63759;
		System.out.println(char3);
		
		///////////////////////����
		// boolean ��, ����
		
		boolean check = true;
		
		System.out.println(check);
		
		System.out.println('A'=='a');
	
		iNum = 10;
		int iNum2 = 10;
		
		
		System.out.println(iNum == iNum2);
	
		check = iNum == iNum2 + 1;//! = not
		
		System.out.println("����� : " + check);
		//�� ���� �����ϴ� Ÿ��
		//off on
		
		/* PŸ��
		 * ������
		 *  byte
		 *  short
		 *  int
		 *  long
		 * �Ǽ���
		 *  float
		 *  double
		 * ������
		 *  char
		 * ����
		 *  boolean
		 */
		
		int code = 1;
		int result = code % 2;//��ⷯ = ������ ��
		check = result == 0;
		
		if(check) {//���࿡ check�� ���̶��
			System.out.println("����� ����");
		} else {
			System.out.println("����� ����");
		}
		
	}

}
