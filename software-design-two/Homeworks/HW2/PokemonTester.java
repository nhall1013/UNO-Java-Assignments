/**
@author Nick Hall
@since 2/11/2019

JUnit tester that redirects standard output so that the 
Pokemon and PokemonTrainer classes can be tested

*/


import static org.junit.Assert.*;
import org.junit.*;
import java.io.ByteArrayOutputStream; 
import java.io.PrintStream; 

public class PokemonTester{
	
	private ByteArrayOutputStream output = new ByteArrayOutputStream();   
	private String lineSeparator = System.getProperty("line.separator"); 
	private Pokemon Nick;
	private Pokemon Summa;
	private Pokemon Danny;
	private Pokemon Charlie;
	private Pokemon Kristen;
	private PokemonTrainer Lauren;
	private PokemonTrainer Sam;
	private PokemonTrainer Audrey;
	
/**	
	
 A setup method that redirects output and builds Pokemon and PokemonTrainer objects before
 every test.  

*/	
	
	@Before  
	public void setup(){  
	System.setOut(new PrintStream(output));     
	Nick = new Pokemon("Nick",100,20);
	Summa = new Pokemon("Summa",80,25);
	Danny = new Pokemon("Danny",90,30);
	Charlie = new Pokemon("Charlie",70,10);
	Kristen = new Pokemon("Kristen",0,0);
	Lauren= new PokemonTrainer("Lauren");
	Sam = new PokemonTrainer("Sam");
	Audrey = new PokemonTrainer("Audrey");
	} // end @Before method 
 
/**	
	
 Tests the Pokemon constructor. 
	
*/	
	@Test 
	public void testPokemonConstruction(){
		System.out.println(Nick.getName());
		System.out.println(Nick.getHealth());
		System.out.println(Nick.getAttackPower());
		assertEquals("Nick" + lineSeparator + 100 + lineSeparator + 20 + lineSeparator, output.toString());
	}
	
/**	

 Tests the PokemonTrainer constructor. 
	
*/	
	@Test 
	public void testTrainerConstruction(){
		System.out.println(Lauren.getName());
		assertEquals("Lauren" + lineSeparator, output.toString());
	}
	
/**	
	
 Tests the isDead method in Pokemon by creating a new boolean value and setting it to true
 and comparing it to what isDead returns. 

*/	
	@Test
	public void testIsDead(){
		boolean deadPokemon = true; 
		System.out.println(Kristen.isDead());
		assertEquals(deadPokemon + lineSeparator, output.toString());
	}
	
/**	

 Tests the attack method and takeDamage method in Pokemon. 
 
*/	
	@Test
	public void testAttack(){
		Nick.takeDamage(30, Danny);
		System.out.println(Nick.getHealth());
		assertEquals(70 + lineSeparator, output.toString());
	}	
	
/**	
	
 Tests a second case in the attack method where the amount of damage 
 the pokemon takes is greater than the amount of health it has. 

*/	
	@Test 
	public void testAttack2(){
		Summa.takeDamage(81, Nick);
		System.out.println(Summa.getHealth());
		assertEquals(0 + lineSeparator, output.toString());
	}
	
/**	
	
 Tests the toString method in Pokemon.
	
*/	
	@Test 
	public void testPokemonToString(){
		System.out.println(Nick.toString());
		assertEquals("Pokemon Nick:\n\thealth: 100\n\tattack: 20\r\n", output.toString());
	} 

/**	
	
 Tests the toString method in PokemonTrainer.
	
*/	
	@Test 
	public void testTrainerToString(){
		System.out.println(Sam.toString());
		assertEquals("PokemonTrainer " + "Sam\r\n", output.toString());
	} 

/**	
	
 Tests Myobservable and Myobserver classes.

*/	
	@Test 
	public void testObservers(){
		
		Nick.addObserver(Lauren);
		Nick.addObserver(Sam);
		Danny.addObserver(Audrey);
		Charlie.addObserver(Audrey);
		Charlie.addObserver(Sam);
		Summa.addObserver(Lauren);
		
		output.reset();
		Charlie.attack(Danny);
		String expected = "PokemonTrainer Audrey is notified that Pokemon Charlie attacked Pokemon Danny using Body Slam for 10 damage.\r\n";
		assertEquals(expected, output.toString());
		
		output.reset();
		Danny.attack(Charlie);
		String expected2 = "PokemonTrainer Audrey is notified that Pokemon Danny attacked Pokemon Charlie using Body Slam for 30 damage.\r\nPokemonTrainer Sam is notified that Pokemon Danny attacked Pokemon Charlie using Body Slam for 30 damage.\r\n";
		assertEquals(expected2, output.toString());
		
		output.reset();
		Nick.attack(Summa);
		String expected3 = "PokemonTrainer Lauren is notified that Pokemon Nick attacked Pokemon Summa using Body Slam for 20 damage.\r\n";
		assertEquals(expected3, output.toString());
		
		output.reset();
		Summa.attack(Danny);
		String expected4 = "PokemonTrainer Audrey is notified that Pokemon Summa attacked Pokemon Danny using Body Slam for 25 damage.\r\n";
		assertEquals(expected4, output.toString());
		
	
	}	
	
/**	
	
 Resets the output after every test.
	
*/	
	@After  
	public void resetStreams(){   
		System.setOut(System.out);   
		System.setErr(System.err);  
	} // end @After method 

} //end class



















