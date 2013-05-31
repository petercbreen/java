package circuit;
/**
 * Binary gates take two input wires
 * The output value is determined by the type
 * of gate
 * @author Peter C. Breen
 *
 */
public abstract class ABinaryGate implements IComponent {
	private Wire input1;
	private Wire input2;
	private Wire output;
	
	/**
	 * Constructor
	 * @param input1 input from wire 1
	 * @param input2 input from wire 2
	 */
	public ABinaryGate(boolean input1, boolean input2) {
		this.input1 = new Wire(input1);
		this.input2 = new Wire(input2);
		this.output = new Wire(false);
	}
	
	/**
	 * Getter for input1
	 * @return value
	 */
	public boolean getInput1() {
		return this.input1.getValue();
	}
	
	/**
	 * Getter for input 2
	 * @return value
	 */
	public boolean getInput2() {
		return this.input2.getValue();
	}
	
	/**
	 * Getter for output
	 * @return value
	 */
	public boolean getOutput() {
		return this.output.getValue();
	}
	
	
	
	
	@Override
	public void updateOutputs() {
		this.output.setValue(computeFunction(this.input1.getValue(), this.input2.getValue()));
	}
	
	/**
	 * 
	 * @param input1 input from wire 1
	 * @param input2 input from wire 2
	 * @return the value of the output wire
	 */
	public abstract boolean computeFunction(boolean input1, boolean input2);

}
