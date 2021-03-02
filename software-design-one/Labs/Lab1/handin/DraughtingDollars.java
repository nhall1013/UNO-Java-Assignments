import java.util.Scanner;

public class DraughtingDollars{
 
	public static void main(String[] args){
		
		//set up input
		Scanner input = new Scanner(System.in);
		
		//attributes of the program 
		double remainingBeer = input.nextDouble();
		double pricePerBeer = input.nextDouble();
		double fullKeg = 15.5;
		double ozPerGallon = 128;
		double ozPerPint = 16;
		double servingSize = ozPerPint;
		double priceOfBeer;
		
		//logic:
		//how much beer is left in keg
		//full keg * remaining beer 
		remainingBeer = fullKeg * remainingBeer;
		//how many oz is that
		remainingBeer = remainingBeer * ozPerGallon;
		//how many servings there are
		remainingBeer = remainingBeer / servingSize;
		//what is the price of the remaining beer
		priceOfBeer = remainingBeer * pricePerBeer;
		// the output
		System.out.printf("There is $%.2f of beer left in keg\n", priceOfBeer);
	}
}