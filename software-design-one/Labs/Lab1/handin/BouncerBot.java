import java.util.Scanner;

public class BouncerBot{
	
	public static void main(String[] args){
		
		//attributes of the program
		
			Scanner input = new Scanner(System.in); //create scanner to obtain input 
		
			int currentMonth = input.nextInt(); //initialize currentMonth to user input
			
			int currentDay = input.nextInt(); //initialize currentDay to user input 
			
			int currentYear = input.nextInt(); //initialize currentYear to user input 
			
			int birthMonth = input.nextInt(); //initialize birthMonth to user input 
			
			int birthDay = input.nextInt(); //initialize birthDay to user input
			
			int birthYear = input.nextInt(); //initialize birthYear to user input 
			
				//logic of the program
					
			if(currentDay == birthDay && currentMonth == birthMonth && currentYear - birthYear >= 21){ //if currentDay, currentMonth, is not == birthDay, birthMonth then false 
				System.out.println("true"); //output true 
			} 
						
			else{ //if currentDay, currentMonth is == birthDay, birthMonth and if currentYear - birthYear is >= 21 
				System.out.println("false"); //output false
			}
											
	}
}