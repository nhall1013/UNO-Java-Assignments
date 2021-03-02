import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;

import java.util.Date;

public class Words {
    
    public static void main(String[] args) throws IOException {
        
        File file = new File("/home/nhall/OS/HW2/Part2A/Test");
        File[] files = file.listFiles();
        StringBuilder text = new StringBuilder();
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        BufferedReader buffer = null;
        FileInputStream input = null;
        int wordCount;

        Date start = new Date();

        for(File i : files){
            input = new FileInputStream(i);
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
                String word = text.toString().toLowerCase();
                String[] wordArray = word.split("\\s+");
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
            buffer.close();
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
