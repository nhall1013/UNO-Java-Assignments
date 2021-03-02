/**
@author Nick Hall
@since 3/18/2019

This is a class that can compare two strings and it can also find a string with the smallest value in an 
array of strings. 

*/

public class Recursion{
 /**
  
 A method that compares two strings recusively. If the first string passed in is smaller than the second
 string passed in then the method will return a negative integer. If the first string passed in is bigger
 than the second string passed in then the method will return a positive integer. If the two strings are equal 
 then the method will return 0. 

 @param s1 - first string 
 @param s2 - second string
 @return an integer value 

 */
    public static int compareTo(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int compareInt = s1.charAt(0) - s2.charAt(0);
        if(compareInt == 0){
            s1 = s1.substring(1);
            s2 = s2.substring(1);
            if(s1.length() == 0 || s2.length() == 0){
                return s1.length() - s2.length();
            }
            return compareTo(s1, s2);
        }
        else{
            return compareInt;
        }

    }  
    
 /**
  
  A method that finds the smallest string in an array of strings
 
  @param stringArray - an array of strings
  @return a string 

 */    

    public static String findMinimum(String[] stringArray){
        if(stringArray.length == 0){
            return " ";
        }
        String min = stringArray[0];
        return findMinHelper(stringArray, 1, min);    
    }
 
 /**
   
   A helper method that helps the findMinimum method find the smallest string in an array of strings by using recursion.
  
   @param stringArray - an array of strings
   @param index - an integer value
   @param string - a string 
   @return a string 

 */
    private static String findMinHelper(String[] stringArray, int index, String string){        
        string = string.trim();
        if(index == stringArray.length){
            return string;
        } 
        int val = 0;
        if(stringArray[index] != null){
            val = compareTo(string, stringArray[index].trim());
        }
        
        if(val>0){
            string = stringArray[index];
        }
        return findMinHelper(stringArray, index+1, string);
    }
} //end class