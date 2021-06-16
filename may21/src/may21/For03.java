package may21;

public class For03 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1) { //3%5=3(나누는 값이 나눠지는 값보다 크면 그대로 반환)
				continue;

			}
			System.out.println("2 X " + i + " = " + (2 * i));
			// System.out.printf("2 X %d = %d\n", i, 2 * i);
			
		}
		// continue = 이하 실행구문은 무시하고 다시 반복문으로 돌림
		// break = 가장 가까운 조건문을 탈피
	}

}
