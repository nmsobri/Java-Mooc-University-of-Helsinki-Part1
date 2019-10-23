import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	    System.out.println("Type a number:");
	    int firstNumber = Integer.parseInt(scanner.nextLine());


	    System.out.println("Type another number:");
	    int secondNumber = Integer.parseInt(scanner.nextLine());

	    System.out.println("Sum of the numbers: " + (firstNumber +secondNumber));
        // Implement your program here. Remember to ask the input from user
    }
}
