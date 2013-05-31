package undo;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class SheetTest {

	private Sheet a = new Sheet(6);
	private Sheet b = new Sheet(3);
	
	/**
	 * Test of Sheet functionality
	 */
	@Test
	public void test() {
		for (int x = 0; x < 6; x++) {
			a.put(x, x);		
		}
		System.out.println(a.display());
		assertEquals(a.display(), "0/1/2/3/4/5/");
		assertTrue(a.get(5) == 5);
		assertTrue(a.get(18) == 0);		
		
		a.setSeperator('*');
		assertEquals(a.display(), "0*1*2*3*4*5*");
	
		b.setSeperator('$');
		assertEquals(b.display(), "0$0$0$");
		assertEquals(b.getSep(), '$');
		
		
	}

}
