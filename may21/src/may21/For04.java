package may21;

import java.util.Scanner;

//����ڰ� �Է��� ���ڸ�ŭ ������ 2�� ����ϱ�.
public class For04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ���� �Է��ϼ���.");
		int dan = sc.nextInt();
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}

	}

}
