package may21;

//반복문
/* 자바에서는 필요에 따라서 특정 문장을 반복적으로 실행해야 할 때가 있다.
 * 이 때 사용되는 구문이 반복문 Loop문이다.
 * 자바에서는 세가지 형태의 반복문을 제공한다.
 * 
 * for(forEach), while, do~while
 * 
 * for(변수 초기화; 변수 조건문; 변수 증감식){
 * 		변수 조건문이 참일때 실행할 문장;
 * }
 */

public class For01 {

	public static void main(String[] args) {

		// for (int i = 0; i < 10; i++) {

		// System.out.println("안녕하세요.");
		// }
		// 1부터 10까지 더하면? 55
		int result = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		System.out.println("총 합은 " + result);

	}
}
