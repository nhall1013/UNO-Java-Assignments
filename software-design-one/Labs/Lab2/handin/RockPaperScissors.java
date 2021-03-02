import java.util.Scanner;

public class RockPaperScissors{

	public static void main(String[] args){
		//attributes
		Scanner input = new Scanner(System.in); //set up scanner
		int testCases = input.nextInt(); // int called testCases assigned to input
		String rock = "rock"; //initialize rock to true
		String paper = "paper"; //initialze paper to true
		String scissors = "scissors"; //initialize scissors to true	
		//logic
		for(int i = 0; i < testCases; i++){ //set up for loop for testCases
			String playerOne = input.next(); //obtain input from Player 1
			String playerTwo = input.next(); // obtain input from Player 2
			if(playerOne.equals(playerTwo)){ //if players give same input 
				System.out.println("Tie!"); // output tie 
			}
			else if(playerOne.equals(rock) && playerTwo.equals(scissors)){ 
				System.out.println("Player 1 wins!");
			}
			else if(playerOne.equals(paper) && playerTwo.equals(rock)){
				System.out.println("Player 1 wins!");
			}
			else if(playerOne.equals(scissors) && playerTwo.equals(paper)){
				System.out.println("Player 1 wins!");
			}
			else{
				System.out.println("Player 2 wins!");
			}
		} 
	}
}