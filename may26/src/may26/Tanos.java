package may26;

import java.util.Arrays;

/*
Ÿ�뽺�� ���α׷��� ������ ���ؼ��� ����Ʈ�� ���� ������ �������� 
�����ؾ� �Ѵٰ� �ϰ� �ִ�.
Ÿ�뽺�� �հ����� ƨ���� ��(���α׷��� �������� ��) 
�Էµ� ����Ʈ���� ������ ���Ҹ� �������� �����Ͽ� �����ϴ� 
���Ǵ�Ƽ ��Ʋ�� ���α׷��� �ۼ��Ͻÿ�.
(������ �����̹Ƿ� �Է°��� ���Ƶ� ��°��� �Ź� �޶�� �մϴ�)
�Է� ����          [2, 3, 1, 6, 5, 7]
��� ���� 1        [2, 5, 7]
��� ���� 2        [3, 6, 5]
����: ����Ʈ�� ���Ұ� Ȧ������ ��� ������ Ȯ���� ���ݺ��� 
���� ���Ұ� �����ǰų� ���ݺ��� ���� ���Ұ� �����Ǿ�� �մϴ�.
(���� ����Ʈ�� ���Ұ� 7����� ������ Ȯ���� 3�� �Ǵ� 4���� ���Ұ� ������)
 */
public class Tanos {
	public static void main(String[] args) {
		int[] people = {2, 3, 1, 6, 5, 7, 10};
		//int[] half = new int[people.length/2];
		int half = (int)(people.length / 2 + (Math.random() * 2));
		for (int i = 0; i < half; i++) {
			int r = (int) (Math.random() * people.length);
//			if(people[r] != 0) {
//				half[i] = people[r];
//				people[r] = 0;//
//			}else {
//				i--;				
//			}
			if(people[r] != 0) {
				people[r] = 0;//
			} else {
				i--;
			}
		}
		//System.out.println(Arrays.toString(half));
		System.out.println(Arrays.toString(people));
		
		
		
		
		
		
		
		
		
		
	}
}
