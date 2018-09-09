public class FractionCalculator{
	public static void main (String[] args){
		Fraction fraction = new Fraction(-1.0,4.0);
      Fraction fraction1 = new Fraction(2.0);
       
       
		Double numerator = 0.0;
		Double denominator = 0.0;
      Double res = 0.0;

		numerator = fraction.getNumerator();
		denominator = fraction.getDenominator();

		System.out.println("This is numerator: " + numerator);
		System.out.println("This is denominator: " + denominator);

		String output = fraction.toString();
		System.out.println(output);

		String output1 = fraction1.toString();
		System.out.println(output1);

		res = fraction.toDouble();
		System.out.println(res);
	}
}