
public class Money {

	private final int euros;
	private final int cents;

	public Money(int euros, int cents) {

		if (cents > 99) {
			euros += cents / 100;
			cents %= 100;
		}

		this.euros = euros;
		this.cents = cents;
	}

	public int euros() {
		return euros;
	}

	public int cents() {
		return cents;
	}

	@Override
	public String toString() {
		String zero = "";
		if (cents < 10) {
			zero = "0";
		}

		return euros + "." + zero + cents + "e";
	}

	public Money plus(Money money) {
		int totalEuros = this.euros + money.euros;
		int totalCents = this.cents + money.cents;
		return new Money(totalEuros, totalCents);
	}

	public boolean less(Money money) {
		if (this.euros < money.euros) {
			return true;
		} else if (this.euros == money.euros) {
			return this.cents < money.cents;
		} else {
			return false;
		}
	}

	public int totalCents(int euros, int cents) {
		return euros * 100 + cents;
	}

	public Money minus(Money money) {
		int thisTotalCents = this.totalCents(this.euros, this.cents);
		int thatTotalCents = this.totalCents(money.euros, money.cents);

		int finalCents = thisTotalCents - thatTotalCents;

		if (finalCents < 0) {
			return new Money(0, 0);
		}

		return new Money(0, finalCents);
	}

}
