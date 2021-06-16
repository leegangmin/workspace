package may28;

//import정리 : ctrl + shift + o


/*
codingDojang --> coding_dojang

numGoat30 --> num_goat_3_0

위 보기와 같이 CameleCase를 Pothole_case 로 바꾸는 함수를 만들어요!

출처: UT past test
 */
public class Camel2Pothole {
	public static void main(String[] args) {
		
		char ch1 = 'c';
		char ch2 = 'C';
		char ch3 = '1'; //캐릭터 홀따옴표, 한글자
		
		String str = "Hello";//문자열 쌍따옴표, 한글자, 그 이상
		
		System.out.println(Character.isUpperCase(ch1)); //false
		System.out.println(Character.isLowerCase(ch1)); //true
		
		System.out.println(Character.isUpperCase(ch2));//참
		System.out.println(Character.isLowerCase(ch2));//거짓
		
		System.out.println(Character.isUpperCase(ch3)); //거짓
		System.out.println(Character.isLowerCase(ch3)); //거짓
		
		System.out.println(Character.isDigit(ch1)); //false
		System.out.println(Character.isDigit(ch2)); //false
		System.out.println(Character.isDigit(ch3)); //true
		
		//문자열 캐릭터 형태로 한글자씩 잘라내기
		//Hello
		//str = "12345";
		char ch4 = str.charAt( 0 ); //H
		
		System.out.println(Character.isUpperCase(ch4));
		System.out.println(Character.isUpperCase(str.charAt( 0 )));
		System.out.println(Character.isUpperCase(str.charAt( 1 )));
		System.out.println(Character.isUpperCase(str.charAt( 2 )));
		System.out.println(Character.isUpperCase(str.charAt( 3 )));
		System.out.println(Character.isUpperCase(str.charAt( 4 )));
		
		//대소문자 변환
		System.out.println(ch1);//소문자
		System.out.println(Character.toUpperCase(ch1));//C
		
		System.out.println(ch2);//대문자
		System.out.println(Character.toLowerCase(ch2)); //c
		
		
		/////////////////////////////////////////////
		
		//먼저 문자열을 for문으로 
		//한글자씩 비교하기 if 이거 대문자인지 물어보기
		//만약 대문자이면 -> _붙이고 소문자로 변경해서 출력하기
		//만약 소문자라면 그대로 출력하기
		
		//for
			//if 대문자임?
				// 언더바 + 소문자로 변경
				// 그냥 출력
		
		
		String word = "codingDojang";
		
		//0~마지막 번지까지 돌면서 대문자인지 물어보기
		for (int i = 0; i < word.length(); i++) {
			//대문자?
			if(Character.isUpperCase(word.charAt(i))) {
				System.out.print("_" + Character.toLowerCase(word.charAt(i)));
			//소문자
			} else {
				System.out.print(word.charAt(i));
			}
		}
		//String에 넣어서 나중에 출력하게 해주셔도 됩니다.
		//coding_dojang
		
		System.out.println("===============호출해서 사용하기=============");
		
		//호출 = 다른 메소드 일 시키기
		//메소드이름(파라미터);
		String str2 = camel2pothole("codingKorea");
		System.out.println(str2);
		
		System.out.println(camel2pothole("hello3World"));//hello_3_world
		System.out.println(camel2pothole(""));
		// 파라미터 타입이 맞아야 됩니다.
		
		
		
		
		//가나다Hello2!_134 ----> Hello2_134
		
	}//main메소드 끝
	//전체공개 객체안만듬 반환타입  이름         (파라미터){
	public       static    String   camel2pothole(String camel) {
		String result = "";
		for (int i = 0; i < camel.length(); i++) {
			if(Character.isUpperCase(camel.charAt(i))) {
				result += "_" + Character.toLowerCase(camel.charAt(i));
			//숫자일때는 여기로 들어오게 해주세요.
			} else if(Character.isDigit(camel.charAt(i))) {
				result += "_" + camel.charAt(i);
			} else {
				result += camel.charAt(i);
			}
		}
		return result;//임시로 이렇게
	}
	
}//클래스 끝