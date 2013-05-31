/**
 * 
 */
package terminal;

/**
 * Simple statistics gathering typing listener.
 */
public abstract class TypingStats implements ITypingListener {
	
	/**
	 * Result stats of a typing period 
	 * @author fennell
	 *
	 */
	
	/**
	 * @param text a string
	 * @return the number of words in it
	 */
	private static int wordCount(String text) {
		String[] splitted = text.trim().split("\\s+");
		int count = 0;
		for (String s : splitted) {
			if (! s.trim().isEmpty()) count++;
		}
		return count;
	}
	
	/**
	 * Hook method for capturing the stats calculated
	 * @param wordCount the count
	 * @param duration the duration
	 */
	protected abstract void setResult(int wordCount, long duration);
	
	
	@Override
	public void onStartTyping() {
		// nothing to do
	}

	@Override
	public void onStopTyping(long duration, String newText, String allText) {
		setResult(wordCount(newText), duration);
	}

	@Override
	public void onSubmit(String s) {
		// no need to do anything
	}

}
