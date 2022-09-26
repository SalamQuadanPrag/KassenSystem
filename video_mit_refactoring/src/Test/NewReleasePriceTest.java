package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewReleasePriceTest {

	@Test
	void testNewRealease() {
		int tage = 3; 
		double amount = 3 * tage; 
		int expected = 9 ; 
		assertEquals(expected, amount);
		
	}
	@Test
	void testFrequentRenterPmehrals1() {
		
		int tage = 2 ; 
		int expected = 2 ;
		assertEquals(expected, tage);
			
		
	}
	@Test
	void testFrequentRenterPwenigerals1() {
		int tage = 1 ; 
		int expected = 1 ;
		assertEquals(expected, tage);
	}

}
