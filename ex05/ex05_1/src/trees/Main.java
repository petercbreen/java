package trees;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import draw.Canvas;

/**
 * Main class that draws trees.
 * 
 * @author fennell
 * 
 */
public class Main {
	/**
	 * The main method
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {

		// see the tutorials for further information
		// (http://docs.oracle.com/javase/tutorial/uiswing/)
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				
				InnerNode n0 = new InnerNode(0, new Leaf(), new Leaf());
				InnerNode n1 = new InnerNode(1, new Leaf(), new Leaf());
				InnerNode n2 = new InnerNode(2, new Leaf(), new Leaf());
				InnerNode n3 = new InnerNode(3, new Leaf(), new Leaf()); 
				InnerNode n4 = new InnerNode(4, n0, new Leaf());
				InnerNode n5 = new InnerNode(5, n1, new Leaf());
				InnerNode n6 = new InnerNode(6, new Leaf(), n2);
				InnerNode n7 = new InnerNode(7, new Leaf(), n3);
				
				InnerNode n8 = new InnerNode(8, n4, n5);
				InnerNode n9 = new InnerNode(9, n6, n7);
				
				InnerNode n10 = new InnerNode(10, n8, n9);
				
				
				
				
				Canvas canvas = new Canvas(600,600);
				n10.draw(300, 60, 600, 600, canvas);
				createAndShowGUI(canvas);
				System.out.print("height of tree 1: " + n10.height());
				System.out.println("");
				
				
				
				
				
				
				InnerNode n11 = new InnerNode(11, new Leaf(), new Leaf());
				InnerNode n12 = new InnerNode(12, new Leaf(), new Leaf());
				
				InnerNode n13 = new InnerNode(13, n11, new Leaf());
				InnerNode n14 = new InnerNode(14, new Leaf(), n12);
				
				InnerNode n15 = new InnerNode(15, n13, n14);
				
				
				
				
				Canvas canvas2 = new Canvas(600,600);
				
				n15.draw(300, 60, 600, 600, canvas2);
				createAndShowGUI(canvas2);
				
				System.out.print("height of tree 2: " + n10.height());
				System.out.println("");
				
				
				
				
				
				
				
			}
		});
	}

	/**
	 * Show a GUI with a single panel.
	 * 
	 * @param panel
	 *            The panel to show
	 */
	private static void createAndShowGUI(JPanel panel) {
		// Create and set up the window.
		JFrame frame = new JFrame("Trees");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the panel to the frame
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().add(panel);
		

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}
