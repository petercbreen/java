/**
 * 
 */
package controller;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author fennell
 *
 */
public class Keyboard extends AController implements IController, IKeyboard {
	private final Queue<KbKey> pending = new LinkedList<KbKey>();

	@Override
	public Command getNextCommand(int player) {
		if (pending.isEmpty() || ! isEnabled() || !(isMyPlayer(player))) {
			return Command.NONE;
		} else {
			KbKey k = pending.remove();
			if (k == KbKey.LEFT) { 
				return Command.LEFT;
			} else if (k == KbKey.RIGHT) {
				return Command.RIGHT;
			} else if (k == KbKey.CTRL) {
				return Command.FIRE;
			} else {
				return Command.NONE;
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see controller.IKeyboard#updateKeyPress(controller.KbKey)
	 */
	@Override
	public void updateKeyPress(KbKey k) {
		pending.add(k);
	}
	


}
