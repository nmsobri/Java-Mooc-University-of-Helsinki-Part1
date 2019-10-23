
import java.util.Scanner;

public class LoopsEndingRemembering {

	public static void main(String[] args) {
		// program in this project exercises 36.1-36.5
		// actually this is just one program that is split in many parts

		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int number = 0;
		int attempt = 0;
		int even = 0;
		int odds = 0;

		while (true) {
			System.out.println("Type number:");
			number = Integer.parseInt(reader.nextLine());

			if (number == -1) {
				break;
			}

			sum += number;
			attempt++;

			if (number % 2 == 0) {
				even++;
			} else {
				odds++;
			}
		}

		double average = sum / (attempt * 1.0);

		System.out.println("Thank you and see you later");
		System.out.println("The sum is " + sum);
		System.out.println("How many numbers: " + attempt);
		System.out.println("Average: " + average);
		System.out.println("Even numbers: " + even);
		System.out.println("Odds numbers: " + odds);
	}
}
