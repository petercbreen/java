package trees;

import draw.Circle;
import draw.ICanvas;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class Leaf implements ITree {
	private ITree left;
	private ITree right;
	
	/**
	 * Constructor
	 */
	public Leaf() {
		this.left = null;
		this.right = null;
	}
		
	@Override
	public int height() {
		return 0;
	}

	@Override
	public void draw(int x, int y, int width, int height, ICanvas canvas) {
		int radius = 10;
		Circle c = new Circle(x, y, radius, "");
		canvas.drawCircle(c);
	}



}
