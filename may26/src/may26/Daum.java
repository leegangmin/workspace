package may26;
/* Ǯ���ּ��� 
 1������ ������ �־����� ��, 
 �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�.
 (�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)
������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, 
������� (3, 4)�� �� ���̴�.
 */
public class Daum {
	public static void main(String[] args) {
		
		int[] daum = {1, 3, 4, 8, 13, 17, 20};
		//�� �Ÿ����̸� ������ ����
		
		int count = daum[1] - daum[0];
		//ª�� �Ÿ��� ù��° ��, �ι�° �� ������ ����
		int fir = daum[0], sec = daum[1];
		
		for (int i = 0; i < daum.length - 1; i++) {
			if(count > daum[i + 1] - daum[i]) {
				fir = daum[i];
				sec = daum[i + 1];
				count = daum[i + 1] - daum[i];//?�̰� �ʿ��ҵ� �մϴ�.
			}
		}
		//�� ��� ���� �ٸ� ����� ���ƿ�.
		System.out.println(fir + ", " + sec);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
