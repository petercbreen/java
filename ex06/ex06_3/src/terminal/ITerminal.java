/**
 * 
 */
package terminal;

/**
 * The listener-facing interface for terminals.
 */
public interface ITerminal {
	/**
	 * Add a listener for typing start- and stop-events
	 * @param handler The handler to register
	 */
	public void register(ITypingListener handler);
	
	
}
