/**

 @author Nick Hall
 @since 1/30/2019


Class ComplexNumber performs the operations of addition, subtraction, multiplication,
and division and represents them as complex numbers 

 */
import java.lang.ArithmeticException; // import ArithemticException class 

public class ComplexNumber{
	
	//instance variables 
	private float a; // stores first float 
	private float b; // stores second float 
	
/**

 @param a This is the first float 
 @param b This is the second float 


*/
	//constructor 
	public ComplexNumber (float a, float b){
		//initialize instance variables 
		this.a = a; 
		this.b = b;
	} //end constructor
	
	
/**
 This method returns the real part of the complex number 
 @return The value of a - represents the first float  	
	
*/
	//getter method 
	public float getA(){
		return this.a;
	} //end getter method 

/**
 This method returns the imaginary part of the complex number 
 @return The value of b - represents the second float 

*/	
	//getter method 
	public float getB(){
		return this.b;
	} //end getter method 
	
/**
 This method takes two complex numbers and adds them
 @param otherNumber - a value  
 @return the sum of two complex numbers 
 */	
	
	//addition method 
	public ComplexNumber add(ComplexNumber otherNumber){
		ComplexNumber newComplex;
		float newA = this.a + otherNumber.getA(); 
		float newB = this.b + otherNumber.getB();
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	} //end addition method 
	
/**
 This method takes two complex numbers and subtracts them 
 @param otherNumber - a value 
 @return the diference of two complex numbers
*/
	//subtraction method 
	public ComplexNumber subtract(ComplexNumber otherNumber){
		ComplexNumber newComplex;
		float newA = this.a - otherNumber.getA();
		float newB = this.b - otherNumber.getB();
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	} //end subtraction method 

/**
 This method takes two complex numbers and multiplies them 
 @param otherNumber - a value 
 @return the product of two complex numbers
*/	
	//multiplication method 
	public ComplexNumber multiply(ComplexNumber otherNumber){
		ComplexNumber newComplex;
		float newA = (this.a * otherNumber.getA() - this.b * otherNumber.getB());
		float newB = (this.b * otherNumber.getA() + this.a * otherNumber.getB());
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	} //end multiplication method 

/**
 This method takes two complex numbers and divides them 
 @param otherNumber - a value
 @return the quotient of two complex numbers
*/	
	//division method 
	public ComplexNumber divide(ComplexNumber otherNumber) throws ArithmeticException{
		if(otherNumber.getA() == 0 && otherNumber.getB() == 0){
			throw new ArithmeticException("Division by 0");
		}
		ComplexNumber newComplex;
		float newA = (this.a * otherNumber.getA() + this.b * otherNumber.getB()) / (otherNumber.getA() * otherNumber.getA() + otherNumber.getB() * otherNumber.getB());
		float newB = (this.b * otherNumber.getA() - this.a * otherNumber.getB()) / (otherNumber.getA() * otherNumber.getA() + otherNumber.getB() * otherNumber.getB());
		newComplex = new ComplexNumber(newA, newB);
		return newComplex;
	} //end division method
	
/**
 This method overrides objects toString method and formats numbers into complex numbers 
 @return string in the form of a complex number 
*/
	//toString method that returns a string in the format of a complex number 
	@Override 
	public String toString(){
		String returnComplex = "";
		returnComplex += this.a + this.b + "i";
		return returnComplex;
		//return String.format("(%s + %si)", this.a, this.b);
	} //end toString method 
	
/**
 This method overrides objects equals method to be able to compare objects
 @param o - a reference object 
 @return true if this object is the same as the o argument; false otherwise 
*/	
	//overriden equals method 
	@Override
	public boolean equals(Object o){
		if(o instanceof ComplexNumber){
			ComplexNumber num = (ComplexNumber)o;
			if(num.getA() == this.a && num.getB() == this.b)
				return true;
		}
		return false; 
	} //end equals method
} //end class 




