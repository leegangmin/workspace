package may24;
//�����ڵ带 �Է¹ް� ��⵵�� �¾ ������ �������� ����غ���

import java.util.Scanner;

public class Switch03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ �� ���� �ڵ� �Է�_");
		
		int year = 0, code;//�⵵, �����ڵ�
		String sex; //������ ����
		code = sc.nextInt();
		
		switch (code) {
		case 1:
		case 2:
			year = 1900;
			break;
			
		case 3:
		case 4:
			year = 2000;
			break;

		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
			//break;
			System.exit(0);//���α׷� ����
		}
		
		sex = code % 2 == 0 ? "����" : "����";
		//    ���ǽ�        ?     �� : ����;
		
		System.out.println("����� " + year + "�⵵�� �¾ ");
		System.out.println(sex + "�Դϴ�.");
		
		
		//if���ϰ� ���ƿ�.
		//key�� ���� ��ġ�� case�� �����ϰ� ������
		//break�� �־�� �ؿ�.
		//������ ������ �� �����.
		//���� �����ִϱ� �����ϱ� ���ؿ�
		//char, String �����մϴ�.
		//�Ǽ�, long �� �ǿ�
	}
}
