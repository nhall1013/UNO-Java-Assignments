import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class StudentDatabaseSerializedFileReader{


    private static ObjectInputStream inputStudentDatabase; 

		
		public static void openFile (String filename) {
			try {
					inputStudentDatabase = new ObjectInputStream(new FileInputStream(filename));
			}   
			catch (IOException e) {
					System.err.println("Error opening file.  Terminating3");
					System.exit(1);
			}        
		} 
		
		public static StudentDatabase readData(){
		StudentDatabase data = null;
			try{
				
				data = (StudentDatabase)inputStudentDatabase.readObject();
			
			}
			catch (ClassNotFoundException e){
				e.printStackTrace();
			}
			catch (IOException e){
				e.printStackTrace();
			}
		return data;
	}

	public static void closeFile() {
		try{ 
				if (inputStudentDatabase != null) {
				 inputStudentDatabase.close();
				 inputStudentDatabase = null;
				}
		}
		catch (IOException e){
				 e.printStackTrace();
		}
 }



}