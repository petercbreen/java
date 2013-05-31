package adventure.viewcontroller;
import java.util.*;
import adventure.model.*;

/**
 * The main class which is called by the Swing thread and can do anything with
 * the GUI.
 * 
 * @author jakobro, Peter C. Breen
 * 
 */
public class Main {

	/**
	 * Start StoryWindow
	 * @param s story state passed to the window
	 */
	private List<StoryWindow> sw = new LinkedList<StoryWindow>();
	
	/**
	 * 
	 * @param s current story state
	 */
	public void run(IStoryState s) {
		StoryWindow x = new StoryWindow(s);
		sw.add(x);
		
	}
}
