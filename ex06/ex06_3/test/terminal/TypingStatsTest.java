/**
 * 
 */
package terminal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author fennell
 * 
 */
public class TypingStatsTest {

	/**
	 * Mock implementation of typing stats.
	 */
	public static class TypingStatsResult extends TypingStats {
		/**
		 * Result class for stats
		 */
		public class Result {
			private final int wordCount;
			private final long timeSpan;

			/**
			 * @return The wordCount
			 */
			public int getWordCount() {
				return wordCount;
			}

			/**
			 * @return the timeSpan
			 */
			public long getTimeSpan() {
				return timeSpan;
			}

			/**
			 * @param wordCount The wordCount
			 * @param timeSpan The timeSpan
			 */
			private Result(int wordCount, long timeSpan) {
				this.wordCount = wordCount;
				this.timeSpan = timeSpan;
			}
		}
		
		private Result result;

		@Override
		protected void setResult(int wordCount, long duration) {
			this.result = new Result(wordCount, duration);
		}
		
		/**
		 * @return The result
		 */
		public Result getLastResult() {
			return result;
		}

	}

	private TypingStatsResult stats;

	/**
	 * Test case
	 */
	@Before
	public void setUp() {
		stats = new TypingStatsResult();
	}

	/**
	 * Add some text
	 * 
	 * @param duration
	 *            the duration
	 * @param stats
	 *            the stats
	 * @param newText
	 *            the text to add
	 */
	private static void addText(int duration, TypingStats stats, String newText) {
		stats.onStartTyping();
		stats.onStopTyping(duration, newText, newText);
	}

	/**
	 * Get stats for single text
	 * 
	 * @param newText
	 *            the text
	 * @return the result
	 */
	private static TypingStatsResult.Result resultWithText(String newText) {
		TypingStatsResult stats = new TypingStatsResult();
		addText(0, stats, newText);
		return stats.getLastResult();
	}

	/**
	 * Test case (not very interesting)
	 */
	@Test
	public void testTimeSpan() {
		int[] expectedTimes = new int[] { 11, 22, 493, 27 };
		for (int i = 0; i < expectedTimes.length; i++) {
			addText(expectedTimes[i], stats, "Hello" + i);
			assertEquals(expectedTimes[i], stats.getLastResult().getTimeSpan());
		}
	}

	/**
	 * Test case
	 */
	@Test
	public void testWordCount() {
		assertEquals(0, resultWithText("").getWordCount());
		assertEquals(1, resultWithText("HelloWorld").getWordCount());
		assertEquals(0, resultWithText("        ").getWordCount());
		assertEquals(0, resultWithText("   \n\n\n     ").getWordCount());
		assertEquals(2, resultWithText("Hello World").getWordCount());
		assertEquals(5, resultWithText("Hello World, again, and again.")
				.getWordCount());
		assertEquals(5, resultWithText("Hello World,   \n again,  and again.")
				.getWordCount());
		assertEquals(5,
				resultWithText("\n Hello World,   \n again,  and again.")
						.getWordCount());
	}

}
