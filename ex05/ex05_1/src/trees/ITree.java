/**
 * 
 */
package trees;

import draw.ICanvas;

/**
 * @author fennell
 * 
 */
public interface ITree {
	/**
	 * @return the height of the tree
	 */
	public int height();

	/**
	 * Draw the tree on a canvas, using the given width and height. When the
	 * rectangle is not large enough, abort drawing.
	 * 
	 * @param x
	 *            the topLeft corner's x coordinate
	 * @param y
	 *            the topLeft corner's y coordinate
	 * @param width
	 *            the
	 * @param height
	 *            the height of the area to draw in
	 * @param canvas
	 *            the canvas to draw this node's subtree in
	 */
	public void draw(int x, int y, int width, int height, ICanvas canvas);

}
