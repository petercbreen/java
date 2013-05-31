package controller;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class JoystickTest {

	private Joystick js1 = new Joystick();
	/**
	 * Check whether or not the joystick trigger clicks generate the correct commands
	 */
	@Test
	public void joystickButtonTest() {
		js1.setPlayer(1);
		
		js1.disable();
		assertTrue(js1.getNextCommand(1) == Command.NONE);
		js1.enable();
		
		
		
		
		js1.updateButtonPress(JSButton.SECONDARY);
		assertTrue(js1.getNextCommand(1) == Command.NONE);
		js1.updateButtonPress(JSButton.TRIGGER);
		assertTrue(js1.getNextCommand(1) == Command.FIRE);
		js1.updateButtonPress(JSButton.SECONDARY);
		assertTrue(js1.getNextCommand(1) == Command.NONE);
		assertTrue(js1.getNextCommand(1) == Command.NONE);
		assertTrue(js1.getNextCommand(1) == Command.NONE);
		
	}
	
	/**
	 * Test whether or not the joystick movements generate the correct commands
	 */
	@Test
	public void joystickPositionTest() {

		js1.setPlayer(2);
		js1.updatePosition(100, 200);
		js1.updatePosition(500, 10);
		js1.updatePosition(500, 170);
		assertTrue(js1.getNextCommand(2) == Command.NONE);
		assertTrue(js1.getNextCommand(2) == Command.RIGHT);
		assertTrue(js1.getNextCommand(2) == Command.LEFT);
		assertTrue(js1.getNextCommand(2) == Command.NONE);
	}
}
