package may27;

//3x3 랜덤배열
import java.util.Arrays;

public class MultiArray04 {

	public static void main(String[] args) {

		int[][] multiArr01 = new int[3][3];

		for (int i = 0; i < multiArr01.length; i++) {//외부측
			for (int j = 0; j < multiArr01[i].length; j++) {//내부측

				int ran = (int) (Math.random() * 9 + 1);
				// System.out.println(i + ", " + j + ", " + ran);
				// 중복발생 검사
				boolean ch = true;
				F: for (int k = 0; k < multiArr01.length; k++) {
					for (int k2 = 0; k2 < multiArr01[i].length; k2++) {
						if (multiArr01[k][k2] != 0 && ran == multiArr01[k][k2]) {
							j--;//i 일 경우 전체 재시작
							ch = false;
							break F;
						}
					}
				}
				if (ch) {
					multiArr01[i][j] = ran;

			}
			}
				

		}
		for (int[] is : multiArr01) {
			System.out.println(Arrays.toString(is));
		}

	}
}
