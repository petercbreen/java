/**
 * 
 */
package monopoly;

/**
 * @author thiemann and Peter C. Breen
 *
 */
public class Street {
	private final String name;
	private final int price;
	private final int[] rent;
	private final int mortgageValue;
	private final int houseCost;
	private final Group colorGroup;
	
	private static Street balticInstance;
	private static Street newYorkInstance;
	private static Street stCharlesInstance;
	
	
	
	
	private boolean mortgage;
	private State state;

    /**
     * @return the name
     */
	public String getName() {
		return name;
	}

    /**
     * @return the price
     */
	public int getPrice() {
		return price;
	}

    /**
     * @return the rent for each state
     */
	public int[] getRent() {
		return rent.clone();		// do not return the plain array!
	}

    /**
     * @return the mortgageValue
     */
	public int getMortgageValue() {
		return mortgageValue;
	}

    /**
     * @return the house cost
     */
	public int getHouseCost() {
		return houseCost;
	}

    /**
     * @return the group
     */
	public Group getColorGroup() {
		return colorGroup;
	}

	/**
	 * @return the mortgage
	 */
	public boolean getMortgage() {
		return mortgage;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}


    /**
     * Constructor for Streets. The initial state is UNOWNED and there is no mortage initially.
     * @param name the name
     * @param price the price
     * @param rent the rent
     * @param mortgageValue the value of the mortgage
     * @param houseCost the price to add a house
     * @param colorGroup the group
     */
	private Street(String name, int price, int[] rent, 
			int mortgageValue, int houseCost,
			Group colorGroup) {
		this.name = name; this.price = price; this.rent = rent;
		this.mortgageValue = mortgageValue; this.houseCost = houseCost;
		this.colorGroup = colorGroup;
		
		this.mortgage = false;
		this.state = State.UNOWNED;
	}
	
    /**
     * @return Baltic Avenue
     */
	public static synchronized Street makeBaltic() {
		if (balticInstance == null) {
			balticInstance = new Street("Baltic Avenue", 60, new int[] {0, 4, 20, 60, 180, 320, 450}, 
					30, 50, Group.SADDLEBROWN);
		}
		return balticInstance; 
	}
	
    /**
     * @return New York Avenue
     */
	public static Street makeNewYork() {
		if (newYorkInstance == null) {
			newYorkInstance = new Street("New York Avenue", 200, new int[] {0, 16, 80, 220, 600, 800, 1000}, 
					100, 100, Group.ORANGE);
		}
		return newYorkInstance;
	}
	
    /**
     * @return St. Charles Place
     */
	public static Street makeStCharles() {
		if (stCharlesInstance == null) {
			stCharlesInstance = new Street("St. Charles Place", 140, new int[] {0, 10, 50, 150, 450, 625, 750},
					70, 100, Group.DARKORCHID);
		}
		return stCharlesInstance;
	}
	
    /**
     * @return a simple string representation of the street
     */
	public String toString() {
		return this.name + " " + this.colorGroup;
	}

	/**
	 * Buy this street.
	 * @return true if buying the street was successful.
	 */
	public boolean buy() {
		if (State.UNOWNED.equals(this.state)) {
			this.state = State.OWNED;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Buy a house or a hotel for this street.
	 * @return true if buying the house or hotel was successful.
	 */
	public boolean buyHouse() {
		if (this.state == State.UNOWNED || this.state == State.HOTEL) {
			return false;
		} else {
			int i = this.state.ordinal();
			this.state = State.values()[i+1];
			return true;
		}
	}

	/**
	 * Calculate the rent that the owner can charge for this street.
	 * @return the amount of rent.
	 */
	public int calculateRent() {
		if (this.mortgage) {
			return 0;
		} else {
			return rent[this.state.ordinal()];
		}
	}
}
