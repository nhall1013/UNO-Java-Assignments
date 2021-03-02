import java.util.Scanner;
public class Adventure{
	
	public static void main(String[] args){
		House house = new House();
		Scanner input = new Scanner(System.in);
		boolean currentStatus = true;
		Room currentRoom = house.start();
		while(currentStatus){
			System.out.println(currentRoom);
			System.out.println("What direction would you like to go?");
			char response = input.nextLine().charAt(0);
			if(response == 'n'){
				if(currentRoom.getNorth() != null){
					currentRoom = currentRoom.getNorth();
				}else{
					System.out.println("That is not a valid exit");
				}
			}
			if(response == 's'){
				if(currentRoom.getSouth() != null){
					currentRoom = currentRoom.getSouth();
				}else{
					System.out.println("That is not a valid exit");
				}
			}
			if(response == 'e'){
				if(currentRoom.getEast() != null){
					currentRoom = currentRoom.getEast();
				}else{
					System.out.println("That is not a valid exit");
				}	
			}
			if(response == 'w'){
				if(currentRoom.getWest() != null){
					currentRoom = currentRoom.getWest();
				}else{
					System.out.println("That is not a valid exit");
				}
			}
			if(response == 'q'){
				System.out.println("You have quit the game. Goodbye.");
				currentStatus = false; 
			}
		}
	}
}