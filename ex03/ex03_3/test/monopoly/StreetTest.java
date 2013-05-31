/**
 * 
 */
package monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author thiemann and Peter C. Breen
 *
 */
public class StreetTest {

    /**
     * Test case.
     */
	@Test
	public void test() {
		/**
		 * Baltic Ave
		 */
		Street s = Street.makeBaltic();
		Street s2 = Street.makeBaltic();
		
		assertTrue(s == s2);
		
		/**
		 * New York Ave
		 */
		Street s3 = Street.makeNewYork();
		Street s4 = Street.makeNewYork();
		
		assertTrue(s3 == s4);
		assertTrue(s3 != s);
		
		/**
		 * St. Charles Place
		 */
		Street s5 = Street.makeStCharles();
		Street s6 = Street.makeStCharles();
		
		assertTrue(s5 == s6);
		assertTrue(s5 != s4);
		assertTrue(s5 != s2);
		
		
		
		assertEquals(State.UNOWNED, s.getState());
		assertTrue("can buy unowned street", s.buy());
		assertEquals(State.OWNED, s.getState());
		assertFalse(s.buy());
		
		assertTrue("can build on owned street", s.buyHouse());
		assertEquals(State.ONEHOUSE, s.getState());
		
		assertEquals(20, s.calculateRent());
	}

}

