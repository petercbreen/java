/**
 * 
 */
package menu;

/**
 * Common interface of entries in the menu.
 * @author jakobro
 */
public interface Entry {

	/**
	 * @return the name of the entry.
	 */
	public String getName();
	
	/**
	 * @return the description of the entry.
	 */
	public String getDescription();
	
	/**
	 * @return the price of the entry in ct.
	 */
	public int getPrice();
}
