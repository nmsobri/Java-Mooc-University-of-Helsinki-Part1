
import java.util.Scanner;

public class FirstCharacters {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = reader.nextLine();

		printFirstThreeCharacters(name);
	}

	public static void printFirstThreeCharacters(String text) {
		if (text.length() >= 3) {
			int i = 0;
			while (i < 3) {
				System.out.println(i + 1 + ". character:" + text.charAt(i));
				i++;
			}
		}
	}
}
