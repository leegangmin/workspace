package may28;
/*
 ���ڿ��� �Է¹޾Ƽ�, ���� ���ڰ� ���������� �ݺ��Ǵ� ��쿡 
 �� �ݺ� Ƚ���� ǥ���Ͽ� ���ڿ��� �����ϱ�.

�Է� ����: aaabbcccccca

��� ����: a3b2c6a1
 */
public class RunLength02 {
	public static void main(String[] args) {
			
		String zip = "aaabbcccccca";
		//�迭�� �־�ڽ��ϴ�.
		char[] zipArray = zip.toCharArray();
		
		String result = String.valueOf(zipArray[0]);
		int number = 1;
		//						aaabbcccccca
		for (int i = 0; i < zipArray.length - 1; i++) {
			if(zipArray[i] == zipArray[i + 1]) {
				number++;
			} else {
				result += String.valueOf(number);
				result += String.valueOf(zipArray[i + 1]);
				number = 1;
			}
			if(zipArray.length - 2 == i) {				
				result += number;
			}
		}		
		//result += number;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}
}
