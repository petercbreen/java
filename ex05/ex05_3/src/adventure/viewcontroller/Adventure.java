/**
 * 
 */
package adventure.viewcontroller;

import adventure.model.ExampleStory;

/**
 * @author jakobro, Peter C. Breen
 * 
 */
public class Adventure {

	/**
	 * Main method of the program.
	 * 
	 * @param args
	 *            Unused.
	 */
	public static void main(String[] args) {
		// Enable anti aliasing, otherwise the output looks really ugly.
		System.setProperty("awt.useSystemAAFontSettings", "on");
		System.setProperty("swing.aatext", "true");

		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
        // Standard way of initializing swing main loop. See Oracle Tutorial.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main().run(ExampleStory.getStory());
			}
		});
	}
}
