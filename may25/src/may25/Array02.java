package may25;

import java.util.Arrays;
import java.util.Iterator;

//배열

public class Array02 {
	public static void main(String[] args) {

		// 생성식=int배열, 10칸 = 초기값으로
		// 정수는 0, 실수는 0.0, char는 0, boolean은 거짓, String(객체)은 null
		int[] arr01 = new int[10];

		// 생성식 = 바로 값을 넣어주기
		int[] arr02 = new int[] { 10, 11, 12, 13, 14, 15, 16, 17 };
		// 0 1 2 3 4 5 6 7
		// 길이는?
		System.out.println(arr02.length);// 8

		// 생성식 = 바로 값을 넣어주기2
		int[] arr03 = { 100, 200, 300, 400, 500 };
		System.out.println(arr03.length);// 8
		// 400이라는 값을 찍기
		System.out.println(arr03[3]);

		// arr01 10칸
		// arr03 5칸
		// arr01 홀수칸에 arr03의 값을 순서대로 넣어

		for (int i = 0; i < arr01.length; i++) {
			if (i % 2 == 1) {
				arr01[i] = arr03[i / 2];
				System.out.println(i / 2);
			}
		}

		// String[] strArr = new String[10];

		System.out.println(Arrays.toString(arr01));

		// foreach 문장
		// 향상 for문
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);// index에 넣어서
		}
		for (int i : arr01) { // 어떤 집합을 열어서 그 요소를 반환
			System.out.println(i);
		}

		double[] dArr = new double[5];//
		for (double d : dArr) {
			System.out.println(d);
		}

	}

}
