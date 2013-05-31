package paper;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class ASeriesPaperSizeTest {
	private ASeriesPaperSize aPaper1 = new ASeriesPaperSize(0);
	private ASeriesPaperSize aOldPaper = new ASeriesPaperSize(0);
	private ASeriesPaperSize aNewPaper;
	
	/**
	 * Test method for ASeriesPaperSize.getName()
	 */
	@Test
	public void testNaming() {
		
		assertEquals("getName function does not produce accurate output", aPaper1.getName(), "A0");
		
	}
	
	/**
	 * Test method for GeneralPaperSize.bisect()
	 */
	@Test
	public void testBisect() {

		assertEquals("bisect test fails after one bisection", aPaper1.bisect().getName(), "A1");
		
		for(int x = 1; x < 8; x++) {
			aNewPaper = aOldPaper.bisect();
			aOldPaper = aNewPaper;
		}
		assertEquals("bisect test fails after time", aOldPaper.getName(), "A7");
		System.out.println(aOldPaper.getLength());
		assertTrue( aOldPaper.getLength() == 105.11205190671433);

	}

}
