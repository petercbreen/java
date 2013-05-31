/**
 * 
 */
package terminal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Typing listener that updates a smiley count when the user stopped typing.
 */
public abstract class CountSmileys implements ITypingListener {
	
	private static Pattern smileyRe = Pattern.compile("(:\\)|:-\\))");
	
	/**
	 * Counts smileys in a string
	 * @param s the string
	 * @return the number of smileys contained in it
	 */
	private static int countSmileys(String s) {
		int count = 0;
		Matcher m = smileyRe.matcher(s);
		while (m.find()) {
			count++;
		}
		return count;
	}
	
	/**
	 * Hook method to specify where the counting result should go
	 * @param count the result
	 */
	protected abstract void setResult(int count);
	

	/* (non-Javadoc)
	 * @see terminal.ITypingListener#onStartTyping()
	 */
	@Override
	public void onStartTyping() {
		// nothing to do
	}

	/* (non-Javadoc)
	 * @see terminal.ITypingListener#onStopTyping(java.lang.String)
	 */
	@Override
	public void onStopTyping(long duration, String newText, String allText) {
		setResult(countSmileys(allText));
	}

	/* (non-Javadoc)
	 * @see terminal.ITypingListener#onSubmit(java.lang.String)
	 */
	@Override
	public void onSubmit(String s) {
		// reset the count on submit
		setResult(0);
	}

}
