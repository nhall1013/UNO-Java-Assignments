import java.util.NoSuchElementException;
import java.util.Scanner;
public class Player extends GameCharacter{

	private int mana;
	private Scanner input;
	public Player(String name, int health, int atk, int mana){
		super(name, health, atk);
		input = new Scanner(System.in);
		this.mana = mana;
		
	}
	
	public void attack(Monster target){
		target.takeDamage(super.getAttackPower());
	}
	
	public void castSpells(Monster monster){
		if(this.mana > 10){
			monster.takeDamage(super.getAttackPower() * 2);
			this.mana -= 10; 
		}else{
			System.out.println("Not enough mana.");
		}
	}
	
	public void takeTurn(Monster monster){
		int choice;
		boolean correct = false;
		while(!correct){
			System.out.println("What would you like to do?\n"
								+"1. Attack\n"
								+"2. Cast a Spell\n"
								+"3. Charge Mana\n"
								+"4. Items\n"
								+"5. Run\n");
			try{
				choice = input.nextInt();
				if(choice < 6 && choice > 0){
					correct = true;
					takeTurn(choice, monster);
				}
			}catch(NoSuchElementException e){
				System.out.println("\nPlease enter a numeric choice from the menu.\n");
			}
		}
		
	}
	
	private void takeTurn(int choice, Monster monster){
		switch(choice){
			case 1: {this.attack(monster);}break;
			case 2: {this.castSpells(monster);}break;
			case 3: {this.chargeMana();}break;
			case 4: {/*use items*/}break;
			case 5: {/*escape*/}break;
		}
	}
	
	public void chargeMana(){
		this.mana += 8;
	}
	
	public int getMana(){
		return this.mana;
	}
	
	public String toString(){
		return String.format("%s Mana: [%d]\n", super.toString(), this.mana);
	}
}