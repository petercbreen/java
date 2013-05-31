package draw;

/**
 * Interface for a simple canvas.
 * @author fennell
 *
 */
public interface ICanvas {
    /**
     * Draw a labeled circle on a canvas.
     *
     * @param circle the circle to draw
     */
    public void drawCircle(ICircle circle);

    /**
     * Draw a straight line connecting two points of a canvas.
     *
     * @param line the line to draw
     */
    public void drawLine(ILine line);
    
    /**
     * Abort the drawing.
     * @param message An error message explaining the abort
     */
    public void abort(String message);
    
    /**
     * @return the height
     */
    public int getDrawHeight();
    /**
     * @return the width
     */
    public int getDrawWidth();
 }

