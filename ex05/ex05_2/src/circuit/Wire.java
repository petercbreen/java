package circuit;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class Wire {
	private boolean value;
	
	/**
	 * Constructor
	 * @param value Passed to constructor
	 */
	public Wire(boolean value) {
		this.value = value;
	}
	
	/**
	 * Setter method
	 * @param value New value to set
	 */
	public void setValue(boolean value) {
		this.value = value;
	}
	
	/**
	 * Getter method
	 * @return Gets current value
	 */
	public boolean getValue() {
		return this.value;
	}

}
