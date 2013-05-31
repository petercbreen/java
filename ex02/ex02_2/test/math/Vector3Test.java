/**
 * 
 */
package math;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * test to see if implementation passes
 * @author pcbreen
 *
 */
public class Vector3Test {
    /**
     * Test case.
     */
	@Test
	public void test() {
		Vector3 testVect1 = new Vector3(2.0,3.0,5.0);
		assertFalse(testVect1.isNull());
		

	}



}