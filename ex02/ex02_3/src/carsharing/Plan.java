package carsharing;
/**
 * 
 * @author pcbreen
 *
 */
public class Plan {
	private final String name;
	private final int baseFee;
	private final int pricePerKilometer;
	private final int feePerUse;
	private final int kilometerIncluded;
	private final int usesIncluded;
	/**
	 * 
	 * @param name Plan name
	 * @param baseFee Flat fee that must be paid, in Euro
	 * @param pricePerKilometer Fee per kilometer, in Cent
	 * @param feePerUse Fee per use, in Cent
	 * @param kilometerIncluded Free kilometers included in plan
	 * @param usesIncluded Free number of uses included in plan
	 */
	public Plan(String name, int baseFee, int pricePerKilometer,
			int feePerUse, int kilometerIncluded, int usesIncluded) {
		this.name = name;
		this.baseFee = baseFee;
		this.pricePerKilometer = pricePerKilometer;
		this.feePerUse = feePerUse;
		this.kilometerIncluded = kilometerIncluded;
		this.usesIncluded = usesIncluded;
		
	}
	/**
	 * 
	 * @return plan name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 
	 * @param distance Distance in integer km driven by customer per month
	 * @param uses Number of times the car was used
	 * @return Price customer has to pay per month
	 */
	public int calculateMonthlyPrice(int distance, int uses) {
		int monthlyPrice;
		monthlyPrice = (this.baseFee * 100) + 
				((distance - this.kilometerIncluded) * this.pricePerKilometer) +
				((uses - this.usesIncluded) * this.feePerUse);
		return monthlyPrice;
	}	

}
