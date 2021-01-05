
/**
 *This assignment is meant to help introduce students to methods and practice writing methods in Java.
 *
 * @author (Steve Kong)
 * @version (1.0)
 */

import java.util.Scanner;

public class Method_Practice
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 10;
        
        int answer1;
        int answer2;
        boolean answer3;
        
        answer1 = multNumbers(num1);
        
        System.out.println("When we multiply num1 by 10 we get: " + answer1);
        
        answer2 = addNumbers(num1, num2);
        System.out.println("\nWhen we add num1 and num2, we get: " + answer2);
        
        answer3 = equalNumbers(num1, num2);
        System.out.println("num1 and num2 are equal: " + answer3);
    }
    public static int multNumbers(int a){
         int ans = a * 10;
         
         return ans;
    }
    
    public static int addNumbers(int x, int y) {
        int ans = x + y;
        
        return ans;
    }
    
    public static boolean equalNumbers(int r, int t) {
        if(r==t) return true;
        
        else return false;
    }
}
