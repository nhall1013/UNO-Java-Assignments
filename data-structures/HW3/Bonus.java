import java.util.*;

public class Bonus{
	
	
	
	public static void main(String[] args){
		String output = ""; //null string to store correct output in later
		//map that stores correct keys and values
		HashMap<Character, Character> newMap = new HashMap<Character, Character>();
		//map that stores original text input 
		HashMap<Integer, Character> textMap = new HashMap<Integer, Character>();
		Scanner input = new Scanner(System.in);
		int keySwaps = input.nextInt(); //number of keyswaps from user input
		//arrays for storing keys that need to be swapped
		char[] keyOne = new char[keySwaps];  
		char[] keyTwo = new char[keySwaps];
		
		//load keys to be swapped into arrays
		input.nextLine();
		for(int i=0;i<keySwaps;i++){
			String a[] = input.nextLine().toLowerCase().split(" ");
			keyOne[i] = a[0].charAt(0);
			keyTwo[i] = a[1].charAt(0);
		}
		
		
		
		
		String text = input.nextLine().toLowerCase(); //text that needs to be corrected
		char[] textToArray = text.toCharArray(); //array that stores text
		
		//load text into textMap
		for(int i=0; i<textToArray.length; i++){
			int key = i; 
			char textValue = textToArray[i];
			textMap.put(key, textValue);
		}
		
		//load letters from text into newMap, this map corrects the keys so each letter maps to the correct value
		for(int i=0; i<textToArray.length; i++){
			char key = text.charAt(i); 
			char textValue = textToArray[i];
			newMap.put(key, textValue);
		}
		
		//loops through text to find values that need to be swapped then swaps textMap values with the correct value //from newMap 
		for(int i=0; i<textToArray.length; i++){
			
			for(int j=0;j<keyTwo.length;j++){
				if(textToArray[i] == keyOne[j]){
					textMap.put(i, newMap.get(keyTwo[j]));
				}
				if(textToArray[i] == keyTwo[j]){
					textMap.put(i, newMap.get(keyOne[j]));
				}
				if(textToArray[i] == keyOne[j]){
					textMap.put(i, newMap.get(keyTwo[j]));
				}
				if(textToArray[i] == keyTwo[j]){
					textMap.put(i, newMap.get(keyOne[j]));
				}
			}
		}
		
		//loops through textMap values and stores them in the null string so they can be printed out
		for(int i=0; i<textToArray.length; i++){
			output += textMap.get(i);
		}
		
		System.out.println(output); //print output to screen 
	}	
}	