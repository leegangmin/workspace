package may26;

import java.util.Arrays;

//2���� �迭 : �迭 �� �迭

public class MultiArray01 {
	public static void main(String[] args) {
		
		int[] arr01 = {10, 20, 30, 40};//���� 4, index 0~3
		
		int[][] multiArr01 = new int[4][5];
		
		//����
		multiArr01[1][2] = 500;
		multiArr01[3][1] = 100;
		
		int number = 1;
		for (int i = 0; i < multiArr01.length; i++) {//?
			for (int j = 0; j < multiArr01[i].length; j++) {//?				
				multiArr01[i][j] = number++;
			}
		}
		
		//���
		for (int i = 0; i < multiArr01.length; i++) {//
			for (int j = 0; j < multiArr01[i].length; j++) {//
				System.out.println(i + ":" + j + ":" + multiArr01[i][j]);
			}
		}
		
		//Arrays
		for (int i = 0; i < multiArr01.length; i++) {
			System.out.println(Arrays.toString(multiArr01[i]));
		}
		
		//foreach
		for (int[] is : multiArr01) {
			for (int i : is) {
				System.out.println(i);
			}
		}
		//�ɽ��Ͻø� �Ʒ� ������.
		//�Ǻ���ġ���� 0, 1�� �⺻���� �־����ϴ�. 
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 
		//610, 987, 1597, 2584, 4181, 6765, 10946
		//���� ���� ����ϴ� ������ ������ּ���.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
