package may28;

import java.util.Arrays;
import java.util.Scanner;

public class Nasen {
	public static void main(String[] args) {
		
		//1. ����_���ڸ� �Է¹����� 
		//���μ��� �ش� ���ڸ�ŭ ū �迭�� �׷��ּ���.
		
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		System.out.print("Number for Nasen : \n ex) 6_6");
		String number = sc.nextLine();
		//�Ʊ� �����̽��� ó�� ���ϴϱ� �̰ɷ� �ٲٰڽ��ϴ�.
		
		System.out.println(number);
		
		String[] cut = number.split(" ");//"2 3"
		System.out.println(Arrays.toString(cut));
		//�迭 �׸��� = String to int -> Integer.parseInt(��Ʈ����)
		int[][] nasenArr = 
				new int[Integer.parseInt(cut[0])][Integer.parseInt(cut[1])];
		
		//���
		for (int[] is : nasenArr) {
			System.out.println(Arrays.toString(is));
		}
		
		//�� ��Ȱ�ڵ�, tcpSchool, W3Schools ���ż� ���� ���ּ����� �մϴ�.
		
		
		
		
		
		
		
		
		
	}
}
