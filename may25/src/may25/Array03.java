package may25;

import java.util.Arrays;
import java.util.Scanner;

//char[] �빮�� A~Z ����

public class Array03 {

	public static void main(String[] args) {

		char[] cArr01 = new char[26];
		for (int i = 65; i < 65 + cArr01.length; i++) {
			cArr01[i - 65] = (char) i;
		}
		System.out.println(Arrays.toString(cArr01));

		// for (int i : cArr01) {
		// System.out.println((char) i);
		// }

		System.out.println((char) (cArr01[0] + 3));

		///////////////////////////////////////////////////////////////////

		char[] cat = { 'C', 'A', 'T' };
		// 5ĭ �и�
		// 3ĭ �и�
		// XYZ�� �� ������???
		for (int i = 0; i < cat.length; i++) {
			System.out.println((char) (cat[i] + 5));
		}

		for (int i = 0; i < cat.length; i++) {
			System.out.println((char) (cat[i] + 3));
		}
		char[] xyz = { 'X', 'Y', 'Z' };
		// for (int i = 0; i < xyz.length; i++) {
		// System.out.println((char) (i + 65 + 3));
		int pass =  5;
		
		for (int i = 0; i < xyz.length; i++) {
			if (xyz[i] + pass > 'Z') {
				System.out.println((char) (xyz[i] + pass - 26));
				}
		}

		//��ĳ�ʷ� �Է¹��� �� �迭�� �ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� �Է���");
		String input = sc.next();
		char[] string2Char = input.toCharArray();
		//���ڿ��� �ϳ��ϳ� ����
		System.out.println(Arrays.toString(string2Char));
		
		
	}

}
