package may28;

public class Test01 {

	public static void main(String[] args) {
		String word = "codingDojang0";

		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				word = word.replaceAll(Character.toString(word.charAt(i)), "_" + Character.toLowerCase(word.charAt(i)));
			} else if (Character.isDigit(word.charAt(i))) {
				word = word.replaceAll(Character.toString(word.charAt(i)), "_" + word.charAt(i));
			}
		}

		System.out.println(word);

	}

}
