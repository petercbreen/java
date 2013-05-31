package trees;

import draw.Circle;
import draw.Line;
import draw.ICanvas;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class InnerNode implements ITree {
	private ITree left;
	private ITree right;
	private int value;
	
	/**
	 * Contructor
	 * @param value data stored in this node
	 * @param left left child
	 * @param right right child
	 */
	public InnerNode(int value, ITree left, ITree right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	/**
	 * Getter
	 * @return value
	 */
	public int getVal() {
		return this.value;
	}
	
	/**
	 * Getter
	 * @return left
	 */
	public ITree getLeft() {
		return this.left;
	}
	
	/**
	 * Getter
	 * @return left
	 */
	public ITree getRight() {
		return this.right;
	}
	
	
	@Override
	public int height() {
		if (this == null) {
			return 0;
		} else {
			ITree nLeft = this.getLeft();
			ITree nRight = this.getRight();
			return Math.max(nLeft.height(), nRight.height()) + 1;
		}
	}

	@Override
	public void draw(int x, int y, int width, int height, ICanvas canvas) {
		if (this != null) {
			
			if (x < 0 || x > width || y < 0 || y > height) {
				canvas.abort("not enough space to draw desired tree");
			}
			
			int radius = 10;
			Circle c = new Circle(x, y, radius,  Integer.toString(this.getVal()));
			canvas.drawCircle(c);
			

			
			ITree nLeft = this.getLeft();
			ITree nRight = this.getRight();
			
			double h = ((y-60)/75)+1;
			
			
			int xLeftNew = x - 30*(int)(5000/(1250*h));
			int yLeftNew = y + 75;
			int xRightNew = x + 30*(int)(5000/(1250*h));
			int yRightNew = y + 75;
			
			
			if (xLeftNew < 0 || xRightNew > width || yLeftNew < 0 || yLeftNew > height) {
				canvas.abort("not enough space to draw desired tree");
			}
						
			Line leftLine = new Line(x,y,xLeftNew,yLeftNew);
			Line rightLine = new Line(x,y,xRightNew,yRightNew);
			canvas.drawLine(leftLine);
			canvas.drawLine(rightLine);
			
			nLeft.draw(xLeftNew, yLeftNew, width, height, canvas);
			nRight.draw(xRightNew, yRightNew, width, height, canvas);
			
			
			
			
		}
	}

}
