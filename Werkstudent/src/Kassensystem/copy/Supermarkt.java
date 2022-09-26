package Kassensystem.copy;
public class Supermarkt {

	public static void main(String[] args) throws Exception {
		
		Einkaufswagen wagen_1 = new Einkaufswagen();// der erste Kunde
		Eingabe e1 = new Eingabe(wagen_1); 
		e1.eingabe();

		Einkaufswagen wagen_2 = new Einkaufswagen();// der zweite Kunde
		Eingabe e2 = new Eingabe(wagen_2); 
		e2.eingabe();

		Einkaufswagen wagen_3 = new Einkaufswagen();// der dritte Kunde
		Eingabe e3 = new Eingabe(wagen_3); 
		e3.eingabe(); 

		//Hier wird den Tagesumsatz berechnet . 
		double rechnung1 = wagen_1.berechnen();
		double rechnung2 = wagen_2.berechnen();
		double rechnung3 = wagen_3.berechnen();
		System.out.printf("Tagesumsatz =  %.2f " , rechnung1 + rechnung2 + rechnung3 );

		
	}

}
