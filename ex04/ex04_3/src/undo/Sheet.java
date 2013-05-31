package undo;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class Sheet {
	private final int numCells;
	private int cells[];
	private char sep = '/';
	/**
	 * Constructor
	 * @param numCells number of cells desired in spreadsheet
	 */
	public Sheet(int numCells) {
		this.cells = new int [numCells];
		this.numCells = numCells;
		
		for (int x = 0; x < this.numCells; x++) {
			this.cells[x] = 0;
		}
	}
	
	/**
	 * 
	 * @param sep set the current separator character
	 */
	public void setSeperator(char sep) {
		this.sep = sep;
	}
	
	/**
	 * 
	 * @return what the current separator character is
	 */
	public char getSep() {
		return this.sep;
	}
	
	/**
	 * 
	 * @return the contents of the spreadsheet as a string
	 */
	public String display() {
		StringBuilder stringToReturn = new StringBuilder();
		for (int x = 0; x < this.numCells; x++) {
			stringToReturn.append(this.cells[x]);
			stringToReturn.append(this.sep);
		}
		return stringToReturn.toString();
	}
	
	
	/**
	 * 	
	 * @param index which cell to look at
	 * @return the value stored in that cell
	 */
	public int get(int index) {
		if (index < this.numCells && index >= 0) {
			return this.cells[index];
		} else {
			return this.cells[0];
		}
				
	}
	
	/**
	 * Modify the spreadsheet
	 * @param cell which cell to look at
	 * @param value the integer to put in that cell
	 */
	public void put(int cell, int value) {
		if (cell < this.numCells && cell >= 0) {
			this.cells[cell] = value;
		} else {
			this.cells[0] = value;
		}
	}
}
