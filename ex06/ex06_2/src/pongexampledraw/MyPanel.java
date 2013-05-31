/**
 * 
 */
package pongexampledraw;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 
 * Creating our own panel which we use to draw stuff.
 * 
 * It might be useful to add width and height for the playground
 * when using this for pong...
 * 
 * @author jakobro
 * 
 */
@SuppressWarnings("serial")
public class MyPanel extends JPanel {

	/**
	 * Creates a new CustomPanel.
	 * 
	 */
	public MyPanel() {
	}

	/**
	 * Draw content.
	 * @param g The graphics object we can use for drawing.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Erase everything
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.red);
		g.drawOval(5, 5, 20, 20);
		
		g.setColor(Color.white);
		g.fillOval(5, 30, 20, 20);
		
		g.setColor(Color.red);
		g.drawRect(30, 5, 20, 20);
		
		g.setColor(Color.white);
		g.fillRect(30, 30, 20, 20);
		
		for (int y=30;y<300;y+=10) {
			g.drawLine(60, y, 300, 300-y);
		}
	}
}
