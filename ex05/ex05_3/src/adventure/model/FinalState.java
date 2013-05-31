package adventure.model;
import java.util.List;

/**
 * For the end of the story
 * @author Peter C. Breen
 *
 */
public class FinalState implements IStoryState {
	private String text;
	
	/**
	 * Constructor
	 * @param text text for constructor
	 */
	public FinalState(String text) {
		this.text = text;
	}

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public List<IStoryState> getAvailChoices() {
		return null;
	}
}
