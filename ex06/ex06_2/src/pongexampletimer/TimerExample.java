/**
 * 
 */
package pongexampletimer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/**
 * A timer example.
 * 
 * When this class is executed, a timer is started which prints 'Timer is fired'
 * every 100ms.
 * 
 * @author jakobro
 */
public class TimerExample implements ActionListener {

	private Timer timer;

	/**
	 * Creates a new empty window with a timer.
	 */
	public TimerExample() {
		timer = new Timer(100, this);
		timer.start();
	}

	/**
	 * The actionPerformed method is called every time the timer is fired.
	 * 
	 * @param e
	 *            Parameter of the event (unused)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Timer is fired");
	}

	/**
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		// Standard way of initializing swing main loop. See Oracle Tutorial.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TimerExample();
			}
		});
		// This invokeLater is necessary! If we just call
		// new TimerExample();
		// the application will immediately stop.
	}

}
