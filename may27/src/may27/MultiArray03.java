package may27;

//���� ����� ���α׷�
//java, jsp, spring �� ����, ����, ���, ���
//�л� �̸� �Է¹޾Ƽ� ���� ���
//2���� �迭, ����ġ, for, if
import java.util.Arrays;
import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�л� ���� �Է��ϼ���. : ");
		int input = sc.nextInt();

		int[][] student = new int[input][4];
		String[] name = new String[input];
		String[] subject = { "java", "jsp", "spring" };
		char[] grade = new char[input];
		double[] avg = new double[input];

		for (int i = 0; i < name.length; i++) {
			System.out.print("�̸��� �Է��ϼ���. : ");
			name[i] = sc.next();
			for (int j = 0; j < subject.length; j++) {
				do {
					System.out.println(subject[j] + "������ �Է��ϼ���.");
					student[i][j] = sc.nextInt();
				} while (student[i][j] < 0 || student[i][j] > 100);
			

		}

			// ����
			student[i][3] = student[i][0] + student[i][1] + student[i][2];
			// ���
			avg[i] = student[i][3] / 3.0;
			// ���
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

		System.out.println("������������������������������������������������������������������������������������������������������");
		System.out.println("�� �� �� �� �ڹ� �� jsp �� spring �� ���� �� ��� �� ��ަ�");
		System.out.println("������������������������������������������������������������������������������������������������������");
		for (int i = 0; i < avg.length; i++) {
			System.out.printf("�� %3.3s �� %4d �� %3d �� %6d �� %4d �� %.2f �� %3s �� \n", name[i], student[i][0],
					student[i][1], student[i][2], student[i][3], avg[i], grade[i]);
			System.out.println("������������������������������������������������������������������������������������������������������");

			//%S = ��� �빮�� ó��
			//%s = 3.3 = 3(����).3(���� �Ѿ�� �ڸ�)
			//%d = 4 = 4ĭ �Ҵ��ؼ� ���� 60 �̸� __60
			//%f = .2 = �Ҽ��� �Ʒ� ���ڸ�
			
		}
	}

}
