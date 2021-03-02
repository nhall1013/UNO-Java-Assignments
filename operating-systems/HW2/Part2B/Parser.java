import java.util.*;
import java.io.*;
import java.util.regex.*;

public class Parser implements Runnable {
    
    private File file;
    private String words;

    public Parser(File file){
        this.file = file;
    }

    public String getText(){
        return this.words;
    }

    public void run(){
        try{
            
            BufferedReader buffer = null;
            FileInputStream input = null;
            input = new FileInputStream(file);
            StringBuilder text = new StringBuilder();
            String temp;
            buffer = new BufferedReader(new InputStreamReader(input));
            while((temp = buffer.readLine()) != null){
                Pattern p = Pattern.compile("[ a-zA-Z]+");
                Matcher m = p.matcher(temp);
                if(p.matcher(temp).matches()){
                    while(m.find()){
                        text.append(m.group());
                    }
                }
            }
            words = text.toString().toLowerCase();
            buffer.close();   
        }catch(IOException e){}  
    }
        
}
