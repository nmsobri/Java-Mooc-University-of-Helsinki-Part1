
public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter();

		counter.increase(5);
		counter.increase();

		counter.decrease(2);
		counter.decrease(-1);
		System.out.println(counter);
	}
}
