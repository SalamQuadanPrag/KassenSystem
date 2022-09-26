package Kassensystem;

import java.util.Arrays;

public class Einkaufswagen {

	private Produkt[] einkaufswagen = new Produkt[10];

	public void addProdukt(Produkt produkt) {

		for (int i = 0; i < einkaufswagen.length; i++) {
			if (einkaufswagen[i] == null) {
				einkaufswagen[i] = produkt;
				break;
			} else {
				extendEinkaufswagen();
			}
		}

	}
//diese Methode vergrößert die Länge des Arrays.
	private void extendEinkaufswagen() {
		Produkt[] neu = new Produkt[einkaufswagen.length + 10];
		for (int i = 0; i < einkaufswagen.length; i++) {
			neu[i] = einkaufswagen[i];
		}
		this.einkaufswagen = neu;

	}

	// diese Methode berechnet und ausgibt die Rechnung .
	public void druckenUndberechnen() {
		for (int i = 0; i < einkaufswagen.length; i++) {
			if (einkaufswagen[i] != null) {
				System.out.println(i + 1 + "-:" + einkaufswagen[i]);

			}

		}
		System.out.printf(" Ihre Rechnung =   \t\t %.2f %s%n  ",berechnen(),"€2");

	}

	public void removeProdukt(String name) {
		for (int i = 0; i < einkaufswagen.length; i++) {
			if (einkaufswagen[i].getName().equals(name)) {
				einkaufswagen[i] = null;
				break;
			}
		}

	}

	public double berechnen() {
		double summe = 0;
		for (int i = 0; i < einkaufswagen.length; i++) {
			if (einkaufswagen[i] != null) {
				summe = einkaufswagen[i].getPreis() + summe;
			}
		}
		return summe;
	}
	

	@Override
	public String toString() {
		return "Einkaufswagen [einkaufswagen=" + Arrays.toString(einkaufswagen) + super.toString() + "]";
	}

}
