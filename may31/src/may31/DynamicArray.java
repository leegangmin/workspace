package may31;

import java.util.Arrays;

/* ���������迭
 * ���������迭�̶� �迭�� ���̸� ��������, �ʿ�ÿ� �����ϴ� ��.
 * ���������迭�� �ƴ� ���� ó������ �迭�� ���̸� �ʱ�ȭ�ؼ� ����� �����.
 * 
 * ������ ���������迭�� �ʿ�ÿ� �ʿ��� ��ŭ ���� �����.
 * 
 * 
 */

public class DynamicArray {

	public static void main(String[] args) {
	
		int[] arr = new int[3];
		
		int[][] arr01 = new int[3][3];
		
		char[][] arr02 = new char[10][];//���θ� �����
		
		for (int i = 0 ; i < arr02.length; i++) {
			arr02[i] = new char[i + 1];//1 10 �游���
			
			for (int j = 0; j < arr02[i].length; j++) {//�� ������
				arr02[i][j] = (char)(65 + i + j);
			}
		}
		
		for (char[] cs : arr02) {
			System.out.println(Arrays.toString(cs));
		}
		
		
		
		
		
		
		
		
	}

}
