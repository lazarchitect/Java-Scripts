public class Fraction {

	// fields are attributes of Fraction objects
	private int num;   // numerator
	private int denom; // denominator

	// this is the default constructor supplied by the compiler ONLY if
	// there isn't any other constructor
	// if all you want to do is this, you don't need to write it out
	/* public Fraction() { } */

	/**
	 * This is the general constructor, accepts numerator and denominator
	 * If denominator is 0, sets it to 1
	 *
	 * @param num Numerator
	 * @param denom Denominator
	 */
	public Fraction(int num, int denom) {
		this.num = num;   // "this" object's num is set to parameter num
		if (denom == 0) {
			denom = 1;
		}
		else{
			this.denom = denom;
		}
	}

	/* this constructor is for num/1 */
	public Fraction(int num) {
		/* YOU CAN DO IT THIS WAY
		this.num = num;
		denom = 1;
		*/
		/* OR, YOU CAN CALL THE OTHER CONSTRUCTOR */
		this(num,1);  // "this(...)" is a call to another constructor
	}

	/* this is for the number 1, i.e. 1/1 */
	public Fraction() {
		this(1,1);
	}

	/* copy constructor */
	public Fraction(Fraction f) {
		num = f.num;
		denom = f.denom;
	}

	// getter for numerator
	public int getNum() {
		return num;
	}

	// getter for denominator
	public int getDenom() {
		return denom;
	}

	// setter for num
	public void setNum(int num) {
		this.num = num;
	}

	// setter for denominator
	public void setDenom(int denom) {
		if (denom == 0) {
			denom = 1;
		}
		this.denom = denom;
		// this(num,denom);  => WON'T WORK, CAN ONLY CALL CONSTRUCTOR FROM ANOTHER CONSTRUCTOR
	}

	// adds other fraction with this fraction and returns the result
	// this fraction is not changed
	public Fraction sum(Fraction other) {
		int resultNum = num*other.denom + denom*other.num;
		int resultDenom = denom*other.denom;
		return new Fraction(resultNum, resultDenom);
	}

	// adds other fraction TO this fraction - MUTATOR, since it changes the
	// state of this object
	public void add(Fraction other) {
		num = num*other.denom + denom*other.num;
		denom = denom*other.denom;
	}

	public void simplify() {
		int g = gcd(num,denom);
		num /= g;
		denom /= g;
	}

	private int gcd(int x, int y) {
		if (y == 0) { return x; }
		return gcd(y, x%y);
	}

	// STANDARD REPRESENTATION METHOD, HEADER MUST BE WRITTEN EXACTLY LIKE THIS
	public String toString() {
		return num + "/" + denom;
	}

	/* THIS IS THE BAD WAY
	public boolean equals(Fraction other) {
		simplify();    // this.simplify() can be done as well
		other.simplify();
		return num == other.num && denom == other.denom;
	}
	*/

	/* THIS IS THE BEST AND ONLY WAY */
	public boolean equals(Object other) {
		if (other == null) { return false; }
		if (!(other instanceof Fraction)) {
			return false;
		}
		Fraction f = (Fraction)other;   // cast other to type Fraction
		simplify();
		f.simplify();
		return num == f.num && denom == f.denom;
	}

}
