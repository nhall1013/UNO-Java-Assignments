
public class GameCharacter{
	
	private String name;
	private int health;
	private int attackPower;
	
	public GameCharacter(String name, int health, int attackPower){
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
	}
	
	public void takeDamage(int damage){
		if(this.health>damage){
			this.health -= damage;
			System.out.printf("%s takes %d damage. ", this.name, damage);
		}else{
			this.health = 0;
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public int getAttackPower(){
		return this.attackPower;
	}
	
	public String toString(){
	return String.format("Name: [%s], Health: [%d], Attack: [%d]\n", this.name, this.health, this.attackPower);
	}
}