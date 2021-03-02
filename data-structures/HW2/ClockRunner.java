import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClockRunner{
    public static void main(String[] args){
        //build new clock object
        Clock clock = new Clock();
        
        //ArrayList for storing values from input
        ArrayList<Integer> list = new ArrayList<Integer>();
         
        //recieve input from text file 
        try{
            
            Scanner input = new Scanner(new File("input.txt"));
            while(input.hasNextInt()){
                list.add(input.nextInt());
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        //load queue and clone with number of balls recieved from input.txt
        //run ball clock simulation
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > 27 && list.get(i) < 127){
                clock.loadQueue(list.get(i));
                clock.runClock();
            }
            else{
                System.out.println("Error: invalid input");
            }
        }    
    }   
}