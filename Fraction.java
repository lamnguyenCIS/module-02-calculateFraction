public class Fraction{
	int numerator;
	int denominator;

	// default constructor
	// integer - 0 && double - 0.0 && String null
	public Fraction(){
		this.numerator = 0;
		this.denominator = 1;
	}

	public Fraction (int numerator, int denominator){
		if(denominator == 0){
			throw new IllegalArgumentException("Denominator cannot be ZERO");
		}
		else if(denominator < 0){
			numerator = numerator * (-1);
			denominator = denominator * (-1);
		}
		else{
			Fraction myFrac = new Fraction(4,5);
		}

	}
	
	public Fraction (int numerator){
		Fraction myFrac = new Fraction(numerator);
		this.denominator = 1;
	}



	
}
