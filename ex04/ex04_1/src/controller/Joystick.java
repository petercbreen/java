package controller;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Peter C. Breen
 *
 */
public class Joystick extends AController implements IJoystick, IController {
	private int lastExcursion = 0;
	private int lastAngle = 0;
	private final Queue<Command> pending = new LinkedList<Command>();
	public final static int THRESHOLD = 50;

	
	@Override
	public void updatePosition(int excursion, int angle) {
		if (angle >= 0 && angle <= 180 && excursion >= 0) {
			int change = (int)((double)excursion * Math.cos(Math.toRadians(angle))
					-(double)this.lastExcursion * Math.cos(Math.toRadians(this.lastAngle)));
			if (change >= THRESHOLD) {
				this.lastExcursion = excursion;
				this.lastAngle = angle;
				pending.add(Command.RIGHT);
			} else if (change <= -THRESHOLD) {
				pending.add(Command.LEFT);
			} else {
				pending.add(Command.NONE);
			}
		} else {
			pending.add(Command.NONE);
		}
	}

	@Override
	public void updateButtonPress(JSButton b) {
		if (b == JSButton.TRIGGER) {
			pending.add(Command.FIRE);
		}
	}

	@Override
	public Command getNextCommand(int player) {
		if (pending.isEmpty() || this.isEnabled() == false || ! isMyPlayer(player)) {
			return Command.NONE;
		} else {
			return pending.remove();
		}
	}


}
