/**
 * 
 */
package terminal.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * View for the chat window
 *
 */
public class ChatView extends JFrame {
	
	// Ignore this
	private static final long serialVersionUID = 1L;
	
	protected final JEditorPane text;
	protected final JButton submit;
	protected final JLabel smileyCount;
	protected final JLabel stats;
	/**
	 * A GUI for a chat window
	 */
	public ChatView() {
		
		// The text
		this.text = mkEditor();
		
		// The submit button
		this.submit = new JButton("Submit");
		this.submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("");
			}
		});
		
		// The status labels
		this.smileyCount = new JLabel(); 
		this.stats = new JLabel(); 
		
		arrange(this);
	}
	
	/**
	 * @return the editor
	 */
	private static JEditorPane mkEditor() {
		JEditorPane result = new JEditorPane();
		result.setPreferredSize(new Dimension(600, 400));
		return result;
	}
	
	/**
	 * @return the panel
	 */
	private static JPanel mkXPanel() {
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.setAlignmentX(LEFT_ALIGNMENT);
		return p;
	}
	
	
	/**
	 * Arrange the components on the view
	 * @param me the un-arranged view
	 */
	private static void arrange(ChatView me) {
		me.setLayout(new BoxLayout(me.getContentPane(), BoxLayout.Y_AXIS));
		me.setPreferredSize(new Dimension(640, 480));
		
		JLabel scTitle = new JLabel("Smiley Count: ");
		JLabel stTitle = new JLabel("Stats: ");
		JPanel sc = mkXPanel();
		JPanel st = mkXPanel();
		
		
		sc.add(scTitle);
		sc.add(me.smileyCount);
		st.add(stTitle);
		st.add(me.stats);
		
		me.add(me.text);
		me.add(sc);
		me.add(st);
		me.add(me.submit);
	}
	

	/**
	 * @return the text
	 */
	public JEditorPane getText() {
		return text;
	}
	/**
	 * @return the submit button
	 */
	public JButton getSubmit() {
		return submit;
	}
	/**
	 * @return the smiley count component
	 */
	public JLabel getSmileyCount() {
		return smileyCount;
	}
	/**
	 * @return the stats component
	 */
	public JLabel getStats() {
		return stats;
	}
}
