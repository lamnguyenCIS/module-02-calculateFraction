import java.util.Scanner;

public class FractionCalculator{
	public static void main (String[] args){

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter numerator: ");
		int numerator = reader.nextInt();

		System.out.print("Enter denominator: ");
		int denominator = reader.nextInt();

		Fraction fraction = new Fraction(numerator,denominator);

		
        Double res = 0.0;

		numerator = fraction.getNumerator();
		denominator = fraction.getDenominator();

		System.out.println("This is numerator: " + numerator);
		System.out.println("This is denominator: " + denominator);

		res = fraction.toDouble();
		System.out.println(res);

	}
}