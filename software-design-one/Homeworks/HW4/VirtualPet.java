import java.util.Scanner; //import scanner

public class VirtualPet{
		
		static String petName; //declare String petName 
		static int petAge; //declare int petAge
		static int currentHunger; //declare int currentHunger
		static int currentBoredom; //declare int currentBoredom
		static int currentDirtiness; //declare int currentDirtiness
		static int hungerRate; //declare int hungerRate
		static int boredomRate; //declare int boredomRate
		static int dirtinessRate; //declare int dirtinessRate
		static final int LOW_STAT_THRESHOLD = 1; //declare int LOW_STAT_THRESHOLD
		static final int MED_STAT_THRESHOLD = 2; //declare int MED_STAT_THRESHOLD
		static final int HIGH_STAT_THRESHOLD = 3; //declare int HIGH_STAT_THRESHOLD
		static final int RUNAWAY_STAT_THRESHOLD = 4; //declare int RUNAWAY_STAT_THRESHOLD
	
	public static void main(String[] args){
		createPet();
		while(currentHunger < RUNAWAY_STAT_THRESHOLD && currentDirtiness < RUNAWAY_STAT_THRESHOLD && currentBoredom < RUNAWAY_STAT_THRESHOLD){
			increaseAge();
			playerInteraction();
			petStatus();
			runawayStatus();
		}
		playerResult();
	} //end main 
	
	public static void createPet(){
		System.out.println("Welcome to Virtual Pet!"); //output
		System.out.println("What would you like to name your pet?"); //output 
		Scanner input = new Scanner(System.in); //set up scanner
		petAge = 0; //initialize petAge to 0
		petName = input.nextLine(); //recieve input from user and assign it to petName 
		currentHunger = 0; //initialize currentHunger to 0
		currentBoredom = 0; //initialize currentBoredom to 0
		currentDirtiness = 0; //intialize currentDirtiness to 0
		hungerRate = currentHunger++; //initialize hungerRate to currentHunger + 1 
		boredomRate = currentBoredom++; //initialize boredomRate to currentBoredom + 1
		dirtinessRate = currentDirtiness++; //initialize dirtinessRate to currentDirtiness + 1 
	} //end createPet method

	public static void increaseAge(){
		petAge++; // increment petAge 
		System.out.println(petName + " is now " + petAge + " days old!"); //output current age of pet
		if(petAge % 2 == 0){ //check to see if pet age is divsible by two
			hungerRate++; //if divisible by two increment hungerRate
			System.out.println(petName + " gets hungrier faster!"); //inform player hungerRate has increased 
		}
		if(petAge % 3 == 0){ //check to see if pet age is divisible by three 
			dirtinessRate++; //if divisibile by three increment dirtinessRate
			System.out.println(petName + " gets dirtier faster!"); //inform player dirtinessRate has increased 
		}
		if(petAge % 5 == 0){ //check to see if pet age is divisibile by five
			boredomRate++; //if divisibile by five increment boredomRate
			System.out.println(petName + " gets bored faster!"); //infor player boredomRate has increased 
		}
	} //end increaseAge method 
	
	public static void playerInteraction(){
		System.out.println("1. Feed"); //output option to feed pet
		System.out.println("2. Clean"); //output option to clean pet 
		System.out.println("3. Play"); //output option to play with pet 
		System.out.println("What would you like to do with " + petName); //prompt player to choose what to do with pet
		Scanner input = new Scanner(System.in); //set up scanner 
		int decision = input.nextInt(); // initialize variable decision to player input
		if(decision == 1){ //check to see if player chose option 1 
			feedPet(); //call feedPet method
		}
		if(decision == 2){ //check to see if player chose option 2 
			cleanPet(); //call cleanPet
		}
		if(decision == 3){ //check to see if player chose option 3 
			playPet(); //call playPet
		}
	} //end playerInteraction
	
	public static void feedPet(){
		currentHunger = currentHunger - hungerRate; //decrease currentHunger by hungerRate
		currentDirtiness = currentDirtiness + dirtinessRate; //increase currentDirtiness by dirtinessRate
		System.out.println("You feed " + petName + " but it makes a mess..."); //inform player on what happened
	} //end feedPet
	
	public static void cleanPet(){
		currentDirtiness = currentDirtiness - dirtinessRate; //decrease currentDirtiness by dirtinessRate
		currentBoredom = currentBoredom + boredomRate; //increase currentBoredom by boredomRate
		System.out.println("You clean " + petName + " but it gets bored..."); //inform player on what happened 
	} //end cleanPet
	
	public static void playPet(){
		currentBoredom = currentBoredom - boredomRate; // decrease currentBoredom by boredomRate
		currentHunger = currentHunger + hungerRate; // increase currentHunger by hungerRate
		System.out.println("You play with " + petName + " but it gets hungry..."); //inform plyer on what happened 
	} //end playPet
	
	public static void petStatus(){
		String hungerDescription = "Hunger Level: " + petDescription(currentHunger); //assign hungerDescription to method and set int value to currentHunger 
		String dirtDescription = "Cleanliness Level: " + petDescription(currentDirtiness); //assign dirtDescription to method and set int value to currentDirtiness
		String boredDescription = "Boredom Level: " + petDescription(currentBoredom); //assign boredDescription to method and set int value to currentBoredom
		System.out.println(hungerDescription); //output hungerDescription
		System.out.println(dirtDescription); //output dirtDescription 
		System.out.println(boredDescription); //output boredDescription
	}
	
	public static String petDescription(int value){
		String message = ""; //declare String message
		if(value < LOW_STAT_THRESHOLD){
			message = " sublime!";
		}
		else if(value < MED_STAT_THRESHOLD){ //check if value is less than MED_STAT_THRESHOLD
			message = " Could be better..."; //assign description to String message 
		}
		else if(value < HIGH_STAT_THRESHOLD){ //check if value is less than HIGH_STAT_THRESHOLD
			message = " Very bad!"; //assign description to String message 
		}
		return message; //return String message 
	} //end petDescription method
	
	public static void runawayStatus(){
		boolean runaway = true; 
		if(currentHunger>RUNAWAY_STAT_THRESHOLD){
			System.out.println(petName + " is too hungry! They have run away!");
			runaway = true;
		}
		if(currentDirtiness>RUNAWAY_STAT_THRESHOLD){
			System.out.println(petName + " is too dirty! They have run away!");
			runaway = true; 
		}
		if(currentBoredom>RUNAWAY_STAT_THRESHOLD){
			System.out.println(petName + " is too bored! They have run away!");
			runaway = true; 
		}
		else{
			runaway = false; 
		}
	} //end runawayStatus
	public static void playerResult(){
		System.out.println("You took care of " + petName + " for " + petAge + " days!");
		if(petAge<5){
			System.out.println("You'll do better next time!");
		}
		if(petAge>=6){
			System.out.println("Congratulations for spending many happy days with your pet!");
		}
		if(petAge>=16){
			System.out.println("You are an great pet owner!");
		}
		if(petAge>25){
			System.out.println("You are ready for real pet ownership!");
		}
	}
} //end class