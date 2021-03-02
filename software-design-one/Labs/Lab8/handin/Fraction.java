public class Fraction{

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator){
		this.numerator = Math.abs(numerator);
		this.numerator *= (numerator * denominator >= 0) ? 1 : -1;
		this.denominator = Math.abs(denominator);
	}
	public Fraction add(Fraction other){
		int numerator = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator(); 
		int denominator = this.getDenominator() * other.getDenominator();
		Fraction sum = this.simplify(numerator, denominator);
		return sum;
	}
	public Fraction subtract(Fraction other){
		int numerator = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
		int denominator = this.getDenominator() * other.getDenominator();
		Fraction diff = this.simplify(numerator, denominator);
		return diff;
	}
	public Fraction multiply(Fraction other){
		int numerator = this.getNumerator() * other.getNumerator();
		int denominator = this.getDenominator() * other.getDenominator();
		Fraction product = simplify(numerator, denominator);
		return product;
	}
	public Fraction divide(Fraction other){
		int numerator = this.getNumerator() * other.getDenominator();
		int denominator = this.getDenominator() * other.getNumerator();
		Fraction dividen = simplify(numerator, denominator);
		return dividen;
	}
	public String toString(){
		return String.format("(%d/%d)", numerator, denominator);
	}
	public int getNumerator(){
		return this.numerator;
	}
	public int getDenominator(){
		return this.denominator;
	}
	public Fraction simplify(int numerator, int denominator){
		for(int i=denominator; i>0; i--){
			if(numerator % i == 0 && denominator % i == 0){
				numerator /= i;
				denominator /= i; 
			}
		}
		return new Fraction(numerator, denominator);
	}
}