
/**
 * Edit this program to make it shorter and simpler using methods. 
 *
 * @author (Steve Kong)
 * @version (1.0)
 */
import java.util.Arrays;
import java.util.Scanner;

public class Array_Methods
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int[] grades = new int[amount];
        
        
        for(int i = 0; i < amount; i++) 
        {
            int x = input.nextInt();
            grades[i] = x;
        }
        
        System.out.println(Arrays.toString(grades));
    }
}
