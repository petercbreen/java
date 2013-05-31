package paper;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class ASeriesPaperSize implements PaperSize {
	private int aNumber;

	@Override
	public String getName() {
		return "A" + String.valueOf(this.aNumber);
	}

	@Override
	public double getLength() {
		return ((Math.pow(2,0.25) * 1000) 
				/ (Math.pow(2,(this.aNumber + 1)/2))) 
				* Math.pow(2,0.5);
	}

	@Override
	public double getWidth() {
		return (Math.pow(2,0.25) * 1000) 
				/ (Math.pow(2,(this.aNumber + 1)/2)); 
	}

	@Override
	public ASeriesPaperSize bisect() {
		return new ASeriesPaperSize(this.aNumber + 1);
	}

	/**
	 * Constructor
	 * @param aNumber DIN-A number
	 */
	public ASeriesPaperSize(int aNumber) {
		this.aNumber = aNumber;
	}
}
