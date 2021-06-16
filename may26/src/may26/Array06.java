package may26;

import java.util.Iterator;
import java.util.Scanner;

public class Array06 {
	public static void main(String[] args) {

		// int java, jsp, spring, total;
		int[] subject = new int[4];//
		double avg;
		char grade;

		Scanner sc = new Scanner(System.in);

		String[] text = {"java", "jsp", "spring"};
		
		for (int i = 0; i < text.length; i++) {
		
			do {
				System.out.println(text[i] + " 점수를 입력하세요");
				subject[i] = sc.nextInt();
			} while (subject[i] < 0 || subject[i] > 100);
			
		}
		
		subject[3] = subject[0] + subject[1] + subject[2];
		avg = subject[3] / 3.0;//조심해주세요

		switch ((int)(avg / 10)) { // ?
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;

		case 7:
			grade = 'C';
			break;

		default:
			grade = 'F';
			break;
		}
		
		//출력해주세요.
		System.out.println("java : " + subject[0]);
		System.out.println("jsp : " + subject[1]);
		System.out.println("spring : " + subject[2]);
		System.out.println("total : " + subject[3]);
		System.out.println("avg : " + avg);
		System.out.println("grade : " + grade);
		
		
		
	}
}
