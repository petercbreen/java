package adventure.viewcontroller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JEditorPane;

import adventure.model.*;


/**
 * Where to display the story
 * @author Peter C. Breen
 *
 */
public class StoryWindow extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int width = 200;
	private static int height = 200;
	private static JButton[] bArray;
	private IStoryState currentState;

	/**
	 * Draw the current window
	 * @param s current story state
	 */
	public StoryWindow(IStoryState s) {
		
		super ("Abenteuer!");
		this.currentState = s;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComp(getContentPane(), s);
		pack();
		setVisible(true);
	
	
	}
	
	/**
	 * Getter
	 * @return current story state
	 */
	private IStoryState getThisState() {
		return this.currentState;
	}
	

	/**
	 * 
	 * @param c the Container for these components
	 * @param s the Current story state
	 */
	private void addComp(Container c, IStoryState s) {
		c.add(makeTextDescripPanel(s.getText()), BorderLayout.NORTH);
		c.add(makeButtonPanel(s),BorderLayout.SOUTH);
	}
	
	/**
	 * Print the html of the current choices
	 * @param htmlOfChoices the hmtl text from ExampleStory
	 * @return the html text as the top panel
	 */
	private Component makeTextDescripPanel(String htmlOfChoices) {
		JPanel header = new JPanel(new BorderLayout());

		JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);
        editorPane.setContentType("text/html");
        editorPane.setText(htmlOfChoices);

        
		header.setBackground(Color.WHITE);
		header.setSize(new Dimension(width, height));

		header.add(editorPane, BorderLayout.NORTH);
		
		return header;
	}
	
	/**
	 * Make the buttons
	 * @param t the current story state
	 * @return The buttons 
	 */
	private Component makeButtonPanel(IStoryState t) {
		
		int buttons = 1;
		
		if (t.getAvailChoices() != null) {
			buttons = t.getAvailChoices().size();	
		}
				
		JPanel buttonArea = new JPanel(new BorderLayout());
		buttonArea.setLayout( new GridLayout(0, buttons) );
		buttonArea.setPreferredSize(new Dimension(width, height));
		
		bArray = new JButton[buttons];

		
		if (t.getAvailChoices() != null) {
			for (int counter = 0; counter < buttons; counter++)
	        {
	            JButton newButton = new JButton(String.valueOf(counter+1));
	            newButton.addActionListener( this );
	            newButton.setActionCommand(Integer.toString(counter));
	            bArray[counter] = newButton;
	            buttonArea.add( newButton );
	        }
		} else {
			JButton newButton = new JButton("Das Ende!");
			newButton.addActionListener( this );
            newButton.setActionCommand("200");
			buttonArea.add( newButton );
		}

		return buttonArea;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		String intAsAString = ((JButton) event.getSource()).getActionCommand();
		
		int actionChosen = Integer.parseInt(intAsAString);
		
		if (actionChosen == 200) {
			System.exit(0);
		} else {
			dispose();
			IStoryState oldState = this.getThisState();
			List<IStoryState> newChoices = new LinkedList<IStoryState>();
			newChoices = oldState.getAvailChoices();
			new Main().run(newChoices.get(actionChosen));
		}
	}






	
}



