/**
 * 
 */
package terminal;

/**
 * An interface for reacting to entries of characters 
 */
public interface ICharBuffer {
	/**
	 * Called when a character is entered into the terminal
	 * 
	 * @param c
	 *            the character that was entered
	 */
	public abstract void onCharacterEntered(char c);
	
	/**
	 * Submit the typed message.
	 */
	public abstract void onSubmit();

}
