package controller;

/**
 * A Keyboard that receives key-press events from the OS.
 * @author fennell
 *
 */
public interface IKeyboard {

	/**
	 * Event handler that is invoked when a key is pressed.
	 * @param k The keycode that was pressed.
	 */
	public abstract void updateKeyPress(KbKey k);
	
	
	/**
	 * Assign the controller to a player
	 * @param player The player id to which to assign the controller.
	 */
	public void setPlayer(int player);

}