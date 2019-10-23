
import java.util.Calendar;

public class Person {

	private String name;
	private MyDate birthday;

	public Person(String name, int pp, int kk, int vv) {
		this.name = name;
		this.birthday = new MyDate(pp, kk, vv);
	}

	public Person(String name, MyDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public Person(String name) {
		this.name = name;
		Calendar cal = Calendar.getInstance();
		this.birthday = new MyDate(cal.get(Calendar.DATE), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.YEAR));
	}

	public int age() {
		Calendar cal = Calendar.getInstance();
		int currentDate = cal.get(Calendar.DATE);
		int currentMonth = cal.get(Calendar.MONTH) + 1;
		int currentYear = cal.get(Calendar.YEAR);

		MyDate current = new MyDate(currentDate, currentMonth, currentYear);
		return this.birthday.differenceInYears(current);
	}

	public boolean olderThan(Person compared) {
		return this.birthday.earlier(compared.birthday);
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.name + ", born " + this.birthday;
	}
}
