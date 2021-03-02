public class Monster{
	
	private static int count = 0;
	
	public static int getCount() { return Monster.count; }
	
	public static Monster spawn(String userInput){
		
		Monster monster = null;
		final int GOBLIN = 0, ORC = 1, TROLL = 2; 
		int type;
		if(userInput.equals("goblin")){
			type = GOBLIN;
		}
		else if(userInput.equals("orc")){
			type = ORC;
		}
		else if(userInput.equals("troll")){
			type =  TROLL; 
		}
		else{
			type = (int)(Math.random() * 3);
		}
		switch(type){
			case GOBLIN:{
				String name = "goblin";
				int hp = (int)(Math.random() * 25) +75;
				int st = (int)(Math.random() * 5) +8;
				int xp = 1;
				monster = new Monster(name, hp, st, xp);
			}break;
			case ORC:{
				String name = "orc";
				int hp = (int)(Math.random() * 25) +100;
				int st = (int)(Math.random() * 5) +12;
				int xp = 3;
				monster = new Monster(name, hp, st, xp);
			}break; 
			case TROLL:{
				String name = "troll";
				int hp = (int)(Math.random() * 25) +150;
				int st = (int)(Math.random() * 5) +15;
				int xp = 5;
				monster = new Monster(name, hp, st, xp);
			}break;
		}
		return monster;
	}
	
	private String name;
	private int health;
	private int strength;
	private int xp; 
	
	public Monster(String name, int health, int strength, int xp){
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.xp = xp;
		Monster.count++;
	}
	
	public void attack(Player hero){
		int damage = (int)(Math.random() * this.strength) + 1;
		hero.takeDamage(damage);
	}
	public void takeDamage(int damage){
		if(this.health > damage){
			this.health -= damage;
		}
		else{
			this.health = 0;
		}
	}
	public String toString(){
		return String.format("[%s] HP: %d, STR: %d",name,health,strength);
	}
	public String getName(){ return this.name; }
	public int getHealth(){ return this.health; }
	public int getStrength(){ return this.strength; }
	public int getXp(){ return this.xp; }
}
