package may31;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// �迭, for, if, while, switch
		// �迭�� ��� ����
		// ���� : ��, ���, ��, �·�

		// �� �� �Ұ�?

		// �ݺ� ������

		// �迭�� �·� ���� 0 = ��, 1 = �̱�

		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� �ݺ�?");
		int input = sc.nextInt();
		// System.out.println("�� �� �ݺ�?");
		// String input2 = sc.next();
		// String input3 = sc.nextLine();

		int[] score = new int[input + 2];
		int win = 0;
		// int com2 = (int) (Math.random() * 3 + 1);
		// ����������
		// ����ڰ� �Է��� Ƚ����ŭ �ݺ�
		// �迭�� ����� ����

		System.out.println("1. ����\t2. ����\t3. ��");// \t tab
		System.out.println("���ϴ� ��ȣ�� �����ּ���.");

		for (int i = 1; i < input + 1; i++) {
			double random = Math.random() * 3 + 1;
			// System.out.println(random);
			// ���� ���� �ɸ� ���� ���ʿ� �迭
			int com = (int) random;
			int user = sc.nextInt();
			if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("����� �̰���ϴ�.");
				score[i - 1] = 1;
				win++;
			} else if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else if (user == com) {
				System.out.println("�����ϴ�. �ٽ�");
				i--;
			} else {
				System.out.println("������� �Ѿ. �ٽ�");
				i--;
			}
			if (input > i) {
				System.out.println("���ϴ� ��ȣ�� �����ּ���.");
			}

		}
		System.out.println("");
		score[input] = win;
		// System.out.println(win);
		// System.out.println(input);
		double rate = ((double) win / (double) input) * 100;
		score[input + 1] = (int) rate;
		System.out.println("�·� : " + (int) rate + "%");
		System.out.println("");
		System.out.println(Arrays.toString(score));
		// for (int i = 0; i < score.length; i++) {
		// System.out.println(score[i]);
		// }
		sc.close();
	}

}
