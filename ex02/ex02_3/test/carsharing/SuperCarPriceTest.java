package carsharing;

import static org.junit.Assert.*;

import org.junit.Test;

import carsharing.Plan;
/**
 * 
 * @author pcbreen
 *
 */
public class SuperCarPriceTest {
    /**
     * Test case.
     */
	@Test
	public void test() {
		assertEquals(1,1);
		assertEquals(0, new Plan("ShortRunner", 10, 10, 150, 0, 0).calculateMonthlyPrice(0,0));
	}

}
