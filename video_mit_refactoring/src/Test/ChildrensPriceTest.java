package Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import video.ChildrensPrice;

class ChildrensPriceTest {

	@Test
	void testmehrals3Tage() {

		int tage = 6 ;
		double result= 1.5;
		ChildrensPrice c1 = new ChildrensPrice();
		result += (tage - 3) * 1.5;

		assertEquals(result,c1.getCharge(tage));
		
		
	}
	@Test
	void testwenigerAls3Tage() {
		int tage = 2 ;
		double result= 1.5;
		ChildrensPrice c1 = new ChildrensPrice();
		assertEquals(result,c1.getCharge(tage));
		System.out.println(result);
		
	}

}
