import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class StudentDatabaseSerializedFileWriter{

    private static ObjectOutputStream outputStudentDatabase;
    
    
    public static void openFile (String filename) {
        try {
            outputStudentDatabase = new ObjectOutputStream(new FileOutputStream(filename));
        }   
        catch (IOException e) {
            System.err.println("Error opening file.  Terminating1");
            System.exit(1);
        }        
    } 
    
    
    
    public static void writeData(StudentDatabase theData){
        try{
           outputStudentDatabase.writeObject(theData);
        }
        catch (IOException e){
			e.printStackTrace();
		}
    }

    public static void closeFile() {
       try{ 
           if (outputStudentDatabase != null) {
            outputStudentDatabase.close();
            outputStudentDatabase = null;
           }
       }
       catch (IOException e){
            e.printStackTrace();
       }
    }


}