package terminal;

/**
 * Listener for terminals that accept character entry
 */
public interface ITypingListener {
	/**
	 * invoked when the user starts typing on the terminal
	 */
	public void onStartTyping();

	/**
	 * invoked when the user stops typing on the terminal
	 * 
	 * @param duration
	 *            The time since typing started in ms (tolerance 100 ms)
	 * @param newText
	 *            The string of characters that was typed since starting typing.
	 * @param allText
	 *            The complete text that is buffered in the terminal since the
	 *            last submit.
	 */
	public void onStopTyping(long duration, String newText, String allText);

	/**
	 * invoked when the user has submitted a message
	 * 
	 * @param s
	 *            the complete message that was submitted
	 */
	public void onSubmit(String s);
	
}
