package paper;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class GeneralPaperSizeTest {

	private GeneralPaperSize paper1 = new GeneralPaperSize(100.0, 200.0);
	private GeneralPaperSize paper2 = new GeneralPaperSize(100.0, 100.0);
	private GeneralPaperSize paper3 = new GeneralPaperSize(10000.235, 200.0);
	private GeneralPaperSize paper4 = new GeneralPaperSize(200.0, 10000.0);
	private GeneralPaperSize oldPaper = new GeneralPaperSize(200.0, 200.0);
	private GeneralPaperSize newPaper;
	
	/**
	 * Test method for GeneralPaperSize.getName()
	 */
	@Test
	public void testNaming() {
		
		assertEquals("getName function does not produce accurate output", paper1.getName(), "100.0x200.0");
		assertEquals("getName function does not produce accurate output", paper2.getName(), "100.0x100.0");
		assertEquals("getName function does not produce accurate output", paper3.getName(), "10000.235x200.0");
		assertEquals("getName function does not produce accurate output", paper4.getName(), "200.0x10000.0");
				
	}
	
	/**
	 * Test method for GeneralPaperSize.bisect()
	 */
	@Test
	public void testBisect() {

		assertTrue("bisect test fails after one bisection", paper1.bisect().getLength() == paper1.bisect().getWidth());
		
		for(int x = 0; x < 100; x++) {
			newPaper = oldPaper.bisect();
			oldPaper = newPaper;
		}
		assertTrue("bisect test fails after a long time", oldPaper.getLength() == oldPaper.getWidth());

	}
	
	/**
	 * Test method for GeneralPaperSize.getWidth()
	 */
	@Test
	public void testGetWidth() {

		assertTrue("get width test fails", paper1.getWidth() == 200.0);
	}
	
	
	
	/**
	 * Test method for GeneralPaperSize.getLength()
	 */
	@Test
	public void testGetLength() {
		assertTrue("get length test fails",paper1.getLength() == 100.0); 
	}
	
	

}
