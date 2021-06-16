package may28;

/*
 문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 
 그 반복 횟수를 표시하여 문자열을 압축하기.

입력 예시: aaabbcccccca

출력 예시: a3b2c6a1
 */
public class RunLength {
	public static void main(String[] args) {
		
		String zip = "aaabbcccccca";
		//배열에 넣으셔도 됩니다.
		
		//for문에서 한글자씩 검사
		String result = "";
		
		char checkChar = zip.charAt(0);//무조건 첫번째 글자로
		
		int number = 1;
		for (int i = 0; i < zip.length() - 1; i++) {
			if(checkChar != zip.charAt(i + 1)) {
				result += String.valueOf(checkChar) + number;
				checkChar = zip.charAt(i + 1);
				number = 1;
			} else {
				number++;
			}
			if(i + 1 == zip.length() - 1) {//왜 안 될까...
				result += String.valueOf(checkChar) + number;
				checkChar = zip.charAt(i + 1);
			}
		}
		System.out.println(result);//문제는 마지막 글자가;;;;
		//신호 확인하고 배열로 바꿔볼께욤.
		
		
	}
}
