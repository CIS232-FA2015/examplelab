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
    	// This is imported to my home computer
    	Scanner kb = new Scanner(System.in);
    	String name = "";
    	System.out.print("Enter Name: ");
    	name = kb.nextLine();
    	System.out.printf("Hello %s!", name);
    }
}
