package may25;

import java.util.Arrays;
import java.util.Iterator;

//�迭

public class Array02 {
	public static void main(String[] args) {

		// ������=int�迭, 10ĭ = �ʱⰪ����
		// ������ 0, �Ǽ��� 0.0, char�� 0, boolean�� ����, String(��ü)�� null
		int[] arr01 = new int[10];

		// ������ = �ٷ� ���� �־��ֱ�
		int[] arr02 = new int[] { 10, 11, 12, 13, 14, 15, 16, 17 };
		// 0 1 2 3 4 5 6 7
		// ���̴�?
		System.out.println(arr02.length);// 8

		// ������ = �ٷ� ���� �־��ֱ�2
		int[] arr03 = { 100, 200, 300, 400, 500 };
		System.out.println(arr03.length);// 8
		// 400�̶�� ���� ���
		System.out.println(arr03[3]);

		// arr01 10ĭ
		// arr03 5ĭ
		// arr01 Ȧ��ĭ�� arr03�� ���� ������� �־�

		for (int i = 0; i < arr01.length; i++) {
			if (i % 2 == 1) {
				arr01[i] = arr03[i / 2];
				System.out.println(i / 2);
			}
		}

		// String[] strArr = new String[10];

		System.out.println(Arrays.toString(arr01));

		// foreach ����
		// ��� for��
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);// index�� �־
		}
		for (int i : arr01) { // � ������ ��� �� ��Ҹ� ��ȯ
			System.out.println(i);
		}

		double[] dArr = new double[5];//
		for (double d : dArr) {
			System.out.println(d);
		}

	}

}
