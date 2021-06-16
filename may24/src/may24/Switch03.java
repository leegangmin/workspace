package may24;
//성별코드를 입력받고 몇년도에 태어난 성별이 무엇인지 출력해보기

import java.util.Scanner;

public class Switch03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 중 성별 코드 입력_");
		
		int year = 0, code;//년도, 성별코드
		String sex; //성별을 저장
		code = sc.nextInt();
		
		switch (code) {
		case 1:
		case 2:
			year = 1900;
			break;
			
		case 3:
		case 4:
			year = 2000;
			break;

		default:
			System.out.println("잘못 입력했습니다.");
			//break;
			System.exit(0);//프로그램 종료
		}
		
		sex = code % 2 == 0 ? "여성" : "남성";
		//    조건식        ?     참 : 거짓;
		
		System.out.println("당신은 " + year + "년도에 태어난 ");
		System.out.println(sex + "입니다.");
		
		
		//if문하고 같아요.
		//key의 값이 일치한 case만 실행하고 나가요
		//break꼭 있어야 해요.
		//범위를 지정할 수 없어요.
		//값을 보여주니까 개발하기 편해요
		//char, String 가능합니다.
		//실수, long 안 되요
	}
}
