package may24;

import java.util.Scanner;

/*
 
 *
 **
 ***
 ****
 *****
 
 */
public class For07 {
	public static void main(String[] args) {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("=============================");

		for (int i = 0; i < 5; i++) {// ��
			for (int j = 0; j < i + 1; j++) {// ��
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		// 10 9 8 7 6 5 4 3 2 1

		System.out.println("*****");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
		System.out.println("---------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("____*1");
		System.out.println("___***3");
		System.out.println("__*****5");
		System.out.println("_*******7");
		System.out.println("*********9");

		System.out.println("==============================");

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {// �����̽� --
				// 4�� -> 0��
				System.out.print("_");
			}

			for (int j = 0; j < i * 2 + 1; j++) {// �� ++
				// 1�� -> 5��
				System.out.print("*");
			}
			System.out.println("");// ���� ó��
		}

		System.out.println("==============================");

		System.out.println("*****");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*****");

		System.out.println("==============================");

		for (int i = 0; i < 5; i++) {
			if (i % 4 == 0) {// ù�ٰ� �������ٸ�
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
				} // for
			} else {// �������� �� �����
				System.out.print("*   *");// for������ ����?
			} // if
			System.out.println("");
		} // for
		
		System.out.println("==============================");
		
		
		
		
		
		
		
		System.out.println("*___*");
		System.out.println("**__*");
		System.out.println("*_*_*");
		System.out.println("*__**");
		System.out.println("*___*");
		
		System.out.println("==============================");
		//�Ļ��ϰ� ���ø� �̾ �ϰڽ��ϴ�.
		
		//����� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("Ȧ���� �Է��ϼ���.");
		int input = sc.nextInt();
		//Ȥ ¦���� ������ Ȧ���� �����ϴ� �ڵ嵵 �־��ָ�
		//���� �� �����ϴ�.
		if(input % 2 == 0) {
			input++;
		}
		
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {				
				if(j == 0 || j == input - 1 || i == j) {//����!
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}
			System.out.println("");
		}
		
		sc.close();//��ĳ�� �ݱ�
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
