package carsharing;
/**
 * 
 * @author pcbreen
 *
 */
public class Profile {
	private final String name;
	private final int distance;
	private final int uses;
	
	/**
	 * 
	 * @param name Person's name
	 * @param distance Monthly distance traveled in km, integer
	 * @param uses Number of monthly uses
	 */
	public Profile(String name, int distance,
			int uses) {
		this.name = name;
		this.distance = distance;
		this.uses = uses;		
	}
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 
	 * @return distance
	 */
	public int getDist() {
		return this.distance;
	}
	/**
	 * 
	 * @return uses
	 */
	public int getUses() {
		return this.uses;
	}

}
