import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class MultiThreadWords {
    
    public static void main(String[] args) throws IOException {
        
        File file = new File("/home/nhall/OS/HW2/Part2A/Test");
        File[] files = file.listFiles();
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        Parser parse;
        Thread thread;
        List<Thread> threads = new ArrayList<Thread>();
        List<Parser> parseList = new ArrayList<Parser>();
        StringBuilder b = new StringBuilder();

        int wordCount;

        Date start = new Date();

        
        for(File i : files){
            
            parse = new Parser(i);
            
            thread = new Thread(parse);
            
            thread.start();

            threads.add(thread);

            parseList.add(parse);
            
            for(Thread t : threads){
                try{
                    t.join();
                }catch(InterruptedException e){}
            }
            threads.clear();

            for(Parser p : parseList){
                b = b.append(parse.getText());
            }

            
            
            String s = b.toString();

            String[] wordArray = s.split("\\s+");
        
            for(String j : wordArray){
                if(wordMap.containsKey(j)){
                    wordCount = wordMap.get(j);
                    wordMap.put(j, wordCount + 1); 
                }
                else{
                    wordMap.put(j, 1);
                }
            }
        } 
        
        LinkedHashMap<String, Integer> sorted = new LinkedHashMap<String, Integer>();

        wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

        List<Entry<String,Integer>> sortedList = new ArrayList<>(sorted.entrySet());

        sortedList = sortedList.subList(0, 20);

        Date end = new Date();

        System.out.println("\nRuntime: " + ((end.getTime() - start.getTime())/1000) + " seconds");

        System.out.println("\n Top 20 words: " + sortedList);
    }
}