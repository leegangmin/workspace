package may21;

import java.util.Scanner;

//���������� ����

public class If07 {

	public static void main(String[] args) {
		
		//1. ������� �Է� �ޱ� = Scanner
		//������Ÿ�� ������ = ��;
		Scanner sc = new Scanner(System.in);//��ü ����
		System.out.println("1. ����\t2. ����\t3. ��");//\t tab
		System.out.println("���ϴ� ��ȣ�� �����ּ���.");
		int user = sc.nextInt();
		System.out.println(user);
		
		//2. ��ǻ�� ���� �����ϱ�
		int com = (int) (Math.random() * 3 + 1);
		System.out.println(com);
		
		//3. �����ϱ� & ����ϱ�
		if((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
			System.out.println("����� �̰���ϴ�.");
		} else if((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else {//(user == com)
			System.out.println("�����ϴ�.");
		}
		
	}
	
}
	


