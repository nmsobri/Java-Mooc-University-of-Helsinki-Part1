
public class DecreasingCounter {

	private int value;
	private int cacheValue;

	public DecreasingCounter(int valueAtStart) {
		this.value = this.cacheValue = valueAtStart;
	}

	public void printValue() {
		// do not touch this!
		System.out.println("value: " + this.value);
	}

	public void decrease() {
		this.value--;

		if (this.value < 0) {
			this.value = 0;
		}
	}

	public void reset() {
		this.value = 0;
	}

	public void setInitial() {
		this.value = this.cacheValue;
	}
}
