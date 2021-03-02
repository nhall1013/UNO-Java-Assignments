//NIck Hall Problem 1 Summing It Up
import java.util.Scanner;

public class SummingItUp{

	public static void main(String[] args){
		//attriubutes 
		Scanner input = new Scanner(System.in); //set up scanner
		int testCases = input.nextInt(); //declare int called testCases and assign input 
		int answer;
		answer = 0;
		//logic
		// for loop test cases
		for(int i = testCases; i > 0; i--){
			int firstNumber = input.nextInt(); //declare an int called firstNumber and assign input 
			int secondNumber = input.nextInt(); //declare an int called secondNumber and assign input
			for(int j = secondNumber; j < firstNumber + 1; j++){
				answer = answer + j;
			}
			for(int j = firstNumber; j < secondNumber + 1; j++){
				answer = answer + j;
			}	
		System.out.println(answer);
		answer = 0;
		}	
	} 
}