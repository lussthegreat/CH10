public class FractionDriver {

	public static void main (String[] args) {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,2);
		Fraction f3 = Fraction.mult(f1,f2);
		Fraction f4 = Fraction.divide(f1,f2);
		System.out.println(f4);
		//System.out.println(f3);
		//System.out.println(f1.getNum());
		//System.out.println(f1.toDouble());
		//f2.reduce();
		//System.out.println(f2);
	}

 
}
