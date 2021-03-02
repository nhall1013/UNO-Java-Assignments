import java.util.Scanner;

public class LogIt{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		int cases = input.nextInt(); 
		for(int i=0; i<cases;i++){
			int maxNumber = input.nextInt();
			binarySortAlg(maxNumber);
		}
	}
	
	public static void binarySortAlg(int number){
		
		double log2 = Math.log(number) / Math.log(2);
		int maxGuesses = (int) Math.ceil(log2);
		System.out.println(maxGuesses);
	}
}