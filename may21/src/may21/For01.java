package may21;

//�ݺ���
/* �ڹٿ����� �ʿ信 ���� Ư�� ������ �ݺ������� �����ؾ� �� ���� �ִ�.
 * �� �� ���Ǵ� ������ �ݺ��� Loop���̴�.
 * �ڹٿ����� ������ ������ �ݺ����� �����Ѵ�.
 * 
 * for(forEach), while, do~while
 * 
 * for(���� �ʱ�ȭ; ���� ���ǹ�; ���� ������){
 * 		���� ���ǹ��� ���϶� ������ ����;
 * }
 */

public class For01 {

	public static void main(String[] args) {

		// for (int i = 0; i < 10; i++) {

		// System.out.println("�ȳ��ϼ���.");
		// }
		// 1���� 10���� ���ϸ�? 55
		int result = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		System.out.println("�� ���� " + result);

	}
}
