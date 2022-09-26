package video;

public class RegularPrice extends Price {

	@Override
	public double getCharge(int daysRented) {
		double lThisAmount = 2;
		if (daysRented > 2)
			lThisAmount += (daysRented - 2) * 1.5;
		return lThisAmount;
	}

}
