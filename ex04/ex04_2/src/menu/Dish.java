/**
 * 
 */
package menu;

import menu.Entry;

/**
 * A dish as an entry of a menu list.
 * @author jakobro
 */
public class Dish implements Entry {
	
	private String name;
	private String description;
	private int price;
	private boolean vegetarian;
	
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
	 * @return Returns the price of the dish. 
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @return Whether the dish is vegetarian.
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}

	/**
	 * Creates a new dish.
	 * @param name Name of the dish.
	 * @param description Description of the dish.
	 * @param price Price of the dish in ct.
	 * @param vegetarian Whether it is vegetarian (true) or not (false).
	 */
	public Dish(String name, String description, int price, boolean vegetarian) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}
}
