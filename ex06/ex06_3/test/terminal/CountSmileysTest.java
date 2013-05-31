/**
 * 
 */
package terminal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author fennell
 *
 */
public class CountSmileysTest {
	
	private CountSmileysResult cs;
	private StringBuffer text;

	/**
	 * Mock for smiley count class
	 */
	private class CountSmileysResult extends CountSmileys {
			private int result;

			@Override
			protected void setResult(int s) {
				result = s;
			}
			
			/**
			 * @return the smiley count
			 */
			public int getSmileyCount() {
				return result;
			}
	}
	/**
	 * @throws java.lang.Exception when something goes wrong
	 */
	@Before
	public void setUp() throws Exception {
		cs = new CountSmileysResult();
		text = new StringBuffer();
	}

	/**
	 * Add some text
	 * @param s the text
	 */
	private void addText(String s) {
		text.append(s);
		cs.onStartTyping();
		cs.onStopTyping(0, s, text.toString());
	}
	
	/**
	 * Simulate a submit
	 */
	private void mockSubmit() {
		cs.onSubmit(text.toString());
		text.setLength(0);
	}
	/**
	 * Test case
	 */
	@Test
	public void test() {
		assertEquals(0, cs.getSmileyCount());
		addText("");
		assertEquals(0, cs.getSmileyCount());
		addText("Hello :) World :)");
		assertEquals(2, cs.getSmileyCount());
		addText("What's up");
		assertEquals(2, cs.getSmileyCount());
		addText(". ::-) Testing is fun");
		assertEquals(3, cs.getSmileyCount());
		mockSubmit();
		addText("What's up");
		assertEquals(0, cs.getSmileyCount());
	}

}
