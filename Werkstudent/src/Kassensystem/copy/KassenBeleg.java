package Kassensystem.copy;


public class KassenBeleg {

	//Diese Klasse hätten wir auch ausgebaut ,wenn wir noch mehr Zeit hätten . 
	
	//
	private static Produkt[] einkaufswagen;
	private static double summe = 0;
	
	public KassenBeleg(Einkaufswagen wagen) {
		
	}
	public KassenBeleg( Produkt[] einkaufswagen) {
		for (int i = 0; i < einkaufswagen.length; i++) {
			if(einkaufswagen[i]!=null) {
				System.out.println(einkaufswagen[i]);
			}
		}
		
	}
	@Override
	public String toString() {
		return "KassenBeleg   + "+ einkaufswagen +  "]";
	}
	public void einkaufen(Produkt pro) {
		for (int i = 0; i < einkaufswagen.length; i++) {
			if(einkaufswagen[i]==null) {
				einkaufswagen[i]= pro;
				System.out.println(einkaufswagen[i]);
			}
			
		}
		
		
		
		
	}
	public double einzahlen(Produkt []einkaufswagen) {
		
		return 0;
		
	}
	public double auszahlen(double a) {
		
		return a;
		
	}
	public double summeBerchnen(Produkt [] einkaufswagen) {
		
		return 0;
		
	}
	
	
	
	
	
}
