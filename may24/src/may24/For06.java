package may24;

import java.util.Scanner;

//���� ���߱�
/*
 * ��ǻ�Ͱ� ������ ���� ���ڸ����� �̽��ϴ�.
 * ����ڰ� ���ڸ� �Է��ϸ� UP / DOWN�� ����ϰ�
 * ��ġ�Ѵٸ� "�����մϴ�"��� �ϸ鼭 ��� ����� ���α׷�
 * 1. for������ 20�� �����ϱ�
 * 2. ��ġ�ϸ� for�� ���� �����ϰ� ���α׷� �����ϱ�
 */
public class For06 {
	public static void main(String[] args) {

		// ��ǻ�Ͱ� ���� �̱�
		// ����� �Է� ���
		// for������ 20�� �˻��ϱ�
		// ����� ���ڰ� �۴ٸ� UP
		// ����� ���ڰ� ũ�ٸ� DOWN
		// ��ġ�Ѵٸ� "�����մϴ�" ���α׷� ����
		// for, break, if

		// double random = Math.random() * 99 + 1;//0.45676371565
		int random02 = (int) (Math.random() * 99 + 1);
		System.out.println(random02);// 1~99

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {
			System.out.println("���ڸ� �Է��ϼ���.");
			int input = sc.nextInt();

			if (input < random02) {// ��ǻ�� ���ڰ� Ŭ ���
				System.out.println("UP");
			} else if (random02 < input) {// ��ǻ�� ���ڰ� ���� ���
				System.out.println("DOWN");
			} else {// ������ ���
				System.out.println("�����մϴ�.");
				break;
				//i = 20;
			}
			
		} // for
		sc.close();// �̰� ��. ��ĳ�� �ݱ�

	}

}
