package t1;

import java.util.Random;
import java.util.Scanner;

//  TASK 1:Number guessing game


public class Task1 {

	public static void main(String[] args) {
		
		int z;
		System.out.println("how many rounds you want to play:");
		System.out.println("Enter your choice: \n1. 1 round\n2. 2 rounds ");
		Scanner sc=new Scanner(System.in);
		z=sc.nextInt(2);
		
		
		
		
		Random rnNum=new Random();   // Random is a class in  java.util.Random package
		int a=rnNum.nextInt(100);   // a is the number generated by the system/computer
		//System.out.println("random num is: " + a);
		
		int chances=3;
		int n,b;   // b is the number  to be guessed 
		
		System.out.println("You have " + chances + " trials to guess the number.");
		
		 
		
		for(n=0 ; n<chances ; n++)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number to be guessed: ");
			b=s.nextInt();
			
			if(a==b)
			{
				System.out.println("!!!!!!!!!!!CONGRATULATIONS!!!!!!!!!!!!");
				System.out.println("You have guessed the right number!!!!!");
				break;
			}
			
			else if(a>b && n!=chances-1)   //  if generated number is greater than the number guessed
			{
				System.out.println("The number is greater than " + b);
				
			}
			
			else if(a<b && n!=chances-1)
			{
				System.out.println("The number is less than " + b);
				
			}
			
		}
		 
		if(n==chances)
		{
			System.out.println("\n*********THE GAME IS OVER*********");
			System.out.println("\nYou have exhausted all your chances!!!!!....");
			System.out.println("\nThe number was " + a);
		}
		 
		 
	}
	
}
