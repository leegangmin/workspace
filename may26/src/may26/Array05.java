package may26;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {
	public static void main(String[] args) {
		//����� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣȭ �� ���ڸ� �Է��ϼ���.");
		String input = sc.next();
		
		System.out.println("�� ĭ �̵��ұ��? ���ڸ� �Է��ϼ���.");
		int number = sc.nextInt();
		
		input = input.toUpperCase();//���ڿ��� ��� �빮�ڷ�.
		
		//ĳ���� �迭�� �����
		char[] inputArray = input.toCharArray();

		//�迭�� ���鼭 ������ ���ڸ�ŭ �б� -> ���
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] + number > 'Z') {//�Ѿ�ϴ�. ó�����ּ���.
				//XYZ -> ABC
				inputArray[i] = (char) (inputArray[i] + number - 26);//?
				
			} else {
				inputArray[i] = (char) (inputArray[i] + number);
			}
		}
		
		System.out.println("�Ʒ��� �迭�� ���ڿ��� ��ȯ�մϴ�.");
		String conv = String.valueOf(inputArray);//char array to String
		System.out.println(conv);
		String.valueOf(123); // -> "123"
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
