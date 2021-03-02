import java.util.Scanner;

public class PrimeNumber{

	public static void main(String[] args){
		//attributes
		Scanner input = new Scanner(System.in); //set up scanner
		int testCases = input.nextInt(); //intitilize int testCases to input 
		boolean num = true; 
		//logic
		for(int i = 0; i < testCases; i++){
			int originalNumber = input.nextInt();
			num = true;
			for(int j = 2; j < originalNumber; j++){
				if(originalNumber % j == 0){
					num = false;
				}
			} // end second loop 
			originalNumber = 0;
			System.out.println(num);
		} //end test case loop
	} //end main method
} // end class 	