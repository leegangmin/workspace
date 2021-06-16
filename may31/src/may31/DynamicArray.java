package may31;

import java.util.Arrays;

/* 동적가변배열
 * 동적가변배열이란 배열의 길이를 동적으로, 필요시에 생성하는 것.
 * 동적가변배열이 아닌 것은 처음부터 배열의 길이를 초기화해서 만들어 사용함.
 * 
 * 하지만 동적가변배열은 필요시에 필요한 만큼 만들어서 사용함.
 * 
 * 
 */

public class DynamicArray {

	public static void main(String[] args) {
	
		int[] arr = new int[3];
		
		int[][] arr01 = new int[3][3];
		
		char[][] arr02 = new char[10][];//내부를 비워둠
		
		for (int i = 0 ; i < arr02.length; i++) {
			arr02[i] = new char[i + 1];//1 10 방만들기
			
			for (int j = 0; j < arr02[i].length; j++) {//각 집마다
				arr02[i][j] = (char)(65 + i + j);
			}
		}
		
		for (char[] cs : arr02) {
			System.out.println(Arrays.toString(cs));
		}
		
		
		
		
		
		
		
		
	}

}
