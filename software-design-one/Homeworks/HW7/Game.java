
public class Game{

	private static Player hero;
	private static Monster monster;
	
	public static void main(String[] args){
		hero = new Player("Nick", 100, 10, 25);
		monster = new Monster("Danny", 60, 7, 15);
		boolean combat = true;
		System.out.println("You encounter a wild Danny and he attacks!");
		while(combat){
			combat = combat(); 
		}
	}
	
	public static boolean combat(){
		while(hero.getHealth() > 0 && monster.getHealth() > 0){
			hero.takeTurn(monster);
			monster.takeTurn(hero);
		}
		if(hero.getHealth()==0){
			System.out.println("You have died.");
		}else{
			System.out.printf("You have defeated %s.\nYou gain %d exp.\n", monster.getName(), monster.getXp()); 
		}
		return false;
	}
}