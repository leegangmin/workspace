package may20;

import java.util.Scanner;

//������� ���ڸ� �޾Ƽ�
//0 ~ 9
//���ڰ� 5���� ū�� ������ ǥ���ϱ�
//��������?
public class If02 {
	public static void main(String[] args) {
		//����ڰ� ���� �Է��ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 9 �� ���� �ϳ��� �Է����ּ���.");
		//������ �ޱ�
		int input = sc.nextInt();
		//if�� �����
		
		if(input > 5) {
			System.out.println("5���� Ů�ϴ�.");
		} else {
			System.out.println("5���� �۽��ϴ�.");			
		}
		
		
		
		
		
	}
}