package may24;
//while�� ����Ͽ� ���ڰ����� ������ּ���.

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {

		//����� �Է�
		Scanner sc = new Scanner(System.in);
		
		//�� ���ڸ� ���� �̱�
		int com = (int) (Math.random() * 99 + 1);
		
		//while�� ��
		//Up/down / ��ġ�ϸ� "�����մϴ�" ���α׷� ����
		int count = 0;//�ʱ�ȭ
		
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���.");
			int input = sc.nextInt();
			count++;//Ƚ�� ����, ��ġ ����

			if(input > com) {
				System.out.println("DOWN");
			} else if(input < com) {
				System.out.println("UP");
			} else {
				System.out.println("�����մϴ�");
				//�� �� �õ� �ߴ��� ���α׷� ���� �� ������ּ���.
				System.out.println(count + "�� �õ��߽��ϴ�.");
				break;
			}
		}
	}
}
