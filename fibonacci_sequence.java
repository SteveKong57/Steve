
/**
 * Write a program that uses a for loop to write a specific sequence of numbers based on user input.  
 * Options:  Fibonacci Sequence or Pascal's Triangle.
 *
 * @author (Steve Kong)
 * @version (1.0)
 */
public class fibonacci_sequence
{
    public static void main(String[] args)
    {
        int k,a=1,b=1;
        k=0;
        System.out.print("1 1 ");
        while(k<=50)
        {
            k=a+b;
            System.out.print(k + " ");
            a=b;
            b=k;
        }
    }
}
