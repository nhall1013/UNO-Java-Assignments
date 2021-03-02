import java.util.Scanner; 

public class FizzBuzz{
	
	public static void main(String[] args){
		//attributes
		Scanner input = new Scanner(System.in); //set up scanner 
		int testCases = input.nextInt(); // initialize int testCases to input 
		 
		//logic 
		for(int i = 0;i < testCases; i++){
			int number = input.nextInt(); //initialize int number to input
			if(number % 3 == 0 && number % 5 == 0){ //if number % 3 == 0 and number % 5 == 0
				System.out.println("fizzbuzz"); //output fizzbuzz
			}
			else if(number % 3 != 0 && number % 5 != 0){ //if number % 3 != 0 and number % 5 != 0
				System.out.println(number);//output number
			}   
			else if(number % 3 == 0){ //if number % 3 == 0
				System.out.println("fizz"); //output fizz
			}
			else if(number % 5 == 0){ //if number % 5 == 0
				System.out.println("buzz"); //output buzz
			}
		} //end for loop 
	} //end main method
} //end class