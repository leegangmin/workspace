package may21;
// ���ݱ��� ��� ��

/* 4����
 * �ڹ� ��ġ OracleJDK, OpenJDK
 * JDK = Java Development Kit
 * JRE = Java Runtime Environment (���� JVM = Java Vitual Machine)
 * 
 * ���� = ���α׷� ���� �� ���� ���ؾ� �ϴ� ���� ��Ƶ�.
 * ��� = final int INT_NUMBER = 100; // ������ ����.
 * 
 * ǥ���
 * 
 * 		�ڹٿ��� ��밡���� ���ڴ�? ���� ��ҹ���, ����, _, $
 * 
 * 		�Ľ�Į = ù���� �빮��, Ŭ������ ���, �� �ܾ� ���ս� �ڿ� ���� �ܾ� ù���� �빮�� ex) HelloKorea
 * 		ī�� = ù���� �ҹ���, �޼ҵ�, ������ ���, �� �ܾ� ���ս� �ڿ� ���� �ܾ� ù���� �빮�� ex) helloKorea
 * 		������ũ = ����� ���, ��� �빮��, �ܾ� ���̴� ����� ex) HELLO_KOREA
 * 
 * ������ Ÿ��
 * Primitive
 * 	����, ���� : byte(1), short(2), int(4)(�⺻), long(8)
 *  ����, �Ǽ� : float(4), double(8)(�⺻)
 *  ���� : char
 *  �� : boolean
 * 
 * Reference : �⺻ Ÿ���� ������ ��� Ÿ��, ���ݵ� ��������� ����.
 * 	���ڿ� : String
 * 
 * ������ Ÿ�Ժ�ȯ
 * 		���� Ÿ���� ū Ÿ�Կ� �� �� = ���θ��
 * 		ū Ÿ���� ���� Ÿ�Կ� �� �� = ĳ��Ʈ
 * 			ĳ������ ���� = ���� ����� �� ���� (����, �����̶�� ǥ����)
 * 			���� = (����Ÿ��) ������
 * 			<-------------- ������ �帧
 * 
 * ������ ������ = ���� �� ��.
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {

		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
	//	if (���ǽ�) {//���ǽ��� ��/����
	//		���ǽ��� ���϶� ������ ��ɹ�;
	//	} else if (�ٸ� ���ǽ�) {
	//		�ٸ� ���ǽ��� ���϶� ������ ��ɹ�;
	//	} else if (�� �ٸ� ���ǽ�){
	//		�� �ٸ� ���ǽ��� ���϶� ������ ��ɹ�;
	//	}
		
		
		

		if (input % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}

		sc.close();// �Է� ������ ��ĳ�ʸ� �ݱ�

	}

}
