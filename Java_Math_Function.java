

/**
 * Create a program that gives the user the option to use any of these 6 
 * Math functions.  Once the specific function is chosen, the program prompts 
 * the user for the necessary input and gives an answer.
 * 
 *
 * @author (Steve Kong)
 * @version (1.1)
 */

import java.util.Scanner;

public class Java_Math_Function
{
    public static void main(String[] args)
    {
       //Clear the BlueJ terminal
       System.out.println('\u000C'); 
       
       //Define input Scanner
       Scanner userInput = new Scanner(System.in);
       
       int choice;
       double x;
       double y;
       double results;
       
       //Input for Math variables
       System.out.println("This app will allow you to choose a specific function. But you need to enter the number first.");
       
       System.out.print("Type \"a\" to find the highest value"); //Math.max(x,y)
       System.out.print("Type \"b\" to find the lowest value"); //Math.min(x,y)
       System.out.print("Type \"c\" to find the square root"); //Math.sqrt(x)
       System.out.print("Type \"d\" to find the absolute value"); //Math.abs(x)
       System.out.print("Type \"e\" to give a random number"); //Math.random()
       System.out.print("Type \"f\" to find the x to the power of y"); //Math.pow(x,y)
       System.out.print(" ");
       
       System.out.print("You chose: ");
       choice = userInput.nextInt();
       
       //choices 1-6
       if (choice <= 6) //types1-6
       {
           if (choice < 1)
           {
               System.out.println("Enter a number from 1-7");
           }
           else
           {
               if (choice == 1)
               {
                   //variables
                   System.out.println("You chose 1: find the highest value");
                   System.out.print("x = ");
                   x = userInput.nextDouble();
                   System.out.print("y = ");
                   y = userInput.nextDouble();
                   System.out.println(" ");
                   //results
                   results = Math.max(x,y);
                   System.out.print("The greater value is " + results + ".");
               }
               else if (choice == 2)
               {
                   //variables
                   System.out.println("You chose 2: find the lowest value");
                   System.out.print("x = ");
                   x = userInput.nextDouble();
                   System.out.print("y = ");
                   y = userInput.nextDouble();
                   System.out.println(" ");
                   //results
                   results = Math.min(x,y);
                   System.out.print("The lowest value is " + results + ".");
               }
               else if(choice == 3)
               {
                   //variables
                   System.out.println("You chose 3: find the square root");
                   System.out.print("x = ");
                   x = userInput.nextDouble();
                   System.out.print(" ");
                   //results
                   results = Math.sqrt(x);
                   System.out.print("The square root of " + results + ".");
               }
               else if(choice == 4)
               {
                   //variables
                   System.out.println("You chose 4: find the absolute value");
                   System.out.print("x = ");
                   x = userInput.nextDouble();
                   System.out.println(" ");
                   //results
                   results = Math.abs(x);
                   System.out.print("The absolute value is " + results + ".");
               }
               else if(choice == 5)
               {
                   //variables
                   System.out.println("You chose 5: give a random number");
                   System.out.print(" ");
                   //results
                   results = Math.random();
                   System.out.print("Your number is " + results + ".");
               }
               else if(choice == 6)
               {
                   //variables
                   System.out.println("You chose 6: find the x to the power of y");
                   System.out.print("x = ");
                   x = userInput.nextDouble();
                   System.out.print("y = ");
                   y = userInput.nextDouble();
                   System.out.println(" ");
                   //results
                   results = Math.pow(x,y);
                   System.out.print(x + "^" + y + "=" + results);
               }
            }
        }        
    }               
}            

