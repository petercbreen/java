package menu;
/**
 * 
 * @author Peter C. Breen
 *
 */
public abstract class AMenuItem implements IMenuItem {
	private String name;
	private String description;
	private int price;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public int getPrice() {
		return this.price;
	}
	
	/**
	 * Constructor
	 * @param name Item name
	 * @param description Item description
	 * @param price Item price
	 */
	public AMenuItem(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

}
