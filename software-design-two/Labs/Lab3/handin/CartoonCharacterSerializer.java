//package Lab3Student;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
//#TODO
//Use appropriate imports
//hint: there are a lot!

public class CartoonCharacterSerializer {
	
	private static ObjectOutputStream outputCartoon;
	private static ObjectInputStream inputCartoon;
	private static PrintWriter writer;
	
	//Method that writes one CartoonCharacter object out to a file
	public static void serializeCharacter(CartoonCharacter character) {
		//#TODO
		//Initialize outputCartoon to serialize objects to a file called Cartoon.ser
		try{
          outputCartoon = new ObjectOutputStream(new FileOutputStream("Cartoon.ser"));
		//Write the character object out to the file
		outputCartoon.writeObject(character);
		//Close the stream
          outputCartoon.close(); 
          }
          catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static CartoonCharacter deserializeCharacter() {
		CartoonCharacter cartoon = null;
		try{
          inputCartoon = new ObjectInputStream(new FileInputStream("Cartoon.ser"));
		//#TODO
		//Initialize inputCartoon to read objects from a file called Cartoon.ser
		
		//Read one CartoonCharacter object and store it in variable cartoon
		     while(true){
                    cartoon = (CartoonCharacter)inputCartoon.readObject();
		          
               }
          }
          catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
          catch (IOException e)//Must include
		{
			try {
				inputCartoon.close();
				if (e instanceof EOFException) {//When end of file is reached, print this message
					System.out.println("Reached end of file, " + e);
				} 
                    else {
					e.printStackTrace();
			     }
			} catch (IOException e1) {
				e1.printStackTrace();
			}
          }
          return cartoon;
	}
	
	public static void printToFile(String stringToFile) throws FileNotFoundException {
		
		//#TODO
		//Initialize writer to print characters to a file called C-137.txt
		try{
          writer = new PrintWriter("c-137.txt");
		//Print stringToFile to that file
		writer.write(stringToFile);
		//Print the string "PrintWriter makes printing 50 times easier!" followed by a newline character out to the file
		writer.write("PrintWriter makes printing 50 times easier!");
		//Close the PrintWriter stream
          writer.close();
          }
          catch(FileNotFoundException e2){
               e2.printStackTrace();
          
          }
	}

}
