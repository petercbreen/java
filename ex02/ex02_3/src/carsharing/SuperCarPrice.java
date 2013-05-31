package carsharing;

/**
 * 
 * @author pcbreen
 *
 */
public class SuperCarPrice {

	/**
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String args[]) {
		Profile userProf = new Profile(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		Plan shortRunner = new Plan("ShortRunner", 10, 10, 150, 0, 0);
		Plan longRunner = new Plan("LongRunner", 25, 5, 120, 50, 5);

		System.out.println("Hello, " + userProf.getName() + "!");
		System.out.println("");
		System.out.println("Calculated prices:");
		System.out.println(shortRunner.getName() + ":\t" + shortRunner.calculateMonthlyPrice(userProf.getDist(), userProf.getUses()) + " ct");
		System.out.println(longRunner.getName() + ":\t" + longRunner.calculateMonthlyPrice(userProf.getDist(), userProf.getUses()) + " ct");
	}

}
