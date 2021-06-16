package may31;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 배열, for, if, while, switch
		// 배열에 결과 저장
		// 저장 : 승, 비김, 패, 승률

		// 몇 판 할거?

		// 반복 돌리기

		// 배열에 승률 저장 0 = 짐, 1 = 이김

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번 반복?");
		int input = sc.nextInt();
		// System.out.println("몇 번 반복?");
		// String input2 = sc.next();
		// String input3 = sc.nextLine();

		int[] score = new int[input + 2];
		int win = 0;
		// int com2 = (int) (Math.random() * 3 + 1);
		// 가위바위보
		// 사용자가 입력한 횟수만큼 반복
		// 배열에 결과값 저장

		System.out.println("1. 가위\t2. 바위\t3. 보");// \t tab
		System.out.println("원하는 번호를 눌러주세요.");

		for (int i = 1; i < input + 1; i++) {
			double random = Math.random() * 3 + 1;
			// System.out.println(random);
			// 가장 많이 걸릴 값을 위쪽에 배열
			int com = (int) random;
			int user = sc.nextInt();
			if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("당신이 이겼습니다.");
				score[i - 1] = 1;
				win++;
			} else if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1)) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else if (user == com) {
				System.out.println("비겼습니다. 다시");
				i--;
			} else {
				System.out.println("제어범위 넘어섬. 다시");
				i--;
			}
			if (input > i) {
				System.out.println("원하는 번호를 눌러주세요.");
			}

		}
		System.out.println("");
		score[input] = win;
		// System.out.println(win);
		// System.out.println(input);
		double rate = ((double) win / (double) input) * 100;
		score[input + 1] = (int) rate;
		System.out.println("승률 : " + (int) rate + "%");
		System.out.println("");
		System.out.println(Arrays.toString(score));
		// for (int i = 0; i < score.length; i++) {
		// System.out.println(score[i]);
		// }
		sc.close();
	}

}
