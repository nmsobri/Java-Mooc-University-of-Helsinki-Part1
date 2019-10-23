
import java.util.ArrayList;

public class Variance {
	// Copy here sum from exercise 63 

	public static int sum(ArrayList<Integer> list) {
		int sum = 0;

		for (int num : list) {
			sum += num;
		}

		return sum;
	}

	// Copy here average from exercise 64 
	public static double average(ArrayList<Integer> list) {
		return sum(list) / (list.size() * 1.0);
	}

	public static double variance(ArrayList<Integer> list) {
		double average = average(list);
		ArrayList<Double> squares = new ArrayList<Double>();

		for (int item : list) {
			squares.add(Math.pow(item - average, 2));
		}

		double sum = 0;

		for (double square : squares) {
			sum += square;
		}

		return sum / (list.size() - 1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The variance is: " + variance(list));
	}

}
