package jun03;
//접근제어자
/*
 * 자바에서는 접근 제어자를 통해서 각 API의 접근 권한을 제한할 수 있습니다.
 * 
 * 어려운 내용이 아니니까 잘 봐주시면 됩니다.
 * 
 * 아래는 접근 제어자의 접근 범위를 나타낸 것 입니다.
 * 
 * public > protected > default(package) > private
 * 
 * public : 가장 넓은 범위로 패키지 제한없이 모두 접근 가능한 상태
 * 
 * protected : 같은 패키지내에서 접근 가능, 
 * 				다른 패키지에서는 상속이나 자식 클래스, 인터페이스라면
 * 				접근 가능합니다.
 * 
 * default : 아무런 접근 제한을 두지 않을 때 = 비어있다면 
 * 			같은 패키지 내에서 접근 가능
 * 			외부 패키지에서는 접근 불가.
 * 
 * private : 자기 자신 클래스에서만 접근 가능, 그외 모두 막음.
 * 
 * 
 * 주의 : 클래스 앞에 붙는 접근제어자는 public, default만 있습니다.
 * 
 * 번외 : 클래스를 만들 떄 어떤 클래스에 public을 붙여야 함?
 * 		왜 파일이름과 public 클래스명을 맞춰야 할까? 
 * 		가독성? 자바 파일 안에 많은 클래스를 정의할 때 
 * 				하나의 대표 클래스를 지정하고 파일명과 동일하게
 * 				맞추는 것이 가독성에 도움이 됩니다.
 * 
 * 		사람이 소스코드를 읽을 때 public키워드가 붙은 클래스를 본다면
 * 		현 소스가 어떤 자바 파일 이름으로 되어있는지 알 수 있습니다.
 * 		= public이 없는 것은 자바 파일명과 동일한 class가 아니다. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
class AAA{//DTO, VO
	private int age;   //a1.age = -100;
	private String name;
	
	public int getAge() {//getter
		return age;
	}
	public void setAge(int age) {//setter
		if(age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//3글자 이하라면 _로  채워주세요.  홍길 -> _홍길
		//5글자라면 앞 3글자만 저장하게 하기   가나다라마바 -> 가나다
		//빈칸으로 들어오면 홍길동으로 저장하기    "" -> 홍길동
		if(name.length() < 1) {
			this.name = "홍길동";
			
		}else if(name.length() == 1){
			this.name = "__" + name;
			
		} else if(name.length() == 2) {
			this.name = "_" + name;
			
		} else if(name.length() > 3) {
			this.name = name.substring(0, 3);
			
		} else {			
			this.name = name;
		}
	}
	
	
	
}

public class AccessModifier {
	public static void main(String[] args) {
		
		AAA a1 = new AAA();
		//a1.age = 10;
		a1.setAge(-110);
		System.out.println( a1.getAge()  );
		//a1.name = "";
		a1.setName("3PO");
		System.out.println(  a1.getName()   );
		
		
		
		
		
		
	}
}
