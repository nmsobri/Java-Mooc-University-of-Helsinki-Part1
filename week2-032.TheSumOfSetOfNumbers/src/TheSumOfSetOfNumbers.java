
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Until what?");
		int limit = Integer.parseInt(reader.nextLine());
		int num = 1;
		int result = 0;

		while (num <= limit) {
			result += num;
			num++;
		}

		System.out.println("Sum is " + result);

	}
}
