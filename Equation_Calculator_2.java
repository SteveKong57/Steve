
/**
 * “Equation Calculator II”:  Modify one of your programs from the Equation 
 * Calculation topic so that it prompts the user for input and then writes 
 * the output to the console.
 *
 * @author (Steve Kong)
 * @version (1.1)
 */
import java.util.Scanner;

public class Equation_Calculator_2
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       //Declare Variables
       double a = 1;
       double b = 5;
       double c = 6;
        
       double disc = 0;  //stores a temporary value to check
       double x1 = 0;
       double x2 = 0;
       //Take Inputs:
       System.out.println("Input the values a, b and c for ax^2+bx+c = 0");
       System.out.println("Input a: ");
       a = s.nextDouble();
       System.out.println("Input b: ");
       b = s.nextDouble();
       System.out.println("Input c: ");
       c = s.nextDouble();
       //Process Inputs
       disc = Math.pow(b,2)-4*a*c;
        
       if (disc >= 0) {
        
          x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
          x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
          //results
          System.out.println("x1 = "+x1);
          System.out.println("x2 = "+x2);
       }
       else if (disc == 0) {
           x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
           System.out.println("There is one real root at x = "+x1);
       }
       else {
           System.out.println("There are no real roots");
       }
   }
}
