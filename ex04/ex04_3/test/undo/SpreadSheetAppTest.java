package undo;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class SpreadSheetAppTest {

	private Sheet a = new Sheet(3);
	private SpreadSheetApp ss = new SpreadSheetApp(a);
	
	/**
	 * test of the spreadsheet editing functionality
	 */
	@Test
	public void editingTest() {

		ss.put(0, 1);
		ss.put(1, 1);
		ss.put(2, 2);

		assertEquals("1/1/2/",ss.display());
		
		ss.put(2, 5);
		assertEquals("1/1/5/",ss.display());
	}
	
	/**
	 * test of the spreadsheet undo functionality
	 */
	@Test
	public void undoTest() {
		
		ss.setHistorySize(4);
		ss.put(0, 1);
		ss.put(1, 1);
		ss.put(2, 2);
		ss.put(0, 5);

		assertEquals("5/1/2/",ss.display());
	
		ss.undo();
		ss.undo();
		ss.undo();
		ss.undo();
		ss.undo();

	}

}
