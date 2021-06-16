package may24;

import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 직급을 입력하세요.");
		System.out.println("1.사장 \t 2.부장 \t 3.과장 "
				+ "\t 4.대리 \t 5.사원 \t 6.알바");
	
		int input = sc.nextInt();
		System.out.print("올라갈 수 있는 층은 ");
		
		switch (input) {
		case 1:
			System.out.print("6층, ");			//break;
		case 2:
			System.out.print("5층, ");			//break;
		case 3:
			System.out.print("4층, ");			//break;
		case 4:
			System.out.print("3층, ");			//break;
		case 5:
			System.out.print("2층, ");			//break;
		default:
			System.out.print("1층입니다.");
			break;
		}
	}
}
