/**
 * 
 */
package controller;

/**
 * @author fennell
 *
 */
public interface IMouse {
	/**
	 * Handler for changes of the current pointer position, set by the OS
	 * @param x The current position of the pointer on the x-Axis (in pixels)
	 * @param y The current position of the pointer on the y-Axis (in pixels)
	 */
	public void updatePointer(int x, int y);
	
	/**
	 * Handler for mouse button presses, set by the OS
	 * @param b The button that was Pressed.
	 */
	public void updateButtonPress(MButton b);
	
	
	/**
	 * Assign the controller to a player
	 * @param player The player id to which to assign the controller.
	 */
	public void setPlayer(int player);

}
