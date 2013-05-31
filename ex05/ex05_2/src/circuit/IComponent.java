package circuit;
/**
 * A digital circuit component
 * @author Peter C. Breen
 *
 */
interface IComponent {
	/**
	 * computer new values for all outputs from the current
	 * state of the inputs and write the values to the outputs
	 */
	public void updateOutputs();
}
