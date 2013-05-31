package menu;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class Dish extends AMenuItem{
	private final boolean vegetarian;
	/**
	 * Constructor
	 * @param name Dish name
	 * @param description Dish description
	 * @param price Dish price
	 * @param vegetarian Is dish vegetarian? (True = yes)
	 */
	public Dish(String name, String description, int price, boolean vegetarian) {
		super (name, description, price);
		this.vegetarian = vegetarian;
	}
	/**
	 * 
	 * @return vegetarian if dish is veggie
	 */
	public boolean isVegetarian() {
		return this.vegetarian;
	}

}
