package may27;

import java.util.Arrays;

//https://codingdojang.com/scode/469
//단어 자르기
public class MorsecodeDecoding {

	public static void main(String[] args) {
		String str = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
		System.out.println(str);

		String[] strArr = str.split("");
		System.out.println(Arrays.toString(strArr));

		String word = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
		String[][] alpha = {
				{ "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
						"U", "V", "W", "X", "Y", "Z" },
				{ ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
						"---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." } };

		String[] decode = word.split(" ");
		System.out.println(Arrays.toString(decode));
		System.out.println(decode[2]);
		for (int i = 0; i < decode.length; i++) {
			for (int j = 0; j < alpha[0].length; j++) {
				if (decode[i].equals(alpha[1][j])) {
					System.out.print(alpha[0][j]);
					break;
				}
			}
			System.out.print(" ");
		}

		// 비교
		// == != P타입

		String str1 = "Hi";
		String str2 = "Hi";

		/*
		 * if(str1.equals(str2)) { System.out.println("같아요"); }
		 * 
		 * 
		 * str2 = "---";//o System.out.println(str2.equals("---"));
		 * 
		 * str1 = "...";//s System.out.println(str1.equals("..."));
		 */
	}

}
