package may26;
//�迭 Array : ���� ������ Ÿ���� �������� �ϳ��� ��� ���� 

import java.util.Arrays;

public class Array04 {
	public static void main(String[] args) {
		
		int[] arr01 = null;//��ü �⺻Ÿ��
		arr01 = new int[5];//�ӿ��� 0
					//  ���� = �����Ҷ��� ����
		
		// [112, 0, 0, 0, 150]
		//������ = index = ��ǻ�ʹ� 0���� ����
		arr01[0] = 112;
		arr01[arr01.length - 1] = 150;
		
		//��� Arrays, for, foreach
		System.out.println(arr01); //�迭�� �״�� ����Ѵٸ�? ***�� �����ϴ�.
		// [I@5ccd43c2
		
		System.out.println(Arrays.toString(arr01));
		//String   java.util.Arrays.toString(int[] a)
		//��ȯŸ�� ���     Ŭ������   �޼ҵ��(�Ķ����)
		
		
		//[112, 0, 0, 0, 150]
		
		String str = Arrays.toString(arr01);
		System.out.println(str);
		
		int[] arr02 = new int[] {112, 113, 114, 115, 116};
		//length?
		//last index?
		
		int[] arr03 = {122, 123, 124, 125, 126};
		
		//���� arr02���� ���� arr01�� ����?
		
//		arr01[0] = arr02[0];
//		arr01[1] = arr02[1];
//		arr01[2] = arr02[2];
//		arr01[3] = arr02[3];
//		arr01[4] = arr02[4];//�� ����� �ݺ������� ������ּ���
		
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = arr02[i];
		}
		
		//arr01 = arr02;//�̰� ����� ;;;;
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		String name = "ȫ�浿";//���ڿ�, R, ��ü 
		//String name2 = new String("ȫ�浿");
		System.out.println(name.length());//3
		
		String addr = "����� ���Ǳ� �Ÿ� 1222";
		System.out.println(addr.length());//15?
		
		System.out.println(name.charAt(0));//?
		//char java.lang.String.charAt(int index)
		
		char name01 = name.charAt(0);
		System.out.println(name01);
		
		char addr09 = addr.charAt(4);//�ش� index�� �� ���ڸ� �����ɴϴ�.
		System.out.println(addr09);
		
		
		String apple = "apple";
		System.out.println(apple.charAt(3));//l�̾�����
		System.out.println(Character.toUpperCase(apple.charAt(3)));//�빮��
		
		//string array?
		char[] appleArray = new char[apple.length()];
		
		for (int i = 0; i < apple.length(); i++) {			
			appleArray[i] = apple.charAt(i);
		}
		
		System.out.println(Arrays.toString(appleArray));
		
		appleArray = apple.toCharArray();
		
		
		
		
		
	}
}
