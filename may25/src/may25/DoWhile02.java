package may25;

import java.util.Scanner;

//do~while��, �迭, ��������
/*
 * �ɷ´����� : ȭ�鱸��
 * �ɷ´������ : UI ���� Ȯ���ϱ� 
 */
public class DoWhile02 {

	public static void main(String[] args) {
		//����� �Է�
		Scanner sc = new Scanner(System.in);
		//����
		int java, jsp, spring, total;
		double avg;
		char grade;
		
		//���� �Է�
		do {
			System.out.println("�ڹ� ���� �Է�");
			java = sc.nextInt();
		} while (java < 0 || java > 100);

		do {
			System.out.println("JSP ���� �Է�");
			jsp = sc.nextInt();
		} while (jsp < 0 || jsp > 100);
		
		do {
			System.out.println("Spring ���� �Է�");
			spring = sc.nextInt();
		} while (spring < 0 || spring > 100);
		
		//���, ����, ���
		total = java + jsp + spring;
		avg = total / 3.0;
		
		//��� ��� 100~90 A, 89~80 B, 79~70 C, ������ F
		switch ((int) avg/10) {
		case 10 :
		case 9:
			grade = 'A';
			break;
			
		case 8:
			grade = 'B';
			break;
			
		case 7:
			grade = 'C';
			break;
			
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("����� " + avg);
		System.out.println("������ " + total);
		System.out.println("����� " + grade);
		
		//����
		/* ����
		 * ���� �̸�
		 * ������Ÿ��
		 * ������
		 * if
		 * for
		 * while
		 * do~while
		 * switch
		 * 
		 * 
		 * 
		 * 
		 * �迭
		 * 
		 */
		
		
		
		
	}

}
