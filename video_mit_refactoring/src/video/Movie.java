package video;

public class Movie {

	private String title;
	private Price price;

	public Movie(String pTitle, Price pPrice) {
		title = pTitle;
		price = pPrice;
	}

	public Price getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public void setPrice(Price pPrice) {
		price = pPrice;
	}

	public double getCharge(int daysRented) {
		return getPrice().getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return getPrice().getFrequentRenterPoints(daysRented);
	}

}