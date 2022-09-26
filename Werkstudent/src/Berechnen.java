import java.util.HashMap;

public class Berechnen {
	private double preis;
	private double menge;
	private double summe;

	
	
	public Berechnen(double preis, double menge , double summe) {
		super();
		this.preis = preis;
		this.menge = menge;
		this.summe = summe;
	}

	
	public double getSumme() {
		return summe;
	}

	public void setSumme(double summe) {
		this.summe = summe;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public double getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	@Override
	public String toString() {
		return "[preis=" + preis + ", menge=" + menge +  " Summe " + summe +  "]"  ;
	}
	
}
