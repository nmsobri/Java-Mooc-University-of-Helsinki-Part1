
import java.util.Scanner;

public class WordInsideWord {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type the first words: ");
		String firstWords = reader.nextLine();

		System.out.println("Type the second words: ");
		String secondWords = reader.nextLine();

		if (firstWords.indexOf(secondWords) != -1) {
			System.out.println("The word '" + secondWords + "' is found in the word '" + firstWords + "'.");
		} else {
			System.out.println("The word '" + secondWords + "' is not found in the word '" + firstWords + "'.");
		}
	}
}
