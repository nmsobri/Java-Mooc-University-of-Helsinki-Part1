
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a number: ");
		int num = Integer.parseInt(reader.nextLine());

		int start = 1;
		int factorial = 1;

		while (start <= num) {
			factorial *= start;
			start++;
		}

		System.out.println("Factorial is " + factorial);

	}
}
