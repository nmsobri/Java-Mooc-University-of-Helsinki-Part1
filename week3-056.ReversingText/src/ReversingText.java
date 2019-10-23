
import java.util.Scanner;

public class ReversingText {

	public static String reverse(String text) {
		String reverse = "";

		int textLength = text.length();

		while (textLength - 1 >= 0) {
			reverse += text.charAt(textLength - 1);
			textLength--;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in your text: ");
		String text = reader.nextLine();
		System.out.println("In reverse order: " + reverse(text));
	}
}
