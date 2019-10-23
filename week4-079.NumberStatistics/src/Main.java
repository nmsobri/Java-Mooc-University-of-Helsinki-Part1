
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		NumberStatistics sumAll = new NumberStatistics();
		NumberStatistics sumEven = new NumberStatistics();
		NumberStatistics sumOdd = new NumberStatistics();

		System.out.println("Type numbers: ");

		while (true) {
			int number = Integer.parseInt(reader.nextLine());

			if (number == -1) {
				break;
			}

			sumAll.addNumber(number);

			if (number % 2 == 0) {
				sumEven.addNumber(number);
			} else {
				sumOdd.addNumber(number);
			}
		}

		System.out.println("Sum: " + sumAll.sum());
		System.out.println("Sum of even: " + sumEven.sum());
		System.out.println("Sum of odd: " + sumOdd.sum());
	}
}
