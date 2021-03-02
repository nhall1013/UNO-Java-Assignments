/**
@author Nick Hall
@since 3/19/2019

JUnit tester that tests the Recursion class.

*/

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;

public class RecursionTester{
 /**
  
 A method that tests the compareTo method in the Recursion class.
 
 
 */  
    @Test
    public void testCompareTo(){
        String s1 = "nick";
        String s2 = "summa";
        assertEquals(Recursion.compareTo(s1,s2), -5);
    }

/**
  
 A method that tests the compareTo method in the Recursion class.
 
 
 */  
    @Test
    public void testCompareTo2(){
        String s1 = "nick";
        String s2 = "nick";
        assertEquals(Recursion.compareTo(s1,s2), 0);
    }

/**
  
 A method that tests the compareTo method in the Recursion class.
 
 
 */  
    @Test
    public void testCompareTo3(){
        String s1 = "n";
        String s2 = "ni";
        assertEquals(Recursion.compareTo(s1,s2), -1);
    }

/**
  
 A method that tests the compareTo method in the Recursion class.
 
 
 */  
    @Test
    public void testCompareTo4(){
        String s1 = "summa";
        String s2 = "nick";
        assertEquals(Recursion.compareTo(s1,s2), 5);
    }

/**
  
 A method that tests the compareTo method in the Recursion class.
 
 
 */  
    @Test
    public void testCompareTo5(){
        String s1 = "nicK";
        String s2 = "SuMmA";
        assertEquals(Recursion.compareTo(s1,s2), -5);
    }

/**
  
 A method that tests the compareTo method in the Recursion class.
 
 
 */  
    @Test
    public void testCompareTo6(){
        String s1 = "nicka";
        String s2 = "nick";
        assertEquals(Recursion.compareTo(s1,s2), 1);
    }
/**
  
 A method that tests the compareTo method in the Recursion class.
 
 
 */  
    @Test
    public void testCompareTo7(){
        String s1 = "nicka";
        String s2 = "nickb";
        assertEquals(Recursion.compareTo(s1,s2), -1);
    }

/**

 A method that test the findMinimum method in the Recursion class. 

*/
    @Test
    public void testfindMinimum(){
        String[] country = new String[] {"usA","caNada    ","russia","Mexico","GerMany",null,"    brazil"};
        assertEquals(Recursion.findMinimum(country), "brazil");
    }
} //end class



