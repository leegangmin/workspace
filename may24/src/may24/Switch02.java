package may24;

import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �Է��ϼ���.");
		System.out.println("1.���� \t 2.���� \t 3.���� "
				+ "\t 4.�븮 \t 5.��� \t 6.�˹�");
	
		int input = sc.nextInt();
		System.out.print("�ö� �� �ִ� ���� ");
		
		switch (input) {
		case 1:
			System.out.print("6��, ");			//break;
		case 2:
			System.out.print("5��, ");			//break;
		case 3:
			System.out.print("4��, ");			//break;
		case 4:
			System.out.print("3��, ");			//break;
		case 5:
			System.out.print("2��, ");			//break;
		default:
			System.out.print("1���Դϴ�.");
			break;
		}
	}
}
