package may28;

/*
 ���ڿ��� �Է¹޾Ƽ�, ���� ���ڰ� ���������� �ݺ��Ǵ� ��쿡 
 �� �ݺ� Ƚ���� ǥ���Ͽ� ���ڿ��� �����ϱ�.

�Է� ����: aaabbcccccca

��� ����: a3b2c6a1
 */
public class RunLength {
	public static void main(String[] args) {
		
		String zip = "aaabbcccccca";
		//�迭�� �����ŵ� �˴ϴ�.
		
		//for������ �ѱ��ھ� �˻�
		String result = "";
		
		char checkChar = zip.charAt(0);//������ ù��° ���ڷ�
		
		int number = 1;
		for (int i = 0; i < zip.length() - 1; i++) {
			if(checkChar != zip.charAt(i + 1)) {
				result += String.valueOf(checkChar) + number;
				checkChar = zip.charAt(i + 1);
				number = 1;
			} else {
				number++;
			}
			if(i + 1 == zip.length() - 1) {//�� �� �ɱ�...
				result += String.valueOf(checkChar) + number;
				checkChar = zip.charAt(i + 1);
			}
		}
		System.out.println(result);//������ ������ ���ڰ�;;;;
		//��ȣ Ȯ���ϰ� �迭�� �ٲ㺼����.
		
		
	}
}
