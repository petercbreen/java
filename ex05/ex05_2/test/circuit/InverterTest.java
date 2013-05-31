package circuit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test inverter functionality
 * @author Peter C. Breen
 *
 */
public class InverterTest {
	private Inverter invert1 = new Inverter(true);
	private Inverter invert2 = new Inverter(false);

	/**
	 * Test method
	 */
	@Test
	public void test() {
		invert1.updateOutputs();
		assertEquals(invert1.getInput(),!(invert1.getOutput()));
		assertEquals(invert1.getInput(), true);
		invert2.updateOutputs();
		assertEquals(invert2.getInput(),!(invert2.getOutput()));
		assertEquals(invert2.getInput(), false);
	}

	
}
