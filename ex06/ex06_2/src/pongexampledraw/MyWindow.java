/**
 * 
 */
package pongexampledraw;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author jakobro
 * 
 */
@SuppressWarnings("serial")
public class MyWindow extends JFrame {

	private MyPanel myPanel;

	/**
	 * 
	 * @param width Width of the window.
	 * @param height Height of the window.
	 */
	public MyWindow(int width, int height) {
		// Setting window title.
		super("MyWindow");
		
		// Creating new panel.
		this.myPanel = new MyPanel();
		
		// Setting size of the window.
		// setMinimumSize(new Dimension(width, height));
		setSize(new Dimension(width, height));
		
		// Center window when created.
		setLocationRelativeTo(null);
		
		// Adding our new panel to the windottw.
		getContentPane().add(myPanel);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            unused
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
				MyWindow pw = new MyWindow(500, 500);
				pw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				pw.setVisible(true);
			}
		});
	}
}
