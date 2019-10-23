
import java.util.Random;

public class PasswordRandomizer {

	private Random random;
	private int length;

	public PasswordRandomizer(int length) {
		this.random = new Random();
		this.length = length;
	}

	public String createPassword() {
		String password = "";
		String chars = "abcdefghijklmnopqrstuvwxyz";

		int i = 0;
		while (i < this.length) {
			password += chars.charAt(this.random.nextInt(chars.length() - 1));
			i++;
		}

		return password;
	}
}
