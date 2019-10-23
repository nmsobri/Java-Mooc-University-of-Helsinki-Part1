
public class Apartment {

	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;

	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public boolean larger(Apartment apartment) {
		return this.squareMeters > apartment.squareMeters;
	}

	public int priceDifference(Apartment apartment) {
		return Math.abs(
			(this.squareMeters * this.pricePerSquareMeter)
			- (apartment.squareMeters * apartment.pricePerSquareMeter)
		);
	}

	public int realPriceDifference(Apartment apartment) {
		return (this.squareMeters * this.pricePerSquareMeter)
			- (apartment.squareMeters * apartment.pricePerSquareMeter);

	}

	public boolean moreExpensiveThan(Apartment apartment) {
		return this.realPriceDifference(apartment) > 0;
	}

}
