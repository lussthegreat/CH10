import java.util.Scanner;

public class FractionQuiz {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] operators = {"+", "-", "*", "/"};

		int correctCount = 0;
		int totalAnswered = 0;

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        System.out.println();

        
		while (true) {
			Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();
			f2.reduce();
			f1.reduce();
            String op = operators[(int)(Math.random() * 4)];
			System.out.print(f1 + " " + op + " " + f2 + " = ");
			String input = scanner.nextLine();
			Fraction UserAnswer = new Fraction(input);
			totalAnswered++;
			Fraction correctAnswer;
				if (op.equals("+")) {
					correctAnswer = Fraction.add(f1, f2);
				} else if (op.equals("-")) {
					correctAnswer = Fraction.subtract(f1, f2);
				} else if (op.equals("*")) {
					correctAnswer = Fraction.mult(f1, f2);
				} else {
					correctAnswer = Fraction.divide(f1, f2);
				}
				if (input.equals("quit")) {
					break;
				}
			if (UserAnswer.equals(correctAnswer)) {
				System.out.println("Correct!");
				correctCount++;
			} else {
				System.out.println("Wrong, the answer was " + correctAnswer.toString());
			}
			//System.out.println
}
}
}
