
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Please enter first:");
		int first = Integer.parseInt(reader.nextLine());

		System.out.println("Please enter last:");
		int last = Integer.parseInt(reader.nextLine());

		int sum = 0;

		if (first < last) {
			while (first <= last) {
				System.out.println(first);
				sum += first;
				first++;
			}

			System.out.println("Sum is " + sum);
		}
	}
}
