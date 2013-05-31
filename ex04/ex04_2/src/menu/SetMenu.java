/**
 * 
 */
package menu;

import menu.Dish;
import menu.Drink;

/**
 * @author jakobro
 * 
 */
public class SetMenu {

	private final Drink drink;
	private final Dish entry;
	private final Dish main;
	private final Dish desert;

	/**
	 * @return Returns the drink included in set menu.
	 */
	public Drink getDrink() {
		return drink;
	}

	/**
	 * @return Returns the entry included in set menu.
	 */
	public Dish getEntry() {
		return entry;
	}

	/**
	 * @return Returns the main included in set menu.
	 */
	public Dish getMain() {
		return main;
	}

	/**
	 * @return Returns the desert included in set menu.
	 */
	public Dish getDesert() {
		return desert;
	}
	
	/**
	 * Creates a new set menu.
	 * @param drink Drink included in set menu.
	 * @param entry Entry included in set menu.
	 * @param main Main included in set menu.
	 * @param desert Desert included in set menu.
	 */
	public SetMenu(Drink drink, Dish entry, Dish main, Dish desert) {
		this.drink = drink;
		this.entry = entry;
		this.main = main;
		this.desert = desert;
	}

	/**
	 * @return Returns true of all dishes are vegetarian, otherwise false.
	 */
	public boolean isVegetarian() {
		if (this.entry.isVegetarian() && this.main.isVegetarian() && this.desert.isVegetarian()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculates the total price of a set menu.
	 * If it costs less than 10 bucks, 5% discount, less than 20 bucks, 10% discount,
	 * and more or equal 20 bucks, 15% discount.
	 *   
	 * @return Returns the total price of the whole set menu including the discount.
	 */
	public int totalPrice() {
		int totalPrice = this.drink.getPrice() + this.entry.getPrice() + this.main.getPrice() + this.desert.getPrice();
		if (totalPrice < 1000  && totalPrice > 0 ) {
			return (totalPrice*95)/100;
		} else if ( totalPrice < 2000 && totalPrice >= 1000 ) {
			return (totalPrice*90)/100;
		} else if ( totalPrice >= 2000 ) {
			return (totalPrice*85)/100;
		} else {
			return 0;
		}	
	}
}
