/**
 * 
 */
package draw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.beans.Transient;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * @author fennell
 * 
 */
public class Canvas extends JPanel implements ICanvas {

	private final int width;
	private final int height;
	private final Collection<ILine> lines = new ArrayList<ILine>();
	private final Collection<ICircle> circles = new ArrayList<ICircle>();
	private String abortMessage;

	/**
	 * @param width
	 *            the width of the canvas (in pixels)
	 * @param height
	 *            the height of the canvas (in pixels)
	 */
	public Canvas(int width, int height) {
		this.width = width;
		this.height = height;

		// Some cosmetics
		this.setBackground(Color.white);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}

	/**
	 * @return the width
	 */
	public int getDrawWidth() {
		return width;
	}

	/**
	 * @return the height
	 */
	public int getDrawHeight() {
		return height;
	}

	@Override
	public void drawCircle(ICircle circle) {
		circles.add(circle);
	}

	@Override
	public void drawLine(ILine line) {
		lines.add(line);
	}

	@Override
	public void abort(String message) {
		this.abortMessage = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (abortMessage == null) {
			// first paint the lines
			for (ILine l : lines) {
				g.drawLine(l.getOrigX(), l.getOrigY(), l.getDestX(),
						l.getDestY());
			}
			// the draw the circles over them
			for (ICircle c : circles) {
				int centerX = c.getX() - c.getRadius();
				int centerY = c.getY() - c.getRadius();
				int diameter = c.getRadius() * 2;
				g.setColor(Color.lightGray);
				g.fillOval(centerX, centerY, diameter, diameter);
				g.setColor(Color.black);
				g.drawOval(centerX, centerY, diameter, diameter);
//				g.drawString(c.getLabel(), c.getX(), c.getY());
				g.setFont(getFont().deriveFont(Font.BOLD, c.getRadius()*2));
				int strX = (int)Math.round(c.getX() - c.getRadius() / Math.sqrt(2));
				int strY = (int)Math.round(c.getY() + c.getRadius() / Math.sqrt(2));
				g.drawString(c.getLabel(), strX, strY);
			}
		} else {
			g.drawString(abortMessage, this.getDrawWidth()/2, this.getDrawHeight()/2);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#getPreferredSize()
	 */
	@Override
	@Transient
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

}
