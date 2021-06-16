package may27;

//성적 입출력 프로그램
//java, jsp, spring 각 점수, 총점, 평균, 등급
//학생 이름 입력받아서 같이 출력
//2차원 배열, 스위치, for, if
import java.util.Arrays;
import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");
		int input = sc.nextInt();

		int[][] student = new int[input][4];
		String[] name = new String[input];
		String[] subject = { "java", "jsp", "spring" };
		char[] grade = new char[input];
		double[] avg = new double[input];

		for (int i = 0; i < name.length; i++) {
			System.out.print("이름을 입력하세요. : ");
			name[i] = sc.next();
			for (int j = 0; j < subject.length; j++) {
				do {
					System.out.println(subject[j] + "점수를 입력하세요.");
					student[i][j] = sc.nextInt();
				} while (student[i][j] < 0 || student[i][j] > 100);
			

		}

			// 총점
			student[i][3] = student[i][0] + student[i][1] + student[i][2];
			// 평균
			avg[i] = student[i][3] / 3.0;
			// 등급
			switch ((int) (avg[i] / 10)) {
			case 10:
			case 9:
				grade[i] = 'A';
				break;

			case 8:
				grade[i] = 'B';
				break;

			case 7:
				grade[i] = 'C';
				break;

			default:
				grade[i] = 'F';
				break;
			}

		}

		System.out.println("┏━━━━━━━┳━━━━━━┳━━━━━┳━━━━━━━━┳━━━━━━┳━━━━━━┳━━━━━┓");
		System.out.println("┃ 이 름 ┃ 자바 ┃ jsp ┃ spring ┃ 총점 ┃ 평균 ┃ 등급┃");
		System.out.println("┣━━━━━━━╋━━━━━━╋━━━━━╋━━━━━━━━╋━━━━━━╋━━━━━━╋━━━━━┫");
		for (int i = 0; i < avg.length; i++) {
			System.out.printf("┃ %3.3s ┃ %4d ┃ %3d ┃ %6d ┃ %4d ┃ %.2f ┃ %3s ┃ \n", name[i], student[i][0],
					student[i][1], student[i][2], student[i][3], avg[i], grade[i]);
			System.out.println("┗━━━━━━━┻━━━━━━┻━━━━━┻━━━━━━━━┻━━━━━━┻━━━━━━┻━━━━━┛");

			//%S = 모두 대문자 처리
			//%s = 3.3 = 3(글자).3(글자 넘어가면 자름)
			//%d = 4 = 4칸 할당해서 찍음 60 이면 __60
			//%f = .2 = 소수점 아래 두자리
			
		}
	}

}
