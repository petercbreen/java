package paper;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class GeneralPaperSize implements PaperSize {
	private double length;
	private double width;
	@Override
	public String getName() {
		return String.valueOf(this.length) + "x" + String.valueOf(this.width);
	}

	@Override
	public double getLength() {
		return this.length;
	}

	@Override
	public double getWidth() {
		return this.width;
	}
	
	@Override
	public GeneralPaperSize bisect() {
		if (this.length >= this.width) {
			return new GeneralPaperSize(this.length/2, this.width);
		}
		else {
			return new GeneralPaperSize(this.length, this.width/2);
		}
	}
	
	/**
	 * Constructor
	 * @param length Length
	 * @param width Width
	 */
	public GeneralPaperSize(double length, double width) {
		this.length = length;
		this.width = width;
	}

}
