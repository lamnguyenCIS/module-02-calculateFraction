public class Fraction{
	Double numerator;
	Double denominator;

	// default constructor
	// Doubleeger - 0 && double - 0.0 && String null
	public Fraction(){
		this.numerator = 0.0;
		this.denominator = 1.0;
	}

   // 2 parameter constructor
	public Fraction (Double numerator, Double denominator){
		if(denominator == 0.0){
			throw new IllegalArgumentException("Denominator cannot be ZERO");
		}
		else if(denominator < 0.0){
			this.numerator = numerator * (-1.0);
			this.denominator = denominator * (-1.0);
		}
		else{
			this.numerator = numerator;
         this.denominator = denominator;
		}
	}
	
    // One parameter constructor
	public Fraction (Double numerator){
		this.numerator = numerator;
		this.denominator = 1.0;
	}
 
	public Double getNumerator(){
		return numerator;
   }	

	public Double getDenominator(){
		return denominator;
	}

   // PrDouble the string format of the fraction
	public String toString(){
		return this.numerator + " / " + this.denominator;
	}
}

/*

public class Fraction{
	Double numerator;
	Double denominator;

	// default constructor
	// Doubleeger - 0 && double - 0.0 && String null
	public Fraction(){
		this.numerator = 0.0;
		this.denominator = 1.0;
	}

   // 2 parameter constructor
	public Fraction (Double numerator, Double denominator){
		if(denominator == 0.0){
			throw new IllegalArgumentException("Denominator cannot be ZERO");
		}
		else if(denominator < 0.0){
			numerator = numerator * (-1.0);
			denominator = denominator * (-1.0);
		}
		else{
			Fraction myFrac = new Fraction(4.0,5.0);
		}

	}
	
   // One parameter constructor
	public Fraction (Double numerator){
		Fraction myFrac = new Fraction(numerator);
		this.denominator = 1.0;
	}

   // 
	public Double getNumerator(){
		return numerator;
	}

	public Double getDenominator(){
		return denominator;
	}

   // PrDouble the string format of the fraction
	public String toString(){
		return numerator + " / " + denominator;
	}

   // PrDouble the result of the fraction in double value
	public Double toDouble(){
		Double result = 0.0;

		result = numerator / denominator;

		return result;
	}

   // Add 2 fraction 
	public Fraction add(Double numerator, Double denominator){
		Fraction fractionAdd = new Fraction(1.0,2.0);

		this.numerator += numerator;
		this.denominator += denominator;

		return fractionAdd;
	}

   // Subtract 2 fraction
	public Fraction sub(Double numerator, Double denominator){
		Fraction fractionSub = new Fraction(1.0,2.0);

		this.numerator -= numerator;
		this.denominator -= denominator;

		return fractionSub;
	}	
	
   // Multiply 2 fraction
	public Fraction mul(Double numerator, Double denominator){
		Fraction fractionMul = new Fraction(1.0,2.0);

		this.numerator *= numerator;
		this.denominator *= denominator;

		return fractionMul;
	}	

   // Devide 2 fraction
	public Fraction div(Double numerator, Double denominator){
		Fraction fractionDiv = new Fraction(1.0,2.0);

		if(denominator == 0){
			throw new IllegalArgumentException("Denominator cannot be ZERO");
		}
		else{
				this.numerator *= denominator;
				this.denominator *= numerator;
		}

		return fractionDiv;
	}	
	
}

*/