/**
 * 
 */
package pongview;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * @author jakobro
 * 
 */
@SuppressWarnings("serial")
public class PongWindow extends JFrame implements KeyListener {

	/**
	 * Creates a new pong window.
	 * 
	 * @param areaWidth
	 *            width of the pong area
	 * @param areaHeight
	 *            height of the pong area
	 * @param racketHeight
	 *            The height of the paddle.
	 * @param ballDiameter
	 *            diameter of the ball.
	 */
	public PongWindow(int areaWidth, int areaHeight, int racketHeight,
			int ballDiameter) {
		super("Pong");
		
		setMinimumSize(new Dimension(areaWidth, areaHeight));
		setSize(new Dimension(areaWidth, areaHeight));
		getContentPane().add(new PongPanel());

		addKeyListener(this);
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
				PongWindow pw = new PongWindow(300, 100, 20, 10);
				pw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				pw.setVisible(true);
			}
		});
	}

	/**
	 * Handler which is called when a key pressed.
	 * @param arg0 Information abut the key pressed.
	 */
	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			// TODO Do something
		} else if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
			// TODO Do something
		}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}
