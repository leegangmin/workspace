package may28;

import java.util.Arrays;

//1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13......

public class FizzBuzz {
	public static void main(String[] args) {

		// �迭�� ���� ������ Ÿ������ �����ؾ� �ϳ���?
		String[] fb = new String[20];
		//null

		for (int i = 1; i <= fb.length; i++) {// 20�� �ݺ�
			if (i % 3 == 0 && i % 5 == 0) {// 3�� ���
				// System.out.print("fizzBuzz");
				fb[i - 1] = "fizzBuzz";
			} else if (i % 5 == 0) {// 5�� ���
				// System.out.print("buzz");
				fb[i - 1] = "buzz";
			} else if (i % 3 == 0) {// 3, 5�� ���
				// System.out.print("fizz");
				fb[i - 1] = "fizz";
			} else {
				fb[i - 1] = String.valueOf(i);
				// System.out.print(i);
			}
			// System.out.print(", ");
		}

		// ���
		System.out.println(Arrays.toString(fb));

	}

}
