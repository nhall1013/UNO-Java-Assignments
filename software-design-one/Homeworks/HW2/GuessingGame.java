import java.util.Scanner; 

public class GuessingGame{
	
	public static void main(String[] args){
	
		//attributes of the program
			
		Scanner input = new Scanner(System.in); //create scanner to obtain input 
		
		int lowestPossibleNumber = 0; //initialize int lowestPossibleNumber to 0

		int highestPossibleNumber = 100; //initialize int highestPossibleNumber to 100 

		boolean correctGuess = false; //initialize boolean correctGuess to false

		int numberOfGuesses = 0; //initialize numberofGuesses to 0
			
		int firstGuess; //declare int firstGuess 

		int userAnswer; //declare int userAnswer
		
		//logic of the program
				
		System.out.println("Choose an integer between 0 and 100"); //prompt user: "Choose an integer between 0 and 100"
					
		do{
					
			firstGuess = (highestPossibleNumber + lowestPossibleNumber) / 2; //make a guess halfway between range of numbers and store it 
			
			numberOfGuesses++; //add this guess to numberofGuesses variable
			
			System.out.println(firstGuess); //output guess to user 
			
			System.out.println("If guess was correct enter 1, if higher enter 2, if lower enter 3"); //output to see if guess was correct, higher, or lower 
			
			userAnswer = input.nextInt(); //get input from user by using Scanner
			
			if(userAnswer == 1){
				correctGuess = true; //if guess is correct set correctGuess to true 
			} 												
			
			if(userAnswer == 2){
				lowestPossibleNumber = firstGuess + 1; //if higher than guess change range 
			}
				
			if(userAnswer == 3){
				highestPossibleNumber = firstGuess - 1; //if lower than guess change range 
			} 											
					
		}while(correctGuess == false); //repeat while correctGuess is false  
													
		System.out.println(numberOfGuesses); //output numberofGuesses
				
	}
}