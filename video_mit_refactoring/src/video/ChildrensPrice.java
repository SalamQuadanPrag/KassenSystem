package video;

public class ChildrensPrice extends Price {

	@Override
	public double getCharge(int daysRented) {
		double lThisAmount = 1.5;
		if (daysRented > 3)
			lThisAmount += (daysRented - 3) * 1.5;
		return lThisAmount;
	}

}
