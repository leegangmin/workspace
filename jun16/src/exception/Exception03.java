package exception;

public class Exception03 {
	public static void main(String[] args) {
		
		try {
			try {
				int[] ia = new int[5];
				ia[5] = 100;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭 ���� ���Դϴ�.");
			}

			System.out.println(10 / 0);
			
			
		} catch (ArithmeticException e) {
			System.out.println("0���� �������� �մϴ�.");
		} finally {
			System.out.println("�������.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
