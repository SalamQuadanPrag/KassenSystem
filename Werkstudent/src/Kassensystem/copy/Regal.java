package Kassensystem.copy;
import java.util.Arrays;

public class Regal {

	Produkt[] regal = new Produkt[12];
	private String name;
	private int artknr;
	private double preis;
	private int counter = 0;  //f�r Regal Array , jedes mal wird um eins erh�ht. 
                              //z�hlt und nominiert die Waren .

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArtknr() {
		return artknr;
	}

	public void setArtknr(int artknr) {
		this.artknr = artknr;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public Regal(String name, int artknr, double preis) {
		super();
		this.name = name;
		this.artknr = artknr;
		this.preis = preis;
	}

	public Regal() {
		
	}

	@Override
	public String toString() {
		return "Regal [regal=" + Arrays.toString(regal) + ", name=" + name + ", artknr=" + artknr + ", preis=" + preis
				+ "]";
	}

	public boolean addProduktRegal(Produkt pro) {
		for (int i = 0; i <regal.length; i++) {
			if (regal[counter] == null) {
				regal[counter] = pro;
				counter++;
				return true;  //zeigt einfach true ,wenn das gelungen ist (Produkt erzeugen).
			}
		}
		
		extendRegal(); // wird das Array regal gr��er , wenn mein regal Array nicht ausreicht. 
		addProduktRegal(pro);
		return true;
	}

	public void removeProduktvomRegal(String name) {
		for (int i = 0; i < regal.length; i++) {
			if (regal[i].getName().equals(name)) {
				regal[i] = null;
				break;
			}
		}
	}
	
  // hier mit Summe k�nnte man ausbauen ,um Regal Best�nde zu z�hlen . 
	public void druckenUndberechnen() {
		for (int i = 0; i < regal.length; i++) {
			if (regal[i] != null) {
				System.out.println(getArtknr()+ "-:" + regal[i]);

			}

		}
		System.out.println("Summe  =  " + berechnen() + " �");
	}

	
	public double berechnen() {
		double summe = 0;
		for (int i = 0; i < regal.length; i++) {
			if (regal[i] != null) {
				summe = regal[i].getPreis() + summe;
			}
		}
		return summe;
	}
      
	public void drucken() {
		for (int i = 0; i < regal.length; i++) {
			if (!(regal[i] == null)) {
				System.out.println(regal[i].toString());
			}
		}
	}
  //wenn mein Regal voll ist , wird regal Array vergr��ert . 
	private void extendRegal() {
		Produkt[] neu = new Produkt[regal.length + 10];
		for (int i = 0; i < regal.length; i++) {
			neu[i] = regal[i];
		}
		this.regal = neu;

	}
}
