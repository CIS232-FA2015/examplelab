package edu.carrollcc.cis232;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Please enter your name.");
    	Scanner keyboard = new Scanner(System.in);
    	String name = keyboard.nextLine();
    	
        System.out.println("Hello " + name);
    }
}
