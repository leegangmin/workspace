package may25;

import java.util.Arrays;
import java.util.Scanner;

//char[] 대문자 A~Z 저장

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
		// 5칸 밀면
		// 3칸 밀면
		// XYZ가 들어가 있으면???
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

		//스캐너로 입력받은 것 배열로 넣기
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력해");
		String input = sc.next();
		char[] string2Char = input.toCharArray();
		//문자열을 하나하나 분해
		System.out.println(Arrays.toString(string2Char));
		
		
	}

}
