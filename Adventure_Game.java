

/**
 * Write a description of class Adventure_Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;

public class Adventure_Game 
{
    public static void main(String[] args) 
    {
        // System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        // Game variables
        String[] enemies = { "Skeleton", "Zombie", "Enderman", "Creeper"};
        int maxEnemyHealth = 40;
        int enemyAttackDamage = 7;
        
        // Player variables
        int health = 20;
        int attackDamage = 11;
        int numHealthPotions = 10;
        int healthPotionHealAmount = 8;
        int healthPotionDropChance = 50; // Percentage
        
        boolean running = true;
        
        System.out.println("Welcome to the Stronghold!");
        
        GAME:
        while(running) {
            System.out.println("----------------------------------------------------");
            
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " apeared! #\n");
            
            while(enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");
                
                String input = in.nextLine();
                if(input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);
                    
                    enemyHealth -= damageDealt;
                    health -= damageTaken;
                    
                    System.out.println("\t> You strike the " + enemy + " for " + " damage.");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation!");
                    
                    if(health < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                        break;
                    }
                }
                else if(input.equals("2")) {
                    if(numHealthPotions > 0) {
                         health += healthPotionHealAmount;
                         numHealthPotions--;
                         System.out.println("\t> You drink a health potion, healing for " + healthPotionHealAmount + "."
                                          + "\n\t> You now have " + health + " HP."
                                          + "\n\t> You have " + numHealthPotions + " health potions left.\n");
                    }
                    else {
                        System.out.println("\t> You have no health potion left! Defeat enemies for a chance to get one!");
                    }
                }
                else if(input.equals("3")) {
                    System.out.println("\tYou run away from the " + enemy);
                    continue GAME;
                }
                else {
                    System.out.println("\tInvalid command!");
                }
            }
            if(health < 1) {
                System.out.println("You escape out of the Stronghold, weak from battle.");
                break;
            }
            
            System.out.println("----------------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. #");
            if(rand.nextInt(100) < healthPotionDropChance) {
                 numHealthPotions++;
                 System.out.println(" # The " + enemy + " dropped a health potion! # ");
                 System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
            }
            System.out.println("----------------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit Stronghold");
            
            String input = in.nextLine();
            
            while(!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = in.nextLine();
            }
            
            if(input.equals("1")) {
                System.out.println("You continue on your adventure!");
            }
            else if(input.equals("2")) {
                System.out.println("You exit the Stronghold, successful from your adventure!");
                break;
            }
        }
        
        System.out.println("#######################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("#######################");
    }
}    
