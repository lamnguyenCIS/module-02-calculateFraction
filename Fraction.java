import java.io.*;

public class Fraction{
	int numerator;
	int denominator;

	// default constructor
	// Doubleeger - 0 && double - 0.0 && String null
	public Fraction(){
		this.numerator = 0;
		this.denominator = 1;
	}

   // 2 parameter constructor
	public Fraction (int numerator, int denominator){
		if(denominator == 0){
			throw new IllegalArgumentException("Denominator cannot be ZERO");
		}
		else if(denominator < 0){
			this.numerator = numerator * (-1);
			this.denominator = denominator * (-1);
		}
		else{
			this.numerator = numerator;
         this.denominator = denominator;
		}
	}
	
    // One parameter constructor
	public Fraction (int numerator){
		this.numerator = numerator;
		this.denominator = 1;
	}
 
	public int getNumerator(){
		return numerator;
   }	

	public int getDenominator(){
		return denominator;
	}

   // Print the string format of the fraction
	public String toString(){
		return this.numerator + " / " + this.denominator;
	}


	   // Print the result of the fraction in int value
	public Double toDouble(){
		Double result = 0.0;

		result = Double.valueOf(numerator) / Double.valueOf(denominator);

		return result;
	}

   // Add 2 fraction 
	public Fraction add(Fraction fract1){
		int num = this.numerator*fract1.denominator + this.denominator*fract1.numerator;
		int den = this.denominator*fract1.denominator ;

		Fraction fractionAdd = new Fraction(num,den);

		return fractionAdd;
	}	

   // Subtract 2 fraction
	public Fraction sub(Fraction fract1){
		int num = this.numerator*fract1.denominator - this.denominator*fract1.numerator;
		int den = this.denominator*fract1.denominator ;

		Fraction fractionSub = new Fraction(num,den);

		return fractionSub;
	}	



}

/*

	public Boolean equals(Object obj){
		
    	if(string.contains("/")){
    		String[] parts = string.split("/");
            for(int i=0;i<parts.length;i++){
              System.out.println(parts[i]);
            }			
    	}
    	else{
    		System.out.println("It doesn't have a slash");
    	}
	}

   // Subtract 2 fraction
	public Fraction sub(intnumerator, intdenominator){
		Fraction fractionSub = new Fraction(1.0,2.0);

		this.numerator -= numerator;
		this.denominator -= denominator;

		return fractionSub;
	}	
	
   // Multiply 2 fraction
	public Fraction mul(intnumerator, Double denominator){
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