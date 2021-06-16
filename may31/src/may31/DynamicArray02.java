package may31;

import java.util.Arrays;

//동적가변배열

public class DynamicArray02 {

	public static void main(String[] args) {

		// 10칸짜리 int 배열
		// 내부 비워둠

		int[][] arr01 = new int[10][];
		// System.out.println(Arrays.toString(arr01));

		// 각 집마다 랜덤으로 방 만들기
		int ran = (int) (double) ((Math.random() * 5) + 1);

		for (int i = 0; i < arr01.length; i++) {
			int ran1 = (int) (double) ((Math.random() * 5) + 1);
			arr01[i] = new int[ran1];

			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][j] = ran1;
			}

		}

		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		}

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				System.out.println(arr01[i][j]);
			}

		}
		
		//컬렉션 - list - ArrayList

	}
}