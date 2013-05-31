package menu;
/**
 * 
 * @author Peter C. Breen
 *
 */
public interface IMenuItem {
	/**
	 * 
	 * @return Name as string
	 */
	String getName();
	/**
	 * 
	 * @return Description as string
	 */
	String getDescription();
	/**
	 * 
	 * @return Price as int
	 */
	int getPrice();
}

