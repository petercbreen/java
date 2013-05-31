/**
 * 
 */
package terminal;

/**
 * A simple timer interface, inspired by javax.swing.Timer
 */
public interface ITimer {
	
	/**
	 * Handler interface for ITimer
	 * @author fennell
	 *
	 */
	public interface Handler {
		/**
		 * Called when the timer fires.
		 */
		void onTimeout();
	}

	/**
	 * Set a handler for this timer
	 * @param h the handler
	 */
	public void setHandler(Handler h);
	
	/**
	 * Start the timer at ``zero''
	 */
	public void restart();
	
	/**
	 * Stop the timer
	 */
	public void stop();
	
	/**
	 * Set the timer's firing delay
	 * @param delay the delay in milliseconds
	 */
	public void setDelay(int delay);

}
