package may28;

import java.util.Arrays;
import java.util.Scanner;

public class Nasen {
	public static void main(String[] args) {
		
		//1. 숫자_숫자를 입력받으면 
		//가로세로 해당 숫자만큼 큰 배열을 그려주세요.
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		System.out.print("Number for Nasen : \n ex) 6_6");
		String number = sc.nextLine();
		//아까 스페이스바 처리 못하니까 이걸로 바꾸겠습니다.
		
		System.out.println(number);
		
		String[] cut = number.split(" ");//"2 3"
		System.out.println(Arrays.toString(cut));
		//배열 그리기 = String to int -> Integer.parseInt(스트링값)
		int[][] nasenArr = 
				new int[Integer.parseInt(cut[0])][Integer.parseInt(cut[1])];
		
		//출력
		for (int[] is : nasenArr) {
			System.out.println(Arrays.toString(is));
		}
		
		//꼭 생활코딩, tcpSchool, W3Schools 들어가셔서 공부 해주셨으면 합니다.
		
		
		
		
		
		
		
		
		
	}
}
