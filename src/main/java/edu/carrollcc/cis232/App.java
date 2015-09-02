package edu.carrollcc.cis232;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Enter your name: ");
    	Scanner keyboard = new Scanner(System.in);
    	String name = keyboard.nextLine();
        System.out.println("Hello "+ name + "!");
    }
}
