package may25;

import java.util.Arrays;

//�迭 Array
/* index, length ---> String
 * ��ġ, ����
 * 
 * �ϴ�, �̰� �����. �迭�� ��ü��.
 * ��ü�� �⺻������ �Ӽ��� �޼ҵ带 ������ ����
 * �迭�� �����ϰ� �Ӽ��� ������ ����
 * 
 * �迭�� ����(����)�� Ÿ���� �����͸� �ϳ��� ���� ���·�
 * �����ϱ� ���� ���Ǵ� �ڷᱸ����
 * 
 * ��) int Ÿ���� ������ 100�� ���� �ʿ��ϴٸ� ������ ����µ�
 * ���� �ð��� �ɸ�. �̸� �����ϴ� ����� ����.
 * 
 * �̷� ������� �غ��ϰ��� ���Ǵ� ���� �迭.
 * 
 * �迭�� ��ü��� �߱� ������ ��ü�� �Ӽ��� �޼ҵ带 ����ؼ� �迭�� ����.
 * ������ �迭�� �����ϰ� �Ӽ��� ������ ����.
 * 
 * �Ӽ��� �迭�� ���̸� ��Ÿ���� length��.
 * ��ü�� �Ӽ��� �޼ҵ� ���� ȣ���� ���� .(��)�� �̿�.
 * 
 */
public class Array01 {

	public static void main(String[] args) {
		
		// �迭 ������ = ���� �����
		// ������Ÿ�� ������ = ��;
		/* int Ÿ���� �迭 = ���� �迭���� ����
		 * ���� = ������ �� �ִ� ��
		 */
		
		int[] arr01 = new int[10];//int Ÿ���� ���̰� 10�� �迭 ���� 
		double[] dArr01 = new double[5];//double Ÿ���� ���̰� 5�� �迭 ����
		//char Ÿ���� ���̰� 15�� �迭�� ������
		char[] cArr01 = new char[15];
		System.out.println(Arrays.toString(cArr01) + "       cArr01");
		
		//���� Ÿ��, ���� ����, �ּ� ȣ��
		//�迭 ������
		int[] arr02 = new int[5];//���̴� �����Ҷ��� �����
		//int arr02[] = new int[5]; ���� ����
		
		//�� ���� = index
		arr02[0] = 10;//index �� ȣ��, ���� �Ҷ��� ��
		//1 2 3 4 5 6 = ���� length
		//0 1 2 3 4 5 = ��ġ index -1
		//10
		
		//ȣ��
		System.out.println(arr02[0]);
		System.out.println(arr02[1]);
		System.out.println(arr02[2]);
		System.out.println(arr02[3]);
		System.out.println(arr02[4]);
		//System.out.println(arr02[5]);//index ������ ����
		
		//��ü �� ����ַ���?
		System.out.println(arr02); //[I@6ee52dcd �޸� �ּҰ�
		System.out.println(Arrays.toString(arr02));//[10, 0, 0, 0, 0]
		
		//���� [10, 11, 12, 13, 14]
		arr02[1] = 11; //index�� ����, ������ ����
		arr02[2] = 12;
		arr02[3] = 13;
		arr02[4] = 14;
		System.out.println(Arrays.toString(arr02));
		
		//�ش� �迭�� ����
		int length = arr02.length;
		System.out.println(arr02.length);//���̴� int
		
		//int[] arr03 = new int[arr02.length]
		
		//���� [101, 101, 102, 103, 104]
		for (int i = 0; i < 5; i++) {
			arr02[i] = 100 + i;
		}
		
		//���� [100, 102, 104, 106, 108]
				for (int i = 0; i < arr02.length; i++) {
					arr02[i] = 100 + 2*i;
				}
		System.out.println(Arrays.toString(arr02));
		
		//���̸� �𸣴� �迭 �� ������ index�� ���� �����ϰ� �ʹٸ�
		//index = ���� - 1
		arr01[(arr01.length) - 1] = 1000;
		System.out.println(Arrays.toString(arr01));
		
		
		//arr01�� 1���� 10���� ������
		System.out.println(arr01.length);//10�� ���� ����
		
		//����ٰ� for������ �ۼ�
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr01));

		//����
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = arr01.length - i;
		}
		System.out.println(Arrays.toString(arr01));
		
		
	}

}
