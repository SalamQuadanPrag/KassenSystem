package video;

public class Customer {

	private String name;
	private java.util.Vector<Rental> rentals = new java.util.Vector<Rental>();

	public Customer(String pName) {
		name = pName;
	}

	public void addRental(Rental pRental) {
		rentals.addElement(pRental);
	}

	public String getName() {
		return name;
	}

	public double getTotalAmount() {
		double lTotalAmount = 0;
		java.util.Enumeration<Rental> lRentals = rentals.elements();
		while (lRentals.hasMoreElements()) {
			Rental lEachRental = lRentals.nextElement();
			lTotalAmount += lEachRental.getCharge();
		}
		return lTotalAmount;
	}

	public int getFrequentRenterPoints() {
		int lFrequentRenterPoints = 0;
		java.util.Enumeration<Rental> lRentals = rentals.elements();
		while (lRentals.hasMoreElements()) {
			Rental lEachRental = lRentals.nextElement();
			lFrequentRenterPoints += lEachRental.getFrequentRenterPoints();
		}
		return lFrequentRenterPoints;
	}

	@Override
	public String toString() {
		java.util.Enumeration<Rental> lRentals = rentals.elements();
		String lResult = "Rental Record for " + getName() + "\n";
		while (lRentals.hasMoreElements()) {
			Rental lEachRental = lRentals.nextElement();
			lResult += "\t" + lEachRental.getMovie().getTitle() + "\t" + String.valueOf(lEachRental.getCharge()) + "\n";
		}
		lResult += "Amount owed is " + String.valueOf(this.getTotalAmount()) + " Euros\n";
		lResult += "You earned " + String.valueOf(this.getFrequentRenterPoints()) + " frequent renter points";
		return lResult;
	}
}