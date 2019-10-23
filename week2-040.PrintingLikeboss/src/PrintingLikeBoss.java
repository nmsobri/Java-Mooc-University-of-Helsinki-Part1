
public class PrintingLikeBoss {

	// copy or rewrite the method of Assignment 39.1 here
	public static void printStars(int amount) {
		int start = 0;
		while (start < amount) {
			System.out.print("*");
			start++;
		}
		System.out.println("");
	}

	public static void printWhitespaces(int amount) {
		int start = 0;
		while (start < amount) {
			System.out.print(" ");
			start++;
		}
	}

	public static void printTriangle(int size) {
		int start = 0;
		while (start < size) {
			start++;
			printWhitespaces(size - start);
			printStars(start);
		}
	}

	public static void xmasTree(int height) {
		int start = 0;
		while (start < height) {
			int stars = (start * 2) + 1;
			start++;
			printWhitespaces(height - start);
			printStars(stars);
		}
		
		printWhitespaces(height - 2);
		printStars(3);
		printWhitespaces(height - 2);
		printStars(3);
	}

	public static void main(String[] args) {
		// Tests do not use main, yo can write code here freely!

		printTriangle(5);
		System.out.println("---");
		xmasTree(4);
		System.out.println("---");
		xmasTree(10);
	}
}
