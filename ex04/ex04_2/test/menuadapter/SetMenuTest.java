package menuadapter;

import static org.junit.Assert.*;

import menu.Dish;
import menu.Drink;
import menu.SetMenu;

import org.junit.Test;

/**
 * 
 * @author jakobro, Peter C. Breen
 *
 */
public class SetMenuTest {

	private Drink water = new Drink("Water", "Normal non-sparkling tap water", 100);
	private Drink coke = new Drink("Coke", "A drink consisting mainly of water and sugar.", 200);
	private Dish soup = new Dish("Mushroom soup", "A soup made of mushrooms.", 140, true);
	private Dish fish = new Dish("Salmone", "Salmone with noodles.", 1120, false);
	private Dish spaghettiPesto = new Dish("Spaghetti Pesto", "Mjam", 200, true);
	private Dish cheese = new Dish("Cheese", "A plate with different kinds of cheese.", 500, true);
	private Dish strawberryIce = new Dish("Strawberry Ice", "Frozen water and strawberries.", 200, true);
	private SetMenu smNonVeg = new SetMenu(water,soup,fish,cheese);
	private SetMenu smVeg = new SetMenu(coke,soup,spaghettiPesto,strawberryIce);
	private SetMenu smExp = new SetMenu(coke,fish,fish,fish);
	
	/**
	 * Testing the getDrink functionality.
	 */
	@Test
	public void testGetDrink() {
		assertEquals(water, smNonVeg.getDrink());
		assertEquals(coke, smVeg.getDrink());
	}

	/**
	 * Testing the getEntry functionality.
	 */
	@Test
	public void testGetEntry() {
		assertEquals(soup, smNonVeg.getEntry());
		assertEquals(soup, smVeg.getEntry());
	}

	/**
	 * Testing the getMain functionality.
	 */
	@Test
	public void testGetMain() {
		assertEquals(fish, smNonVeg.getMain());
		assertEquals(spaghettiPesto, smVeg.getMain());
	}

	/**
	 * Testing the getDesert functionality.
	 */
	@Test
	public void testGetDesert() {
		assertEquals(strawberryIce, smVeg.getDesert());
		assertEquals(cheese, smNonVeg.getDesert());
	}

	/**
	 * Testing the getVegetarian functionality.
	 */
	@Test
	public void testGetVegetarian() {
		assertFalse(smNonVeg.isVegetarian());
		assertTrue(smVeg.isVegetarian());
	}

	/**
	 * Testing the getTotalPrice functionality.
	 */
	@Test
	public void testTotalPrice() {
		int price1 = ((100 + 140 + 1120 + 500) * 90) / 100;
		int price2 = ((200 + 140 + 200 + 200) * 95) / 100;
		int price3 = ((200 + 1120 + 1120 + 1120) * 85) / 100;
		assertEquals(price1,smNonVeg.totalPrice());
		assertEquals(price2,smVeg.totalPrice());
		assertEquals(price3,smExp.totalPrice());
	}
}
