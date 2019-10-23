
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BirdWatcher bw = new BirdWatcher(scanner);
		bw.run();

	}

}
