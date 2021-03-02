//Nick Hall Problem 6 Chair Scavenging
import java.util.Scanner;

public class ChairScavenging{
	
	public static void main(String[] args){
		//attributes
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		int answer;
		//Logic 
		for(int i=0; i<testCases; i++){
			int numberofPeople = input.nextInt();
			int numberofChairs = input.nextInt();
			if(numberofPeople > numberofChairs){
				answer = numberofPeople - numberofChairs;
				System.out.println(answer);
			}
			if(numberofChairs >= numberofPeople){
				System.out.println("0");
			}
		}	
	}
}
