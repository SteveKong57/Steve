
/**
 *Consider a circumstance where you would have to make a decision based on 
 *at least 3 conditions.  Write a problem involving at least 3 if/then/else 
 *conditions. These conditionals may be nested but don’t have to be.
 *
 *When I need to buy buy my friend a gift.
 *
 * @author (Steve Kong)
 * @version (1.0)
 */

import java.util.Scanner;

public class Decision_Maker
{
    public static void main(String[] args)
    {
        System.out.println('\u000C');                                          
        
        //Initialize an input scanner
        Scanner keyboard1 = new Scanner(System.in);
        
        //Define a String and input that string.
        String stringInput;
        System.out.print("What circumstance do you want to choose?");
        stringInput = keyboard1.next();
        
        //Turn my string into the conditions.
        int myConditions = stringInput.length();
        System.out.println("That circumstance has" + myConditions + " conditions.");
        
        //Determine if the condition is a good one.
        
        if (myConditions == 1)
        {
            System.out.println("It has to be related to Anime");
        }
        else if (myConditions == 2)
        {
            System.out.println("It has to be Green");
        }
        else if(myConditions == 3)
        {
            System.out.println("Not too expensive but not too cheap too");
        }    
    }
}    
