/**
 * 
 */
package draw;

/**
 * @author fennell
 *
 */
public class Circle implements ICircle {
	private final int x;
	private final int y;
	private final int radius;
	private final String label;
	
	/**
	 * @param x the x
	 * @param y the y
	 * @param radius the radius
	 * @param label the label
	 */
	public Circle(int x, int y, int radius, String label) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.label = label;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
}
