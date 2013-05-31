package adventure.model;
import java.util.*;



/**
 * Player must make a choice
 * @author Peter C. Breen
 *
 */
public class ChoiceState implements IStoryState {
	private List<IStoryState> theseChoices = new LinkedList<IStoryState>();
	private String text;

	/**
	 * Constructor
	 * @param text the text to be displayed on the current page
	 * @param choices the text for the other choices
	 */
	public ChoiceState(String text, List<IStoryState> choices) {
		this.text = text;
		this.theseChoices = choices;
		
	}

	@Override
	public String getText() {
		return this.text;
	}	
	@Override
	public List<IStoryState> getAvailChoices() {
		return this.theseChoices;
	}




	

}
