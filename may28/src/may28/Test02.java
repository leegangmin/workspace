package may28;

import java.util.Scanner;

//����ڰ� �Է� "������abc12@#$" ---> abc12 
//�ڹٰ� ����� �� �ִ� ������ �����ϱ�
//���� �빮�� �ҹ���, ����, _, $

//�߰�1, ���ڷ� �����ϸ� ����, �����ڷ� �����ϰ� ���ּ���.


public class Test02 {
	public static void main(String[] args) {

		System.out.println("����� ������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i))){					
				System.out.print(input.charAt(i));
				
			}else if (Character.isDigit(input.charAt(i))) {
				System.out.print(input.charAt(i));
			}//Ư�����ڵ� ������ּ���.

			sc.close();// ��ĳ�� �ݱ�
		}
	}
}