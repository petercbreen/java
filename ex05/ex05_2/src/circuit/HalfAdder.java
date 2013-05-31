package circuit;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class HalfAdder {

	private AndGate ag;
	private OrGate og;
	private Wire carry;
	private Wire sum;
	
	
	/**
	 * Constructor
	 * @param x input1
	 * @param y input2
	 */
	public HalfAdder(boolean x, boolean y) {
		this.ag = new AndGate(x, y);
		this.og = new OrGate(x, y);
		this.carry = new Wire(false);
		this.sum = new Wire(true);
		
	}
	
	/**
	 * The actual logical operations of the half-adder
	 */
	public void calculate() {
		ag.updateOutputs();
		og.updateOutputs();
		this.carry.setValue(ag.getOutput());
		
		if (this.ag.getOutput() == false) {
			this.sum.setValue(og.getOutput());
		} else {
			this.sum.setValue(false);
		}		
	}
	
	/**
	 * Getter for sum
	 * @return value of sum
	 */
	public boolean getSum() {
		return this.sum.getValue();
	}
	
	/**
	 * Getter for carry
	 * @return value of carry
	 */
	public boolean getCarry() {
		return this.carry.getValue();
	}
	
}
