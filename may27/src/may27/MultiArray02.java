package may27;

import java.util.Arrays;

//2���� �迭 : �迭 �ӿ� �迭
public class MultiArray02 {

	public static void main(String[] args) {

		int[][] multiArr01 = new int[2][4];
		/*
		 * [0, 0, 0, 0] 
		 * [0, 0, 0, 0]
		 */

		
		//�� �����ؼ� �ٸ� �Ŀ� ����� ��
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {//[i]
				System.out.print(multiArr01[i][j] + ", ");
			}
			System.out.println("");
		}

		
		System.out.println("================================");
		//���� ���
		System.out.println(Arrays.toString(multiArr01));//[[I@6ee52dcd, [I@4493d195]
		for (int i = 0; i < multiArr01.length; i++) {
			System.out.println(Arrays.toString(multiArr01[i]));
		}
		
		System.out.println("================================");
		//���� ���
		for (int[] is : multiArr01) {
			System.out.println(Arrays.toString(is));
		}
		
		System.out.println("===============================");
		
		for (int i = 0; i < multiArr01.length; i++) {
			for (int j = 0; j < multiArr01[i].length; j++) {
				multiArr01[i][j] = i == 0? (i * 5) + j + 1 : (i * 5) + j;
			}
			System.out.println(Arrays.toString(multiArr01[i]));
		
		}
		
	}

}
