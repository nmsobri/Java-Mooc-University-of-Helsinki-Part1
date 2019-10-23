
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberDrawn = drawNumber();
		int guessCount = 0;

		while (true) {
			System.out.println("Guess a number: ");
			int guess = Integer.parseInt(reader.nextLine());

			if (guess > numberDrawn) {
				guessCount++;
				System.out.println("The number is lesser, guesses made: " + guessCount);
			} else if (guess < numberDrawn) {
				guessCount++;
				System.out.println("The number is greater, guesses made: " + guessCount);
			} else {
				System.out.println("Congratulations, your guess is correct!");
				break;
			}
		}

		// program your solution here. Do not touch the above lines!
	}

	// DO NOT MODIFY THIS!
	private static int drawNumber() {
		return new Random().nextInt(101);
	}
}
