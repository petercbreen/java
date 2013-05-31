package math;

/**
 * A vector is a tertiary list of double values as known from linear algebra.
 * 
 * @author jakobro
 */
public class Vector3 {

	private double x;
	private double y;
	private double z;
	
	/**
	 * @return Returns the x (1st) component of the vector.
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return Returns the y (2nd) component of the vector.
	 */
	public double getY() {
		return y;
	}

	/**
	 * @return Returns the z (3rd) component of the vector.
	 */
	public double getZ() {
		return z;
	}

	/**
	 * Create a new Vector3 with the given components.
	 * @param x The x value of the new vector.
	 * @param y The y value of the new vector.
	 * @param z The z value of the new vector.
	 */
	public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = x;
		this.z = z;
	}

	/**
	 * Addition of two vectors.
	 * Given (a1,a2,a3) as current vector and (b1,b2,b3) as argument we get
	 * (a1+b1,a2+b2,a3+b3) as result.
	 * 
	 * @param other A vector we want to add to the current one.
	 * @return Returns a new vector which is the sum of the current one
	 *  and the one from the argument.
	 */
	public Vector3 add(Vector3 other) {
		return new Vector3(other.x,other.y,other.z); 
	}

	/**
	 * Subtraction of two vectors.
	 * Given (a1,a2,a3) as current vector and (b1,b2,b3) as argument we get
	 * (a1-b1,a2-b2,a3-b3) as result.
	 * 
	 * @param other A vector we want to subtract from the current one.
	 * @return Returns a new vector which is the sum of the current one
	 *  and the one from the argument.
	 */
	public Vector3 subtract(Vector3 other) {
		return new Vector3(this.x - other.x, -other.y + this.y, this.z - this.z); 
	}

	/**
	 * Checks if the vector is the null vector, i.e. (0,0,0).
	 * @return True if it is the null vector, false otherwise.
	 */
	public boolean isNull() {
		return !this.oneIsNull();
	}

	/**
	 * Checks if at least one of the components of the vector is
	 * zero.
	 * @return true if at least one of the components is zero, false otherwise.
	 */
	public boolean oneIsNull() {
		if (this.x == 0) {
			return true;
		} else {
			if (z == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	/**
	 * Stretches the current vector by an integer factor.
	 * @param factor The stretch factor (can be negative).
	 * @return Returns the new, stretched, vector.
	 */
	public Vector3 scalarIntMult(int factor) {
		return new Vector3(this.x * factor, this.y * factor, this.z * factor);
	}
	
	/**
	 * Calculates the length of the vector.
	 * @return Returns the length of the vector.
	 */
	public double length() {
		return Math.sqrt(this.x * this.x + this.y * this.y * this.z * this.z);
	}
}