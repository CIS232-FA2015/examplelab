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
    	
        System.out.println("Hello world!");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        
        String name = input.nextLine();
        
        System.out.printf("Hello %s\n", name);
    }
}
