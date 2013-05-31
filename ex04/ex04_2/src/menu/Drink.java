/**
 * 
 */
package menu;

import menu.Entry;

/**
 * A drink as an entry in the menu list.
 * @author jakobro
 */
public class Drink implements Entry {

	private String name;
	private String description;
	private int price;

	/**
	 * @return Returns the name of the dish.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return Returns the description of the dish.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return Returns the price of the dish in ct. 
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Creates a new drink.
	 * @param name The name of the drink.
	 * @param description The description of the drink.
	 * @param price The price of the drink.
	 */
	public Drink(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
}
