package may27;

//3x3 �����迭
import java.util.Arrays;

public class MultiArray04 {

	public static void main(String[] args) {

		int[][] multiArr01 = new int[3][3];

		for (int i = 0; i < multiArr01.length; i++) {//�ܺ���
			for (int j = 0; j < multiArr01[i].length; j++) {//������

				int ran = (int) (Math.random() * 9 + 1);
				// System.out.println(i + ", " + j + ", " + ran);
				// �ߺ��߻� �˻�
				boolean ch = true;
				F: for (int k = 0; k < multiArr01.length; k++) {
					for (int k2 = 0; k2 < multiArr01[i].length; k2++) {
						if (multiArr01[k][k2] != 0 && ran == multiArr01[k][k2]) {
							j--;//i �� ��� ��ü �����
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
