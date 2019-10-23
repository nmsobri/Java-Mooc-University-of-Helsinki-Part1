
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

	private Random random;
	private ArrayList<Integer> numbers;

	public LotteryNumbers() {
		this.random = new Random();
		this.drawNumbers();
	}

	public ArrayList<Integer> numbers() {
		return this.numbers;
	}

	public void drawNumbers() {
		// We'll format a list for the numbers
		this.numbers = new ArrayList<Integer>();

		while (this.numbers.size() != 7) {
			int num = this.random.nextInt(39) + 1;

			if (!this.containsNumber(num)) {
				this.numbers.add(num);
			}
		}
	}

	public boolean containsNumber(int number) {
		return this.numbers.contains(number);
	}
}
