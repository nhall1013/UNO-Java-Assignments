import java.util.Scanner;

public class PapersPlease{
	
	public static void main(String[] args){
	
	//set up input
	
	Scanner input = new Scanner(System.in);
	
	//attributes
	
	boolean passport = input.nextBoolean(); 
	boolean license = input.nextBoolean(); 
	boolean certificate = input.nextBoolean();
	
	//logic
		
		//if passport is true the output is true
		if(passport == true){  
			System.out.printf("true\n");
		}
		
		//if license and certificate is true then true
		else 
			if(license == true && certificate == true){  
				System.out.printf("true\n");
			}
		//false 
		else{  
			 System.out.printf("false\n");
		}
		
	}
}