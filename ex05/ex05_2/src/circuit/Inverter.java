package circuit;

/**
 * Inverts boolean from in wire and sets as value for out wire
 * @author Peter C. Breen
 *
 */
public class Inverter implements IComponent {
	private Wire in;
	private Wire out;
	
	/**
	 * Contructor
	 * @param inValue initial values for the input wire
	 */
	public Inverter(boolean inValue) {
		this.in = new Wire(inValue);
		this.out = new Wire(false);
	}
		
	@Override
	public void updateOutputs() {
		this.out.setValue(!(this.in.getValue()));
	}
	
	/**
	 * Getter for the value of input wire
	 * @return boolean value
	 */
	public boolean getInput() {
		return this.in.getValue();
	}
	
	/**
	 * Getter for the value of the output wire
	 * @return boolean value
	 */
	public boolean getOutput() {
		return this.out.getValue();
	}

}
