public class Monster extends GameCharacter{
	
	private int xp;
	
	public Monster(String name, int health, int atk, int exp){
		super(name, health, atk);
		this.xp = exp;
	}
	
	public void attack(Player hero){
		hero.takeDamage(super.getAttackPower());
	}
	
	public void takeTurn(Player hero){
		this.attack(hero);
	}
	
	public int getXp(){
		return this.xp;
	}
	
	public String toString(){
		return super.toString() + "XP: [" +this.xp+ "]\n";
	}
}