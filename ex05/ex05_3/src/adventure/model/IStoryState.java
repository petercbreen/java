package adventure.model;

import java.util.List;

/**
 * Interface for story state
 * @author Peter C. Breen
 *
 */
public interface IStoryState {
	/**
	 * Getter for the text descriptions
	 * of the available choices
	 * @return html-formatted text
	 */
	public String getText();
	
	
	/**
	 * Getter for the choices as story states
	 * @return the available states
	 */
	public List<IStoryState> getAvailChoices();
}
