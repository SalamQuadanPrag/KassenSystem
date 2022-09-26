package Kassensystem;


public class Lebensmittel extends Produkt {

	private String ablaufdatum;
	public Lebensmittel(int artikelnummer, String name, double preis,String ablaufdatum ) {
		super( name, preis);
		this.ablaufdatum=ablaufdatum; 
		
	}
	public Lebensmittel(String name, double preis) {
		super(name,preis);
		
	}

}
