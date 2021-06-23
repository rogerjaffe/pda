import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{

    Scanner scanner = new Scanner(System.in);
    int age;
    int LOWER_BOUND = 14;
    
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    public int getYoungerAge(int age) {
        return (int)Math.ceil((double)age / 2 + 7);
    }
    
    public int getOlderAge(int age) {
        return (int)Math.floor(((double)age - 7) * 2);
    }
    
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    System.out.println(age+" is too young!!");
                } else {
                    System.out.println("A "+age+" year-old should date someone between "+getYoungerAge(age)+" and "+getOlderAge(age));
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
