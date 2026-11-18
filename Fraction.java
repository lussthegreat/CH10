public class Fraction {

	//instance variables (attributes, fields)
	private int numerator, denominator;
	
	//constructor (new)
	public Fraction () { //default constructor
		numerator = 1;
		denominator = 1;
	}
	public Fraction (String f) {
		int slashIndex = f.indexOf("/");
		String n = f.substring(0, slashIndex);
		String d = f.substring(slashIndex+1);
		numerator = Integer.parseInt(n);
		setDenom(Integer.parseInt(d));
	}
	public Fraction (Fraction f) {
		numerator = f.numerator;
		denominator = f.denominator;
	}
	
	public Fraction (int n, int d) { //parameterized constructor
		setNum(n);
		setDenom(d);
	}
	//behaviour methods (accessor, mutator, helper)
	
	//accessor methods
	public int getNum() {
		return numerator;
	}
	public int getDenom() {
		return denominator;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	//mutator methods
	public void setNum(int n) {
		numerator = n;
	}
	
	public void setDenom(int d) {
		if (d != 0)
			denominator = d;
		else {
			denominator = 1;
			System.out.println("Error: Denominator can't be zero");
	}

}
}
