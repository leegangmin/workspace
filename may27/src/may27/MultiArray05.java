package may27;

import java.util.Arrays;

//�ٸ� ���
public class MultiArray05 {

	public static void main(String[] args) {

		int[][] three = new int[3][3];// �ʱⰪ = 0

		for (int i = 1; i < 10; i++) {// ����
			int r1 = (int) (Math.random() * 3);// index �ڸ�
			int r2 = (int) (Math.random() * 3);// index �ڸ�

			if (three[r1][r2] == 0) { // �ʱⰪ�̶��
				three[r1][r2] = i;
			} else {
				i--;// �ƴϸ� �ٽ� ����
			}

		}

		for (int[] is : three) {
			System.out.println(Arrays.toString(is));
		}

	}

}
