package jun04;

import java.util.Scanner;

public class Object02 {
	public static void main(String[] args) {

		String id = "hong";
		String pw = "01234567";

		// ����� �Է�
		Scanner sc = new Scanner(System.in);
		String inputID = "", inputPW = "";
		for (int i = 1; i <= 5; i++) {

			do {
				System.out.println("ID?");
				inputID = sc.next();
			} while (inputID.length() < 3);

			do {
				System.out.println("PW?");
				inputPW = sc.next();
			} while (inputPW.length() < 3);

			// ����� ���� �������� ���ϱ�
			if (id.equals(inputID) && pw.equals(inputPW)) {
				System.out.println("�α��� ����");
				break;
			} else {
				System.out.println("������ �ٸ�");
			}
			
			System.out.println(i + "�� �õ���");
			
			if (i == 5) {
				System.out.println("�õ� Ƚ�� �ʰ�. ��");
				break;
			}

		}
	}

}
