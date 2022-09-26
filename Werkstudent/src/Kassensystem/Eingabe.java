package Kassensystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Eingabe {

	private Einkaufswagen einkaufswagen;
	private Produkt[] regal = new Produkt[12];
	static int counter = 1;
	private int myPin = 12345;
	private Regal oRegal = new Regal();
	static Scanner sc = new Scanner(System.in);

	public Eingabe(Einkaufswagen einkaufswagen) {
		super();
		this.einkaufswagen = einkaufswagen;

	}

	public void eingabe() {
		boolean running = true;
		while (running) {
			System.out.println("Sind Sie Mitarbeiter oder Kunde ?" + "\n");
			System.out.println("Für Mitarbeiter drücken Sie die 1" + "\n" + "Für Kunde drücken Sie die 2 ");
			int w = sc.nextInt();
			if (w == 1) {
				try {
					eingabefuerMitarbeiter();
				} catch (Exception e) {

					e.printStackTrace();
				}
			} else if (w == 2) {
				eingabefuerKunden();
				running = false;
			} else
				try {
					throw new NeuerVersuch("Versuchen Sie nochmal");
				} catch (NeuerVersuch e) {

					e.printStackTrace();
				}
		}
	}

	// Hier wird den Mitarbeiter durch Pin überprüft ,
	private void eingabefuerMitarbeiter() throws Exception {
		System.out.println("Pin eingeben " + " und bitte nur Ziffern : ");
		int p = sc.nextInt();
		if (p == myPin) {
			System.out.println("Pin ist richtig");
		} else {
			try {
				throw new Pinistfalsch("Pin ist falsch");
			} catch (Pinistfalsch e) {
				e.printStackTrace();
				eingabefuerMitarbeiter();
			}
		}
// wenn Pin richtig ist , kann der MA alle Funktionen verwenden. 
		boolean running = true;
		while (running) {
			System.out.println("Als Mitarbeiter dürfen Sie :" + "\n" + "-----------------------" + "\n"
					+ "1) Produkte zum Regal hinzufügen " + "\n" + "2) Ein Produkt vom Regal zu löschen " + "\n"
					+ "3) Tagesumsatz durchführen " + "\n" + "4) Zeigen Sie mir das Regal " + "\n" + "5) zurück");
			int w = sc.nextInt();
			if (w == 1) {
				addProduktMitarbeiter();
				buffered();
			} else if (w == 2) {
				System.out.println("Geben Sie das Produkt ein , das Sie löschen möchten : ");
				String name = sc.next().toLowerCase();
				oRegal.removeProduktvomRegal(name.toLowerCase());
			} else if (w == 3) {
				tagesUmsatz();
			} else if (w == 4) {
				oRegal.drucken();

			} else if (w == 5) {
				eingabe();
			}
		}

	}
// Diese Methode h�tte wir ausgebaut , wenn wir mehr Zeit h�tten. 
	//und es ist in der Eingabe nicht verf�gbar. 
	
	private void tagesUmsatz() {
		

	}

	public void buffered() {

		try {

			BufferedWriter meinProdukte = new BufferedWriter(new FileWriter("New.txt"));
			for (int i = 0; i < regal.length; i++) {
				// Abfragen, ob im Regal etwas liegt
				if (regal[i] != null) {
					meinProdukte.write(regal[i].toString());
					meinProdukte.newLine();
				}
			}
			meinProdukte.flush();
			meinProdukte.close();
		} catch (FileNotFoundException e) {
			System.out.println("Das gesuchte Produkt ist nicht vorhanden");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void BufferedReader() {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("New.txt"));
			String line;
			line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();

			}

		} catch (Exception e) {
			System.out.println("Die gesuchte Datei ist nicht gefunden");

			e.printStackTrace();
		}

	}
// hier wird ein Produkt eingegeben und wird ein Objekt von Produkt erzeugt 
	private void addProduktMitarbeiter() {

		System.out.println("Bitte geben Sie den Produktnamen ein");
		String name = sc.next();
		System.out.println("Bitte geben Sie den Produktpreis ein");
		double preis = sc.nextDouble();
		Produkt pro = new Lebensmittel(name, preis);
		regal[counter] = pro;
		counter++;
		System.out.println(oRegal.addProduktRegal(pro));

	}

	public void eingabefuerKunden() {
		boolean running = true;
		while (running) {

			System.out.println("Herzlich Willkommen ! Was möchten Sie kaufen ?");
			System.out.println("Das sind unsere Produkte , bitte wählen Sie ein oder mehrere Produkte aus ^_^" + "\n"
					+ "1) Tomaten" + "\n" + "2) Zwiebeln" + "\n" + "3) Zeitschrift" + "\n" + "4) Gurke " + "\n"
					+ "5) Produkte im Laden " + "\n" + "6) Ein Produkt löschen " + "\n" + "7) beenden");
			int s = sc.nextInt();

			switch (s) {
			case 1:
				einkaufswagen.addProdukt(new Lebensmittel("Tomaten", 1.40));
				einkaufswagen.druckenUndberechnen();
				break;
			case 2:
				einkaufswagen.addProdukt(new Lebensmittel("Zwiebel", 1.20));
				einkaufswagen.druckenUndberechnen();
				break;
			case 3:
				einkaufswagen.addProdukt(new Zeitschriften(23, "Bild", 2.50, "Politik"));
				einkaufswagen.druckenUndberechnen();
				break;
			case 4:
				einkaufswagen.addProdukt(new Lebensmittel("Gurke", 0.80));
				einkaufswagen.druckenUndberechnen();
				break;
			case 5:
				BufferedReader();
				break;
			case 6:
				System.out.println("Geben Sie ein , welches Produkt möchten Sie löschen");
				String name = sc.next();
				einkaufswagen.removeProdukt(name);
				einkaufswagen.druckenUndberechnen();
				break;

			case 7:
				running = false;
				System.out.println("------------------------------------    ");
				einkaufswagen.druckenUndberechnen();
				System.out.println("------------------------------------    ");
				break;
			default:
				try {
					throw new Exception("Das Produkt haben wir leider nicht");
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			}

		}
	}

}
