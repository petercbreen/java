package circuit;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class OrGateTest {

	private OrGate og1 = new OrGate(false, false);
	private OrGate og2 = new OrGate(false, true);
	private OrGate og3 = new OrGate(true, false);
	private OrGate og4 = new OrGate(true, true);	
	
	/**
	 * Test 1
	 */
	@Test
	public void test1() {
		assertEquals(false, og1.getInput1());
		assertEquals(false, og1.getInput2());
		og1.updateOutputs();
		assertEquals(false, og1.getOutput());
	}
	
	/**
	 * Test 2
	 */
	@Test
	public void test2() {
		assertEquals(false, og2.getInput1());
		assertEquals(true, og2.getInput2());
		og2.updateOutputs();
		assertEquals(true, og2.getOutput());
	}
	
	/**
	 * Test 3
	 */
	@Test
	public void test3() {
		assertEquals(true, og3.getInput1());
		assertEquals(false, og3.getInput2());
		og3.updateOutputs();
		assertEquals(true, og3.getOutput());
	}
	
	/**
	 * Test 4
	 */
	@Test
	public void test4() {
		assertEquals(true, og4.getInput1());
		assertEquals(true, og4.getInput2());
		og4.updateOutputs();
		assertEquals(true, og4.getOutput());
	}

}
