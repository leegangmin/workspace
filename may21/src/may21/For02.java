package may21;

//fizz buzz
/* 1 ���� 25 ������ ���ڸ� ����Ʈ�ϴ� ���α׷��� �ۼ��ϴµ�
 * 3�� ����̸� "Fizz"��
 * 5�� ����̸� "Buzz'��
 * �� ����� ��� �� 15�� ����̸� "FizzBuzz"�� ����Ʈ�ض�.
 * 
 */
public class For02 {

	public static void main(String[] args) {
		// 1~25���� �����ϴ� for��
		// if�� �ۼ����ּ���.
		
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
