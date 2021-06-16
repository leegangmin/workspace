package exception;

public class Exception03 {
	public static void main(String[] args) {
		
		try {
			try {
				int[] ia = new int[5];
				ia[5] = 100;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 길이 밖입니다.");
			}

			System.out.println(10 / 0);
			
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누려고 합니다.");
		} finally {
			System.out.println("여기까지.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
