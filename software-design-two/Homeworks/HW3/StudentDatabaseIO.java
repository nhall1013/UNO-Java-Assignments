public class StudentDatabaseIO{

    public static void formattedToSerialized(String input, String output){
        StudentDatabaseCSVFileReader.openFile(input);
        StudentDatabase db = StudentDatabaseCSVFileReader.readData();
        StudentDatabaseCSVFileReader.closeFile();
        db.sortByGPA();
        StudentDatabaseSerializedFileWriter.openFile(output);
        StudentDatabaseSerializedFileWriter.writeData(db);
        StudentDatabaseSerializedFileWriter.closeFile();
    }

    public static void serializedToFormatted(String input, String output){
        StudentDatabaseSerializedFileReader.openFile(input);
        StudentDatabase db = StudentDatabaseSerializedFileReader.readData();
        StudentDatabaseSerializedFileReader.closeFile();
        db.sortByGPA();
        StudentDatabaseCSVFileWriter.openFile(output);
        StudentDatabaseCSVFileWriter.writeData(db);
        StudentDatabaseCSVFileWriter.closeFile(); 
    }
    
}