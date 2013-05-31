/**
 * 
 */
package draw;

/**
 * @author fennell
 *
 */
public class Line implements ILine {
	private final int origX;
	private final int origY;
	private final int destX;
	private final int destY;
	
	
	/**
	 * @param origX the origin x coordinate
	 * @param origY the origin y coordinate
	 * @param destX the destination x coordinate 
	 * @param destY the destination y coordinate
	 */
	public Line(int origX, int origY, int destX, int destY) {
		super();
		this.origX = origX;
		this.origY = origY;
		this.destX = destX;
		this.destY = destY;
	}
	/**
	 * @return the origX
	 */
	public int getOrigX() {
		return origX;
	}
	/**
	 * @return the origY
	 */
	public int getOrigY() {
		return origY;
	}
	/**
	 * @return the destX
	 */
	public int getDestX() {
		return destX;
	}
	/**
	 * @return the destY
	 */
	public int getDestY() {
		return destY;
	}

}
