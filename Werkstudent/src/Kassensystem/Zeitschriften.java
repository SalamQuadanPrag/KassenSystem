package Kassensystem;
public class Zeitschriften extends Produkt {
	
	private String typ ;
	private String name ;
		
	
	public Zeitschriften(int artikelnummer, String name, double preis ,String typ) {
		super( name, preis);
		this.typ=typ;
		
	}
	
	@Override
	public String getName() {
		return name;
		
	}

}
