package circuit;
/**
 * AND gate
 * @author Peter C. Breen
 *
 */
public class AndGate extends ABinaryGate {

	/**
	 * Constructor
	 * @param input1 input from wire 1
	 * @param input2 input from wire 2
	 */
	public AndGate(boolean input1, boolean input2) {
		super (input1, input2);
	}
	@Override
	public boolean computeFunction(boolean input1, boolean input2) {
		return input1 && input2;
	}

}
