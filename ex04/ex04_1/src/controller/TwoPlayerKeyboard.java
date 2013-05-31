package controller;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Peter C. Breen
 *
 */
public class TwoPlayerKeyboard extends AController implements IController, ITwoPlayerKeyboard {
	private int player1 = 0;
	private int player2 = 1;
	private final Queue<KbKey> pending = new LinkedList<KbKey>();

	@Override
	public Command getNextCommand(int player) {
		if (pending.isEmpty() || ! isEnabled()) {
			return Command.NONE;
		} else if ( isPlayer1(player)) {
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
		} else if ( isPlayer2(player)) {
			KbKey k = pending.remove();
			if (k == KbKey.A) { 
				return Command.LEFT;
			} else if (k == KbKey.D) {
				return Command.RIGHT;
			} else if (k == KbKey.ALT) {
				return Command.FIRE;
			} else {
				return Command.NONE;
			}
		} else {
			return Command.NONE;
		}
	}
	
	@Override
	public void updateKeyPress(KbKey k) {
		pending.add(k);		
	}

	@Override
	public void setPlayers(int player1, int player2) {
		this.player1 = player1;
		this.player2 = player2;		
	}

	/**
	 * 
	 * @param player the player entering the command
	 * @return true is the player is player1
	 */
	public boolean isPlayer1(int player) {
		return player == this.player1;
	}
	/**
	 * 
	 * @param player the player entering the command
	 * @return true if the player is player2
	 */
	public boolean isPlayer2(int player) {
		return player == this.player2;
	}

	

}
