
import java.util.Scanner;

public class Temperatures {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		double value = 0;

		while (true) {
			System.out.println("Add coordinates: ");
			value = Double.parseDouble(reader.nextLine());

			if (value >= -30 && value <= 40) {
				Graph.addNumber(value);
			} else {
				System.out.println("Should be greater than -30 and below 40");
			}

//			System.out.println("Continue ([y]es/[n]o)");
//			String command = reader.nextLine();
//
//			if (command.equalsIgnoreCase("n")) {
//				break;
//			}
		}

	}
}
