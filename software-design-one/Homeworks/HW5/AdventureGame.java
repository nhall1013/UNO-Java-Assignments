import java.util.Scanner; 
public class AdventureGame{
	final int NUMBER_OF_ROOMS = 7; //create final int for number of rooms
	final  static int NORTH = 0, EAST = 1, WEST = 2, SOUTH = 3; //create final ints for directions player can go 
	static int currentRoom = 0; //static variable to keep up with current room 
	static boolean currentStatus = true; //static loop control variable 
	static String[] roomDescription = { //string array for room descriptions
		"You are in the library, exits are north and east.",
		"You are in the South Hall, exits are north, east, and west.",
		"You are in the Dining Room, exits are north and west.",
		"You are in the Master Bedroom, exits are east and south.",
		"You are in the North Hall, exits are north, east, west, and south.",
		"You are in the Kitchen, exits are west and south.",
		"You are on the Porch, exits are south."
	};
	static int[][] roomExits = { {3,1,-1,-1},{4,2,0,-1},{5,-1,1,-1},{-1,4,-1,0},{6,5,3,1},{-1,-1,4,2},{-1,-1,-1,4} }; //create 2D array for room exits
	public static void main(String[] args){
		while(currentStatus){ //create game loop 
			Scanner input = new Scanner(System.in); //setup scanner
			System.out.println(roomDescription[currentRoom]); //print current room description
			System.out.println("Which direction would you like to go?"); //output message to user
			char response = input.nextLine().charAt(0); //recieve input from user to see what direction they want to go 
			//selection statements for determining where the player moves
			if(response == 'n' || response == 'e' || response == 'w' || response == 's' || response == 'q'){
				if(response == 'n'){
					int tempRoom = roomExits[currentRoom][NORTH];
					if(tempRoom == -1){
						System.out.println("There is not an exit in that direction.");
					}
					else{
						currentRoom = tempRoom;
					}
				}
				else if(response == 'e'){
					int tempRoom = roomExits[currentRoom][EAST];
					if(tempRoom == -1){
						System.out.println("There is not an exit in that direction.");
					}
					else{
						currentRoom = tempRoom;
					}
				}	
				else if(response == 'w'){
					int tempRoom = roomExits[currentRoom][WEST];
					if(tempRoom == -1){
						System.out.println("There is not an exit in that direction.");
					}
					else{
						currentRoom = tempRoom;
					}
				}
				else if(response == 's'){
					int tempRoom = roomExits[currentRoom][SOUTH];
					if(tempRoom == -1){
						System.out.println("There is not an exit in that direction.");
					}
					else{
						currentRoom = tempRoom;
					}
				}
				else if(response == 'q'){
					System.out.println("You have quit the game. Goodbye!");
					currentStatus = false; 
				}
			}
			else{
				System.out.println("Error: Invalid input!");
			}
		} //end game loop 
	} //end main
} //end class 