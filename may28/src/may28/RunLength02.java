package may28;
/*
 문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 
 그 반복 횟수를 표시하여 문자열을 압축하기.

입력 예시: aaabbcccccca

출력 예시: a3b2c6a1
 */
public class RunLength02 {
	public static void main(String[] args) {
			
		String zip = "aaabbcccccca";
		//배열에 넣어보겠습니다.
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
