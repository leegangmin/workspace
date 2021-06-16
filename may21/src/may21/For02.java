package may21;

//fizz buzz
/* 1 부터 25 사이의 숫자를 프린트하는 프로그램을 작성하는데
 * 3의 배수이면 "Fizz"를
 * 5의 배수이면 "Buzz'를
 * 둘 모두의 배수 즉 15의 배수이면 "FizzBuzz"를 프린트해라.
 * 
 */
public class For02 {

	public static void main(String[] args) {
		// 1~25까지 증가하는 for문
		// if문 작성해주세요.
		
		for (int i = 1; i <= 25; i++) {
			if(i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}

	}

}
