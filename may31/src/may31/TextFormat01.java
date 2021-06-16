package may31;

import java.text.MessageFormat;

public class TextFormat01 {

	public static void main(String[] args) {

	
	System.out.printf("%d", 3);
	
	String name = "홍길동";
	String id = "hong5000";
	String tel = "010-5560-3454";
	
	System.out.println("이름 : " + name + " 아이디 : " + id + " tel : " + tel);
	
	String text = "이름 : {0}, 아이디 : {1}, tel : {2}";
	
	String result = MessageFormat.format(text, name, id, tel);
	System.out.println(result);
	
	String[] arr = {"홍길동", "hong5000", "010-2324-2412"};
	result = MessageFormat.format(text, arr);
	System.out.println(result);
	
	//538p
	
	
	}

}
