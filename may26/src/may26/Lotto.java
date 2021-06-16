package may26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//�ζ�
//1~45 -> 6��, �ߺ� �Ұ�.

public class Lotto {
	public static void main(String[] args) {
		// ����
		// int �迭�� �־��ּ���.
		int[] lotto = new int[6];
		// ��, �ߺ��̸� �ٽ� �̾��ּ���.
		// for, if
		for (int i = 0; i < lotto.length; i++) {//���鼭
			lotto[i] = (int) (Math.random() * 45 + 1);//�Է�
			for (int j = 0; j < i; j++) {//�˻�
				if (lotto[i] == lotto[j]) {//���ٸ�
					i--;//�ٽ� ������
					break;//Ż��
				}
			}//���� for
		}//�ܺ� for
		
		//������?
		System.out.println("���� �ζ� ��ȣ��");
		System.out.println(Arrays.toString(lotto));
		
		//�÷��� List, Set, Map
		Set<Integer> lotto2 = new HashSet<Integer>(); 
		//�ߺ��� �������ִ� Set�� �̿��߽��ϴ�.
		
		while (lotto2.size() < 6) { //size()�� ũ�� = 6���� �۴ٸ� 
			lotto2.add(   (int)(Math.random() * 45 + 1)     );
			//add�� set�� ���� ������� �� ����մϴ�.
		}
		
		System.out.println(lotto2);
		
		
		
		
		
		
		
		
		
	}
}
