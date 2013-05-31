package undo;
/**
 * 
 * @author Peter C. Breen
 *
 */
import java.util.LinkedList;

/**
 * 
 * @author Peter C. Breen
 *
 */
public class SpreadSheetApp {
	private final LinkedList<Sheet> previousSheets = new LinkedList<Sheet>();
	private Sheet ss;
	private int historySize = 5;
	
	/**
	 * Constructor
	 * @param s Spreadsheet
	 */
	public SpreadSheetApp(Sheet s) {
		this.ss = s;
		addToHist(this.ss);
	}
	
	/**
	 * Modify the contents of a cell
	 * @param cell the cell to modify
	 * @param value the value to put in that cell
	 */
	public void put(int cell, int value) {
		this.ss.put(cell, value);
		addToHist(this.ss);
	}
	
	/**
	 * Change the separator character
	 * @param sep the new separator character
	 */
	public void setSeparator(char sep) {
		this.ss.setSeperator(sep);
	}
	
	/**
	 * Undo functionality through a linked list storing previous arrays
	 */
	public void undo() {
		if (this.previousSheets.size() > 1) {
			Sheet temp = this.previousSheets.removeLast();
			this.ss = temp;
		}
	}
	
	/**
	 * Return the contents of the current spreadsheet
	 * @return contents separated by character
	 */
	public String display() {
		return this.ss.display();
	}
	
	/**
	 * Allow modification of the history size
	 * @param sz Number of entries to be stored
	 */
	public void setHistorySize(int sz) {
		while (this.previousSheets.size() > sz) {
			this.previousSheets.removeFirst();
		}
		this.historySize = sz;
	}
	
	/**
	 * If still room in history, add to history
	 * @param s the sheet to be added to history
	 */
	private void addToHist(Sheet s) {
		if (this.previousSheets.size() < this.historySize) {
			this.previousSheets.addLast(s);
		} else {
			this.previousSheets.removeFirst();
			this.previousSheets.addLast(s);
		}
	}

}
