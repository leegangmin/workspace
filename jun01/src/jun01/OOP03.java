package jun01;
/* 객체와 인스턴스
 * 클래스에 의해서 생성된 객체를 인스턴스라고 합니다, 
 * 그렇다면 객체와 인스턴스의 차이는?
 * Animal a1 = new Animal();로 만들어진 a1은 객체입니다. 
 * 그리고 a1 객체는 Animal의 인스턴스(instance)입니다.
 * 즉 인스턴스라는 말은 특정 객체가 어떤 클래스의 객체인지를 
 * 관계위주로 설명할 때 사용합니다. 
 * 즉, "a1은 인스턴스'보다는 'a1은 객체",
 * 'a1은 Animal의 객체'보다는 'a1은 Animal의 인스턴스'라는 표현이
 * 더 잘 어울립니다.
 * 
 * 
 * 클래스와 인스턴스
 * 과자를 만드는 과자틀과 만들어진 과자가 있습니다.
 * 과자틀 -> 클래스
 * 과자 -> 객체- 인스턴스 
 * 
 * Animal a1 = new Animal();
 * Animal a2 = new Animal();
 * Animal a3 = new Animal();
 * Animal a4 = new Animal();
 * Animal a5 = new Animal();
 * Animal a6 = new Animal();
 * Animal a7 = new Animal();
 * 
 */

class Animal{
	String name;//참조형의 기본값 null
	int age; //정수형의 기본값 0
			//실수형의 기본값 0.0
			//문자형의 기본값 0
			//논리형의 기본값 false
	//null
	// name을 실행하면 null이 나왔습니다.
	//null이라는 것은 값이 할당되지 않은 상태를 말합니다. 
	//Animal이라는 클래스의 인스턴스 변수로 name을 추가했지만
	//아무런 값도 대입하지 않았기 때문에 null이라는 값이 출력됩니다.
	
	//메소드
	public void setName(String name) {//저장
		this.name = name;
	}
	public String getName() {//값 불러오기
		return this.name;
	}
}
/* 위 Animal이라는 클래스는 가장 간단한 클래스 입니다. 
 * 클래스 선언만 있고 내용이 없는 껍데기 클래스입니다.
 * 인스턴스 생성 가능합니다.* 
 */
public class OOP03 {
	public static void main(String[] args) {
		
		Animal r2d2 = new Animal();//인스턴스 생성
		System.out.println(r2d2.name);//null
		System.out.println(r2d2.age);
		//r2d2.name = "R2D2";
		
		Animal cat = new Animal();
		cat.name = "동수";
		
		Animal dog = new Animal();
		dog.name = "3PO";
		
		System.out.println(r2d2.name);
		System.out.println(cat.name);
		System.out.println(dog.name);
		
		cat.setName("동수");
		String name = cat.getName();
		System.out.println(name);
		
	}
}
