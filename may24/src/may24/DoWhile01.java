package may24;

import java.util.Scanner;

//do~while
/* do~while���� while�� �ٸ��� ������ �� �� �����ϰ� ������
 * ���ǹ��� ���� �ݺ��ϰ� �� �ϴ� �ݺ����Դϴ�.
 * while���� ���ǽ��� �����̸� �� ���� �� ������
 * do~while���� ������ �� ���� ���� ���¸� ������ �ֽ��ϴ�.
 * 
 * wisejia.com
 */
public class DoWhile01 {
	public static void main(String[] args) {

		do {
			//���ǽ��� ���϶� ������ ����;
			System.out.println("���ǽ��� �����̶� ������ �� ���� ����");
		} while (!true);
		
		int java, jsp, total;
		double avg;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		//���� �Է¹ޱ�
		do {
			System.out.println("�ڹ� ������ �Է��ϼ���.");
			java = sc.nextInt();
		} while (java < 0 || java > 100);//105?
		
		
		do {
			System.out.println("jsp ������ �Է��ϼ���.");
			jsp = sc.nextInt();
		} while (jsp > 100 || jsp < 0);//jsp������ 0���� �۰ų�, 100���� ũ�ٸ�
		
		//�� ������ ���ؼ� total�� �������ּ���
		total = jsp + java;
		//����� avg�� �������ּ���
		avg = total / 2.0;
		//��� -> "java������ 80��, jsp������ 69��,
		//			������ 149��, ����� 75���Դϴ�."
		System.out.printf("java ������ %3d��,\n",java);
		System.out.printf("jsp ������ %3d��,\n",jsp);
		System.out.printf("����� %.2f��,\n",avg);
		
		
		/* ���� %d --> %�ڸ���d   ---> 20�� %3d�� ����ϸ� -> _20 
		 * �Ǽ� %f --> %.�ڸ���f  ---> 2.000�� %.2f�� ��� -> 2.00   
		 * 
		 */
		
		
		
		
		
		
		
	}
}
