package may26;
//배열 Array : 같은 데이터 타입의 변수들을 하나로 묶어서 관리 

import java.util.Arrays;

public class Array04 {
	public static void main(String[] args) {
		
		int[] arr01 = null;//객체 기본타입
		arr01 = new int[5];//속에는 0
					//  길이 = 생성할때만 길이
		
		// [112, 0, 0, 0, 150]
		//값대입 = index = 컴퓨터는 0부터 시작
		arr01[0] = 112;
		arr01[arr01.length - 1] = 150;
		
		//출력 Arrays, for, foreach
		System.out.println(arr01); //배열을 그대로 출력한다면? ***이 찍힙니다.
		// [I@5ccd43c2
		
		System.out.println(Arrays.toString(arr01));
		//String   java.util.Arrays.toString(int[] a)
		//반환타입 경로     클래스명   메소드명(파라미터)
		
		
		//[112, 0, 0, 0, 150]
		
		String str = Arrays.toString(arr01);
		System.out.println(str);
		
		int[] arr02 = new int[] {112, 113, 114, 115, 116};
		//length?
		//last index?
		
		int[] arr03 = {122, 123, 124, 125, 126};
		
		//문제 arr02번의 값을 arr01에 복사?
		
//		arr01[0] = arr02[0];
//		arr01[1] = arr02[1];
//		arr01[2] = arr02[2];
//		arr01[3] = arr02[3];
//		arr01[4] = arr02[4];//이 모양을 반복문으로 만들어주세요
		
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = arr02[i];
		}
		
		//arr01 = arr02;//이거 말고요 ;;;;
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		String name = "홍길동";//문자열, R, 객체 
		//String name2 = new String("홍길동");
		System.out.println(name.length());//3
		
		String addr = "서울시 관악구 신림 1222";
		System.out.println(addr.length());//15?
		
		System.out.println(name.charAt(0));//?
		//char java.lang.String.charAt(int index)
		
		char name01 = name.charAt(0);
		System.out.println(name01);
		
		char addr09 = addr.charAt(4);//해당 index의 한 글자만 가져옵니다.
		System.out.println(addr09);
		
		
		String apple = "apple";
		System.out.println(apple.charAt(3));//l뽑았을때
		System.out.println(Character.toUpperCase(apple.charAt(3)));//대문자
		
		//string array?
		char[] appleArray = new char[apple.length()];
		
		for (int i = 0; i < apple.length(); i++) {			
			appleArray[i] = apple.charAt(i);
		}
		
		System.out.println(Arrays.toString(appleArray));
		
		appleArray = apple.toCharArray();
		
		
		
		
		
	}
}
