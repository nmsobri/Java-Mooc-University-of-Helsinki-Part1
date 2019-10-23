
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4};
		int[] copied = copy(original);
		int[] reverse = reverseCopy(original);

		// change the copied
		copied[0] = 99;

		// print both
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("copied: " + Arrays.toString(copied));

		// print both
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("reversed: " + Arrays.toString(reverse));
	}

	public static int[] copy(int[] orig) {
		int[] copy = new int[orig.length];

		for (int i = 0; i < orig.length; i++) {
			copy[i] = orig[i];
		}

		return copy;
	}

	public static int[] reverseCopy(int[] orig) {

		int[] copy = new int[orig.length];

		int index = 0;
		for (int i = orig.length - 1; i >= 0; i--) {
			copy[index++] = orig[i];
		}

		return copy;
	}

}
