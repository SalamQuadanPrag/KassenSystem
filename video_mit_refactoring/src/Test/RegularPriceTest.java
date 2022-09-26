package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import video.RegularPrice;

class RegularPriceTest {

	@Test
	void testmehrals2Tage() {

		int tage = 3;
		// double expected = 3.5;
		RegularPrice r1 = new RegularPrice();
		// expected += (tage - 2) * 1.5; entweder mit Formell oder direkt in asserEquals
		// eingeben
		assertEquals(3.5, r1.getCharge(tage));

	}

	@Test
	void testwenigerals2Tage() {

		int tage = 1;
		double expected = 2;
		RegularPrice r1 = new RegularPrice();
		assertEquals(r1.getCharge(tage), expected);

	}

	@Test
	void test2Tage() {

		int tage = 2;
		double expected = 2;
		RegularPrice r1 = new RegularPrice();

		assertEquals(r1.getCharge(tage), expected);

	}

}
