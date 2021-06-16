package may31;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		int[][] tic = new int[3][3];
		Scanner sc = new Scanner(System.in);
	
		
		for (int i = 0; i < tic.length; i++) {
			for (int j = 0; j < tic[i].length; j++) {
				tic[i][j] = i == 0? (3 * (i + 1)) - 2 + j : (3 * (i + 1)) - 2 + j;
			}
			System.out.println(Arrays.toString(tic[i]));
			
			
			
		}
		
		
		System.out.println("User 1 ео");
		int u1 = sc.nextInt();
		//char[] board = u1.toCharArray();
		System.out.println("User 2 ео");
		int u2 = sc.nextInt();
		
		
		
		

	}

}
