package terminal;

/**
 * Abstract terminal... to be extended
 */
public abstract class ATerminal implements ITerminal, ICharBuffer,
		ITimer.Handler {

	protected final ITimer timer;

	/**
	 * @param timer
	 *            the timer for this terminal
	 */
	public ATerminal(ITimer timer) {
		this.timer = timer;
		this.timer.setHandler(this);
	}
	
	/**
	 * 
	 * @return get the current text in the terminal's buffer
	 */
	protected abstract String getAllText();

}
