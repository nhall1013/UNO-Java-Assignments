import java.util.*;
import java.io.*;



public class Parser implements Runnable {
    
    private File file;
    private String text;
 

    public Parser(File file){
        this.file = file;
    }

    public String getText(){
        return this.text;
    }


    public void run(){
        try{
            Scanner scan = new Scanner(file);
            
            scan.useDelimiter("[^ a-zA-Z|']");

            StringBuilder temp = new StringBuilder();

            while(scan.hasNext()){
                temp.append(scan.next());
            }

            text = temp.toString().toLowerCase();

            scan.close();
        }catch(FileNotFoundException e){}  
    }
        
}
