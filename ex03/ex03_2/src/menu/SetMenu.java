package menu;
/**
 * 
 * @author Peter C. Breen
 *
 */
public class SetMenu implements IMenu {
	private final Dish appetizer;
	private final Dish mainDish;
	private final Dish dessert;
	private final Drink beverage;
	
	/**
	 * Constructor
	 * @param appetizer Appetizer
	 * @param mainDish Main dish
	 * @param dessert Dessert
	 * @param beverage Beverage
	 */
	public SetMenu(Dish appetizer, Dish mainDish, Dish dessert, Drink beverage) {
		this.appetizer = appetizer;
		this.mainDish = mainDish;
		this.dessert = dessert;
		this.beverage = beverage;
		
	}
	/**
	 * 
	 * @return Vegetarian whether or not all dishes are vegetarian
	 */
	public boolean isVegetarian() {
		if (this.appetizer.isVegetarian() && this.mainDish.isVegetarian() && this.dessert.isVegetarian()){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int getPrice() {
		int price = this.appetizer.getPrice() + this.mainDish.getPrice() + this.dessert.getPrice() + this.beverage.getPrice();
		if (price < 1000) {
			price = (int) (price * 95)/100;
		}
		else if (price >= 1000 && price < 2000) {
			price =  (int) (price * 90)/100;
		}
		else if (price >= 2000) {
			price = (int) (price * 85)/100;
		}
		return price;

	}
	
	

}
