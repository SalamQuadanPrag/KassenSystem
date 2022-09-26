import java.util.HashMap;

public class Kurs {

	private static HashMap<String, Double> geldWechslen = new HashMap<>();

	public Kurs() {

		geldWechslen.put("P", 2.0);
		geldWechslen.put("L", 1.40);

	}

	double getKurs(String w) {

		return geldWechslen.get(w);

	}

}



