package circuit;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test of AND gate
 * @author Peter C. Breen
 *
 */
public class AndGateTest {

	private AndGate ag1 = new AndGate(false, false);
	private AndGate ag2 = new AndGate(false, true);
	private AndGate ag3 = new AndGate(true, false);
	private AndGate ag4 = new AndGate(true, true);	
	
	/**
	 * Test 1
	 */
	@Test
	public void test1() {
		assertEquals(false, ag1.getInput1());
		assertEquals(false, ag1.getInput2());
		ag1.updateOutputs();
		assertEquals(false, ag1.getOutput());
	}
	
	/**
	 * Test 2
	 */
	@Test
	public void test2() {
		assertEquals(false, ag2.getInput1());
		assertEquals(true, ag2.getInput2());
		ag2.updateOutputs();
		assertEquals(false, ag2.getOutput());
	}
	
	/**
	 * Test 3
	 */
	@Test
	public void test3() {
		assertEquals(true, ag3.getInput1());
		assertEquals(false, ag3.getInput2());
		ag3.updateOutputs();
		assertEquals(false, ag3.getOutput());
	}
	
	/**
	 * Test 4
	 */
	@Test
	public void test4() {
		assertEquals(true, ag4.getInput1());
		assertEquals(true, ag4.getInput2());
		ag4.updateOutputs();
		assertEquals(true, ag4.getOutput());
	}

}
