/**
 * 
 */
package controller;

/**
 * @author fennell
 *
 */
public interface IController {
	/**
	 * @param player the id of the player that is supposed to be controlled.
	 * @return The next command that should be executed.
	 */
	public Command getNextCommand(int player);
	
	/**
	 * Enable this controller.
	 */
	public void enable();
	/**
	 * Disable this controller.
	 */
	public void disable();
	
}
