package myfraction;

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

	public Integer getNumerator(){
		return numerator;
	}

	public Integer getDenominator(){
		return denominator;
	}

	public Stringn toString(){
		return numerator + " / " + denominator;
	}

	public Double toDouble(){
		Double result = 0.0;

		result = numeartor / denominator;

		return result;
	}

	public Fraction add(int numerator, int denominator){
		Fraction fractionAdd = new Fraction(1,2);

		this.numerator += numeartor;
		this.denominator += denominator;

		return fractionAdd;
	}

	public Fraction sub(int numerator, int denominator){
		Fraction fractionSub = new Fraction(1,2);

		this.numerator -= numeartor;
		this.denominator -= denominator;

		return fractionSub;
	}	
	
	public Fraction mul(int numerator, int denominator){
		Fraction fractionMul = new Fraction(1,2);

		this.numerator *= numeartor;
		this.denominator *= denominator;

		return fractionMul;
	}	

	public Fraction div(int numerator, int denominator){
		Fraction fractionDiv = new Fraction(1,2);

		if(denominator == 0){
			throw new IllegalArgumentException("Denominator cannot be ZERO");
		}
		else{
				this.numerator /= numeartor;
				this.denominator /= denominator;
		}

		return fractionDiv;
	}	
	
}
