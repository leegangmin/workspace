package may20;

import java.util.Scanner;

//if
//�ڹ��� ���
/* ����̶�, ���α׷��� ����� �� Ư�� ����, �ݺ��� ���� �Ǵ�
 * ���߰� �ϱ� ���� �ʿ��� ����
 * 
 * ����� �ٽ� ���ǿ� ���� �б�Ǵ� ���ǹ���
 * Ư�� ������ �ݺ������� �����ϴ� �ݺ������� ���е˴ϴ�.
 * 
 * ���ǹ� if, switch
 * 
 * �����
 *  if(���ǽ�){
 *  	���ǽ��� ���϶� ������ ����;
 *  }
 *  
 *  =======================================
 *  
 *  if(���ǽ�){
 *  	���ǽ��� ���϶� ������ ����;
 *  } else {
 *  	���ǽ��� �����϶� ������ ����;
 *  }
 *  
 *  =======================================
 *  
 *  if(���ǽ�1){
 *  	���ǽ� 1�� ���϶� ������ ����;
 *  } else if(���ǽ�2) {
 *  	���ǽ� 1�� �����̰�, ���ǽ�2�� ���϶� ������ ����;
 *  } else {
 *  	�� �� ���ǽ� ��� �����϶� ������ ����;
 *  }
 *  
 *  
 *  
 */

public class If01 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ� ����");
		
		Scanner sc = new Scanner(System.in);
		boolean check;
		System.out.println("Y/N�� �����ּ���.");
		String input = sc.next();
		if(input.equals("Y")) {
			check = true;//���ǽ��� ���϶�
		} else {
			check = false;//���ǽ��� �����϶�
		}
		
		check = input.equals("Y") ? true : false;
		
		if(check) {//
			//���ǽ��� ���϶� ������ ����;
			System.out.println("���ǽ��� ���϶� ������ ����");
		}
		
		System.out.println("���� �޼ҵ� ��");
		
		
		int number = 5;
		
		if(number < 10) {
			System.out.println("�ѹ��� 10���� �۽��ϴ�.");
		} else {
			System.out.println("�ѹ��� 10���� Ů�ϴ�. ");
		}
		
		number = 6;
		
		if(number < 5) {
			System.out.println("�ѹ��� 5���� �۽��ϴ�.");
			
		} else if(number > 5 && number < 5) {
			System.out.println("�ѹ��� 5���� Ů�ϴ�.1");//1
			
		} else if(number > 5) {
			System.out.println("�ѹ��� 5���� Ů�ϴ�.2");//2
			
		} else {
			System.out.println("�� �� ���忡 �� �ɸ��� �ʾҾ��.");
			
		}
		//if - else ����
		// ������ ��. �� ������ if�� �������ּ���.
		// ���ǽ��� ���̶� �����ϰ� �Ǹ� �������� ������ �������ɴϴ�.
	}
	
	
	
	
	
	
	
	
	
	
}
