package controller;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class TwoPlayerKeyboardTest {

	private TwoPlayerKeyboard twoPlayerKeyboard1 = new TwoPlayerKeyboard();
		
		/**
		 * Check whether or not the keyboard entries generate the correct commands
		 */
		@Test
		public void keyPressTest() {
			twoPlayerKeyboard1.disable();
			assertTrue(twoPlayerKeyboard1.getNextCommand(0) == Command.NONE);
			
			twoPlayerKeyboard1.enable();
			assertTrue(twoPlayerKeyboard1.getNextCommand(0) == Command.NONE);
			
			twoPlayerKeyboard1.updateKeyPress(KbKey.UP);
			twoPlayerKeyboard1.updateKeyPress(KbKey.DOWN);
			twoPlayerKeyboard1.updateKeyPress(KbKey.LEFT);
			twoPlayerKeyboard1.updateKeyPress(KbKey.RIGHT);
			twoPlayerKeyboard1.updateKeyPress(KbKey.CTRL);

			twoPlayerKeyboard1.updateKeyPress(KbKey.W);
			twoPlayerKeyboard1.updateKeyPress(KbKey.S);
			twoPlayerKeyboard1.updateKeyPress(KbKey.A);
			twoPlayerKeyboard1.updateKeyPress(KbKey.D);
			twoPlayerKeyboard1.updateKeyPress(KbKey.ALT);
			
			assertTrue(twoPlayerKeyboard1.getNextCommand(0) == Command.NONE);
			assertTrue(twoPlayerKeyboard1.getNextCommand(0) == Command.NONE);
			assertTrue(twoPlayerKeyboard1.getNextCommand(0) == Command.LEFT);
			assertTrue(twoPlayerKeyboard1.getNextCommand(0) == Command.RIGHT);
			assertTrue(twoPlayerKeyboard1.getNextCommand(0) == Command.FIRE);
			
			assertTrue(twoPlayerKeyboard1.getNextCommand(1) == Command.NONE);
			assertTrue(twoPlayerKeyboard1.getNextCommand(1) == Command.NONE);
			assertTrue(twoPlayerKeyboard1.getNextCommand(1) == Command.LEFT);
			assertTrue(twoPlayerKeyboard1.getNextCommand(1) == Command.RIGHT);
			assertTrue(twoPlayerKeyboard1.getNextCommand(1) == Command.FIRE);
			
			twoPlayerKeyboard1.updateKeyPress(KbKey.A);
			twoPlayerKeyboard1.setPlayers(2, 3);
			assertTrue(twoPlayerKeyboard1.getNextCommand(2) == Command.NONE);
			assertTrue(twoPlayerKeyboard1.getNextCommand(3) == Command.NONE);
			
		}
}
