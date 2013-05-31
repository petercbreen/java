package circuit;
/**
 * OR gate
 * @author Peter C. Breen
 *
 */
public class OrGate extends ABinaryGate {

	/**
	 * Constructor
	 * @param input1 input from wire 1
	 * @param input2 input from wire 2
	 */
	public OrGate(boolean input1, boolean input2) {
		super (input1, input2);
	}
	@Override
	public boolean computeFunction(boolean input1, boolean input2) {
		return input1 || input2;
	}
}
