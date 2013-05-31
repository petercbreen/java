package menu;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test of SetMenu class
 * @author Peter C. Breen
 *
 */
public class SetMenuTest {
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
	
	
	
	private SetMenu menu1 = new SetMenu(app1, mainDish1, dessert1, drink1);
	private SetMenu menu2 = new SetMenu(app1, mainDish2, dessert2, drink3);
	private SetMenu menu3 = new SetMenu(app2, mainDish3, dessert2, drink4);
	private SetMenu menu4 = new SetMenu(app2, mainDish4, dessert3, drink2);	
	
	/**
	 * Test of vegetarian determination
	 */
	@Test
	public void veggieTest() {
		assertFalse("non-veggie menu should not be vegetarian", menu1.isVegetarian());
		assertTrue("veggie menu should be vegetarian", menu2.isVegetarian());
		assertFalse("non-veggie menu should not be vegetarian", menu3.isVegetarian());
		assertFalse("non-veggie menu should not be vegetarian", menu4.isVegetarian());
		
	}
	
	
	/**
	 * Test of price determination
	 */
	@Test
	public void priceTest() {
	
		
		assertTrue("menu price failed", menu1.getPrice() == 1170);
		assertTrue("menu price failed", menu2.getPrice() == 1350);
		assertTrue("menu price failed", menu3.getPrice() == 1785);
		assertTrue("menu price failed", menu4.getPrice() == 1638);
		
	}

}
