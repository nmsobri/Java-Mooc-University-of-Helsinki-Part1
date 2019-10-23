
import java.util.Scanner;

public class Palindromi {

	public static String reverseString(String text) {
		String reverseString = "";

		int stringLastIndex = text.length() - 1;

		while (stringLastIndex >= 0) {
			reverseString += text.charAt(stringLastIndex);
			stringLastIndex--;
		}

		return reverseString;
	}

	public static boolean palindrome(String text) {
		String reverseString = reverseString(text);
		return text.equals(reverseString);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a text: ");
		String text = reader.nextLine();
		if (palindrome(text)) {
			System.out.println("The text is a palindrome!");
		} else {
			System.out.println("The text is not a palindrome!");
		}
	}
}
