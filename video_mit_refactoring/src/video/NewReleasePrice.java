package video;

public class NewReleasePrice extends Price {

	@Override
	public double getCharge(int daysRented) {
		double lThisAmount = daysRented * 3;
		return lThisAmount;
	}

	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
	
	

}
