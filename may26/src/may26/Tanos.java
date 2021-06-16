package may26;

import java.util.Arrays;

/*
타노스는 프로그램의 균형을 위해서는 리스트의 원소 절반을 무작위로 
삭제해야 한다고 믿고 있다.
타노스가 손가락을 튕겼을 때(프로그램을 실행했을 때) 
입력된 리스트에서 절반의 원소를 무작위로 삭제하여 리턴하는 
인피니티 건틀렛 프로그램을 작성하시오.
(무작위 삭제이므로 입력값이 같아도 출력값이 매번 달라야 합니다)
입력 예시          [2, 3, 1, 6, 5, 7]
출력 예시 1        [2, 5, 7]
출력 예시 2        [3, 6, 5]
참고: 리스트의 원소가 홀수개일 경우 절반의 확률로 절반보다 
많은 원소가 삭제되거나 절반보다 적은 원소가 삭제되어야 합니다.
(만약 리스트의 원소가 7개라면 절반의 확률로 3개 또는 4개의 원소가 삭제됨)
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
