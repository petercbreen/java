package controller;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The mouse controller
 * @author fennell, redundancies removed by Peter C. Breen
 *
 */
public class Mouse extends AController implements IMouse, IController  {
	
	private int lastX = 0;
	private int lastY = 0;
	private final Queue<Command> pending = new LinkedList<Command>();
	public final static int THRESHOLD = 20;

	
	@Override
	public Command getNextCommand(int player) {
		if (pending.isEmpty() || this.isEnabled() == false || ! isMyPlayer(player)) {
			return Command.NONE;
		} else {
			return pending.remove();
		}
	}

	@Override
	public void updatePointer(int x, int y) {
		int change = x - lastX;
		if (change >= THRESHOLD) {
			pending.add(Command.RIGHT);
		} else if (change <= -THRESHOLD) {
			pending.add(Command.LEFT);
		} 
		lastX = x;
	    lastY = y;
	}

	@Override
	public void updateButtonPress(MButton b) {
		if (b == MButton.Button1) {
			pending.add(Command.FIRE);
		}
	}
	


}
