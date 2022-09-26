package video;

public class Program {
	public static void main(String args[]) {
		Customer lCustomer = new Customer("Max Mustermann");

		Movie lMovie1 = new Movie("Film Nr. 1", new NewReleasePrice());
		Movie lMovie2 = new Movie("Film Nr. 2", new ChildrensPrice());
		Movie lMovie3 = new Movie("Film Nr. 3", new RegularPrice());

		Rental lRental1 = new Rental(lMovie1, 12);
		lCustomer.addRental(lRental1);
		Rental lRental2 = new Rental(lMovie2, 2);
		lCustomer.addRental(lRental2);
		Rental lRental3 = new Rental(lMovie3, 7);
		lCustomer.addRental(lRental3);

		System.out.println(lCustomer.toString());

	}
}
