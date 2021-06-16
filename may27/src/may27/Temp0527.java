package may27;

import java.util.Arrays;

public class Temp0527 {

	public static void main(String[] args) {

		int[][] arr = { { 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30, 30, 30, 30, 30 } };
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println("");
		}

		/*
		 * String[] dic = { ".-", "-...", "-.-.", "-...", ".", "..-.", "--.", "....",
		 * "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
		 * "-", "..-", "...-", ".--", "-..-", "-.--", "--.." }; String original =
		 * ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--"; String decode = "";
		 * 
		 * for (String word : original.split("  ")) { for (String cha : word.split(" "))
		 * { for (int i = 0; i < dic.length; i++) { if (cha.equals(dic[i])) { decode =
		 * decode + String.valueOf((char) (i + 'a')); } } } decode = decode + " "; }
		 * System.out.println(decode);
		 */

	}
}