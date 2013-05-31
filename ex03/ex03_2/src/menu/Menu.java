package menu;
import java.util.ListIterator;
import java.util.LinkedList;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class Menu implements IMenu{

	private LinkedList<Drink> drinks;
	private LinkedList<Dish> dishes;
	private ListIterator drinkIt = drinks.listIterator();
	private ListIterator dishIt = dishes.listIterator();
	
	/**
	 * Add a drink to the menu
	 * @param drink Drink
	 */
	public void addEntry(Drink drink) {
		drinks.add(drink);
	}
	
	/**
	 * Add a dish
	 * @param dish Dish
	 */
	public void addEntry(Dish dish) {
		dishes.add(dish);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 
	 */



}
