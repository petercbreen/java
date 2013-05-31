package paper;
/**
 * 
 * @author Peter C. Breen
 *
 */
public interface PaperSize {
	/**
	 * Get the name of the paper
	 * @return Name
	 */
	String getName();
	
	/**
	 * Get how long the paper is in mm
	 * @return Length
	 */
	double getLength();
	
	/**
	 * Get how wide the paper is in mm
	 * @return Width
	 */
	double getWidth();
	
	/**
	 * Cut the paper in half and return new paper
	 * Still must be in format that length is
	 * longer than width
	 * @return New paper size
	 */
	PaperSize bisect();

}
