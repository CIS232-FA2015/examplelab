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
    	
    	Scanner keyboard = new Scanner(System.in);
    	
    	String name = "";
    	
    	System.out.println("What is your name: ");
    	
    	name = keyboard.nextLine();
    	
        System.out.printf("Hello %s",name);
        
        keyboard.close();
    }
}
