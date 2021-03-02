import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class ThreadedWords{

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/home/nhall/OS/HW2/Part1B/input/98-0.txt");
        Parser parse = new Parser(file);

        Thread thread = new Thread(parse);

        thread.start();
        try{
            thread.join();
        }catch(InterruptedException e){}

        String temp = parse.getText();

        String[] wordArray = temp.split("\\s+");

        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        
        int wordCount;

        for(String i: wordArray){
            if(wordMap.containsKey(i)){
                wordCount = wordMap.get(i);
                wordMap.put(i, wordCount + 1); 
            }
            else{
                wordMap.put(i, 1);
            }
        }

        LinkedHashMap<String, Integer> sorted = new LinkedHashMap<String, Integer>();

        wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

        List<Entry<String,Integer>> sortedList = new ArrayList<>(sorted.entrySet());

        sortedList = sortedList.subList(0, 20);

        System.out.println(sortedList);

    }
}