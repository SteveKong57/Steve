
/**
 * Write a description of class HelloWorldMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorldMethod
{
    static void printHelloWorld() {
        System.out.println("Hello, World!");
    }
    
    
    
    
    public static void main(String[] args)
    {
        boolean useGreeting = true;
        
        if (useGreeting) 
        {
           printHelloWorld();
           useGreeting = false;
        }
        
        if (!useGreeting)
        {
            System.out.println("You Rock!");
        }
    }
}
