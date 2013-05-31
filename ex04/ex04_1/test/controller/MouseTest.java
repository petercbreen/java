package controller;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class MouseTest {
	private Mouse mouse1 = new Mouse();
	/**
	 * Check whether or not the mouse clicks generate the correct commands
	 */
	@Test
	public void mouseClickTest() {
		mouse1.setPlayer(1);
		mouse1.disable();
		assertTrue(mouse1.getNextCommand(1) == Command.NONE);
		
		mouse1.enable();
		mouse1.updateButtonPress(MButton.Button1);
		mouse1.updateButtonPress(MButton.Button2);
		mouse1.updateButtonPress(MButton.Button3);
		assertTrue(mouse1.getNextCommand(1) == Command.FIRE);
		assertTrue(mouse1.getNextCommand(1) == Command.NONE);
		assertTrue(mouse1.getNextCommand(1) == Command.NONE);
		
	}
	
	/**
	 * Test whether or not the mouse movements generate the correct commands
	 */
	@Test
	public void mousePositionTest() {

		mouse1.setPlayer(2);
		mouse1.updatePointer(100, 200);
		mouse1.updatePointer(200, 100);
		mouse1.updatePointer(100, 500);
		assertTrue(mouse1.getNextCommand(2) == Command.RIGHT);
		assertTrue(mouse1.getNextCommand(2) == Command.RIGHT);
		assertTrue(mouse1.getNextCommand(2) == Command.LEFT);
		assertTrue(mouse1.getNextCommand(2) == Command.NONE);
	}
	
}
