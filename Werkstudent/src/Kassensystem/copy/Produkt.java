package Kassensystem.copy;
public class Produkt {

	private int artikelnummer;
	private String name;
	private double preis;
	

	
	
	public Produkt( String name, double preis) {
		super();
		this.artikelnummer=Eingabe.counter;
		Eingabe.counter++; 
		this.name = name;
		this.preis = preis;

	}

	@Override
	public String toString() {
		return  name + "\t\t\t " + preis + "€" ;
				
	}

	public int getArtikelnummer() {
		return artikelnummer;
	}

	public String getName() {
		return name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

}
