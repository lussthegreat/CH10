public class Fraction {
    // instance variables (attributes, fields)
    private int numerator, denominator;

    // constructor (new)
    public Fraction() { // default constructor
        numerator = 1;
        denominator = 1;
    }
    public Fraction(String f) {
        int slashIndex = f.indexOf("/");
        String n = f.substring(0, slashIndex);
        String d = f.substring(slashIndex + 1);
        numerator = Integer.parseInt(n);
        setDenom(Integer.parseInt(d));
    }
    public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }

    public Fraction(int n, int d) { // parameterized constructor
        setNum(n);
        setDenom(d);
    }
    // behaviour methods (accessor, mutator, helper)

    // accessor methods
    public int getNum() {
        return numerator;
    }
    public int getDenom() {
        return denominator;
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
    public double toDouble() {
        return (double) getNum() / getDenom();
    }

    // mutator methods
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
    public void reduce() {
        int a = getNum();
        int b = getDenom();
        while (a != b) {
            if (a > b)
                a = a - b;
            if (a < b)
                b = b - a;
        }
        int GCF = a;
        numerator = getNum() / GCF;
        denominator = getDenom() / GCF;
    }

    public static Fraction mult(Fraction a, Fraction b) {
        int n = a.getNum() * b.getNum();
        int d = a.getDenom() * b.getDenom();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }
    public static Fraction divide(Fraction a, Fraction b) {
		int n = a.getNum() * b.getDenom();
		int d = a.getDenom() * b.getNum();
		Fraction answer = new Fraction(n, d);
		answer.reduce();
		return answer;
	}
}
