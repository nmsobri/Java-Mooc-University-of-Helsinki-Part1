
import java.util.Scanner;

public class ReversingName {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = reader.nextLine();

		reverseString(name);

	}

	public static void reverseString(String text) {
		int textLength = text.length();
		String name = "";

		while (textLength - 1 >= 0) {
			name += text.charAt(textLength - 1);
			textLength--;
		}

		System.out.println("In reverse order: " + name);
	}
}
