package may20;

import java.util.Scanner;

//������
/* �ڹ��� ������
 * ��� ���α׷��ֿ����� �����͸� �����ϱ� ���ؼ� �����ڸ� ����մϴ�.
 * ���� ���� �����ڴ� �ڹٻӸ� �ƴ϶� ��� ���� ����ϰ�
 * ���˴ϴ�. �� ������ּ���.
 * 
 * �����ؼ� ���ž� �� ���� �������� ��ɰ� �����Դϴ�. 
 * �������� ������ ���� ������ ��� �ܿ�� ���ٴ�
 * ���� ����Ͻø鼭 �ͼ������ô� ���� ��õ�帳�ϴ�.(å�� ���ּ���)
 * 
 * �Ʒ� �����Ǿ� �ִ� �������� ������ �� ������� ������ ���Դϴ�.
 * 
 * 1. �ֿ켱 ������
 * 		. ��, dot 	Ŭ���� �Ǵ� ��ü ������ ����, �޼ҵ� ����
 * 					ȣ���ϴ� ������(�߿�))
 * 		[] �迭		
 * 		() 
 * 
 * 2. ����
 * 		! �� ����
 * 		~ ��Ʈ ����
 * 		+/- ��ȣ ����
 * 		++/-- ���� ����(�߿�)
 * 
 * 3. ���
 * 		+, -, /, *, %(��ⷯ : ���� �� ������ ���� �������ϴ�)
 * 
 * 4. ����Ʈ
 * 		<<, >>, >>>
 * 
 * 5. ����
 * 		<, >, <=, >=, ==, !=
 * 
 * 6. ��Ʈ
 * 		&, |, ^
 * 
 * 7. ��
 * 		&&(AND), ||(OR)
 * 
 * 8. ���׿���
 * 		���ǽ� ? ������ ���϶� �� : ������ �����϶� ��
 * 
 * 9. ��������
 * 		=, /=, +=, -=, *=, .....���ƿ�. 
 * 
 * 10. ��������
 * 		++/--(�߿�)
 * 
 * �߰�->
 * 1. ����, ����, ���� ������ ������ �켱 ������ ������.
 * 2. ���, ��, ��, ���� ������ ������ �켱 ������ ������.
 * 3. ���װ� ���Կ����ڸ� ������ ��� �������� ������ ���ʿ��� ������.
 * 4. ������ ����Ŀ��� ��ȣ()�� ����ؼ� �켱������ �����ش�.
 * 		å 68p
 * 
 */
public class Operator {
	public static void main(String[] args) {
		int num01 = 1;
		int num02 = ++num01;//2
		int num03 = --num01 + ++num02;
		int num04 = ++num01 - --num02; 
		
		
		num01 = 0; num02 = 0; num03 = 0; num04 = 0;
		num02 = num01++;
		num03 = num02++ + num01;
		num04 = num03-- + num02++ + ++num01;
		
		System.out.println(num01);//1
		System.out.println(num02);//1
		System.out.println(num03);//1
		System.out.println(num04);//0
/* ++		�ǿ�����	: �ٸ� ������ �����ϱ� ���� �ǿ������� ���� +1
*  --		�ǿ�����	: �ٸ� ������ �����ϱ� ���� �ǿ������� ���� -1
*  �ǿ�����	++			: �ٸ� ������ ������ �Ŀ� +1
*  �ǿ�����	--			: �ٸ� ������ ������ �Ŀ� -1
*/
		
		//������ !
		boolean check = true;
		System.out.println(check);
		
		//check = "String".equals("string");
		check = !check;
		System.out.println(check);
		//���̸� ��������
		//�����̸� ������
		
		
		check = 4 < 1;
		System.out.println(check);
		
		//01010101011101010101
		//10101010100010101010
		
		int bitNum01 = ~10;
		System.out.println(bitNum01);//-1
		System.out.println(Integer.toBinaryString(bitNum01));//1
		//11111111111111111111111111110101
		//11111111111111111111111111111111
		/*  1    1
		 *  2    10
		 *  3    11
		 *  4    100
		 *  5    101
		 *  6    110
		 *  7    111
		 *  8    1000
		 *  9    1001
		 *  10   1010
		 */
		
		//��ⷯ : ���� �� ������ ���� �������ϴ�.
		System.out.println(2 / 2); //1
		System.out.println(2 % 2); //0
		System.out.println(10 % 7); //3
		System.out.println(11 % 7); //4
		System.out.println(12 % 7); //5
		System.out.println(13 % 7); //6
		System.out.println(14 % 7); //0
		System.out.println(15 % 7); //1
		System.out.println(16 % 7); //2
		//����ڰ� �Է��� �� �޾Ƽ� �����غ���
		//������Ÿ�� ������ = ��;
		
		int 	code = 0;
		Scanner sc   = new Scanner(System.in);//?
		System.out.print("���� �ڵ带 �Է��ϼ���. _");
		code = sc.nextInt();
		
		System.out.println("����� �Է��� �ڵ�� " + code + "�Դϴ�.");
		
		if(code % 2 == 0){//0�϶� 
			System.out.println("����� �����Դϴ�.");
		} else {//0�� �ƴҶ�
			System.out.println("����� ���� �Դϴ�.");
		}
		System.out.println("��");
		
		/////////////////////////////////////
		num01 = 0;
		num02 = 0;
		num03 = 0;
		
		++num01;
		System.out.println(num01);//1
		
		num02 = ++num01 + 2;
			//9  2      3
		System.out.println(num01);//2
		System.out.println(num02);//4
		
		num03 = num01-- - num02;
		//	  9      10 3
		
		System.out.println(num01);//1
		System.out.println(num02);//4
		System.out.println(num03);//-2
		
		// + ���� ������
		// ���� + ���� = ���   1 + 2 = 3
		// ���� + ���� = ����	�� + 2 = ��2
		// ���� + ���� = ����	2 + �� = 2��
		// ���� + ���� = ����	�� + �� = ����
		// ���� + ���� + ���� = �տ� ��� �ڴ� ����
		//  	1 + 2 + ������ = 3������
		
		// ���� + ���� + ���� = ���� + ���� + ����
		//		������ + 1 + 2 = ������12
		
		// 1 + 2 + 2 + 5 + 100 + ���� = 
		
		//������ + (1 + 2) = ������3
		
		//(1 + 5) + ������ =
		
		//10�� ��Ʈ�� Ȯ���غ��ڽ��ϴ�. >>2�� �غ��ڽ��ϴ�.
		//10 -> 1010
		System.out.println(10);
		System.out.println(Integer.toBinaryString(10));//1010
		System.out.println(Integer.toBinaryString(10 >> 2));//1
		System.out.println(Integer.toBinaryString(10 << 3));//1010000
		
		System.out.println(-10);
		System.out.println(Integer.toBinaryString(-10));
		//1111 1111 1111 1111 1111 1111 1111 0110
		System.out.println(Integer.toBinaryString(-10 >> 2));
		//11111111111111111111111111111101
		System.out.println(Integer.toBinaryString(-10 << 3));
		//11111111111111111111111110110000
		
	
		//���迬���� �񱳿����� = ��� ���� boolean type
		//1�� 2�� ���ƿ� = ����
		
		boolean check02 = true;
		boolean check03 = !check02;
		
		System.out.println(1 != 2);//��
		System.out.println(1 > 2);//����
		System.out.println(1 < 2);//��
		System.out.println(     (1 < 2) == false     );//����
		
		int num05 = 5;
		System.out.println(       num05 > 1 && num05 < 10      );
		//&& ���� �� ���̾�� ��
		//|| ��� ������ ���̸� ��
		System.out.println(       num05 > 1 && num05 > 10      );
		
		System.out.println(       num05 > 1 || num05 > 10      );
		
		System.out.println(  (check == true) && (check02 == false)       );
	
		System.out.println(  ('B' == 65) || (3 == 3.0)  );
		
		double temp = 3 + 3.0; //���� ū Ÿ�Կ� �������ϴ�.
		
		
		//���׿�����
		// ���ǽ� ? ���ǽ��� ���϶� : ���ǽ��� �����϶�;
		
		
		temp = 1 > 2 ? 100 : 55;
		System.out.println(temp);
		
		if( 1 > 2 ) {//���ǽ��� ���϶� 
			temp = 100;//������ ����
		} else {
			temp = 55;//���ǽ��� �����϶� ������ ����
		}
		
		System.out.println(temp);
		
		
		//��������
		// =, 
		
		//+= -> +1 
		num01 = 1;
		num01 += num01;
		System.out.println(num01);//2
		
		num01 = 1;
		num01 -= num01;
		System.out.println(num01);//0
		
		num01 = 2;
		num01 *= 2;
		System.out.println(num01);//
		
		num01 /= 2;
		System.out.println(num01);//
		
		num01 %= 2;
		System.out.println(num01);//
		//å 99����������. 35�п�
		
		
		
		
		
		
		
		
		
	}

}
