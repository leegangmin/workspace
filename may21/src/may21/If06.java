package may21;


//if��ø
//������ ��ø : �ʿ信 ���� ���ǿ� ������ ��� ��ø��Ű�� ��.
//�ʺ��� ��쿡 ���� ���� �� ����.
//
public class If06 {

	public static void main(String[] args) {
	
		double ran = Math.random() * 127;
		System.out.println(ran);
		
		int number = (int) ran;
		System.out.println(number);
		//int number2 = (int) (Math.random() * 150 + 1);
		
		char ch = 'A';
		ch = (char) number;
		System.out.println("���� ���� : " + ch);
		//A 65 Z 90 a 97 z 122
	
		if(ch >= 'A') {//���� �빮��, Ư������, �ҹ���, Ư������
			System.out.println("���� �빮�� A ����");
			if(ch <= 'Z') {
				System.out.println("���� �빮�� �Դϴ�.");
			} else {
				System.out.println("���� �빮�� ���� �����Դϴ�.");
				if(ch < 'a') {
					System.out.println("��ҹ��� ���� Ư������ �Դϴ�.");
				} else {
					if(ch <= 'z') {
						System.out.println("���� �ҹ��� �Դϴ�.");
					} else {
						if(ch > 'z') {
							System.out.println("���� �ҹ��� ���� Ư������");
						}
					}
					
				}
			}
			
		} else {//���� �빮�� ����
			System.out.println("���� �빮�� A ����");
			if(ch >= 48 && ch <= 57) {
				System.out.println("���� �Դϴ�.");
			}
	}
		
	//////////////////////////////////////////////////////////////
	/* �������ڸ� ����Ͽ� �غ���
	 * AND ���
	 */
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("���� �빮���Դϴ�.");
		} else if(ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ��� �Դϴ�.");
		} else if(ch >= '0' && ch <= '9') {
			System.out.println("�����Դϴ�.");
		}
		
		
	/* OR ���
	 */
		if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')) {
			System.out.println("���� ��ҹ��� �Դϴ�.");
		}
		
		
	 /* 
	 * �� ���� �������... API
	 * 
	 * API
	 * (Application Programming Interface)
	 * ���ø����̼� ���α׷��� �������̽�,
	 * ���� ���α׷� ���α׷��� �������̽�)��
	 * �������α׷����� ����� �� �ֵ���,
	 * � ü���� ���α׷��� �� �����ϴ�
	 * ����� ������ �� �ְ� ���� �������̽�
	 */
			System.out.println("===========================");
		if(Character.isUpperCase(ch)) {
			System.out.println("�빮��");
		} else if(Character.isLowerCase(ch)) {
			System.out.println("�ҹ���");
			
		} else if(Character.isDigit(ch)) {
			System.out.println("����");
		} else {
			System.out.println("Ư������");
		}
		
	
		
		
		
	}
}
