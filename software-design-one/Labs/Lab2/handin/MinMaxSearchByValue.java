//Nick Hall Problem 4 Min/Max Search by Value 
import java.util.Scanner;

public class MinMaxSearchByValue{
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in); //set up scanner
	
		//attributes of the program 
	
		int testCases = input.nextInt();
	
		String givenListOfNumbers;
	
		int min;
	
		int max;
	
		input.nextLine(); 
	
		//logic of the program 
	
		for(int i=0;i<testCases;i++){ //loop through for every case   
		
			givenListOfNumbers = input.nextLine(); //convert string to ints using a scanner object
			
			Scanner stringScanner = new Scanner(givenListOfNumbers);
			
			min = stringScanner.nextInt(); //set min and max to the first int in list 
			
			max = min;
			
			//loop through number sequence
			
			while(stringScanner.hasNextInt()){
				int nextValue = stringScanner.nextInt();
				
				if(nextValue < min){ //test if current number less than min 
					min = nextValue; //if so set min to that number 
				}
				
				else if(nextValue > max){ //test if current number is greater than max
					max = nextValue; //if so set max to that number 
				}
				
			}
		
			System.out.printf("%s\n%d\n%d\n\n",givenListOfNumbers,min,max); //output data
		
			//repeat until all sequences are complete
		}	
		
	
	}
}
