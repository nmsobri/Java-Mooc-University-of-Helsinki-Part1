
import java.util.Scanner;

public class SumOfThePowers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a number: ");
		int num = Integer.parseInt(reader.nextLine());

		int start = 0;
		int result = 0;

		while (start <= num) {
			result += ((int) Math.pow(2, start));
			start++;
		}

		System.out.println(result);
	}
}
