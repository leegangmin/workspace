package may31;

import java.util.Arrays;

public class ArrayCopy01 {

	public static void main(String[] args) {
		
		int[] arr01 = {10, 20, 30};
		int[] arr02 = new int[3];
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		//arr02 = arr01;
		
		arr01[0] = 100;
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));

		
		for (int i = 0; i < arr01.length; i++) {
			arr02[i] = arr01[i];
		}
		
		arr01[0] = 1000;
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		System.arraycopy(arr01, 0, arr02, 0, arr01.length);
		/* src 원본
		 * srcPos 원본 어느 위치부터
		 * dest 값을 담을 배열
		 * destPos 어느 위치에 저장?
		 * length 어느 길이만큼
		 * 
		 */
		
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		
		int[] arr03 = new int[10];
		//[0,1000,20,30,0,0,0,0,0,0]
		
		System.arraycopy(arr01, 0, arr03, 1, 3);
		
		System.out.println(Arrays.toString(arr03));
		
		// 깊은 복사
		// 얕은 복사에 대해 찾아봐
		
		int[] arr04 = arr01.clone();
		
		System.out.println(Arrays.toString(arr04));
		
		
		// ~ 185p
		
		
		
		
	}

}
