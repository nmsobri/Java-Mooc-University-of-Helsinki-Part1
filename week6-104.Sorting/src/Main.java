
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] values = {3, 2, 5, 4, 8};
		System.out.println("smallest: " + smallest(values));

		System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

		System.out.println(indexOfTheSmallestStartingFrom(values, 1));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		System.out.println(indexOfTheSmallestStartingFrom(values, 4));

		System.out.println(Arrays.toString(values));

		swap(values, 1, 0);
		System.out.println(Arrays.toString(values));

		swap(values, 0, 3);
		System.out.println(Arrays.toString(values));

		System.out.println("############################");
		int[] values2 = {8, 3, 7, 9, 1, 2, 4};
		sort(values2);
	}

	public static int smallest(int[] array) {
		int smallest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}

		return smallest;
	}

	public static int indexOfTheSmallest(int[] array) {
		int smallest = array[0];
		int smallestIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
				smallestIndex = i;
			}
		}

		return smallestIndex;
	}

	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int smallest = array[index];
		int smallestIndex = index;

		for (int i = index; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
				smallestIndex = i;
			}
		}

		return smallestIndex;
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static void sort(int[] array) {
		//8, 3, 7, 9, 1, 2, 4

		for (int i = 0; i < array.length; i++) {
			int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
			swap(array, i, smallestIndex);
			System.out.println(Arrays.toString(array));
		}
	}

}
