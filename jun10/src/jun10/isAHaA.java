package jun10;
//is a, Has a
/*
 * is a ~는 ~이다.
 * 
 * has a ~는 ~을 갖고 있다.
 * 
 * 메모리
 * enum
 * 랩퍼클래스
 * 컬렉션******
 * 익셉션
 * (db)
 * 내장클래스
 * 입출력
 * 스레드
 * 가비지컬렉션
 * 네트워크
 * 그래픽
 * 
 */
class Human{
	String name;
	int age;
	
}

class Student extends Human{
	int number;
}

class Gun{
	String number;
	int count;
}

class Police{
	String name;
	int polNumber;
	Gun gun;//멤버변수로 객체를 가짐.
	//경찰은 총을 가진다의 구조로 경찰 클래스 안에 권총 클래스의
	//객체를 멤버로 가지는 구조
}


public class isAHaA {

	public static void main(String[] args) {
		
		Student student = new Student();
	
		Police police = new Police();
		
		System.out.println(police.gun);
		
		Gun gun = new Gun();
		
		police.gun = gun;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
