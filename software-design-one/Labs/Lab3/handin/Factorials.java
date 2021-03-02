import java.util.Scanner;

public class Factorials{

	public static void main(String[] args){
		//attributes
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		//logic
		for(int i = 0; i < testCases; i++){
			long factorial = input.nextInt();
			long answer = factorial;
			for(long j = 1; j < factorial; j++){
				answer = answer * j;
				//if(factorial == 0){
				//System.out.println("1");
			}
			
			if (factorial == 0){
				answer = 1;
			}
			System.out.println(answer);	
			factorial = 1; 
		}
	}
}