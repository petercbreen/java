package controller;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class KeyboardTest {
	private Keyboard keyboard1 = new Keyboard();
	
	/**
	 * Check whether or not the keyboard entries generate the correct commands
	 */
	@Test
	public void keyPressTest() {
		keyboard1.disable();
		assertTrue(keyboard1.getNextCommand(0) == Command.NONE);
		
		keyboard1.enable();
		
		keyboard1.updateKeyPress(KbKey.UP);
		keyboard1.updateKeyPress(KbKey.DOWN);
		keyboard1.updateKeyPress(KbKey.LEFT);
		keyboard1.updateKeyPress(KbKey.RIGHT);
		keyboard1.updateKeyPress(KbKey.CTRL);
		
		keyboard1.updateKeyPress(KbKey.A);
		keyboard1.updateKeyPress(KbKey.S);
		keyboard1.updateKeyPress(KbKey.D);
		keyboard1.updateKeyPress(KbKey.W);
		keyboard1.updateKeyPress(KbKey.ALT);
		
		assertTrue(keyboard1.getNextCommand(0) == Command.NONE);
		assertTrue(keyboard1.getNextCommand(0) == Command.NONE);
		assertTrue(keyboard1.getNextCommand(0) == Command.LEFT);
		assertTrue(keyboard1.getNextCommand(0) == Command.RIGHT);
		assertTrue(keyboard1.getNextCommand(0) == Command.FIRE);
		
		assertTrue(keyboard1.getNextCommand(0) == Command.NONE);
		assertTrue(keyboard1.getNextCommand(0) == Command.NONE);
		assertTrue(keyboard1.getNextCommand(0) == Command.NONE);
		assertTrue(keyboard1.getNextCommand(0) == Command.NONE);
		assertTrue(keyboard1.getNextCommand(0) == Command.NONE);
		
		keyboard1.setPlayer(1);
		keyboard1.updateKeyPress(KbKey.LEFT);
		assertTrue(keyboard1.getNextCommand(1) == Command.LEFT);
		
		
		
	}

}
