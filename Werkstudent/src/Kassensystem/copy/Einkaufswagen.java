package Kassensystem.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Einkaufswagen {

	// private Produkt[] einkaufswagen = new Produkt[10];
	private List<Produkt> listeList = new ArrayList<Produkt>();

	public void addProdukt(Produkt produkt) {

		for (Produkt produkte : listeList) {

			listeList.add(new Produkt(produkte.getName(), produkte.getPreis()));

		}

	}

	// diese Methode berechnet und ausgibt die Rechnung .
	public void druckenUndberechnen() {

		for (Produkt produkt : listeList) {
			System.out.println(produkt.getArtikelnummer() + ") " + produkt.getName() + ", " + produkt.getPreis() + "€");
		}
		System.out.printf(" Ihre Rechnung =   \t\t %.2f %s%n  ", berechnen(), "€");

	}

	public void removeProdukt(String name) {

		for (Produkt produkt : listeList) {
			if (produkt.getName().equals(name)) {
				listeList.remove(produkt);
			} else {
				System.out.println("Produkt ist nicht gefunden ");
			}
		}

	}

	public double berechnen() {
		double summe = 0;

		for (Produkt produkt : listeList) {
			summe = produkt.getPreis() + summe;

		}
		return summe;
	}

	/*
	 * @Override public String toString() { return "Einkaufswagen [einkaufswagen=" +
	 * Arrays.toString(einkaufswagen) + super.toString() + "]";
	 */}
