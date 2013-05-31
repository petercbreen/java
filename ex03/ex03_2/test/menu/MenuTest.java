package menu;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test of Menu list class
 * @author Peter C. Breen
 *
 */
public class MenuTest {
	private Dish app1 = new Dish("Salad", "small tossed salad", 200, true);
	private Dish app2 = new Dish("Chicken wings", "spicy chicken wings", 300, false);
	
	private Dish mainDish1 = new Dish("Chicken", "grilled chicken", 700, false);
	private Dish mainDish2 = new Dish("Spaghetti", "creamy sauce", 500, true);
	private Dish mainDish3 = new Dish("Schnitzel", "Viennese style", 1000, false);
	private Dish mainDish4 = new Dish("Fish", "salmon", 1200, false);
	
	private Dish dessert1 = new Dish("Ice cream", "vanilla", 300, true);
	private Dish dessert2 = new Dish("Black forest cherry cake", "local recipe", 600, true);
	private Dish dessert3 = new Dish("Cookies", "chocolate", 200, true);
	
	private Drink drink1 = new Drink("Tea", "iced tea", 100);
	private Drink drink2 = new Drink("Water", "mineral water", 120);
	private Drink drink3 = new Drink("Cola", "coke light", 200);
	private Drink drink4 = new Drink("Beer", "Freiburger", 200);
	
	
	/**
	 * Test of menu
	 */
	@Test
	public void menuTest() {
		fail("Not yet implemented");
	}

}
