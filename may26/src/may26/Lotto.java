package may26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//로또
//1~45 -> 6개, 중복 불가.

public class Lotto {
	public static void main(String[] args) {
		// 랜덤
		// int 배열에 넣어주세요.
		int[] lotto = new int[6];
		// 단, 중복이면 다시 뽑아주세요.
		// for, if
		for (int i = 0; i < lotto.length; i++) {//돌면서
			lotto[i] = (int) (Math.random() * 45 + 1);//입력
			for (int j = 0; j < i; j++) {//검사
				if (lotto[i] == lotto[j]) {//같다면
					i--;//다시 돌리기
					break;//탈출
				}
			}//내부 for
		}//외부 for
		
		//정렬은?
		System.out.println("뽑은 로또 번호는");
		System.out.println(Arrays.toString(lotto));
		
		//컬랙션 List, Set, Map
		Set<Integer> lotto2 = new HashSet<Integer>(); 
		//중복을 제거해주는 Set을 이용했습니다.
		
		while (lotto2.size() < 6) { //size()는 크기 = 6보다 작다면 
			lotto2.add(   (int)(Math.random() * 45 + 1)     );
			//add는 set에 값을 집어넣을 때 사용합니다.
		}
		
		System.out.println(lotto2);
		
		
		
		
		
		
		
		
		
	}
}
