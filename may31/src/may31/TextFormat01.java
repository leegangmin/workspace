package may31;

import java.text.MessageFormat;

public class TextFormat01 {

	public static void main(String[] args) {

	
	System.out.printf("%d", 3);
	
	String name = "ȫ�浿";
	String id = "hong5000";
	String tel = "010-5560-3454";
	
	System.out.println("�̸� : " + name + " ���̵� : " + id + " tel : " + tel);
	
	String text = "�̸� : {0}, ���̵� : {1}, tel : {2}";
	
	String result = MessageFormat.format(text, name, id, tel);
	System.out.println(result);
	
	String[] arr = {"ȫ�浿", "hong5000", "010-2324-2412"};
	result = MessageFormat.format(text, arr);
	System.out.println(result);
	
	//538p
	
	
	}

}
