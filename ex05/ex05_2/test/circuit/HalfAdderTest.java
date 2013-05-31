package circuit;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests of the half adder
 * @author Peter C. Breen
 *
 */
public class HalfAdderTest {

	private HalfAdder ha1 = new HalfAdder(false, false);
	private HalfAdder ha2 = new HalfAdder(false, true);
	private HalfAdder ha3 = new HalfAdder(true, false);
	private HalfAdder ha4 = new HalfAdder(true, true);
	
	/**
	 * Test 1
	 */
	@Test
	public void test1() {
		ha1.calculate();
		assertEquals(false, ha1.getCarry());
		assertEquals(false, ha1.getSum());
	}
	
	/**
	 * Test 2
	 */
	@Test
	public void test2() {
		ha2.calculate();
		assertEquals(false, ha2.getCarry());
		assertEquals(true, ha2.getSum());
	}
	
	/**
	 * Test 3
	 */
	@Test
	public void test3() {
		ha3.calculate();
		assertEquals(false, ha3.getCarry());
		assertEquals(true, ha3.getSum());
	}
	
	/**
	 * Test 4
	 */
	@Test
	public void test4() {
		ha4.calculate();
		assertEquals(true, ha4.getCarry());
		assertEquals(false, ha4.getSum());
	}

}
