package may27;

import java.util.Arrays;

//다른 방법
public class MultiArray05 {

	public static void main(String[] args) {

		int[][] three = new int[3][3];// 초기값 = 0

		for (int i = 1; i < 10; i++) {// 숫자
			int r1 = (int) (Math.random() * 3);// index 자리
			int r2 = (int) (Math.random() * 3);// index 자리

			if (three[r1][r2] == 0) { // 초기값이라면
				three[r1][r2] = i;
			} else {
				i--;// 아니면 다시 돌림
			}

		}

		for (int[] is : three) {
			System.out.println(Arrays.toString(is));
		}

	}

}
