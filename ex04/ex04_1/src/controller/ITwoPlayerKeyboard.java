package controller;

/**
 * A Keyboard controller that supports two players.
 * @author fennell
 *
 */
public interface ITwoPlayerKeyboard {
	/**
	 * Event handler that is invoked when a key is pressed.
	 * @param k The keycode that was pressed.
	 */
	public void updateKeyPress(KbKey k);
	
	
	/**
	 * Assign the controller to two players
	 * @param player1 The first player id to which to assign the controller.
	 * @param player2 The second player id to which to assign the controller.
	 */
	public void setPlayers(int player1, int player2);

}
