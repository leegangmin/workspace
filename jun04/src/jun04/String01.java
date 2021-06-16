package jun04;

import java.util.Arrays;

public class String01 {

	public static void main(String[] args) {

		String str = "Hi";
		String str2 = new String("Hi");
		
		str = str + " java";
		System.out.println(str);
		
		byte[] byteArr = {97,98,99,100};
		
		String str3 = new String(byteArr);
		System.out.println(str3);
		
		String str4 = new String(byteArr, 0, 3);
		System.out.println(str4);
		
		String str5 = new String(byteArr, 1, 3);
		System.out.println(str5);
		
		System.out.println(str5.length());
		
		System.out.println(str5.charAt(str5.length() - 1));
		
		String temp = "asdfghzxvvbndfadwrqeasaaad";
		//a는 몇개?
		int cnt = 0;
		
		for (int i = 0; i < temp.length(); i++) {
			//if (temp.toCharArray()[i] == 97) {
				if (temp.charAt(i) == 97) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		str2 = str2.concat(" JAVA");
		System.out.println(str2);
		
		//contains
		boolean b1 = str2.contains("Hi");
		System.out.println(b1);
		
		//endsWith
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("A"));
		
		String email = "poseidon@kakao.com";
		
		System.out.println(email.indexOf('3'));//-1 이면 없다
		
		System.out.println(email.contains("@"));
		
		System.out.println("id : " + email.substring(0, email.indexOf("@")));
		System.out.println("domain : " + email.substring(email.indexOf("@") + 1, email.length()));
		//id = poseidon
		//domain = kakao.com
		
		
		
		
	}

}
