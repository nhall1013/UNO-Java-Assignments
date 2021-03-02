//Nick Hall Problem 7 Simple Calculator 
import java.util.Scanner;

public class SimpleCalculator{
	
	public static void main(String[] args){
		//define class attributes
		Scanner input = new Scanner(System.in);
		int testCases, firstNumber, secondNumber, answer;
		String operator;
		testCases = input.nextInt();
		answer = 1; 
		//setup testCases for loop 
		for(int i=0; i<testCases; i++){
			//pull input data: firstNumber, operator, secondNumber
			firstNumber = input.nextInt();
			operator = input.next();
			secondNumber = input.nextInt();
			answer = 1; 
		//define logic 
		//if operator is "+": answer = firstNumber + secondNumber
		if(operator.equals("+")){
			answer = firstNumber + secondNumber;
		}
		//if operator is "-": answer = firstNumber - secondNumber
		else if(operator.equals("-")){
			answer = firstNumber - secondNumber;
		}
		//if operator is "*": answer = firstNumber * secondNumber
		else if(operator.equals("*")){
			answer = firstNumber * secondNumber;
		}
		//if operator is "/": answer = firstNumber / secondNumber
		else if(operator.equals("/")){
			answer = firstNumber / secondNumber;
		}
		//if operator is "%": answer = firstNumber % secondNumber
		else if(operator.equals("%")){
			answer = firstNumber % secondNumber;
		}
		//if operator is "**": answer = firstNumber ^ secondNumber
		else{
			//** if second = 0 then answer = 1;
			//** if second > 1 first * first second amount of time 
			for(int j=0; j<secondNumber; j++){
				answer *= firstNumber;
			}
		}
		//print answer
		System.out.println(answer);
		}//end for loop 
	}//end main method
}//end class 