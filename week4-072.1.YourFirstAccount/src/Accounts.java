
import java.util.Scanner;

public class Accounts {

	public static void main(String[] args) {
		Account account = new Account("Sobri", 100.0);
		account.deposit(20.00);
		System.out.println(account);
	}

}
